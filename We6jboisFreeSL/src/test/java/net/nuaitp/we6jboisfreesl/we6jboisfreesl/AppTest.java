/*
 * By: Jeremiah O'Neal
 * Created on: Aug 20, 2013
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.nuaitp.we6jboisfreesl.we6jboisfreesl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author we6jbo
 */
public class AppTest {
    
    public AppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class App.
     */
  //  @Test
  //  public void testMain() {
  //      System.out.println("main");
  //      String[] args = null;
  //      App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
  //  }
    /* You can probably delete this afterwards */

    @Test
    public void testSayHello()
    {
        TermCast termcast = new TermCast();
        String input = "Maven";
        String expected = "Hello " + input;
        String result = termcast.sayHello(input);
        assertEquals(expected, result);
        
    

    }
    //end
}