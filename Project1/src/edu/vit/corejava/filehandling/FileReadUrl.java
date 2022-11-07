package edu.vit.corejava.filehandling;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileReadUrl {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://raw.githubusercontent.com/anthoniraj/datasets/main/StudentsPerformance.csv");
            BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
            String line=br.readLine();// to ignore the first line of data set
            while((line=br.readLine())!=null)
            {
                String temp[]=line.split(",");
                if(temp[0].equals("female"))
                System.out.println("female -"+temp[4]);
                // like this we can further use different logic to do analysis of data
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
