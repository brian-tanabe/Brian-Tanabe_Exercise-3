package com.tanabe.rs.spiralarray;

import java.util.Arrays;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArray {
    public static final int EMPTY_SLOT = -1;
    protected int arrayHeight;
    protected int arrayWidth;
    protected int[][] spiralArray;

    public SpiralArray(int numberToPrintTo){
        arrayWidth = getSpiralArrayWidth(numberToPrintTo);
        arrayHeight = getSpiralArrayHeight(numberToPrintTo);

        instantiateSpiralArray();
    }


    //region PRIVATE HELPER FUNCTIONS:
    private void instantiateSpiralArray() {
        spiralArray = new int[arrayWidth][arrayHeight];
        setSpiralArraySlotsToAllEmpty();
    }

        private void setSpiralArraySlotsToAllEmpty(){
            for(int row = 0; row < spiralArray.length; row++){
                Arrays.fill(spiralArray[row], EMPTY_SLOT);
            }
        }
    //endregion

    //region PROTECTED HELPER FUNCTIONS:
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
    //endregion

    //region GETTERS:
    public int getArrayHeight() {
        return arrayHeight;
    }

    public int getArrayWidth() {
        return arrayWidth;
    }

    public int[][] getSpiralArray(){
        return spiralArray;
    }
    //endregion
}
