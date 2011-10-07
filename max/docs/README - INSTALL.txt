If you clone the git project, it will come with the paths configured. Check in the Java Build Path that they point to good locations on your machine. Especially, the javadocs.

=========================
Add the Max Jar to your project:

    In your Eclipse project, create a folder named lib by right clicking the max folder and selecting New -> Folder.
    Copy the max.jar file, found at [Max installation]/Cycling '74/java/lib/max.jar, to your project's lib folder.
    Back in Eclipse, right click your max folder and select Refresh. This is so Eclipse will notice max.jar.
    Right click your max folder again and select Properties -> Java Build Path -> Libraries -> Add JARs...
    Select max.jar and click OK

If you have Jitter, also add jitter.jar to your project. Later you will probably want to download other libraries, and you can add them to your project the same way. This goes for Processing and its libraries too.

=========================
Set up Max's classpath to find your Java externals.

Go to the file [Max installation]/Cycling '74/java/max.java.config.txt. Make a backup! Edit the file and find the line:
; max.dynamic.class.dir /Users/topher/myclasses ;

Make a copy of this line and remove the leading semicolon and change the path to the bin folder of your Eclipse project, so it should look something like this (this is on Windows - note the forward slashes):
max.dynamic.class.dir "C:/Documents and Settings/srou/My Documents/git/maxpro_1/max/bin"

Note: you need to restart Max after making changes to this file.

=========================
Make MAX see the additional libraries.

Copy core.jar to "C:\Program Files\Cycling '74\Max 5.0\Cycling '74\java\lib" (on Windows) or add a path to the libraries within your project using max.java.config.txt as above.

=========================
Add documentation (optional but convenient)

When adding the jar libraries, you can expand the added reference where it contains a few properties. Pointing the javadoc to [Max installation]/java-doc/api (or api-jitter for jitter.jar) then gives you inline java-doc in the ide. This is much easier than bookmarking the reference I find. Processing does nont have a downloadable javadoc (or I could not find one) but all of its libraries come with them.

=========================
Have a look at the example.maxpat file.