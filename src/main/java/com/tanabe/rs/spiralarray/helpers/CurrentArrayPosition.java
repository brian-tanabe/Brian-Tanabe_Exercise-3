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

    public void move(){
        currentColumnIndex += currentDirection.getColumnIndexAdjustmentForMovementDirection();
        currentRowIndex += currentDirection.getRowIndexAdjustmentForMovementDirection();
    }

    public void turn(){
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
}
