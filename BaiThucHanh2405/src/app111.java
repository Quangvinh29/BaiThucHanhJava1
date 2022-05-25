import java.util.LinkedList;
import java.util.Scanner;

public class app111 {
    public static void main(String[] args){
        LinkedList<Integer> linked = new LinkedList<>();
        Scanner  sc = new Scanner(System.in);
        int number;
        int n;
 
        System.out.println("So phan tu ban muon nhap la:");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++){
            System.out.println("Nhap phan tu thu " +i+ ":");
            number = sc.nextInt();
            linked.add(number);
        }
        System.out.println("danh sach linkedlist la:");
        System.out.println(linked);


        System.out.println("tinh tong cac so chan:");
        LinkedList<Integer> Sochan = new LinkedList<>();
         for (int i = 0; i <= linked.size()-1; i++){
            if(linked.get(i)%2 ==0){
             Sochan.add(linked.get(i));
            }
        }
        int sum =0;
        for( int i =0; i < Sochan.size(); i++){
            sum = sum + Sochan.get(i);
        }
        System.out.println("Tong cac so chan =" +sum);
 

        System.out.println("Tinh trung bình cong:");
        int tbc;
        tbc = sum / Sochan.size();
        System.out.println("Vay trung bình cong cua cac so do la:" +tbc);
    }
}
