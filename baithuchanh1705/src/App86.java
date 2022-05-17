import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App86 {
    public static void main(String[] args){
        HashMap<String, String> Hashmap = new HashMap<>();

        Hashmap.put("CSDL","Co so du lieu");
        Hashmap.put("C++","C++");
        Hashmap.put("C#","C Sharp");
        Hashmap.put("PHP","PHP");
        Hashmap.put("Java","Java");

        Set<Map.Entry<String, String>> setHashMap = Hashmap.entrySet();
        
        System.out.println("Cac entry trong setHashMap:");
        System.out.println(setHashMap);


    // phan bo sung
    // nhap n phan tu tu ban phim
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so luong mon hoc lap trinh cua ban:");
    int n;
    String codename, fullname;
    n= sc.nextInt();
    for(int i=0; i<n;i++){
     System.out.println("Nhap ten viet tat cua mon hoc"+(i+1));
     codename = sc.nextLine();
     System.out.println("Nhap ten day du cua mon hoc"+(i+1));
     fullname = sc.nextLine();
     Hashmap.put(codename, fullname);
 }
     System.out.println("Cac phan tu trong hashmap sau khi them:");
     System.out.println(Hashmap);

    } 
}


