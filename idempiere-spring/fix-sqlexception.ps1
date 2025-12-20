$files = Get-ChildItem 'C:/Users/haiyangl/Landawn/idempiere/idempiere-spring/src/main/java/org/idempiere/service/*.java'
foreach ($file in $files) {
    $content = Get-Content $file.FullName -Raw
    if ($content -notmatch 'import java.sql.SQLException;') {
        $content = $content -replace 'import java.util.List;', "import java.sql.SQLException;`nimport java.util.List;"
        Set-Content -Path $file.FullName -Value $content -NoNewline
        Write-Host "Added SQLException import to $($file.Name)"
    }
}
