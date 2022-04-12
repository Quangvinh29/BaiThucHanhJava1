package slide54;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat{
    public Hinhvuong(){
        ten = "Hinhvuong";
    }
    public void nhapCanh(){
        System.out.println("Canh cua hinh vuong =");
        Scanner sc = new Scanner(System.in);
        chieudai = chieurong = sc.nextFloat();
    }
}
