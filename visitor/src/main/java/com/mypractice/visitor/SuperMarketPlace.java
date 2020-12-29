package com.mypractice.visitor;

public class SuperMarketPlace extends Place{

  @Override
  protected void accept(Visitor visitor) {
    System.out.printf("Welcome %s to %s\n",visitor,this);
  }
  public String toString(){
    return "SuperMarket";
  }
}
