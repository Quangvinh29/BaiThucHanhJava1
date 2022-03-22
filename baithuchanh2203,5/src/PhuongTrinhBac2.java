import java.util.Scanner;

public class PhuongTrinhBac2 {
  double a, b, c, d, Delta;
 Scanner sc= new Scanner(System.in);

 public void Nhapthongtin(){
 System.out.println("Nhap he so a:");
 a = sc.nextDouble();
 System.out.println("Nhap he so b:");
 b = sc.nextDouble();
 System.out.println("Nhap he so c:");
 c = sc.nextDouble();
 System.out.println("Nhap he so d:");
 d = sc.nextDouble();
 }

 public void InPhuongTrinh(){
    System.out.println("Phuong trinh bac 2 co dang:" +a+ "x^2" +b+ "x" +c+ "=" +d);
 }
    void TinhDelta(){
        Delta = Math.pow(b, 2) - 4*a*c;   
    }
    void InDelta(){
        System.out.println("delta =" + Delta);
    }
   public void Inthongtin(){
        if(Delta<0){
            System.out.println("Phuong trinh vo nghiem!"); 
        }else if(Delta==0){
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 ="+ (-b)/2*a); 
        }else if(Delta>0){
            System.out.println("Phuong trinh co 2 nghiem: x1 ="+ (-b + Math.sqrt(Delta)) / (2 * a)+ "va x2 ="+(-b - Math.sqrt(Delta)) / (2 * a));
        } 
        } 
        }


