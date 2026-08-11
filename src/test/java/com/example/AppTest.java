package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testMessage() {
        String message = "Hello from Maven + Jenkins!";
        assertEquals("Hello from Maven + Jenkins!", message);
    }
}