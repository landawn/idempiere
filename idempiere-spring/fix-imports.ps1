$daoPath = "C:\Users\haiyangl\Landawn\idempiere\idempiere-spring\src\main\java\org\idempiere\dao"
Get-ChildItem -Path $daoPath -Filter "*.java" | ForEach-Object {
    $content = Get-Content $_.FullName -Raw
    # Fix SQLBuilder import - correct package is com.landawn.abacus.util
    $content = $content -replace 'com\.landawn\.abacus\.query\.SQLBuilder', 'com.landawn.abacus.util.SQLBuilder'
    # Fix Query annotation to Select
    $content = $content -replace 'import com\.landawn\.abacus\.jdbc\.annotation\.Query;', 'import com.landawn.abacus.jdbc.annotation.Select;'
    $content = $content -replace '@Query\(', '@Select('
    Set-Content -Path $_.FullName -Value $content -NoNewline
}
Write-Host "Fixed imports in all DAO files"
