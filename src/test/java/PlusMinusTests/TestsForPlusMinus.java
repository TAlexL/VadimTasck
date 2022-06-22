package PlusMinusTests;

import PlusMinusMethods.PlusMinus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsForPlusMinus {

    PlusMinus plusMinus = new PlusMinus();

    @Test
    public void plusTestPositive(){

        Assert.assertTrue(37 == plusMinus.plusMethod(25, 12));
    }
    @Test
    public void plusTestNegative(){

        Assert.assertFalse(33 == plusMinus.plusMethod(25, 12));
    }
    @Test
    public void minusTestPositive(){

        Assert.assertTrue(13 == plusMinus.minusMethod(25, 12));
    }
    @Test
    public void minusTestNegative(){

        Assert.assertFalse(22 == plusMinus.minusMethod(25, 12));
    }
}
