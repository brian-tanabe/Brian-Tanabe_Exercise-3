package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/3/2014.
 */
public class CommandLineArgumentHelper {
    protected String[] argsFromCommandLine;

    public CommandLineArgumentHelper(String[] argsFromCommandLine){
        this.argsFromCommandLine = argsFromCommandLine;
    }

    public int getIntegerFromCommandLineArgumentsOrPrintHelp() throws IllegalArgumentException {
        if(argsFromCommandLine.length != 1) {
            throw new IllegalArgumentException();
        } else {
            return extractIntegerFromArguments();
        }
    }

    private int extractIntegerFromArguments() throws NumberFormatException {
        return Integer.parseInt(argsFromCommandLine[0]);
    }
}
