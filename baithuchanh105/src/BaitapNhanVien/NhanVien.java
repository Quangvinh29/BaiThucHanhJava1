package BaitapNhanVien;
import java.util.Scanner;

public class NhanVien{
    static String Name;
    static String Address;
    static Float NameID;


    public void nhapMaNV(){
        System.out.println("Nhan ma nhan vien cua ban");
        Scanner sc = new Scanner(System.in);
        NameID = sc.nextFloat();
        sc.close();
    }
    public void NhapName(){
        System.out.println("Nhap ten cua ban");
        Scanner sc = new Scanner(System.in);
        Name = sc.nextLine();
        sc.close();
    }
    public void NhapAddress(){
        System.out.println("Nhap Dia chi cua Ban");
        Scanner sc = new Scanner(System.in);
        Address =sc.nextLine();
        sc.close();
    }
}
