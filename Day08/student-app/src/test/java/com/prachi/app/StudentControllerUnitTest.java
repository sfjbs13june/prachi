package com.prachi.app;

import com.prachi.app.controller.StudentController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentControllerUnitTest {

    StudentController studentController=new StudentController();

    @Test
    public void listTest(){
        int result = studentController.getStudents().size();
        Assertions.assertEquals(3,result);
    }

    @Test
    public void mapTest(){
        int result = studentController.mapStudents().size();
        Assertions.assertEquals(3,result);
    }
}
