package mainbtso1;


import Custome.Vipcustome;
import Custome.custome;.khachHang.VIPCustomer;
import Employee.Employee;.nhanVien.employee;
import Person.Person;
import Student.SinhvienOffline;
import Student.SinhvienOnline;
import Student.Student;.person;

public class main
{
    public static void main(String[] args)  {
 
        Person ps1=new Person();
        ps1.nhapPersonID();
        ps1.nhapPersonName();
        

        custome kh1=new custome();
        kh1.NhapThongTin();
        kh1.InThongTin();

        Vipcustome kh2=new Vipcustome();
        kh2.InThongTin();


        Employee nv= new Employee();
        nv.nhapMaNV();
        nv.nhapLuong();


        Student sv= new Student();
        sv.nhapMSSV();
        sv.nhapTenLop();
         
        SinhvienOffline sv1=new SinhvienOffline();
        sv1.hocoffline();

        SinhvienOnline sv2=new SinhvienOnline();
        sv2.hoconline();
        
    }
}