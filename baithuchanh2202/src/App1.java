import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap he so a: ");
        a = sc.nextInt();
        System.out.println("Nhap he so b: ");
        b = sc.nextInt();
    while ( a != b)
    {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }
    System.out.println("UCLN cua 2 so a b la: " +a );
    
 } 
}
