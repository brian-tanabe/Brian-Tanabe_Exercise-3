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

    // For JUnit:
    protected SpiralArrayPopulator(){}

    public SpiralArray createAndPopulateSpiralArray(){
        spiralArray = new SpiralArray(numberToPrintUpTo);

//        for(int numberToAddToArray = 0; numberToAddToArray <= numberToPrintUpTo;){
//
//        }

        return spiralArray;
    }

    protected static int determineStartingIndices(SpiralArray array){
        if(array.getArrayWidth() < 3)
            return determineStartingIndicesWhenStartingInTheUpperLeftCorner(array);
        else
            return determineStartingIndicesWhenStartingInTheCenter(array);
    }

        private static int determineStartingIndicesWhenStartingInTheUpperLeftCorner(SpiralArray array){
            return (int)(Math.floor(Math.sqrt(array.getArrayHeight())) - 1);
        }

        private static int determineStartingIndicesWhenStartingInTheCenter(SpiralArray array){
            return (int)Math.floor(Math.sqrt(array.getArrayHeight()));
        }
}
