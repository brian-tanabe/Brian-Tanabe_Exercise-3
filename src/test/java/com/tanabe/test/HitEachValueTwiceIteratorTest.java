package com.tanabe.test;

import com.tanabe.rs.spiralarray.helpers.HitEachValueTwiceIterator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Brian on 7/3/2014.
 */
public class HitEachValueTwiceIteratorTest {

    @Test
    public void testStartAtOne(){
        HitEachValueTwiceIterator iterator = new HitEachValueTwiceIterator(1);
        assertEquals((int)1, (int)iterator.next());
    }
}
