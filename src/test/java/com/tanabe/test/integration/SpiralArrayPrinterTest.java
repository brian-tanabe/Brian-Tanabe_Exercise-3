package com.tanabe.test.integration;

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
        byteArrayOutputStream.reset();
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

        assertEquals("\t0\r\n".trim(), byteArrayOutputStream.toString().trim());
    }

    @Test
    public void testPrintingSpiralArrayOfFour(){
        SpiralArrayPopulator spiralArrayPopulator = new SpiralArrayPopulator(3);
        SpiralArray array = spiralArrayPopulator.createAndPopulateSpiralArray();
        SpiralArrayPrinter.printSpiralArray(array);

        assertEquals("\t\t0\t1\r\n\t\t3\t2\r\n".trim(), byteArrayOutputStream.toString().trim());
    }

    @Test
    public void testPrintingSpiralArrayOfEight(){
        SpiralArrayPopulator spiralArrayPopulator = new SpiralArrayPopulator(8);
        SpiralArray array = spiralArrayPopulator.createAndPopulateSpiralArray();
        SpiralArrayPrinter.printSpiralArray(array);

        assertEquals("\r6\t7\t8\r\n\t5\t0\t1\r\n\t4\t3\t2\r\n".trim(), byteArrayOutputStream.toString().trim());
    }

    @Test
    public void testPrintingSpiralArrayOfNine(){
        SpiralArrayPopulator spiralArrayPopulator = new SpiralArrayPopulator(9);
        SpiralArray array = spiralArrayPopulator.createAndPopulateSpiralArray();
        SpiralArrayPrinter.printSpiralArray(array);

        assertEquals("\t\t6\t7\t8\t9\r\n\t\t5\t0\t1\t\r\n\t\t4\t3\t2".trim(), byteArrayOutputStream.toString().trim());
    }
}
