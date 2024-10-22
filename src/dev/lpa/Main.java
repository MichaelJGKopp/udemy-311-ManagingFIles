package dev.lpa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
  
  public static void main(String[] args) {
    
//    File oldFile = new File("students.json");
//    File newFile = new File("student-activity.json");
//    if (oldFile.exists()) {
//      oldFile.renameTo(newFile);  // IO package, returns boolean, doesn't throw IOException
//      System.out.println("File renamed successfully!");
//    } else {
//      System.out.println("File does not exist!");
//    }
    
//    Path oldPath = oldFile.toPath();
//    Path newPath = newFile.toPath();
    
    Path oldPath = Path.of("students.json");
    Path newPath = Path.of("files/student-activity.json");
    
    try {
      Files.createDirectories(newPath.subpath(0, newPath.getNameCount() - 1));
      Files.move(oldPath, newPath);
      System.out.println(oldPath + " moved (renamed to) --> " + newPath);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
