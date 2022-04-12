package slide79;

public class NhanVienFullTime extends Nhanvien {
     
    private int ngayLamThem; 
    private int loaiChucVu; 
     
    public NhanVienFullTime(String ten) {
        super(ten);
        this.loaiChucVu = config.NHAN_VIEN_LINH; 
    }
     
    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = config.NHAN_VIEN_LINH; 
    }
     
    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }
     
    @Override
    public String loaiNhanVien() {
        if (loaiChucVu == config.NHAN_VIEN_LINH) {
            return "Linh lam toan thoi gian" + (ngayLamThem > 0 ? " (có lam them ngay)":"");
        } else {
            return "Sep toan thoi hian" + (ngayLamThem > 0 ? " (có lam them ngay)":"");
        }
    }
     
    public void tinhLuong() {
        if (loaiChucVu == config.NHAN_VIEN_LINH) {
            luong = config.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * config.LUONG_LAM_THEM_MOI_NGAY;
        } else if (loaiChucVu == config.NHAN_VIEN_SEP) {
        }
    }
}