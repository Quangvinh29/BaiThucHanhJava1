import java.util.ArrayList;
import java.util.Scanner;

public class app22{
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        int number;
        System.out.println("nhap so phan tu cua mang: ");
        n = sc.nextInt();

        for ( int i = 0 ; i < n ; i++){
            System.out.println("nhap so phan tu thu "+i+" : ");
            number=sc.nextInt();
            a.add(number);
        }

        int max = a.get(0);
        for(int i = 1; i < a.size();i++ ){
            if(a.get(i).compareTo(max)>0){
                max=a.get(i);
            }
        }
        
        System.out.println("phan tu lon nhat trong mang la: "+max);

    }
}