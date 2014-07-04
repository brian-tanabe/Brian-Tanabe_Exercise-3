package com.tanabe.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayPrinterTest {
    private static PrintStream oldPrintStream;
    private static PrintStream consolePrintStream;
    private static ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    @BeforeClass
    public static void setUpConsolePrintingToString(){
        consolePrintStream = new PrintStream(byteArrayOutputStream);
        oldPrintStream = System.out;

        System.setOut(consolePrintStream);
    }

    @AfterClass
    public static void tearDown(){
        System.setOut(oldPrintStream);
    }

    @After
    public void clearPrintStream(){
        byteArrayOutputStream.reset();
    }


    @Test
    public void testPrintingSpiralArrayOfZero(){

    }
}
