package Employee;

public class PartTimeEmployee extends Employee{
     
    private int gioLamViec; 
     
    public PartTimeEmployee(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
     
    public PartTimeEmployee() {
        if(gioLamViec>0){
        System.out.println("Nhan vien partime");
        }
    }
}