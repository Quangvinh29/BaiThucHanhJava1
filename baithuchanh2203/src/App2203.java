
public class App2203 {
    public static void main(String[] args) throws Exception {
        System.out.println("Bai_1");
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.Nhapkichthuoc();
        System.out.println("chu vi hcn la: "+hcn.ChuVi());
        System.out.println("dien tich hcn la: "+hcn.DienTich());
        
        System.out.println("Bai_2");
        Person ps = new Person();
        ps.nhapPersonName();
        ps.nhapPersonID();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inPersonName();
        ps.inPersonID();
        ps.inGender();
        ps.inAddress();
        
        System.out.println("Bai_3");
        SinhVien sv = new SinhVien();
        sv.nhapMaSinhVien();
        sv.nhapHoTen();
        sv.nhapDiaChi();
        sv.nhapgioiTinh();
        sv.nhapNgaysinh();
        sv.inMaSinhVien();
        sv.inHoTen();
        sv.inDiaChi();
        sv.ingioiTinh();
        sv.inNgaySinh();
        
        System.out.println("Bai_4");
        PhuongTrinhBac2 pt2 = new PhuongTrinhBac2();
        pt2.Nhapthongtin();
        pt2.InPhuongTrinh();
        pt2.Inthongtin();

    }
}
