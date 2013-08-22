package net.nuaitp.we6jboisfreesl.we6jboisfreesl;

import java.io.*;
import java.lang.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("By Jeremiah O'Neal - Aug 20, 2013");
        System.out.println("Menu\n1. \n2. Exit");
        int selection = 0;
        do
        {
            try
            {
            System.out.print(">>");
                selection = Integer.parseInt(br.readLine());
            }
            catch(IOException e)
            {
            }
            System.out.println(selection);
        switch(selection)
        {
            case 1:
                System.out.println("You entered 1.");
                break;
            case 2:
                break;
            case 3:
                System.out.println(selection + " does not exist. Did you mean to enter 2?");
                break;
        }
    }while(selection != 2);
    }
}
