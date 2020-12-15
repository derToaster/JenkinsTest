package com.example.jenkins.demo.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;
@AutoConfigureMockMvc
@SpringBootTest
class TestControllerTest {

    @Autowired
    MockMvc mvc;

    /////////////////HelloWorld//////////////////////
    @Test
    void HelloWorld() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/test"))
                .andExpect(status().isOk());
    }
}
