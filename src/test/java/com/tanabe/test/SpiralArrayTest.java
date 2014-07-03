package com.tanabe.test;

import com.tanabe.rs.spiralarray.SpiralArray;
import org.junit.Test;

import static com.tanabe.rs.spiralarray.SpiralArray.EMPTY_SLOT;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayTest {

    //region getArrayWidthTests:
    @Test
    public void testGetArrayWidthForZero(){
        SpiralArray testArray = new SpiralArray(0);
        assertEquals(1, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForOne(){
        SpiralArray testArray = new SpiralArray(1);
        assertEquals(2, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForTwo(){
        SpiralArray testArray = new SpiralArray(2);
        assertEquals(2, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForThree(){
        SpiralArray testArray = new SpiralArray(3);
        assertEquals(2, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForFour(){
        SpiralArray testArray = new SpiralArray(4);
        assertEquals(3, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForNine(){
        SpiralArray testArray = new SpiralArray(9);
        assertEquals(4, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForTwentyFour(){
        SpiralArray testArray = new SpiralArray(24);
        assertEquals(5, testArray.getArrayWidth());
    }

    @Test
    public void testGetArrayWidthForTwentyFive(){
        SpiralArray testArray = new SpiralArray(25);
        assertEquals(6, testArray.getArrayWidth());
    }
    //endregion

    //region getArrayHeightTests:
    @Test
    public void testGetArrayHeightForZero(){
        SpiralArray testArray = new SpiralArray(0);
        assertEquals(1, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForOne(){
        SpiralArray testArray = new SpiralArray(1);
        assertEquals(1, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForTwo(){
        SpiralArray testArray = new SpiralArray(2);
        assertEquals(2, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForThree(){
        SpiralArray testArray = new SpiralArray(3);
        assertEquals(2, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForFour(){
        SpiralArray testArray = new SpiralArray(4);
        assertEquals(3, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForNine(){
        SpiralArray testArray = new SpiralArray(9);
        assertEquals(4, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForTwentyFour(){
        SpiralArray testArray = new SpiralArray(24);
        assertEquals(5, testArray.getArrayHeight());
    }

    @Test
    public void testGetArrayHeightForTwentyFive(){
        SpiralArray testArray = new SpiralArray(25);
        assertEquals(6, testArray.getArrayHeight());
    }
    //endregion

    //region createEmptySpiralArrayTests:
    @Test
    public void testCreateEmptySpiralArrayForZero(){
        SpiralArray testArray = new SpiralArray(0);
        int[][] spiralArray = testArray.getSpiralArray();
        assertEquals("Array width", 1, spiralArray.length);
        assertEquals("Array height", 1, spiralArray[0].length);
        assertTrue("Array cleared", isArrayEmpty(spiralArray));
    }

    @Test
    public void testCreateSpiralArrayForZero(){
        SpiralArray testArray = new SpiralArray(1);
        int[][] spiralArray = testArray.getSpiralArray();
        assertEquals("Array width", 2, spiralArray.length);
        assertEquals("Array height", 1, spiralArray[0].length);
        assertTrue("Array cleared", isArrayEmpty(spiralArray));
    }

    @Test
    public void testCreateSpiralArrayForTwo(){
        SpiralArray testArray = new SpiralArray(2);
        int[][] spiralArray = testArray.getSpiralArray();
        assertEquals("Array width", 2, spiralArray.length);
        assertEquals("Array height", 2, spiralArray[0].length);
        assertTrue("Array cleared", isArrayEmpty(spiralArray));
    }

    @Test
    public void testCreateSpiralArrayForThree(){
        SpiralArray testArray = new SpiralArray(4);
        int[][] spiralArray = testArray.getSpiralArray();
        assertEquals("Array width", 3, spiralArray.length);
        assertEquals("Array height", 3, spiralArray[0].length);
        assertTrue("Array cleared", isArrayEmpty(spiralArray));
    }

        private boolean isArrayEmpty(int[][] array){
            boolean isEmpty = true;
            for(int row = 0; row < array.length; row++){
                for(int column = 0; column < array[0].length; column++){
                    isEmpty &= (array[row][column] == EMPTY_SLOT);
                }
            }

            return true;
        }
    //endregion
}

