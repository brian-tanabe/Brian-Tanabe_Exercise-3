package com.tanabe.test;

import com.tanabe.rs.spiralarray.SpiralArray;
import com.tanabe.rs.spiralarray.SpiralArrayPopulator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Brian on 7/3/2014.
 */
public class SpiralArrayPopulatorTest {

    @Test
    public void checkSpiralArrayValuesForZero(){
        SpiralArray testSpiralArray = SpiralArrayPopulator.createAndPopulateSpiralArray(0);
        assertEquals(0, testSpiralArray.getSpiralArray()[0][0]);
    }
}
