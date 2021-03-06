package com.tanabe.rs.array;

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

    public void set(int column, int row, int value){
        spiralArray[column][row] = value;
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
        return (int)(Math.ceil(Math.sqrt(numberToPrintUpTo + 1)) + (1 - Math.ceil(Math.sqrt(numberToPrintUpTo + 1)) % 2));
    }

    protected static int getSpiralArrayHeight(int numberToPrintUpTo){
        return (int)(Math.ceil(Math.sqrt(numberToPrintUpTo + 1)) + (1 - Math.ceil(Math.sqrt(numberToPrintUpTo + 1)) % 2));
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

    public int getValueFromSpiralArray(int column, int row){
        return spiralArray[column][row];
    }
    //endregion
}
