package edu.vit.corejava.basics;
import java.util.Scanner;
import java.time.LocalDate;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GenPract1{
    public static void main(String[] args) {
        try{
            URL url=new URL("https://en.wikipedia.org/wiki/Java_(programming_language)");
            BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
            String line=br.readLine();// to ignore the first line of data set
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            br.close();// we should close the stream used for the above code
        }
        catch(MalformedURLException e)
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
