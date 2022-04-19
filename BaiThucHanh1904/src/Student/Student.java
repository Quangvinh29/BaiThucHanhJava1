package Student;

import Person.Person;
    public class Student extends Person {

        public static final int SINH_VIEN_ONLINE = 1;
        public static final int SINH_VIEN_OFFLINE = 2;

        private String birthday;
        private String gender;
        
            public Student( String masinhvien, String ten, String ngaysinh, String gioitinh,  String diachi){
                this.birthday=ngaysinh;
                this.PersonID=masinhvien;
                this.Address=diachi;
                this.PersonName=ten;
                this.gender=gioitinh;
            }
             public Student(){}
        
            
    protected String loaiNhanVien() {
        return "";
    }
     
    public void xuatThongTin() {
        System.out.println("Sinhvien" +PersonName);
        System.out.println("Loai sinh vien: " + loaiNhanVien());
    }
}
