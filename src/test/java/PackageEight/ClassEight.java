package PackageEight;

import PackageThree.ClassThreePerimeterSquareRectangle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassEight {

    int q = 5;
    int w = 10;
    ClassThreePerimeterSquareRectangle c3 = new ClassThreePerimeterSquareRectangle();

    @Test
    public void perimeterOfSquareTestPositive(){
        int result = 20;

        Assert.assertTrue(result == c3.perimeterOfSquareMethod(q));
    }

    @Test
    public void perimeterOfSquareTestNegative(){
        int result = 21;

        Assert.assertFalse(result == c3.perimeterOfSquareMethod(q));
    }

    @Test
    public void perimeterOfRectangleTestPositive(){
        int result = 30;

        Assert.assertTrue(result == c3.perimeterOfRectangle(q,w));
    }

    @Test
    public void perimeterOfRectangleTestNegative(){
        int result = 50;

        Assert.assertFalse(result == c3.perimeterOfRectangle(q,w));
    }
}
