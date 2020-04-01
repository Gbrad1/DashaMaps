package com.dashaMaps.zipcode;

public class DashaMapTwo implements HashMapX {

    private Node[] arr;

    public DashaMapTwo() {
        arr = new Node[26];
    }

    private String HashFunctionTwo(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(1)).toLowerCase();
        }
        return null;
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public Integer bucketSize(String key) {
        return null;
    }

    @Override
    public void clear() {
        this.arr = new Node[26];
    }
}
