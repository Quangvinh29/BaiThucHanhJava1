

import java.util.HashSet;
import java.util.Scanner;


public class app112{
    public static void main(String[] args) throws Exception{
      HashSet<String> sosinhvien = new HashSet<>();
      int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien");
        n = sc.nextInt();
       for (int i =0; i<n; i++){
        while(name !=null){
        Sinhvien sinhvien = new Sinhvien();
        sinhvien.Nhapthongtin(i);
        sosinhvien.add(sinhvien);
        }
        }
           System.out.println("Thong tin sinh vien nhu sau:");
        for(Sinhvien sinhvien : sosinhvien){
        System.out.println(sinhvien);
        }
        }
       
    // bài này em chưa biết các nhập tên sinh viên cho đến khi null. ban đầu em định làm như 115 nhưng nó cx bị vậy ạ
        }
 
