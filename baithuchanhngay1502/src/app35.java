import java.util.Scanner;

public class app35 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Double A, B;
        System.out.println("Nhap he so A: ");
        A = scanner.nextDouble();
        System.out.println("Nhap he so B:");
        B = scanner.nextDouble();
        if (A<B){
            System.out.println("so nho nhat trong 2 so la A=" + A);
        } else if (A>B){
            System.out.println("so nho nhat trong 2 so la B=" + B);
           }   else 
            System.out.println("so nho nhat trong 2 so la A=B=" + A);
        }
    }
