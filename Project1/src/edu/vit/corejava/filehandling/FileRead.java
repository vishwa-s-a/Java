package edu.vit.corejava.filehandling;
import java.io.FileReader;
public class FileRead {
    public static void main(String[] args) {
        try(FileReader filereader=new FileReader("C:\\Users\\vishw\\Java\\Project1\\src\\edu\\vit\\corejava\\filehandling\\Demo.txt");)
        {
            int ch;
            while((ch=filereader.read())!=-1)
            {
                System.out.print((char)ch);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
