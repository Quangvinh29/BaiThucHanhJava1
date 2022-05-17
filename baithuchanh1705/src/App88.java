import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App88 {
    public static void main(String[] args){
        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("QNg", "Quang Ngai");
        hashmap.put("QN", "Quang Nam");
        hashmap.put("QN", "Quang Ninh");
        hashmap.put("HCM", "Thanh Pho Ho Chi Minh");

        System.out.println("Danh sach Cac thanh pho trong HashMap:");
        Set<Map.Entry<String, String>> Hashmapct = hashmap.entrySet();
        System.out.println(Hashmapct);

        System.out.println("QNg:" +hashmap.get("QNg"));

        System.out.println("NT:" +hashmap.get("NT"));

        if (hashmap.containsValue("Thanh pho Ho Chi Minh")){
            System.out.println("Co thanh pho Ho Chi Minh trong HashMap");
        }
    }
    }
    

