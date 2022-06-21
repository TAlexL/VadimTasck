package PackageSix;

import PackageOne.ClassOnePlusMinus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassSix {
    int q = 25;
    int w = 12;
    ClassOnePlusMinus c1 = new ClassOnePlusMinus();

    @Test
    public void plusTestPositive(){
        int result = 37;

        Assert.assertTrue(result == c1.plusMethod(q,w));
    }
    @Test
    public void plusTestNegative(){
        int result = 33;

        Assert.assertFalse(result == c1.plusMethod(q,w));
    }
    @Test
    public void minusTestPositive(){
        int result = 13;

        Assert.assertTrue(result == c1.minusMethod(q,w));
    }
    @Test
    public void minusTestNegative(){
        int result = 22;

        Assert.assertFalse(result == c1.minusMethod(q,w));
    }
}
