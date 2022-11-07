package edu.vit.corejava.filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class FileWrite {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("out.txt",true))
        {
            String content="\nMy name is Vishwa, this is me";
            fw.write(content);
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        
    }
    
}
