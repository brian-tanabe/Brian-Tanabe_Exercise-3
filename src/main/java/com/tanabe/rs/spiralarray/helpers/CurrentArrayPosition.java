package com.tanabe.rs.spiralarray.helpers;

/**
 * Created by Brian on 7/3/2014.
 */
public class CurrentArrayPosition {
    protected int currentColumnIndex;
    protected int currentRowIndex;



    public CurrentArrayPosition(int startingIndex){
        currentColumnIndex = startingIndex;
        currentRowIndex = startingIndex;
    }
}
