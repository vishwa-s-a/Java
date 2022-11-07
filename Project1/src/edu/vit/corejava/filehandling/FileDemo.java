package edu.vit.corejava.filehandling;
import java.io.File;
public class FileDemo {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\vishw\\Java\\Project1\\src\\edu\\vit\\corejava\\filehandling\\Demo.txt");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
    
}
