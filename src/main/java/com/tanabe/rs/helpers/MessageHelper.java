package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/3/2014.
 */
public class MessageHelper {
    public static final String NEW_LINE = "\r\n";
    public static final String TAB = "\t";

    public static String getHelpMessage(){
        String helpMessage = "You must specify a number to print a sprial array up to" + NEW_LINE;
        helpMessage +=       "< java -jar brian-tanabe-exercise-three.jar 4 > would output:" + NEW_LINE + NEW_LINE;
        helpMessage +=       TAB + "0" + TAB + "1" + NEW_LINE;
        helpMessage +=       TAB + "3" + TAB + "2" + NEW_LINE;
        helpMessage +=       "exiting";

        return helpMessage;
    }
}
