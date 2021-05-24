package com.alexkozyura.tutorial.maven.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {

        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World!", javaHelloWorld.getHello());
    }
}