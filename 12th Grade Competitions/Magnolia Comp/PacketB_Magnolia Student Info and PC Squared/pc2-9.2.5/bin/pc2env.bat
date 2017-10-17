
rem Purpose: to be called by the other scripts to setup the environment
rem Author : pc2@ecs.csus.edu
rem $HeadURL: http://pc2.ecs.csus.edu/repos/pc2v9/branches/PC2_RELEASE_9_2_x/bin/pc2env.bat $

rem Change these (& uncomment) for non-standard installations
rem set libdir=..\lib
rem set mclbdir=..\lib

rem try development locations first
if exist %0\..\..\dist\pc2.jar set libdir=%0\..\..\dist
if exist %0\..\..\vendor\lib\mclb.jar set mclbdir=%0\..\..\vendor\lib

rem then try the distribution locations
if exist %0\..\..\lib\pc2.jar set libdir=%0\..\..\lib
if exist %0\..\..\lib\mclb.jar set mclbdir=%0\..\..\lib

if x%libdir% == x goto nolibdir
goto checkmclb

:nolibdir
echo Could not find pc2.jar, please check your installation
rem XXX we really want to do a break here
pause

:checkmclb
if x%mclbdir% == x goto nomclb
set pc2_classpath=%libdir%\pc2.jar;%mclbdir%\mclb.jar;%mclbdir%\activation.jar;%mclbdir%\mailapi.jar;%mclbdir%\smtp.jar
goto end

:nomclb
echo Could not find mclb.jar, please check your installation
rem XXX we really want to do a break here
pause

:end
rem continue what you were doing...

rem eof pc2env.bat $Id: pc2env.bat 2004 2009-12-16 05:48:11Z boudreat $
