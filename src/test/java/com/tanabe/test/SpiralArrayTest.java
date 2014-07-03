package com.tanabe.test;

import com.tanabe.rs.helpers.SpiralArray;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayTest extends SpiralArray {


    @Test
    public void testGetArrayWidthForTwentyFour(){
        assertEquals(5, getSpiralArrayWidth(25));
    }
}
