import java.util.Scanner;
public class slide16 {
    public static void main(String[] args) throws Exception {
        Hinhtron ht = new Hinhtron();
        ht.NhapBanKinh();
        ht.Chuvi();
        ht.DienTich();
        ht.inChuVi();
        ht.inDienTich();
    }
}

class  Hinhtron{
    final float pi = 3.14f;
    float r;
    float CV,DT;

    void NhapBanKinh(){
        System.out.println("nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        r =sc.nextFloat();
    }

    void Chuvi(){
        CV=2*pi*r;
    }
     

    void DienTich(){
        DT=pi*r*r;
    }
    
    void inDienTich(){
        System.out.println("dien tich hinh tron la: "+DT);
    }

    void inChuVi(){
        System.out.println("chu vi hinh tron la: "+CV);
    }
}