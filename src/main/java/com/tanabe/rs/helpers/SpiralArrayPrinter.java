package com.tanabe.rs.helpers;

import com.tanabe.rs.array.SpiralArray;

import static com.tanabe.rs.array.SpiralArray.EMPTY_SLOT;
import static com.tanabe.rs.helpers.MessageHelper.NEW_LINE;
import static com.tanabe.rs.helpers.MessageHelper.TAB;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayPrinter {

    public static void printSpiralArray(SpiralArray spiralArray){
        for(int rowIndex = 0; rowIndex < spiralArray.getArrayHeight(); rowIndex++){
            for(int columnIndex = 0; columnIndex < spiralArray.getArrayWidth(); columnIndex++){
                if(spiralArray.getValueFromSpiralArray(columnIndex, rowIndex) != EMPTY_SLOT){
                    System.out.print(String.format("\t%d", spiralArray.getValueFromSpiralArray(columnIndex, rowIndex)));
                } else {
                    System.out.print(TAB);
                }
            }

            System.out.print(NEW_LINE);
        }
    }
}
