import java.util.Scanner;

public class AppBai9 {
    public static void main(String[] args) {
        String chuoi;
        int m = 0, n= 0, chuso = 0;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao chuoi bat ky : ");
            chuoi = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isLowerCase(chuoi.charAt(i))) {
                n++;
            } 
            if (Character.isUpperCase(chuoi.charAt(i))) {
                m++;
            } 
            if (Character.isDigit(chuoi.charAt(i))) {
                chuso++;
            }
        }
             
        System.out.println("Trong chuoi vua nhap " + chuoi + " co " 
        + n + " ky tu in thuong va co " 
        + m + " ky tu in hoa va co " 
        + chuso + " chu so");
    }
    }