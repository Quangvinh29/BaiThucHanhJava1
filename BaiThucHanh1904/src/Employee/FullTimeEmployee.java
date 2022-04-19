package Employee;

public class FullTimeEmployee extends Employee{
     
    private int gioLamViec; 
     
    public FullTimeEmployee(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
     
    public FullTimeEmployee() {
        if(gioLamViec>6){
        System.out.println("Nhan vien fulltime");
        } else{
        System.out.println("Nhan vien fulltime hoac Partime");
        }
    }
}
