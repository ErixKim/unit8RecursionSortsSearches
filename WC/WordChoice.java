import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class WordChoice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordChoice
{
    public WordChoice(String fileName)
    {
        int counter = 0;
        int chCounter = 0;
        int lnCount = 0;
        File read = new File(fileName);
        
        try
        {
            Scanner in = new Scanner(read);
            
            while(in.hasNext())
            {
                String word = in.next();
                counter++;
            }
            in.close();
        }
        catch(java.io.FileNotFoundException exception)
        {
            exception.printStackTrace();
        }

        System.out.println("Number of words: " + counter);
        
        try
        {
            Scanner in = new Scanner(read);
            in.useDelimiter("");
            while(in.hasNext())
            {
                char ch = in.next().charAt(0);
                chCounter ++;
            }
            in.close();
        }
        catch(java.io.FileNotFoundException exception)
        {
            exception.printStackTrace();
        }
        
        System.out.println("Number of characters: " + chCounter);
        
        try
        {
            Scanner in = new Scanner(read);
            
            while(in.hasNextLine())
            {
                String ln = in.nextLine();
                lnCount ++;
            }
            in.close();
        }
        catch(java.io.FileNotFoundException exception)
        {
            exception.printStackTrace();
        }
        System.out.println("Number of lines: " + lnCount);
    }

    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a file name: ");
        String name = s.next();
        WordChoice file = new WordChoice(name);
    }
}