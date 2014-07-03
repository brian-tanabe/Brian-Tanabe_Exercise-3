package com.tanabe.rs.spiralarray.helpers;

import java.util.Iterator;

/**
 * Created by Brian on 7/3/2014.
 */
public class HitEachValueTwiceIterator implements Iterator<Integer> {
    private int currentValue = 0;
    private int hitCount = 0;

    public HitEachValueTwiceIterator(int startingValue){
        currentValue = startingValue;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {

        return currentValue;
    }

    @Override
    public void remove() {

    }
}
