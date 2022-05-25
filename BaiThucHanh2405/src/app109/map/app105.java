package app109.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class app105 {
    public static void main(String[] args){
        TreeMap<String, String> TreeMap = new TreeMap<>();

        TreeMap.put("CSDL", "Co so du lieu");
        TreeMap.put("HTML", "HTML");
        TreeMap.put("Java","Java");
        TreeMap.put("C++", "C++");

        Set<Map.Entry<String, String>> SetTreeMap = TreeMap.entrySet();
        System.out.println("cac entry trong TreeMap:");
        System.out.println(SetTreeMap);
    }
}
