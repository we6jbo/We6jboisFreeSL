/*
 * Copyright (C) 2013 Jeremiah ONeal <joneal@nuaitp.net>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package net.nuaitp.we6jboisfreesl.we6jboisfreesl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jeremiah ONeal <joneal@nuaitp.net>
 */
public class TermCast {
public void main(String args[])
{
        Say.it(2,"changzes");
        Say.what(2, "Yes sir");
        Say.it(2, "Ok");
        //      logger.info("Hello!");
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
    protected String sayHello(String input)
    {
        String output = "Hello " + input;
        return output;
    }
}