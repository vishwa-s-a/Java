package edu.vit.corejava.filehandling;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class FileReadChar {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("C:\\Users\\vishw\\Java\\Project1\\src\\edu\\vit\\corejava\\filehandling\\Demo.txt"))
        {
            int ch;
            while((ch=fr.read())!=-1)// throws IO exception
            {
                System.out.print((char) ch);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
   
}
