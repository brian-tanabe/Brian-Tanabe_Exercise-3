package com.tanabe.test;

import com.tanabe.rs.helpers.SpiralArray;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayTest {

    // getArrayWidth tests:
    @Test
    public void testGetArrayWidthForZero(){
        SpiralArray testArray = new SpiralArray(0);
        assertEquals(1, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForOne(){
        SpiralArray testArray = new SpiralArray(1);
        assertEquals(2, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForTwo(){
        SpiralArray testArray = new SpiralArray(2);
        assertEquals(2, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForThree(){
        SpiralArray testArray = new SpiralArray(3);
        assertEquals(2, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForFour(){
        SpiralArray testArray = new SpiralArray(4);
        assertEquals(3, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForNine(){
        SpiralArray testArray = new SpiralArray(9);
        assertEquals(4, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForTwentyFour(){
        SpiralArray testArray = new SpiralArray(24);
        assertEquals(5, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForTwentyFive(){
        SpiralArray testArray = new SpiralArray(25);
        assertEquals(6, testArray.getArrayWidth());
    }

    // getArrayHeightTests:
    @Test
    public void testGetArrayHeightForZero(){
        SpiralArray testArray = new SpiralArray(0);
        assertEquals(1, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForOne(){
        SpiralArray testArray = new SpiralArray(1);
        assertEquals(1, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForTwo(){
        SpiralArray testArray = new SpiralArray(2);
        assertEquals(2, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForThree(){
        SpiralArray testArray = new SpiralArray(3);
        assertEquals(2, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForFour(){
        SpiralArray testArray = new SpiralArray(4);
        assertEquals(3, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForNine(){
        SpiralArray testArray = new SpiralArray(9);
        assertEquals(4, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForTwentyFour(){
        SpiralArray testArray = new SpiralArray(24);
        assertEquals(5, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForTwentyFive(){
        SpiralArray testArray = new SpiralArray(25);
        assertEquals(6, testArray.getArrayHeight());
    }
}
