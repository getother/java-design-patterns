package com.mypractice.visitor.version1;

public class KitesVisitor implements Visitor{
    @Override
    public void visit(Place place) {
        System.out.printf("%s gets the %s\n",this,place);
        place.accept(this);
    }
    @Override
    public String toString() {
        return "Kites";
    }
}
