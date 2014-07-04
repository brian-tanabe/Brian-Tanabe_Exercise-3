package com.tanabe.test;

import com.tanabe.rs.spiralarray.SpiralArray;
import com.tanabe.rs.spiralarray.SpiralArrayPopulator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayPopulatorTest extends SpiralArrayPopulator {

    @Test
    public void checkSpiralArrayValuesForZero(){
        SpiralArray testSpiralArray = new SpiralArrayPopulator(0).createAndPopulateSpiralArray();
        assertEquals(0, testSpiralArray.getSpiralArray()[0][0]);
    }

    @Test
    public void checkSpiralArrayValuesForOne(){
        SpiralArray testSpiralArray = new SpiralArrayPopulator(1).createAndPopulateSpiralArray();
        assertEquals("zero placement", 0, testSpiralArray.getSpiralArray()[0][0]);
        assertEquals("one placement", 1, testSpiralArray.getSpiralArray()[1][0]);
    }

    @Test
    public void checkSpiralArrayValuesForTwo(){
        SpiralArray testSpiralArray = new SpiralArrayPopulator(2).createAndPopulateSpiralArray();
        assertEquals("zero placement", 0, testSpiralArray.getSpiralArray()[0][0]);
        assertEquals("one placement", 1, testSpiralArray.getSpiralArray()[1][0]);
        assertEquals("two placement", 2, testSpiralArray.getSpiralArray()[1][1]);
    }

    @Test
    public void checkSpiralArrayValuesForThree(){
        SpiralArray testSpiralArray = new SpiralArrayPopulator(3).createAndPopulateSpiralArray();
        assertEquals("zero placement", 0, testSpiralArray.getSpiralArray()[0][0]);
        assertEquals("one placement", 1, testSpiralArray.getSpiralArray()[1][0]);
        assertEquals("two placement", 2, testSpiralArray.getSpiralArray()[1][1]);
        assertEquals("three placement", 3, testSpiralArray.getSpiralArray()[0][1]);
    }

    //region determineIndicesTests
    @Test
    public void testDetermineStartingIndicesForZero(){
        assertEquals(0, SpiralArrayPopulator.determineStartingIndices(new SpiralArray(0)));
    }

    @Test
    public void testDetermineStartingIndicesForOne(){
        assertEquals(0, SpiralArrayPopulator.determineStartingIndices(new SpiralArray(1)));
    }

    @Test
    public void testDetermineStartingIndicesForTwo(){
        assertEquals(0, SpiralArrayPopulator.determineStartingIndices(new SpiralArray(2)));
    }

    @Test
    public void testDetermineStartingIndicesForThree(){
        assertEquals(0, SpiralArrayPopulator.determineStartingIndices(new SpiralArray(3)));
    }

    @Test
    public void testDetermineStartingIndicesForFour(){
        assertEquals(1, SpiralArrayPopulator.determineStartingIndices(new SpiralArray(4)));
    }

    @Test
    public void testDetermineStartingIndicesForEight(){
        assertEquals(1, SpiralArrayPopulator.determineStartingIndices(new SpiralArray(8)));
    }
    //endregion
}
