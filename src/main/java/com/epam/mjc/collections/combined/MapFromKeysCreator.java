package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> integerSetMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry: sourceMap.entrySet()) {
            int keyLength = entry.getKey().length();

            if (!integerSetMap.containsKey(keyLength)) {
                Set<String> keysWithTheSameLength = new HashSet<>();

                integerSetMap.put(keyLength, keysWithTheSameLength);
            }

            integerSetMap.get(keyLength).add(entry.getKey());

        }

        return integerSetMap;
    }
}
