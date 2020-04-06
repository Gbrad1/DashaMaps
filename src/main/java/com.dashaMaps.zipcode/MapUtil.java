package com.dashaMaps.zipcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MapUtil {

    private static DashaMapOne mapOne;
    private static DashaMapTwo mapTwo;
    private static DashaMapThree mapThree;

    static {
        mapOne = new DashaMapOne();
        mapTwo = new DashaMapTwo();
        mapThree = new DashaMapThree();
    }

    private static void clearAll() {
        mapOne.clear();
        mapTwo.clear();
        mapThree.clear();
    }

    public static String parseFile() {
        clearAll();
        File file = new File("/word-list.txt");
        try {
            BufferedReader fr = new BufferedReader(new FileReader(file));
            String line;
            while((line = fr.readLine()) != null) {
                String[] splice = line.split(" ");
                if (splice.length == 2) {
                    mapOne.set(splice[0], splice[1]);
                    mapTwo.set(splice[0], splice[1]);
                    mapThree.set(splice[0], splice[1]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
