import java.util.Scanner;

public class App9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, tmp, res = 0;;
        System.out.println("Nhap he so a: ");
        a = sc.nextInt();
        if (a<0)
        System.out.println("a khong thoa man dieu kien so nguyen! ");
        else
        while(a > 0){
            tmp = a % 10;
            res = res * 10 + tmp;
            a = a / 10;
        }
        System.out.println("in ra theo thu tu nguoc lai la: " + res);
     }
}