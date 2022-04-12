package slide79;

public class NhanVienPartTime extends Nhanvien {
     
    private int gioLamViec; 
     
    public NhanVienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
     
    @Override
    public String loaiNhanVien() {
        return "Nhan vien thoi vu";
    }
     
    public void tinhLuong() {
        luong = config.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}