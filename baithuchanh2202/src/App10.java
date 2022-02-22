import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, dem=0;
        System.out.println("Nhap he so a: ");
        n = sc.nextInt();
        if (n<0)
        System.out.println("a khong thoa man dieu kien so nguyen! ");
        else
        while(n>=1){
            n/=10;
            dem++;
        }
        System.out.println("so chu so cua a la:" +dem);
        
    }
}