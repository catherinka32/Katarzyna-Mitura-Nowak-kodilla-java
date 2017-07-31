package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public World() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Poland", new BigDecimal(38000000)));
        countries.add(new Country("Germany", new BigDecimal(45000000)));
        countries.add(new Country("Spain", new BigDecimal(65000000)));
        Continent europe = new Continent(countries);
        continents.add(europe);
        List<Country> countries2 = new ArrayList<>();
        countries2.add(new Country("China", new BigDecimal(74000000)));
        countries2.add(new Country("Iran", new BigDecimal(88000000)));
        countries2.add(new Country("Japan", new BigDecimal(11000000)));
        Continent asia = new Continent(countries2);
        continents.add(asia);
        List<Country> countries3 = new ArrayList<>();
        countries3.add(new Country("Kongo", new BigDecimal(32000000)));
        countries3.add(new Country("Liberia", new BigDecimal(24000000)));
        countries3.add(new Country("Malawi", new BigDecimal(17000000)));
        Continent africa = new Continent(countries3);
        continents.add(africa);
    }

    public List<Continent> getContinents() {
        return new ArrayList<>(continents);
    }

    public BigDecimal getPeopleQuantity() {

        BigDecimal totalPeople =
                getContinents().stream()
                .flatMap(continents -> continents.getCountries().stream())
                .map(countries -> countries.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeople;
        //return new BigDecimal(0);
    }
}