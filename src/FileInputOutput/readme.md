## File Input/Output

Within Java there are several solutions to create, modify or read files.

If you are going to work with files with Java, you should think of simple text files that you want to fill with data, you generally use the `java.io` package.

The `java.io` package contains the `File`, `FileReader` and `FileWriter` class, from these  classes you can create objects to work with files.
- Using the `File` class it is possible to create new files, check if a file / folder exists and if it is a file or folder, if a file / folder is hidden. In addition, a whole list of files can be requested from a certain folder, or a folder can be created.   
- `File a = new File("File.txt");`
- `boolean isFile = a.isFile();` because you are working with objects, you can call methods, like for example `a.isFile();` this is a method of the File class, which only checks if the given file is a file. This returns the boolean value true if it is a file.

Within the `java.util` package is the `Scanner` class where you can use, for example, the `hasNextLine` method to read a file by line. 