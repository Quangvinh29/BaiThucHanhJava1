import java.util.Scanner;

public class App30 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,a, Tong=0;
        System.out.println("Nhap he so n: ");
        n = sc.nextInt();
        if (n<0){
        System.out.println("n khong thoa man dieu kien!");
        }else
        while (n != 0)
        {
            a = n % 10;
            n = n /10;
            Tong += a;
        }
        System.out.println("tong cac phan tu cua n la: " + Tong);
    }
}
