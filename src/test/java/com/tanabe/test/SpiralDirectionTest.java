package com.tanabe.test;

import com.tanabe.rs.spiralarray.helpers.SpiralDirection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralDirectionTest {

    @Test
    public void testChangeDirectionsOnce(){
        SpiralDirection spiralDirection = SpiralDirection.getStartingDirection();

        assertEquals("Initial direction", SpiralDirection.RIGHT, spiralDirection);

        spiralDirection = spiralDirection.turn();

        assertEquals("1st turn", SpiralDirection.DOWN, spiralDirection);
    }
}
