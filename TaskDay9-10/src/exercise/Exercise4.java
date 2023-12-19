package exercise;

import java.util.HashSet;
import java.util.TreeMap;

// --> Set and Map Implementation

public class Exercise4 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(45);
        hashSet.add(45);
        hashSet.add(40);
        hashSet.add(44);
        hashSet.add(42);

        System.out.println(hashSet);

        TreeMap<String,String> treeMap=new TreeMap<>();
        treeMap.put("India","Delhi");
        treeMap.put("USA","Washington");
        treeMap.put("Pakistan","Lahore");
        System.out.println(treeMap);

    }
}
