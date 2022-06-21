package PackageSeven;

import PackageTwo.ClassTwoMultiplicationDivision;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassSeven {

    int q = 10;
    int w = 5;
    ClassTwoMultiplicationDivision c2 = new ClassTwoMultiplicationDivision();

    @Test
    public void multiplicationTestPositive(){
        int result = 50;

        Assert.assertTrue(result == c2.multiplicationMethod(q,w));
    }

    @Test
    public void multiplicationTestNegative(){
        int result = 30;

        Assert.assertFalse(result == c2.multiplicationMethod(q,w));
    }

    @Test
    public void divisionTestPositive(){
        int result = 2;

        Assert.assertTrue(result==c2.divisionMethod(q,w));
    }

    @Test
    public void divisionTestNrgative(){
        int result = 4;

        Assert.assertFalse(result==c2.divisionMethod(q,w));
    }
}
