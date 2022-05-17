import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args){
        String name;
        HashSet<String> hash = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hash.add("Wison");
        hash.add("Nike");
        hash.add("Volvo");
        hash.add("Kia");
        hash.add("Lenovo");
        hash.add("Lenovo");

        System.out.println("Cac phan tu trong hashset la:");
        System.out.println(hash);
        System.out.println("Nhap phan tu cab xoa:");
        name = sc.nextLine();

        if(hash.contains(name)){
            hash.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong Hashset la:");
            System.out.println(hash);
        } else{
            System.out.println("Xoa khong thanh cong!");
        }
    }
}
