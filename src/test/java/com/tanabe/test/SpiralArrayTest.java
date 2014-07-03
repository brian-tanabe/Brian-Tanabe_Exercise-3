package com.tanabe.test;

import com.tanabe.rs.helpers.SpiralArray;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayTest extends SpiralArray {

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
    public void testGetArrayWidthForTwentyFour(){
        assertEquals(5, getSpiralArrayWidth(24));
    }

    @Test
    public void testGetArrayWidthForTwentyFive(){
        assertEquals(6, getSpiralArrayWidth(25));
    }
}
