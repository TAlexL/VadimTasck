package MultiplicationDivisionTests;

import MultiplicationDivisionMethods.MultiplicationDivision;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForMultiplicationDivision {

    MultiplicationDivision multiplicationDivision = new MultiplicationDivision();

    @Test
    public void multiplicationTestPositive(){

        Assert.assertTrue(50 == multiplicationDivision.multiplicationMethod(10,5));
    }

    @Test
    public void multiplicationTestNegative(){

        Assert.assertFalse(30 == multiplicationDivision.multiplicationMethod(10,5));
    }

    @Test
    public void divisionTestPositive(){

        Assert.assertTrue(2 == multiplicationDivision.divisionMethod(10,5));
    }

    @Test
    public void divisionTestNrgative(){

        Assert.assertFalse(4 == multiplicationDivision.divisionMethod(10,5));
    }
}
