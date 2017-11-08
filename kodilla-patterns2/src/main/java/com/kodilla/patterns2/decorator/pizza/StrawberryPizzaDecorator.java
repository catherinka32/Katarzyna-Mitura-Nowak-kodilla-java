package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class StrawberryPizzaDecorator extends AbstractPizzaOrderDecorator {
    public StrawberryPizzaDecorator (PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }
    @Override
    public String getDescription() {
        return super.getDescription()+ " strawberries/";
    }
}
