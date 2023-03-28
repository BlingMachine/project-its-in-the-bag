package com.csc205.project3;

public interface Container<T> extends Iterable<T> {

        boolean isEmpty();
        int size();
        void add(T item);

}
