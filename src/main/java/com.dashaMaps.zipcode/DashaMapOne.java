package com.dashaMaps.zipcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class DashaMapOne implements HashMapX {

    private Node[] arr;

    public DashaMapOne() {
        this.arr = new Node[26];
    }

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
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
