package com.mypractice.visitor;

public class Main {

  public static void main(String[] args) {
    Place place = new SuperMarketPlace();
    Visitor visitor = new John();
    visitor.visit(place);
  }
}