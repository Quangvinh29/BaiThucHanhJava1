import java.util.Scanner;

public class HinhChuNhat {
            float chieudai;
            float chieurong;
            float CV,DT;
            Scanner sc = new Scanner(System.in);
            public void Nhapkichthuoc(){
                System.out.println("nhap chieu dai:");
                    chieudai=sc.nextFloat();
                System.out.println("nhap chieu rong:");    
                    chieurong=sc.nextFloat();
            }
            public float ChuVi(){
                CV=(chieudai+chieurong)*2;
                return CV;
            }
        
            public float DienTich(){
                DT=chieudai*chieurong;
                return DT;
            
            }
}
