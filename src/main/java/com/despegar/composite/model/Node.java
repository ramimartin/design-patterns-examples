package com.despegar.composite.model;


public abstract class Node {

    abstract public String show();

    @Override
    public String toString() {
        return show();
    }
}
