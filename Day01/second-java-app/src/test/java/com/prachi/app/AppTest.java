package com.prachi.app;

import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test
    public void testSayHi(){
        String expectedResult= "Hi from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayHi();
        Assert.assertEquals(expectedResult,result);
    }
    public void testSayWelcome(){
        String expectedResult= "Welcome from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayWelcome();
        Assert.assertEquals(expectedResult,result);
    }
    public void testSayHello(){
        String expectedResult= "Hello from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayHello();
        Assert.assertEquals(expectedResult,result);
    }
    public void testSayBye(){
        String expectedResult= "Bye from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayBye();
        Assert.assertEquals(expectedResult,result);
    }

}
