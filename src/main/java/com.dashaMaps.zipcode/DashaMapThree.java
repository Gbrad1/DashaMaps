package com.dashaMaps.zipcode;

public class DashaMapThree implements HashMapX {

    private Node[] arr;

    public DashaMapThree() {
        arr = new Node[26];
    }

    private String HashFunctionThree(String input) {
        if (input.length() > 1) {
            return String.valueOf(input.charAt(0) + input.charAt(1)).toLowerCase();
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
