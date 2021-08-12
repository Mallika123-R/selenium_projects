$winHandle=WinGetHandle("Open")
WinActivate($winHandle)
ControlSetText("Open","","[CLASS:Edit;INSTANCE:1]","xxxxxxxx")
ControlClick("Open","","[CLASS:Button;INSTANCE:1]")

