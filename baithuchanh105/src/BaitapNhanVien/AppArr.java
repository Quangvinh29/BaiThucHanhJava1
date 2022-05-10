package BaitapNhanVien;

import java.util.ArrayList;

public class AppArr extends NhanVien{
    public static void main(String[] args){
        ArrayList<NhanVien> nv = new ArrayList<>();
        NhanVien nv1 = new NhanVien(NameID, Name, Address);
        NhanVien nv2 = new nhanvien(NameID, Name, Address);
        NhanVien nv3 = new nhanvien(NameID, Name, Address);
        NhanVien nv4 = new nhanvien(NameID, Name, Address);
        nv.add(nv1);
        nv.add(nv2);
        nv.add(nv3);
        nv.remove(nv3);
        nv.set(3, nv4);
        showList(nv);

    }
}