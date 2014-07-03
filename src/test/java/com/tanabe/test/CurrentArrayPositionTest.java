package com.tanabe.test;

import com.tanabe.rs.spiralarray.helpers.CurrentArrayPosition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 7/3/2014.
 */
public class CurrentArrayPositionTest {

    @Test
    public void testStartAtOneOneAndMoveRight(){
        CurrentArrayPosition position = new CurrentArrayPosition(1);
        position.move();
        assertEquals("column", 2, position.getCurrentColumnIndex());
        assertEquals("row", 1, position.getCurrentRowIndex());
    }

    @Test
    public void testStartAtOneOneAndMoveRightOnceDownOnce(){
        CurrentArrayPosition position = new CurrentArrayPosition(1);
        position.move();
        position.turnRight();
        position.move();
        assertEquals("column", 2, position.getCurrentColumnIndex());
        assertEquals("row", 2, position.getCurrentRowIndex());
    }
}
