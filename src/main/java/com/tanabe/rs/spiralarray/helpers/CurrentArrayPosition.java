package com.tanabe.rs.spiralarray.helpers;

/**
 * Created by Brian on 7/3/2014.
 */
public class CurrentArrayPosition {
    protected int currentColumnIndex;
    protected int currentRowIndex;
    protected SpiralDirection currentDirection;

    public CurrentArrayPosition(int startingIndex){
        currentColumnIndex = startingIndex;
        currentRowIndex = startingIndex;
        currentDirection = SpiralDirection.getStartingDirection();
    }

    public boolean move(){
        currentColumnIndex += currentDirection.getColumnIndexAdjustmentForMovementDirection();
        currentRowIndex += currentDirection.getRowIndexAdjustmentForMovementDirection();
        return true;
    }

    public void turnRight(){
        currentDirection = currentDirection.turn();
    }

    public int getCurrentColumnIndex() {
        return currentColumnIndex;
    }

    public int getCurrentRowIndex(){
        return currentRowIndex;
    }

    public SpiralDirection getCurrentMovementDirectionDirection(){
        return currentDirection;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d), %s", currentColumnIndex, currentRowIndex, currentDirection);
    }
}
