package com.prachi.app;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;


public class GreetingControllerUnitTest {
    GreetingController greetingController = new GreetingController();

    @Test
    public void testSayGreet() {
        String expectedResult = "Greet from App";
        String result = greetingController.SayGreet();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayWelcome() {
        String expectedResult = "Welcome from App";
        String result = greetingController.SayWelcome();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayHi() {
        String expectedResult = "Hi from App";
        String result = greetingController.SayHi();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayThanks() {
        String expectedResult = "Thanks from App";
        String result = greetingController.SayThanks();
        Assert.assertEquals(expectedResult, result);
    }

}


