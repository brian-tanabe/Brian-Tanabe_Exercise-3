package com.tanabe.test;

import com.tanabe.rs.array.SpiralArray;
import com.tanabe.rs.helpers.SpiralArrayPopulator;
import com.tanabe.rs.helpers.SpiralArrayPrinter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

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
        SpiralArrayPopulator spiralArrayPopulator = new SpiralArrayPopulator(0);
        SpiralArray array = spiralArrayPopulator.createAndPopulateSpiralArray();
        SpiralArrayPrinter.printSpiralArray(array);

        assertEquals("0\t1\r\n3\t2", byteArrayOutputStream.toString().trim());
    }
}
