package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalmonPizzaDecorator extends AbstractPizzaOrderDecorator {
    public SalmonPizzaDecorator (PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }
    @Override
    public String getDescription() {
        return super.getDescription()+ " salmon/";
    }
}

