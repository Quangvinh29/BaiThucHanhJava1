package shape;

import java.util.Scanner;

public class point {
    protected int y;
    protected int x;
    private String n;

    public point(){
    }
    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void SetPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setPointXY(String n,int x, int y){
        this.n=n;
        this.x = x;
        this.y = y;
    }
     public void nhapToaDo(){
        System.out.println("Nhap toa do thu 1 cua ban la");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("Nhap toa do thu 2 cua ban la");
        Scanner sc = new Scanner(System.in);
        y = scanner.nextInt();
        scanner.close();
        sc.close();
    }
    public void nhapTenDiem(){
        System.out.println("Nhap ten diem cua ban la");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLine();
        scanner.close();
    }
    public void inToaDo(){
    System.out.println("Toa Do diem" +n+ "la ("+x+","+y+")");
    }
}
