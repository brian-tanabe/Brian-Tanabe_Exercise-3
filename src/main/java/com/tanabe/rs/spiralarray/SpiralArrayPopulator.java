package com.tanabe.rs.spiralarray;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayPopulator {
    protected int numberToPrintUpTo;
    protected SpiralArray spiralArray;

    public SpiralArrayPopulator(int numberToPrintUpTo){
        this.numberToPrintUpTo = numberToPrintUpTo;
        spiralArray = new SpiralArray(numberToPrintUpTo);
    }

    protected SpiralArrayPopulator(){}

    public SpiralArray createAndPopulateSpiralArray(){

        return null;
    }

    protected static int determineStartingIndices(SpiralArray array){
        return (int)(Math.ceil(Math.sqrt(array.getArrayHeight())) - 1);
    }
}
