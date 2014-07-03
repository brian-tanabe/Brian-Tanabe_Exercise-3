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
        if(array.getArrayWidth() < 3)
            return determineStartingIndiciesWhenStartingInTheUpperLeftCorner(array);
        else
            return determineStartingIndiciesWhenStartingInTheCenter(array);
    }

        private static int determineStartingIndiciesWhenStartingInTheUpperLeftCorner(SpiralArray array){
            return (int)(Math.floor(Math.sqrt(array.getArrayHeight())) - 1);
        }

        private static int determineStartingIndiciesWhenStartingInTheCenter(SpiralArray array){
            return (int)Math.floor(Math.sqrt(array.getArrayHeight()));
        }
}
