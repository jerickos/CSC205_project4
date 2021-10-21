package com.example.project4;

import java.util.ArrayList;
import java.util.Iterator;


public class Bag<T>implements Container<T>{

    //keeps the elements in a standard list
    public ArrayList<T> arr =  new ArrayList<T>();



    //returns if the bag is empty
    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    //provides the size of the list
    @Override
    public int size() {
        return arr.size();
    }

    //allows the element to be added to the list
    @Override
    public void add(T item) {
        arr.add(item);
    }

    // returning String representation of the list
    @Override
    public String toString() {
        return arr.toString();
    }
    //implements the iterable method
    @Override
    public Iterator<T> iterator() {
        return arr.iterator();
    }
}
