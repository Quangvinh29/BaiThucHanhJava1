package Employee;

import java.util.Scanner;

import Person.Person;

public class Employee extends Person{
    boolean gioiTinh;
    String maNV;
    int luong;
    Scanner sc= new Scanner(System.in);

    public void gioiTinh(){
        System.out.println("Nam nhap 0, nu nhap 1");
        gioiTinh=sc.nextBoolean();
    }
    
    public void nhapMaNV(){
        System.out.println("Nhap ma nhan vien:");
        maNV=sc.nextLine();
    }

    public void inMaNv(){
        System.out.println("Ma nhan vien: "+ maNV);
    }
    public void nhapLuong(){
        System.out.println("Nhap luong nhan vien:");
        luong=sc.nextInt();
    }
    public int luongNV(){
        return luong;
    }
}