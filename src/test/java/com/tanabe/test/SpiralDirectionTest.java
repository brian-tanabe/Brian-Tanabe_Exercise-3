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
        assertEquals("1st turn", SpiralDirection.DOWN, spiralDirection.turn());
    }

    @Test
    public void turnTwice(){
        SpiralDirection spiralDirection = SpiralDirection.getStartingDirection();
        assertEquals("Initial direction", SpiralDirection.RIGHT, spiralDirection);
        assertEquals("1st turn", SpiralDirection.DOWN, spiralDirection.turn());
        assertEquals("2nd turn", SpiralDirection.LEFT, spiralDirection.turn().turn());
    }

    @Test
    public void turnThreeTimes(){
        SpiralDirection spiralDirection = SpiralDirection.getStartingDirection();
        assertEquals("Initial direction", SpiralDirection.RIGHT, spiralDirection);
        assertEquals("1st turn", SpiralDirection.DOWN, spiralDirection.turn());
        assertEquals("2nd turn", SpiralDirection.LEFT, spiralDirection.turn().turn());
        assertEquals("3rd turn", SpiralDirection.UP, spiralDirection.turn().turn().turn());
    }

    @Test
    public void turnFourTimes(){
        SpiralDirection spiralDirection = SpiralDirection.getStartingDirection();
        assertEquals("Initial direction", SpiralDirection.RIGHT, spiralDirection);
        assertEquals("1st turn", SpiralDirection.DOWN, spiralDirection.turn());
        assertEquals("2nd turn", SpiralDirection.LEFT, spiralDirection.turn().turn());
        assertEquals("3rd turn", SpiralDirection.UP, spiralDirection.turn().turn().turn());
        assertEquals("4th turn", SpiralDirection.RIGHT, spiralDirection.turn().turn().turn().turn());
    }
}
