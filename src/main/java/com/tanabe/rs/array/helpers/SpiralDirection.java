package com.tanabe.rs.array.helpers;

/**
 * Created by Brian on 7/3/2014.
 */
public enum SpiralDirection {
    RIGHT(SpiralDirectionType.RIGHT_TYPE),
    DOWN(SpiralDirectionType.DOWN_TYPE),
    LEFT(SpiralDirectionType.LEFT_TYPE),
    UP(SpiralDirectionType.UP_TYPE);

    private SpiralDirectionType type;

    private SpiralDirection(SpiralDirectionType type) {
        this.type = type;
    }

    public SpiralDirection turn(){
        SpiralDirection[] possibleDirections = SpiralDirection.values();
        int currentDirection = this.ordinal();
        return possibleDirections[(currentDirection + 1) % 4];
    }

    public static SpiralDirection getStartingDirection(){
        return SpiralDirection.RIGHT;
    }

    public int getColumnIndexAdjustmentForMovementDirection(){
        switch(this){
            case RIGHT:
                return 1;
            case LEFT:
                return -1;
            case DOWN:
            case UP:
            default:
                return 0;
        }
    }

    public int getRowIndexAdjustmentForMovementDirection(){
        switch(this){
            case DOWN:
                return 1;
            case UP:
                return -1;
            case LEFT:
            case RIGHT:
            default:
                return 0;
        }
    }
}
