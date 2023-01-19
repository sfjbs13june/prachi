package com.prachi.app.controller;

import com.prachi.app.Controller.OperationController;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OperationControllerUnitTest {
    OperationController operationController = new OperationController();

    @Test
    public void testAdd(){
        Long a = 10L;
        Long b = 5L;
        Long result = operationController.add(a,b);
        Assertions.assertEquals(15,result);
    }
    @Test
    public void testSub(){
        Long a = 10L;
        Long b = 5L;
        Long result = operationController.sub(a,b);
        Assertions.assertEquals(5,result);
    }
    @Test
    public void testMul(){
        Long a = 10L;
        Long b = 5L;
        Long result = operationController.mul(a,b);
        Assertions.assertEquals(50,result);
    }

    @Test
    public void testDiv(){
        Long a = 10L;
        Long b =5L;
        Long result = operationController.div(a,b);
        Assertions.assertEquals(2,result);
    }
}
