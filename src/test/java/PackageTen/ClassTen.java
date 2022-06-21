package PackageTen;

import PackageFive.ClassFiveAreaCircleVolumeSphere;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTen {
    int q = 5;
    ClassFiveAreaCircleVolumeSphere c5 = new ClassFiveAreaCircleVolumeSphere();

    @Test
    public void areaOfCircleTestPositive(){
        float result = 78.5F;

        Assert.assertTrue(result == c5.areaOfCircleMethod(q));
    }

    @Test
    public void areaOfCircleTestNegative(){
        float result = 78.8F;

        Assert.assertFalse(result == c5.areaOfCircleMethod(q));
    }

    @Test
    public void volumeOfSphereTestPositive(){
        float result = 523.2025F;

        Assert.assertTrue(result == c5.volumeSphereMethod(q));
    }

    @Test
    public void volumeOfSphereTestNegative(){
        float result = 520.1F;

        Assert.assertFalse(result == c5.volumeSphereMethod(q));
    }
}
