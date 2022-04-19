package Employee;

import Person.Person;

public class Employee extends Person{
    protected String ten;
    protected long luong;
     
    public Employee() {
         
    }
     
    public Employee(String ten) {
        this.ten = PersonName;
    }
     
    protected String loaiNhanVien() {
        return "";
    }
     
    public void xuatThongTin() {
        System.out.println("Nhan vien: " + PersonName);
        System.out.println("- Loai nhan vien: " + loaiNhanVien());
    }
}
