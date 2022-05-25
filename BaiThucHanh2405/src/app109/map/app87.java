package app109.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class app87 {
   public static void main(String[] args){
       HashMap<String, String> HashMap = new HashMap<>();

       HashMap.put("QNg","Quang Ngai" );
       HashMap.put("HN", "Ha Noi");
       HashMap.put("HCM","Thanh Pho Ho Chi Minh");
       HashMap.put("QN", "Quang Nam");
       HashMap.put("QN", "Quang Ngai");

       System.out.println("cac thanh pho trong HashMap la:");
      Set<Map.Entry<String, String>> SetHashMap =HashMap.entrySet();
      System.out.println(SetHashMap);

      System.out.println("QNg:"+HashMap.get("QNg"));
      
      System.out.println("NT"+HashMap.get("NT"));

      if (HashMap.containsValue("Thanh Pho Ho Chi Minh")){
          System.out.println("Co thanh pho Ho Chi Minh trong HashMap");
      }
   } 
}
