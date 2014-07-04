package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/3/2014.
 */
public class MessageHelper {
    private static final String NEW_LINE = "\r\n";

    public static String getHelpMessage(){
        String helpMessage = "You must specify a number to print a sprial array up to" + NEW_LINE;
        helpMessage +=       "< java -jar brian-tanabe-exercise-three.jar 4 > would output:" + NEW_LINE + NEW_LINE;
        helpMessage +=       "\t0\t1" + NEW_LINE;
        helpMessage +=       "\t3\t2" + NEW_LINE;
        helpMessage +=       "exiting";

        return helpMessage;
    }
}
