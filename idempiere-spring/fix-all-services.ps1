$servicePath = "C:\Users\haiyangl\Landawn\idempiere\idempiere-spring\src\main\java\org\idempiere\service"

Get-ChildItem -Path $servicePath -Filter "*.java" | ForEach-Object {
    $file = $_.FullName
    $content = Get-Content $file -Raw
    $modified = $false
    
    # Pattern to match methods that return Optional and call dao.gett()
    # Replace: return Optional.ofNullable(xxxDao.gett(id));
    # With: try { return Optional.ofNullable(xxxDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed", e); }
    $pattern1 = 'return Optional\.ofNullable\((\w+)\.gett\((\w+)\)\);'
    $replacement1 = 'try { return Optional.ofNullable($1.gett($2)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id: " + $2, e); }'
    if ($content -match $pattern1) {
        $content = $content -replace $pattern1, $replacement1
        $modified = $true
    }
    
    # Pattern for insert/update in if-else blocks
    $pattern2 = '(\s+)if \((\w+)\.get\w+\(\) == null\) \{\s+(\w+)\.insert\((\w+)\);\s+\} else \{\s+\3\.update\(\4\);\s+\}\s+return \4;'
    $replacement2 = '$1try { if ($2.get$5() == null) { $3.insert($4); } else { $3.update($4); } return $4; } catch (SQLException e) { throw new RuntimeException("Failed to save", e); }'
    
    # Pattern for simple deleteById
    $pattern3 = '(\w+)\.deleteById\((\w+)\);(\s*\})'
    if ($content -match $pattern3) {
        $content = $content -replace $pattern3, 'try { $1.deleteById($2); } catch (SQLException e) { throw new RuntimeException("Failed to delete: " + $2, e); }$3'
        $modified = $true
    }
    
    # Pattern for simple exists
    $pattern4 = 'return (\w+)\.exists\((\w+)\);'
    if ($content -match $pattern4) {
        $content = $content -replace $pattern4, 'try { return $1.exists($2); } catch (SQLException e) { throw new RuntimeException("Failed to check exists: " + $2, e); }'
        $modified = $true
    }
    
    if ($modified) {
        Set-Content $file $content -NoNewline
        Write-Host "Fixed: $($_.Name)"
    }
}
