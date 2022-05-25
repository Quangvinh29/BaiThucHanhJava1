package app109.set;

import java.util.Scanner;
import java.util.TreeSet;

public class app68 {
    public static void main(String[] args){
        int number;
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        
        treeSet.add(0);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(8);
        System.out.println("Cac phan tu trong TreeSet:");
        System.out.println(treeSet);
        System.out.println("Nhap phan tu can them:");
        number = sc.nextInt();
    
        if (!treeSet.contains(number)){
            treeSet.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong treeSet sau khi them:");
            System.out.println(treeSet);
        } else {
            System.out.println("Phan tu" +number+ "da ton tai!");
        }
    }
}
