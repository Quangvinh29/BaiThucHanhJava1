package slide54;

import java.util.Scanner;

public class Hinhtru extends Hinhtron{
    public float chieucao;

    public Hinhtru(){
        ten = "Hinh tru";
    }
    public void nhapChieucao(){
        nhapBanKinh();
        System.out.println("Chieu cao cua hinh tru =");
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();
    }
    public void tinhThetich(){
        tinhDientich();
        thetich = dientich * chieucao;
    }
}
