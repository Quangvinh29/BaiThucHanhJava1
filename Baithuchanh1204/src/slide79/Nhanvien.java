package slide79;

public class Nhanvien {
    protected String ten;
    protected long luong;
     
    public Nhanvien() {
         
    }
     
    public Nhanvien(String ten) {
        this.ten = ten;
    }
     
    protected String loaiNhanVien() {
        return "";
    }
     
    public void xuatThongTin() {
        System.out.println("===== Nhan vien: " + ten + " =====");
        System.out.println("- Loai nhan vien: " + loaiNhanVien());
        System.out.println("- Luong: " + luong + " VND");
    }
}

