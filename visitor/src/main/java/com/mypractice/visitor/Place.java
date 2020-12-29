package com.mypractice.visitor;

import java.util.Arrays;

public abstract class Place {
  private Place[] places;

  public Place(Place[] places) {
    this.places = places;
  }

  protected void accept(Visitor visitor){
    Arrays.stream(places).forEach(place -> place.accept(visitor));
  }
}
