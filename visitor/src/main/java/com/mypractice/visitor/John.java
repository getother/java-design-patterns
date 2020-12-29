package com.mypractice.visitor;

public class John implements Visitor{

  @Override
  public void visit(Place place) {
    System.out.printf("%s go to %s\n",this,place);
    place.accept(this);
  }

  @Override
  public String toString() {
    return "John";
  }
}
