import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double A, B, C, x1, x2, delta;
        System.out.println("Nhap he so A: ");
        System.out.println("Nhap he so B: ");
        System.out.println("Nhap he so C: ");
        String strHeSo = "";
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        System.out.println("Phuong trinh bac hai co dang: " + A + "x^2 + " + B + "x + " + C + " = 0");
        delta = B*B - 4*A*C;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!");
        } else if (delta == 0) {
            x1 = -B / (2*A);
            System.out.println("Phuong trinh co mot nghiem x1 = x2 = " + x1);
        } else {
            x1 = (-B + Math.sqrt(delta)) / (2*A);
            x2 = (-B - Math.sqrt(delta)) / (2*A);
            System.out.println("Phuong trinh co hai nghiem = " + x1 + " và x2 = " + x2);
        }
    }

}