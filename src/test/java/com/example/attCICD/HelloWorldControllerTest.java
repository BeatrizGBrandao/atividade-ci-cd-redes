package com.example.attCICD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldControllerTest {
    @Test
    void testHelloWorld() {
        HelloWorldController controller = new HelloWorldController();
        assertEquals("Hello, World!", controller.hello());
    }
}
