package Student;

import java.util.Scanner;

import Person.Person;
public class Student extends Person{
    public String msv,tentruong;
    String phuongthuchoc;
    public Student(){        
    }
    public Student(String ten,String msv){
       this.PersonName=ten;
       this.PersonID=msv;
    }
    @Override
    public String congviec(){
        return "Hoc sinh";
    }
    public void nhaptruong(){
       Scanner sc= new Scanner(System.in);
       System.out.print("Nhap ten truong : ");
       tentruong=sc.nextLine();
    }
    @Override
    public void Xuatthongtin(){
        System.out.print("Hoc sinh" + PersonName + "msv : " + msv +"hoc o truong:" + tentruong);
    }
}