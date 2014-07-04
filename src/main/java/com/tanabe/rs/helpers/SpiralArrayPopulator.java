package com.tanabe.rs.helpers;

import com.tanabe.rs.array.SpiralArray;
import com.tanabe.rs.array.movement.CurrentArrayPosition;
import com.tanabe.rs.array.movement.HitEachValueTwiceIterator;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayPopulator {
    protected int numberToPrintUpTo;
    protected SpiralArray spiralArray;

    private CurrentArrayPosition currentPosition;

    public SpiralArrayPopulator(int numberToPrintUpTo){
        this.numberToPrintUpTo = numberToPrintUpTo;
        spiralArray = new SpiralArray(numberToPrintUpTo);
        currentPosition = new CurrentArrayPosition(determineStartingIndices(spiralArray));
    }

    // For JUnit:
    protected SpiralArrayPopulator(){}

    public SpiralArray createAndPopulateSpiralArray(){
        spiralArray = new SpiralArray(numberToPrintUpTo);
        spiralArray.set(currentPosition.getCurrentColumnIndex(), currentPosition.getCurrentRowIndex(), 0);
        currentPosition.move();

        int numberToAddToArray = 1;
        HitEachValueTwiceIterator stepIterator = new HitEachValueTwiceIterator(1);
        while(numberToAddToArray <= numberToPrintUpTo){
            int stepsToTakeBeforeTurning = stepIterator.next();
            int stepsTakenSinceLastTurn = 0;
            do {
                spiralArray.set(currentPosition.getCurrentColumnIndex(), currentPosition.getCurrentRowIndex(), numberToAddToArray);
                numberToAddToArray++;
                stepsTakenSinceLastTurn++;
            } while(numberToAddToArray <= numberToPrintUpTo && stepsTakenSinceLastTurn < stepsToTakeBeforeTurning && currentPosition.move());

            currentPosition.turnRight();
            currentPosition.move();
        }


        return spiralArray;
    }

    protected static int determineStartingIndices(SpiralArray array){
        return (int)array.getArrayWidth() / 2;
    }

}
