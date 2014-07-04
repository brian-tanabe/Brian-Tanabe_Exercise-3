package com.tanabe.test.unit;

import com.tanabe.rs.array.movement.CurrentArrayPosition;
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

    @Test
    public void testStartAtOneOneAndMoveRightOnceDownOnceLeftOnce(){
        CurrentArrayPosition position = new CurrentArrayPosition(1);
        position.move();
        position.turnRight();
        position.move();
        position.turnRight();
        position.move();
        assertEquals("column", 1, position.getCurrentColumnIndex());
        assertEquals("row", 2, position.getCurrentRowIndex());
    }

    @Test
    public void testStartAtOneOneAndMoveRightOnceDownOnceLeftTwice(){
        CurrentArrayPosition position = new CurrentArrayPosition(1);
        position.move();
        position.turnRight();
        position.move();
        position.turnRight();
        position.move();
        position.move();
        assertEquals("column", 0, position.getCurrentColumnIndex());
        assertEquals("row", 2, position.getCurrentRowIndex());
    }

    @Test
    public void testStartAtOneOneAndMoveRightOnceDownOnceLeftTwiceUpOnce(){
        CurrentArrayPosition position = new CurrentArrayPosition(1);
        position.move();
        position.turnRight();
        position.move();
        position.turnRight();
        position.move();
        position.move();
        position.turnRight();
        position.move();
        assertEquals("column", 0, position.getCurrentColumnIndex());
        assertEquals("row", 1, position.getCurrentRowIndex());
    }

    @Test
    public void testStartAtOneOneAndMoveRightOnceDownOnceLeftTwiceUpTwice(){
        CurrentArrayPosition position = new CurrentArrayPosition(1);
        position.move();
        position.turnRight();
        position.move();
        position.turnRight();
        position.move();
        position.move();
        position.turnRight();
        position.move();
        position.move();
        assertEquals("column", 0, position.getCurrentColumnIndex());
        assertEquals("row", 0, position.getCurrentRowIndex());
    }

    @Test
    public void testStartAtOneOneAndMoveRightOnceDownOnceLeftTwiceUpTwiceRightThreeTimes(){
        CurrentArrayPosition position = new CurrentArrayPosition(1);
        position.move();
        position.turnRight();
        position.move();
        position.turnRight();
        position.move();
        position.move();
        position.turnRight();
        position.move();
        position.move();
        position.turnRight();
        position.move();
        position.move();
        position.move();
        assertEquals("column", 3, position.getCurrentColumnIndex());
        assertEquals("row", 0, position.getCurrentRowIndex());
    }
}
