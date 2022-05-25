package app109.set;

import java.util.HashSet;
import java.util.Scanner;

public class app55 {
    public static void main(String[] args){
        String name;
        HashSet<String> hashset = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashset.add("Wison");
        hashset.add("Nike");
        hashset.add("Volvo");
        hashset.add("Kia");
        hashset.add("Lenovo");
        hashset.add("Lenovo");

        System.out.println("Cac phan tu trong hashset la:");
        System.out.println( hashset);
        System.out.println("Nhap phan tu can xoa:");
        name = sc.nextLine();

        if( hashset.contains(name)){
            hashset.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong Hashset la:");
            System.out.println( hashset);
        } else{
            System.out.println("Xoa khong thanh cong!");
        }
    }
}


