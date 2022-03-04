import java.util.Scanner;

public class AppBai6 {
    public static void main(String[] args) {
        int n, temp = 1;
        long giaithua = 1;
         
        Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.println("Nhap vao 1 so nguyen duong bat ky : ");
            n = scanner.nextInt();
        } while ((n <= 0) || (n > 10));
        while (temp <= n) {
            giaithua *= temp;
            temp++;
        }
        System.out.println( "Giai thua cua so "+ n + " la: = " + giaithua);
    }
 
}