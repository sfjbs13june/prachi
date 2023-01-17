package com.prachi.app;
import org.junit.Assert;
import org.junit.Test;
public class CalculatorControllerUnitTest {

    CalculatorController calculatorController = new CalculatorController();

    @Test
    public void testAdd() {
        Double a = 10.0;
        Double b = 20.0;
        Double expectedResult = 30.0;
        Double result = calculatorController.add(a,b);
        Assert.assertEquals(expectedResult, result,0.00);
    }
    @Test
    public void testSub() {
        Double a = 20.0;
        Double b = 10.0;
        Double expectedResult = 10.0;
        Double result = calculatorController.sub(a,b);
        Assert.assertEquals(expectedResult, result, 0.00);
    }
    @Test
    public void testMul() {
        Double a = 10.0;
        Double b = 20.0;
        Double expectedResult = 200.0;
        Double result = calculatorController.mul(a,b);
        Assert.assertEquals(expectedResult, result,0.00);
    }
    @Test
    public void testDiv() {
        Double a = 20.0;
        Double b = 10.0;
        Double expectedResult =2.0;
        Double result = calculatorController.div(a,b);
        Assert.assertEquals(expectedResult, result,0.00);
    }




}
