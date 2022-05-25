package app115;

import java.util.Scanner;

public class Sinhvien{
    public  int MSV;
    public String Name;
    public String Lop;
     
    public Sinhvien(){}

    public Sinhvien(int studentID, String name, String Lop){
        this.MSV = studentID;
        this.Name = name;
        this.Lop = Lop;
    }
    public void Nhapthongtin(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sinh vien thu "+i);
        Name =sc.nextLine();
        System.out.println("nhap MSV sinh vien thu "+i);
        MSV =sc.nextInt();
        System.out.println("nhap LOP sinh vien thu "+i);
        Lop = sc.nextLine();
        }
}