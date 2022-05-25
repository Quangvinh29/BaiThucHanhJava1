package app109.set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class app59 {
    public static void main(String[] args){
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        Scanner sc = new Scanner(System.in);
        String name;
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");

        System.out.println("Cac phan tu trong hashset la:");
        System.out.println(  linkedHashSet);
        System.out.println("Nhap phan tu can xoa:");
        name = sc.nextLine();

        if(   linkedHashSet.contains(name)){
            linkedHashSet.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong Hashset la:");
            System.out.println(linkedHashSet);
        } else{
            System.out.println("Xoa khong thanh cong!");
        }
    }
}