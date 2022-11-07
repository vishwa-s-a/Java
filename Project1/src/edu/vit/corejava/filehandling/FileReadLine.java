package edu.vit.corejava.filehandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReadLine {
    public static void main(String[] args) {
        try(BufferedReader bfr=new BufferedReader(new FileReader("C:\\Users\\vishw\\Java\\Project1\\src\\edu\\vit\\corejava\\filehandling\\Demo.txt")))
        {
            String line;
            while((line=bfr.readLine())!=null)
            {
                System.out.println(line);
            }
        
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
