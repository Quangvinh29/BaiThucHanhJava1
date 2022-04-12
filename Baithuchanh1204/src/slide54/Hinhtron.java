package slide54;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public float bankinh;

public Hinhtron(){
    ten = "Hinh tron";
}
    public void nhapBanKinh(){
        System.out.println("Ban kinh hinh tron =");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }
    public void tinhChuvi(){
        chuvi = 2* PI * bankinh;
    }
    public void tinhDientich(){
        dientich = PI * bankinh *bankinh;
    }
}
