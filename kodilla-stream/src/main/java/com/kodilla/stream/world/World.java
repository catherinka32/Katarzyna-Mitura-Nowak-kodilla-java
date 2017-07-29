/*package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public World() {
        Continent Europe = new Continent();
        Continent Asia = new Continent();
        Continent Africa = new Continent();
        continents.add(Europe);
        continents.add(Asia);
        continents.add(Africa);
    }

    public List<Continent> getContinents() {
        return continents;
    }

   /* public BigDecimal getPeopleQuantity(){
        world.getContinents.stream()
                .flatMap(continents ->continents.getCountries().stream())
                .map(countries -> countries.getPeopleQuantity())
                .reduce
    }*/

