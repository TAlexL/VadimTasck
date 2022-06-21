package PackageNine;

import PackageFour.ClassFourAreaVolumeOfSquare;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassNine {

    int q = 5;
    ClassFourAreaVolumeOfSquare c4 = new ClassFourAreaVolumeOfSquare();

    @Test
    public void areaOfSquareTestPositive(){
        int result = 25;

        Assert.assertTrue(result == c4.areaOfSquareMethod(q));
    }

    @Test
    public void areaOfSquareTestNegative(){
        int result = 52;

        Assert.assertFalse(result == c4.areaOfSquareMethod(q));
    }

    @Test
    public void volumeOfSquareTestPositive(){
        int result = 125;

        Assert.assertTrue(result == c4.volumeOfSquareMethod(q));
    }

    @Test
    public void volumeOfSquareTestNegative(){
        int result = 500;

        Assert.assertFalse(result == c4.volumeOfSquareMethod(q));
    }
}
