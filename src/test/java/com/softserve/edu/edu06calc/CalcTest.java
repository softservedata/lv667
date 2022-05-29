package com.softserve.edu.edu06calc;


import com.softserve.edu.edu06.calc.Calc;
import org.junit.jupiter.api.*;

public class CalcTest {
    private static Calc calc;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        calc = new Calc();
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("\t@Before setUp()");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("\t@After tearDown()");
    }

    @Test//(expected = ArithmeticException.class) // for JUnit-4
    public void testException() {
        //int i = 0;
        //i = 10 / i;
        //System.out.println("\t\t\ti = " + i);
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class,
                () -> {
                    int i = 0;
                    i = 10 / i;
                    System.out.println("\t\t\ti = " + i);
                }, "ArithmeticException was expected");
    }

    @Test
    public void testAdd1() {
        System.out.println("\t\t@Test testAdd1()");

        double actual;
        double expected;

        //
        actual = calc.add(4, 4);
        expected = 8.0001;

        //
        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testAdd2() {
        System.out.println("\t\t@Test testAdd2()");

        double actual;
        double expected;

        actual = calc.add(4, 6);
        expected = 10;

        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDiv1() {
        System.out.println("\t\t@Test testDiv1()");

        double actual;
        double expected;

        actual = calc.div(20, 4);
        expected = 5;

        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDiv2() {
        System.out.println("\t\t@Test testDiv2()");

        double actual;
        double expected;
        //
        actual = calc.div(20, 8);
        expected = 2.5;
        //
        Assertions.assertEquals(expected, actual, 0.001);
    }
}