package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void shouldTestGetString() {

        HelloWorld hello = new HelloWorld();
        Assertions.assertEquals("Hello!",hello.getString());
    }
}