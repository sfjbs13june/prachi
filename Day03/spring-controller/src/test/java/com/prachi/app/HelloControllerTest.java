package com.prachi.app;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;


public class HelloControllerTest {
    HelloController helloController = new HelloController();

    @Test
    public void testSayHello() {
        String expectedResult = "Hello from App";
        String result = helloController.SayHello();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testRequestHello() {
        String expectedResult = "Hello from Request Mapping";
        String result = helloController.RequestHello();
        Assert.assertEquals(expectedResult, result);
    }

}
