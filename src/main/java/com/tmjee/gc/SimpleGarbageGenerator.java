package com.tmjee.gc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tmjee
 */
public class SimpleGarbageGenerator {


    public static void main(String[] args) throws Exception {

        String prefix = "SimpleGarbageGenerator";

        Map<String, String> stringMap = new HashMap<>();
        for (int a=0; a< 5000000; a++) {
            String key = prefix + " index_"+ a;
            stringMap.put(key, String.valueOf(a));
        }

        System.out.println("stringMap size="+stringMap.size());

        for (int a=0; a< 4000000; a++) {
            String key = prefix + " index_"+a;
            stringMap.remove(key);
        }

        System.out.println("stringMap size="+stringMap.size());

        System.gc();
    }
}
