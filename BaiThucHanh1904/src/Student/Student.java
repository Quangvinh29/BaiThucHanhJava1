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
                this.PersonName=ten;
                this.gender=gioitinh;
            }
            public Student(){}   
    }

