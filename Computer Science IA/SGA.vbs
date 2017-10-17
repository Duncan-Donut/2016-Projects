Set oShell = CreateObject ("Wscript.Shell") 
Dim strArgs
strArgs = "cmd /c IA.bat"
oShell.Run strArgs, 0, false