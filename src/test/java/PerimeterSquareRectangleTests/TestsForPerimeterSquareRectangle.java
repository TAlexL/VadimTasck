package PerimeterSquareRectangleTests;

import PerimeterSquareRectangleMethods.PerimeterSquareRectangle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsForPerimeterSquareRectangle {

    PerimeterSquareRectangle perimeterSquareRectangle = new PerimeterSquareRectangle();

    @Test
    public void perimeterOfSquareTestPositive(){

        Assert.assertTrue(20 == perimeterSquareRectangle.perimeterOfSquare(5));
    }

    @Test
    public void perimeterOfSquareTestNegative(){

        Assert.assertFalse(21 == perimeterSquareRectangle.perimeterOfSquare(5));
    }

    @Test
    public void perimeterOfRectangleTestPositive(){

        Assert.assertTrue(30 == perimeterSquareRectangle.perimeterOfRectangle(6, 9));
    }

    @Test
    public void perimeterOfRectangleTestNegative(){

        Assert.assertFalse(50 == perimeterSquareRectangle.perimeterOfRectangle(6,9));
    }
}
