package slide54;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc{
    public float chieudai;
    public float chieurong;

public Hinhchunhat(){
  ten = "Hinh chu nhat";
}
public void nhapchieudai(){
   System.out.println("chieu dai hinh chu nhat =");
   Scanner sc = new Scanner(System.in);
   chieudai = sc.nextFloat();
}
public void nhapchieurong(){
    System.out.println("chieu rong hinh chu nhat =");
    Scanner sc = new Scanner(System.in);
    chieurong = sc.nextFloat();
}
public void tinhChuvi(){
    chuvi = 2*(chieudai + chieurong);
}
public void tinhDientich(){
    dientich = chieudai * chieurong;
}
}