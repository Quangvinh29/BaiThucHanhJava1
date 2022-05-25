
import java.util.ArrayList;
import java.util.Scanner;

public class App110{
  public static void main(String[] args){
      ArrayList<Integer> Array = new ArrayList<>();
    Scanner sc =new Scanner(System.in);
    int number;

    System.out.println("Nhap so phan tu ban  muon:");
    int n = sc.nextInt();
    for(int i = 0; i <=n; i++){
      System.out.println("nhap so phan tu thu" +i+":");
      number = sc.nextInt();
      Array.add(number);
    }
    // tim phan tu lon nhat
    int max = Array.get(0);

    for (int i = 1; i < Array.size(); i++){
    if(Array.get(i).compareTo(max) >0){
        max = Array.get(i);
    }
    }
    System.out.println("Phan tu lon nhat trong array = "+max);

    // xoa 1 phan tu
    System.out.println("nhap phan tu ban muon xoa:");
    int unnumber;
    unnumber = sc.nextInt();
    ArrayList<Integer> phantuxoa = new ArrayList<>();
    phantuxoa.add(unnumber);
    Array.removeAll(phantuxoa);
    System.out.println("xoa thanh cong!");
    System.out.println("danh sach phan tu trong arraylist sau khi xoa la:");
    System.out.println(Array);

    //sap xep day so
    for (int i = 0; i <Array.size(); i++){
      for (int j = i+1; i < Array.size()-1; j++){
           if (Array.get(i) > Array.get(j)){
              int temp = Array.get(i);
              Array.set(i, Array.get(j));
              Array.set(j, temp);
          }
      }
  }
  System.out.print("Danh sach sau khi sap xep: ");
  for (int i = 0; i < Array.size(); i ++){
      System.out.print(Array.get(i) + " ");
  }


     } 
   }



  
