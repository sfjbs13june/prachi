package com.prachi.app.controller;

import com.prachi.app.Controller.OperationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Assertions;

@RunWith(SpringRunner.class)
@WebMvcTest({OperationController.class})

public class OperationControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testIntAdd() throws Exception{
        long a =(long) 10.0;
        long b =(long)5.0;
        ResultActions entity = mockMvc.perform(get("/add").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        entity.andExpect(status().isOk());
        String result = entity.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals("15",result);
    }
    @Test
    public void testIntSub() throws Exception{
        long a =(long) 10.0;
        long b =(long)5.0;
        ResultActions entity = mockMvc.perform(post("/sub").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        entity.andExpect(status().isOk());
        String result = entity.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals("5",result);
    }
    @Test
    public void testIntMul() throws Exception{
        long a =(long) 10.0;
        long b =(long)5.0;
        ResultActions entity = mockMvc.perform(put("/mul").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        entity.andExpect(status().isOk());
        String result = entity.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals("50",result);
    }
    @Test
    public void testIntDiv() throws Exception{
        long a =(long) 10.0;
        long b =(long)5.0;
        ResultActions entity = mockMvc.perform(delete("/div").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        entity.andExpect(status().isOk());
        String result = entity.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals("2",result);
    }


}

