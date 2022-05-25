
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class app113 {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<>();
        Scanner sc =new Scanner(System.in);
        String traicay;
    
        System.out.println("Nhap so luon trai cay ban :");
        int n = sc.nextInt();
        for(int i = 0; i <n; i++){
          System.out.println("nhap ten trai cay thu" +i+":");
          traicay = sc.nextLine();
          hashSet.add(traicay);
        }
        System.out.println("So luong trai cay trong hashset la");
        System.out.println(hashSet);
      
    //tim loai trai cay
        System.out.println("Nhap vao ten 1 loai trai cay:");
        String name = sc.nextLine();
        if(hashSet.contains(name)){
          System.out.println("Tim thay "+name+ "trong hashSet");
        } else {
          System.out.println("Khong Tim thay "+name+ "trong hashSet");
        }

    //xoa trai cay
    HashSet<String> delete = new HashSet<>();
    String delname;
    delname= sc.nextLine();
    delete.add(delname);
    hashSet.removeAll(delete);
    System.out.println("xoa thanh cong!");
    System.out.println("cac phan tu con lai trong hashset la:");
    System.out.println(hashSet);

    // them phan tu vao hashset
    HashSet<String> list = new HashSet<>();

    list.add("nho");
    list.add("dua gang");
    list.add("man");
    list.add("qua thieu");

    hashSet.addAll(list);
    System.out.println("Các phan tu co trong hashSet sau khi them: ");
    Iterator<String> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "\t");

    // xoa phan tu list
    hashSet.removeAll(list);
    System.out.println("Các phần tu co trong hashSetFruits sau khi xoa: " + hashSet);
   }
  }
}