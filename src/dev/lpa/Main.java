package dev.lpa;

import java.io.File;

public class Main {
  
  public static void main(String[] args) {
    
    File oldFile = new File("students.json");
    File newFile = new File("student-activity.json");
    if (oldFile.exists()) {
      oldFile.renameTo(newFile);  // IO package, returns boolean, doesn't throw IOException
      System.out.println("File renamed successfully!");
    } else {
      System.out.println("File does not exist!");
    }
  }
}
