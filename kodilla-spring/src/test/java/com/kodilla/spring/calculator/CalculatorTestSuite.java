package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator= context.getBean(Calculator.class);
        //When
        double add = calculator.add(5,6);
        double sub = calculator.sub(6,4);
        double mul = calculator.mul(2,4);
        double div = calculator.div(6,3);
        //Then
        Assert.assertEquals(11, add,0.0);
        Assert.assertEquals(2, sub,0.0);
        Assert.assertEquals(8, mul,0.0);
        Assert.assertEquals(2, div,0.0);
    }
}
