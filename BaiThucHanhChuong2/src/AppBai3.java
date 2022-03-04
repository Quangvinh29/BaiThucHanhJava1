
import java.util.Scanner;
public class AppBai3 {
    public static void main(String[] args) throws Exception {
        int age, year;
        String name;
        Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhap vao Ten: ");
    name = scanner.nextLine();
    System.out.println("Nhap vao nam sinh: ");
    year = scanner.nextInt();
    
    age = 2022 - year;  
    if (age < 16) {
        System.out.println("Ban"  + name +  "o do tuoi vi thanh nien");
    } else if (age >= 16 && age < 18) {
        System.out.println("Ban"  + name +  "o do tuoi truong thanh");
    } else {
        System.out.println("Ban"  + name + "da gia");
    }
}
}