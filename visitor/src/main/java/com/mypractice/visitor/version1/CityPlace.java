package com.mypractice.visitor.version1;

import java.util.Arrays;

public class CityPlace implements Place{
    private Place[] places;

    public CityPlace(Place ... places) {
        this.places = places;
    }

    @Override
    public void accept(Visitor visitor) {
        Arrays.stream(places).forEach(place -> {
            System.out.printf("%s visits %s\n",visitor,place);
            place.accept(visitor);
        });
    }
    @Override
    public String toString() {
        return "City";
    }
}
