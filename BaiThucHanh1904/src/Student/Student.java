package Student;

import java.util.Scanner;

import Person.Person;
public class Student extends Person{
    String mssv, tenLop;
    Scanner sc= new Scanner(System.in);
    public void nhapMSSV(){
        System.out.println("Nhap mssv cua ban: ");
        mssv=sc.nextLine();
    }
    public void inMSSV(){
        System.out.println("mssv: " + mssv);
        
    }
    public void nhapTenLop(){
        System.out.println("Nhap ten lop cua ban: ");
        tenLop=sc.nextLine();
    }
    public void inTenLop(){
        System.out.println("lop: "+ tenLop);
        
    }
}