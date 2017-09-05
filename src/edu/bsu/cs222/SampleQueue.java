package edu.bsu.cs222;

import java.util.LinkedList;

public class SampleQueue {

    LinkedList<String> list = new LinkedList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void add(String x) {
        list.add(x);
    }
}
