package com.mypractice.visitor.version1;

public class VisitorMain {
    public static void main(String[]  args){
        Visitor kites = new KitesVisitor();
        kites.visit(new SuperMarketPlace());
        kites.visit(new ParkPlace());
    }
}
