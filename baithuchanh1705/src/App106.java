import java.security.KeyStore.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App106 {
    public static void main(String[] args){
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        treeMap.put(6,'A');
        treeMap.put(5,'B');
        treeMap.put(1,'C');
        treeMap.put(2,'D');
        treeMap.put(8,'E');

        Set<Entry<Integer, Character>> SetTreeMap =  treeMap.entrySet();

        System.out.println("Cac entry trong SetTreeMap");
        System.out.println(SetTreeMap);

    }
}
