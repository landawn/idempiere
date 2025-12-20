# PowerShell script to fix all remaining SQLException errors in service files

$servicePath = "C:\Users\haiyangl\Landawn\idempiere\idempiere-spring\src\main\java\org\idempiere\service"

# Get all service files with SQLException errors
$serviceFiles = @(
    "DashboardService.java"
)

foreach ($file in $serviceFiles) {
    $filePath = "$servicePath\$file"
    Write-Host "Fixing $file..."

    # Read the file content
    $content = Get-Content $filePath -Raw

    # Pattern 1: Fix save methods with if-else pattern
    $content = $content -replace '(?s)(public \w+ save\(\w+ \w+\) \{)\s*(if.*?\{)\s*(\w+Dao\.insert\(\w+\);)\s*(\} else \{)\s*(\w+Dao\.update\(\w+\);)\s*(\})\s*(return \w+;)\s*(\})', '$1' + "`n        try {`n            $2`n                $3`n            $4`n                $5`n            $6`n            $7`n        } catch (SQLException e) {`n            throw new RuntimeException(`"Failed to save`", e);`n        }`n    }"

    # Write back
    Set-Content $filePath $content -NoNewline
}

Write-Host "All SQLException errors fixed!"
