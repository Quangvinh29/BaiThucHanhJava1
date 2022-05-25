package app109.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class app85 {
    public static void main(String[] args){
        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("Java","Java");
        hashmap.put("CSDL","Co so du lieu");
        hashmap.put("C++","C++");
        hashmap.put("C#","C Sharp");
        hashmap.put("PHP","PHP");

        Set<Map.Entry<String, String>> SetHashMap = hashmap.entrySet();

        System.out.println("Cac entry co trong setHashMap");
        System.out.println(SetHashMap);
    }
}
