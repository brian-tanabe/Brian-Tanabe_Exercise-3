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

    @Test
    public void checkSpiralArrayValuesForFour(){
        SpiralArray testSpiralArray = new SpiralArrayPopulator(4).createAndPopulateSpiralArray();
        assertEquals("zero placement", 0, testSpiralArray.getSpiralArray()[1][1]);
        assertEquals("one placement", 1, testSpiralArray.getSpiralArray()[2][1]);
        assertEquals("two placement", 2, testSpiralArray.getSpiralArray()[2][2]);
        assertEquals("three placement", 3, testSpiralArray.getSpiralArray()[1][2]);
        assertEquals("four placement", 4, testSpiralArray.getSpiralArray()[0][2]);
    }

    @Test
    public void checkSpiralArrayValuesForEight(){
        SpiralArray testSpiralArray = new SpiralArrayPopulator(8).createAndPopulateSpiralArray();
        assertEquals("zero placement", 0, testSpiralArray.getSpiralArray()[1][1]);
        assertEquals("one placement", 1, testSpiralArray.getSpiralArray()[2][1]);
        assertEquals("two placement", 2, testSpiralArray.getSpiralArray()[2][2]);
        assertEquals("three placement", 3, testSpiralArray.getSpiralArray()[1][2]);
        assertEquals("four placement", 4, testSpiralArray.getSpiralArray()[0][2]);
        assertEquals("five placement", 5, testSpiralArray.getSpiralArray()[0][1]);
        assertEquals("six placement", 6, testSpiralArray.getSpiralArray()[0][0]);
        assertEquals("seven placement", 7, testSpiralArray.getSpiralArray()[1][0]);
        assertEquals("eight placement", 8, testSpiralArray.getSpiralArray()[2][0]);
    }

    @Test
    public void checkSpiralArrayValuesForTwentyFour(){
        SpiralArray testSpiralArray = new SpiralArrayPopulator(24).createAndPopulateSpiralArray();
        assertEquals("zero placement", 0, testSpiralArray.getSpiralArray()[2][2]);
        assertEquals("one placement", 1, testSpiralArray.getSpiralArray()[3][2]);
        assertEquals("two placement", 2, testSpiralArray.getSpiralArray()[3][3]);
        assertEquals("three placement", 3, testSpiralArray.getSpiralArray()[2][3]);
        assertEquals("four placement", 4, testSpiralArray.getSpiralArray()[1][3]);
        assertEquals("five placement", 5, testSpiralArray.getSpiralArray()[1][2]);
        assertEquals("six placement", 6, testSpiralArray.getSpiralArray()[1][1]);
        assertEquals("seven placement", 7, testSpiralArray.getSpiralArray()[2][1]);
        assertEquals("eight placement", 8, testSpiralArray.getSpiralArray()[3][1]);
        assertEquals("nine placement", 9, testSpiralArray.getSpiralArray()[4][1]);
        assertEquals("ten placement", 10, testSpiralArray.getSpiralArray()[4][2]);
        assertEquals("eleven placement", 11, testSpiralArray.getSpiralArray()[4][3]);
        assertEquals("twelve placement", 12, testSpiralArray.getSpiralArray()[4][4]);
        assertEquals("thirteen placement", 13, testSpiralArray.getSpiralArray()[3][4]);
        assertEquals("fourteen placement", 14, testSpiralArray.getSpiralArray()[2][4]);
        assertEquals("fifteen placement", 15, testSpiralArray.getSpiralArray()[1][4]);
        assertEquals("sixteen placement", 16, testSpiralArray.getSpiralArray()[0][4]);
        assertEquals("seventeen placement", 17, testSpiralArray.getSpiralArray()[0][3]);
        assertEquals("eighteen placement", 18, testSpiralArray.getSpiralArray()[0][2]);
        assertEquals("nineteen placement", 19, testSpiralArray.getSpiralArray()[0][1]);
        assertEquals("twenty placement", 20, testSpiralArray.getSpiralArray()[0][0]);
        assertEquals("twenty-one placement", 21, testSpiralArray.getSpiralArray()[1][0]);
        assertEquals("twenty-two placement", 22, testSpiralArray.getSpiralArray()[2][0]);
        assertEquals("twenty-three placement", 23, testSpiralArray.getSpiralArray()[3][0]);
        assertEquals("twenty-four placement", 24, testSpiralArray.getSpiralArray()[4][0]);
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
