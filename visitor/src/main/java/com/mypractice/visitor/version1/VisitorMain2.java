package com.mypractice.visitor.version1;

public class VisitorMain2 {
    public static void main(String[]  args){
        CityPlace places = new CityPlace(new SuperMarketPlace(),new ParkPlace());
        Visitor kites = new KitesVisitor();
        kites.visit(places);
    }
}
