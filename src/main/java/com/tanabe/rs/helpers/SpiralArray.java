package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArray {
    protected int arrayHeight;
    protected int arrayWidth;

    protected static int getSpiralArrayWidth(int numberToPrintUpTo){
        return 1 + (int)Math.floor(Math.sqrt(numberToPrintUpTo));

//        return (int)(Math.floor(Math.sqrt(numberToPrintUpTo)) + 1);
//        return (int) Math.ceil(Math.sqrt(numberToPrintUpTo + 1));
    }

    protected static int getSpiralArrayHeight(int numberToPrintUpTo){
        // TODO REFACTOR THIS:
        if(numberToPrintUpTo < 2){
            return 1;
        } else {
            return 1 + (int)Math.floor(Math.sqrt(numberToPrintUpTo));
        }
//        return (int) Math.ceil(Math.sqrt(numberToPrintUpTo + 1)) - 1;
    }
}
