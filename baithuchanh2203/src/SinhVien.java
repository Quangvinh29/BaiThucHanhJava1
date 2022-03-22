import java.util.Scanner;

public class SinhVien{
    Scanner sc = new Scanner(System.in);
    String MaSinhVien;
    String HoTen;
    Boolean gioiTinh;
    String Diachi;
    String dob;
     
    void nhapMaSinhVien() {
        System.out.println(" nhap Ma Sinh Vien cua ban ");
        Scanner sc = new Scanner(System.in);
        MaSinhVien = sc.nextLine();
        sc.close();
    }

    void nhapHoTen() {
        System.out.println(" nhap Ho Ten cua ban");
        Scanner sc = new Scanner(System.in);
        HoTen = sc.nextLine();
        sc.close();
    }

    void nhapgioiTinh() {
        System.out.println(" nhap gioi tinh cua ban");
        Scanner sc = new Scanner(System.in);
        gioiTinh = sc.nextBoolean();
        sc.close();
    }

    void nhapDiaChi() {
        System.out.println(" nhap Dia chi cua ban ");
        Scanner sc = new Scanner(System.in);
        Diachi = sc.nextLine();
        sc.close();
    }

    void nhapNgaysinh() {
        System.out.println("nhap ngay sinh cua ban ");
        Scanner sc = new Scanner(System.in);
        dob = sc.nextLine();
        sc.close();
    }

    void inMaSinhVien() {
        System.out.println("Ma sinh vien cua ban la " + MaSinhVien);
    }

    void inHoTen() {
        System.out.println("Ho ten cua ban la " + HoTen);
    }

    void ingioiTinh() {
        System.out.println("Gioi tinh cua ban la " + gioiTinh);
    }

    void inDiaChi() {
        System.out.println("Dia chi cua ban la " + Diachi);
    }

    void inNgaySinh() {
        System.out.println("Ngay sinh cua ban la " + dob);
    }
  
}
