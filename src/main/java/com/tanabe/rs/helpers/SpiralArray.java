package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArray {
    protected int arrayHeight;
    protected int arrayWidth;

    public SpiralArray(int numberToPrintTo){
        arrayWidth = getSpiralArrayWidth(numberToPrintTo);
        arrayHeight = getSpiralArrayHeight(numberToPrintTo);
    }

    // For JUnit:
    protected SpiralArray(){}

    protected static int getSpiralArrayWidth(int numberToPrintUpTo){
        return 1 + (int)Math.floor(Math.sqrt(numberToPrintUpTo));
    }

    protected static int getSpiralArrayHeight(int numberToPrintUpTo){
        // TODO REFACTOR THIS:
        if(numberToPrintUpTo < 2){
            return 1;
        } else {
            return 1 + (int)Math.floor(Math.sqrt(numberToPrintUpTo));
        }
    }

    // GETTERS:
    public int getArrayHeight() {
        return arrayHeight;
    }

    public int getArrayWidth() {
        return arrayWidth;
    }
}
