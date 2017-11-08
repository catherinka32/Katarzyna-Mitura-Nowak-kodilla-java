package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testCreamSesamePizzaGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CreamPizzaDecorator(theOrder);
        theOrder = new SesamePizzaDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        System.out.println("Cost of pizza is " + theOrder.getCost()+ "zl");
        //Then
        assertEquals(new BigDecimal(18),theCost);
    }
    @Test
    public void testCreamSesamePizzaGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CreamPizzaDecorator(theOrder);
        theOrder = new SesamePizzaDecorator(theOrder);
        //When
        String theDescription = theOrder.getDescription();
        System.out.println(theOrder.getDescription());
        //Then
        assertEquals("Making pizza with cream/ sesame/",theDescription);
    }
    @Test
    public void testCreamSesameExtraCheeseSalmonPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CreamPizzaDecorator(theOrder);
        theOrder = new SesamePizzaDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new SalmonPizzaDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        System.out.println("Cost of pizza is " + theOrder.getCost() + "zl");
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }

    @Test
    public void testCreamSesameExtraCheeseSalmonPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CreamPizzaDecorator(theOrder);
        theOrder = new SesamePizzaDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new SalmonPizzaDecorator(theOrder);
        //When
        String theDescription = theOrder.getDescription();
        System.out.println(theOrder.getDescription());
        //Then
        assertEquals("Making pizza with cream/ sesame/ extra cheese/ salmon/", theDescription);
    }
}

