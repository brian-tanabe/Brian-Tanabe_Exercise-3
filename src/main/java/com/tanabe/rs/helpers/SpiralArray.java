package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArray {


    protected static int getSpiralArrayWidth(int numberToPrintUpTo){
        return (int)Math.floor(Math.sqrt(numberToPrintUpTo + 1));
    }
}
