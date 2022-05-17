import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) throws Exception {
    int number;
    HashSet<Integer> hash = new HashSet<>();
    Scanner sc = new Scanner(System.in);


    hash.add(0);
    hash.add(3);
    hash.add(1);
    hash.add(4);
    hash.add(2);
    hash.add(8);
   
    System.out.println("cac phan tu trong hashset:");
    System.out.println(hash);
    System.out.println("nhap phan tu can them:");
    number = sc.nextInt();

    if(hash.contains(number)){
        hash.add(number);
        System.out.println("them thanh cong!");
        System.out.println("Cac phan tu trong hashset sau khi them:");
        System.out.println(hash);
    } else {
        System.out.println("Phan tu"+number+"da ton tai!");
    }

    // phan mo rong
   //Loai bo cac phan tu trong hashset
    int renumber;
    System.out.println("hay nhap phan tu ban muon loai bo:");
    renumber = sc.nextInt();
    if(hash.contains(renumber)){
        hash.remove(renumber);
        System.out.println("Xoa thanh cong!");
    }else{
        System.out.println("Phan tu"+number+"khong ton tai trong hashset!");;
    }
    // Nhap n phan tu
    System.out.println("Nhap so luong phan tu cua ban:");
    int n;
    n= sc.nextInt();
    for(int i=0; i<=n;i++){
      System.out.println("Nhap phan tu thu"+i);
      number = sc.nextInt();
      hash.add(number);
    }
    System.out.println("Cac phan tu trong hashset sau khi them:");
        System.out.println(hash);
    }  
}

