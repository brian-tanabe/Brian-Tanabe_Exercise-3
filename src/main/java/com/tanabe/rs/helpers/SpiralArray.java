package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArray {
    protected int arrayHeight;
    protected int arrayWidth;

    protected static int getSpiralArrayWidth(int numberToPrintUpTo){
        return (int) Math.ceil(Math.sqrt(numberToPrintUpTo + 1));
    }

}
