package com.tanabe.test;

import com.tanabe.rs.helpers.SpiralArray;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayTest extends SpiralArray {

    // getArrayWidth tests:
    @Test
    public void testGetArrayWidthForZero(){
        assertEquals(1, getSpiralArrayWidth(0));
    }

    @Test
    public void testGetArrayWidthForOne(){
        assertEquals(2, getSpiralArrayWidth(1));
    }

    @Test
    public void testGetArrayWidthForTwo(){
        assertEquals(2, getSpiralArrayWidth(2));
    }

    @Test
    public void testGetArrayWidthForThree(){
        assertEquals(2, getSpiralArrayWidth(3));
    }

    @Test
    public void testGetArrayWidthForFour(){
        assertEquals(3, getSpiralArrayWidth(4));
    }

    @Test
    public void testGetArrayWidthForNine(){
        assertEquals(4, getSpiralArrayWidth(9));
    }

    @Test
    public void testGetArrayWidthForTwentyFour(){
        assertEquals(5, getSpiralArrayWidth(24));
    }

    @Test
    public void testGetArrayWidthForTwentyFive(){
        assertEquals(6, getSpiralArrayWidth(25));
    }

    // getArrayHeightTests:
    @Test
    public void testGetArrayHeightForZero(){
        assertEquals(1, getSpiralArrayHeight(0));
    }

    @Test
    public void testGetArrayHeightForOne(){
        assertEquals(1, getSpiralArrayHeight(1));
    }

    @Test
    public void testGetArrayHeightForTwo(){
        assertEquals(2, getSpiralArrayHeight(2));
    }

    @Test
    public void testGetArrayHeightForThree(){
        assertEquals(2, getSpiralArrayHeight(3));
    }

    @Test
    public void testGetArrayHeightForFour(){
        assertEquals(3, getSpiralArrayHeight(4));
    }

    @Test
    public void testGetArrayHeightForNine(){
        assertEquals(4, getSpiralArrayHeight(9));
    }

    @Test
    public void testGetArrayHeightForTwentyFour(){
        assertEquals(5, getSpiralArrayHeight(24));
    }

    @Test
    public void testGetArrayHeightForTwentyFive(){
        assertEquals(6, getSpiralArrayHeight(25));
    }
}
