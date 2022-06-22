package AreaCircleAndVolumeSphereTests;

import AreaCircleAndVolumeSphereMethods.AreaCircleAndVolumeSphere;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsAreaCircleAndVolumeSphere {

    AreaCircleAndVolumeSphere areaCircleAndVolumeSphere = new AreaCircleAndVolumeSphere();

    @Test
    public void areaOfCircleTestPositive(){

        Assert.assertTrue(78.5F == areaCircleAndVolumeSphere.areaOfCircleMethod(5));
    }

    @Test
    public void areaOfCircleTestNegative(){

        Assert.assertFalse(78.8F == areaCircleAndVolumeSphere.areaOfCircleMethod(5));
    }

    @Test
    public void volumeOfSphereTestPositive(){

        Assert.assertTrue(523.2025F == areaCircleAndVolumeSphere.volumeSphereMethod(5));
    }

    @Test
    public void volumeOfSphereTestNegative(){

        Assert.assertFalse(520.1F == areaCircleAndVolumeSphere.volumeSphereMethod(5));
    }
}
