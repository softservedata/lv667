package com.softserve.edu;

import org.junit.jupiter.api.*;

public class AppTest {

    @BeforeAll
    public static void setup() {
        System.out.println("@BeforeAll executed");
    }

    @AfterAll
    public static void tear() {
        System.out.println("@AfterAll executed");
    }

    @BeforeEach
    public void setupThis() {
        System.out.println("\t@BeforeEach executed");
    }

    @AfterEach
    public void tearThis() {
        System.out.println("\t@AfterEach executed");
    }

    @Test
    public void testOne() {
        System.out.println("\t\t@Test testOne()");
        Assertions.assertEquals(4, 2 + 2);
    }

    @Test
    public void testTwo() {
        System.out.println("\t\t@Test testTwo()");
        Assertions.assertEquals(6, 2 + 4);
    }

    @Test
    public void testApp() {
        // From Maven
        System.out.println("***surefire.java.version = " + System.getProperty("surefire.application.password"));
        // From OS
        System.out.println("***System.getenv(\"JAVA_HOME\") = " + System.getenv("JAVA_HOME"));
        System.out.println("***System.getenv(\"DEFAULT_PASS\") = " + System.getenv("DEFAULT_PASS"));
        // From Eclipse/Idea
        System.out.println("***System.getenv().MY_IDE = " + System.getenv().get("MY_IDE"));
    }

}

