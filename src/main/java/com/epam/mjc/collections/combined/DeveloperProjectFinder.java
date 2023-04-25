package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> keysList = new ArrayList<>();
        System.out.println(developer);
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                keysList.add(entry.getKey());
            }
        }
        Collections.sort(keysList, Comparator.comparingInt(String::length).reversed());
        return keysList;
    }
}
