package BaitapNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class AppArr extends NhanVien{
    public static void main(String[] args){
    ArrayList<Integer> arrayList= new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n;

    System.out.println("Nhap So luong nhan vien");
    n = sc.nextInt();
    for(int i=0; i<=n; i++){
    System.out.println("Nhap thong tin nhan vien thu"+i);
    arrayList.add(i);
    }
    }
    public void nhapThongTin(){
    for(int i=0; i<=n; i++){
    super.nhapMaNV();
    super.NhapName();
    super.NhapAddress();
    }
    }
}



