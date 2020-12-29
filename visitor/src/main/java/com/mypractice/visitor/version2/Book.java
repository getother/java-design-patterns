package com.mypractice.visitor.version2;

public interface Book {
    void accept(Visitor v);
}