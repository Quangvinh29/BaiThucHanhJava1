package slide77;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    protected float bankinh;
    private Scanner scanner;

    public Hinhtron(){
        super();
        scanner = new Scanner(System.in);
    }
    public void nhapBanKinh(){
        System.out.println("Ban dung don vi tinh nao:");
        System.out.println("\t1 - Centimet");
        System.out.println("\t2 - Inch");
        Hinhhoc.donVi = scanner.nextInt();

        System.out.println("Hay nhap vao ban kinh hinh tron:");
        bankinh = scanner.nextFloat();
    }
    public void inthongtin(){
        if (Hinhhoc.donVi == Hinhhoc.DON_VI_CM){
            System.out.println("Hinh tron co ban kinh" + bankinh + "cm");
            System.out.println("Tuong duong" +Hinhhoc.ChuyenCentimetsangInch(bankinh) + "inch");
        } else {
            System.out.println("Hinh tron co ban kinh" + bankinh + "inch");
            System.out.println("Tuong duong" +Hinhhoc.ChuyenInchsangCentimet(bankinh) + "cm");
        }
    }
}
