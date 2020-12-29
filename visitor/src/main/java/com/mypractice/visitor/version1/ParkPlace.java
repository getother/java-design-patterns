package com.mypractice.visitor.version1;

public class ParkPlace implements Place{

    @Override
    public void accept(Visitor visitor) {
        System.out.printf("Welcome %s to %s\n",visitor,this);
    }

    @Override
    public String toString() {
        return "ParkPlace";
    }
}
