package AreaVolumeOfSquareTests;

import AreaVolumeOfSquareMethods.AreaVolumeOfSquare;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsAreaVolumeOfSquare {

    AreaVolumeOfSquare areaVolumeOfSquare = new AreaVolumeOfSquare();

    @Test
    public void areaOfSquareTestPositive(){

        Assert.assertTrue(25 == areaVolumeOfSquare.areaOfSquareMethod(5));
    }

    @Test
    public void areaOfSquareTestNegative(){

        Assert.assertFalse(52 == areaVolumeOfSquare.areaOfSquareMethod(5));
    }

    @Test
    public void volumeOfSquareTestPositive(){

        Assert.assertTrue(125 == areaVolumeOfSquare.volumeOfSquareMethod(5));
    }

    @Test
    public void volumeOfSquareTestNegative(){

        Assert.assertFalse(500 == areaVolumeOfSquare.volumeOfSquareMethod(5));
    }
}
