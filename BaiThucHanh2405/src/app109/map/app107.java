package app109.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class app107 {
    public static void main(String[] args){
        TreeMap<Integer, Double> treeMap = new TreeMap<>();

        treeMap.put(1,9d);
        treeMap.put(4,10.1d);
        treeMap.put(2,7.2d);
        treeMap.put(8,20.28d);

        System.out.println("cac entry trong treemap la:");
        Set<Map.Entry<Integer,Double>> SETtreeMap = treeMap.entrySet();
        System.out.println(SETtreeMap);
        
        treeMap.replace(4,7.2d,7.7d);

        treeMap.replace(4, 20.11d);

        System.out.println("Cac phan tu trong treemap sau khi thay the:");
        SETtreeMap = treeMap.entrySet();
        System.out.println(SETtreeMap);
}}
