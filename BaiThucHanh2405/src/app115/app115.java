package app115;

import java.util.HashMap;
import java.util.Scanner;

public class app115 {
    public static void main(String[] args){
        HashMap<Sinhvien,Sinhvien> hashMap = new HashMap<>();
       Scanner sc = new Scanner(System.in);
       int n;

       System.out.println("Nhap so luong sinh vien");
       n = sc.nextInt();
       for(int i=1; i < n; i++){
           Sinhvien sv = new Sinhvien();
           sv.Nhapthongtin(i);
           hashMap.put(sv, sv);
       }
       System.out.println(hashMap);

    }
}
