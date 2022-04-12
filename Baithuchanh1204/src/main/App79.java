package main;

import slide79.NhanVienFullTime;
import slide79.config;
import slide79.NhanVienPartTime;

public class App79 {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Tran Van Sep");
        sep.setLoaiChucVu(config.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van Linh"); 
        NhanVienFullTime linh2 = new NhanVienFullTime("Le Thi Linh", 3); 
         
        
        NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thi Thoi Vu", 240); 
         
    
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
         
  
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
 
}

