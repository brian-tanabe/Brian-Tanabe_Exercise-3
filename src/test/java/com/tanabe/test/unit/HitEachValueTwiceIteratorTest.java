package com.tanabe.test.unit;

import com.tanabe.rs.array.movement.HitEachValueTwiceIterator;
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

    @Test
    public void testHitOneTwice(){
        HitEachValueTwiceIterator iterator = new HitEachValueTwiceIterator(1);
        assertEquals("first hit", (int)1, (int)iterator.next());
        assertEquals("second hit", (int)1, (int)iterator.next());
    }

    @Test
    public void testHitOneTwiceTwoOnce(){
        HitEachValueTwiceIterator iterator = new HitEachValueTwiceIterator(1);
        assertEquals("first hit one", (int)1, (int)iterator.next());
        assertEquals("second hit one", (int)1, (int)iterator.next());
        assertEquals("first hit two", (int)2, (int)iterator.next());
    }

    @Test
    public void testHitOneTwiceTwoTwice(){
        HitEachValueTwiceIterator iterator = new HitEachValueTwiceIterator(1);
        assertEquals("first hit one", (int)1, (int)iterator.next());
        assertEquals("second hit one", (int)1, (int)iterator.next());
        assertEquals("first hit two", (int)2, (int)iterator.next());
        assertEquals("second hit two", (int)2, (int)iterator.next());
    }

    @Test
    public void testHitOneTwiceTwoTwiceThreeOnce(){
        HitEachValueTwiceIterator iterator = new HitEachValueTwiceIterator(1);
        assertEquals("first hit one", (int)1, (int)iterator.next());
        assertEquals("second hit one", (int)1, (int)iterator.next());
        assertEquals("first hit two", (int)2, (int)iterator.next());
        assertEquals("second hit two", (int)2, (int)iterator.next());
        assertEquals("first hit three", (int)3, (int)iterator.next());
    }

    @Test
    public void testHitOneTwiceTwoTwiceThreeTwice(){
        HitEachValueTwiceIterator iterator = new HitEachValueTwiceIterator(1);
        assertEquals("first hit one", (int)1, (int)iterator.next());
        assertEquals("second hit one", (int)1, (int)iterator.next());
        assertEquals("first hit two", (int)2, (int)iterator.next());
        assertEquals("second hit two", (int)2, (int)iterator.next());
        assertEquals("first hit three", (int)3, (int)iterator.next());
        assertEquals("second hit three", (int)3, (int)iterator.next());
    }
}
