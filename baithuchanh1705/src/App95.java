import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Set;

public class App95 {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> linkhash = new LinkedHashMap<Integer, String>();
        linkhash.put(1, "Java");
        linkhash.put(2, "C++");
        linkhash.put(3, "PHP");
        linkhash.put(4, "Python");

        System.out.println("Before remove");
        show(linkhash);
        linkhash.remove(2);
        System.out.println("After remove");
        show(linkhash);
    }
    public static void show(LinkedHashMap<Integer, String> linkedHashMap){
        Set<Integer> Keyset = linkedHashMap.keySet();
        for (Integer key : Keyset){
            System.out.println(key +""+ linkedHashMap.get(key));
        }
    }
}
