package app109.set;

import java.util.HashSet;
import java.util.Scanner;

public class app53 {
    public static void main(String[] args) throws Exception {
    int number;
    HashSet<Integer> hashsIntegers = new HashSet<>();
    Scanner scanner = new Scanner(System.in);


    hashsIntegers.add(0);
    hashsIntegers.add(3);
    hashsIntegers.add(1);
    hashsIntegers.add(4);
    hashsIntegers.add(2);
    hashsIntegers.add(8);
   
    System.out.println("cac phan tu trong hashset:");
    System.out.println( hashsIntegers);
    System.out.println("nhap phan tu can them:");
    number = scanner.nextInt();

    if( hashsIntegers.contains(number)){
        hashsIntegers.add(number);
        System.out.println("them thanh cong!");
        System.out.println("Cac phan tu trong hashset sau khi them:");
        System.out.println( hashsIntegers);
    } else {
        System.out.println("Phan tu"+number+"da ton tai!");
    }
    }
}
