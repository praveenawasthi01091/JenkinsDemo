package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalculatorAPI {

    CalculatorAPI calculatorAPI;
    int res;
    @BeforeClass
    public void startTest()
    {
         calculatorAPI=new CalculatorAPI();
    }

    @BeforeMethod
    public void Init()
    {
        res=0;
    }

    @Test(priority = 1)
    public void TestAdditionWithPositiveValues()
    {
        res = calculatorAPI.addition(20,30);
        Assert.assertEquals(res,50, "Correct value with zero");
    }

    @Test (priority =2)
    public void TestAdditionWithZeroValues()
    {
        res = calculatorAPI.addition(20,0);
        Assert.assertEquals(res, 20, "Correct value with zero");
    }

    @Test (priority =3)
    public void TestAdditionWithNegativeValues()
    {
        res = calculatorAPI.addition(20,-2);
        Assert.assertEquals(res, 18, "Correct value with zero");
    }
}
