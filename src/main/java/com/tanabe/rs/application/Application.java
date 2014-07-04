package com.tanabe.rs.application;

import com.tanabe.rs.array.SpiralArray;
import com.tanabe.rs.helpers.CommandLineArgumentHelper;
import com.tanabe.rs.helpers.MessageHelper;
import com.tanabe.rs.helpers.SpiralArrayPopulator;
import com.tanabe.rs.helpers.SpiralArrayPrinter;

/**
 * Created by Brian on 7/3/2014.
 */
public class Application {

    public static void main(String[] args){
        try {
            CommandLineArgumentHelper commandLineArgumentHelper = new CommandLineArgumentHelper(args);
            int numberToPrintUpTo = commandLineArgumentHelper.getIntegerFromCommandLineArgumentsOrPrintHelp();
            SpiralArrayPopulator arrayPopulator = new SpiralArrayPopulator(numberToPrintUpTo);
            SpiralArray spiralArray = arrayPopulator.createAndPopulateSpiralArray();
            SpiralArrayPrinter.printSpiralArray(spiralArray);
        } catch (IllegalArgumentException ex){
            System.out.print(MessageHelper.getHelpMessage());
        }
    }
}
