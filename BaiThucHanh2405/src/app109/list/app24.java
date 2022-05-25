package app109.list;

import java.util.ArrayList;
import java.util.Scanner;

public class app24 {
    public static void main(String[] args){
        ArrayList<Integer> Array = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       int number;


    System.out.println("nhap so phan tu vao array:");
    int n = sc.nextInt();
    for (int i = 0 ; i<= n; i++){
        System.out.println("Nhap phan tu thu"+i+":");
        number = sc.nextInt();
        Array.add(number);
    }
        int max = Array.get(0);

        for (int i = 1; i < Array.size(); i++){
        if(Array.get(i).compareTo(max) >0){
            max = Array.get(i);
        }
        }
        System.out.println("Phan tu lon nhat trong array = "+max);
    }
    }

