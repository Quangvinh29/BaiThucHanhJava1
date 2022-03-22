import java.util.Scanner;
public class Person {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;
    Scanner sc = new Scanner(System.in);
    public void nhapPersonID(){
        System.out.println("Hay nhap ID cua ban ");
        Scanner sc = new Scanner(System.in);
        PersonID = sc.nextLine();
        sc.close();
    }
    public void nhapPersonName() {
        System.out.println("Hay nhap ten cua ban ");
        Scanner sc = new Scanner(System.in);
        PersonName = sc.nextLine();
        sc.close();
    }
    public void nhapGender() {
        
        System.out.println("Hay nhap gioi tinh ");
        Scanner sc = new Scanner(System.in);
        Gender = sc.nextBoolean();
        sc.close();
    }
    public void nhapAddress() {
        System.out.println("Hay nhap Dia chi ");
        Scanner sc = new Scanner(System.in);
        Address = sc.nextLine();
        sc.close();
    }
    public void inPersonID() {
        System.out.println("ID cua ban la : " + PersonID);
    }
    public void inPersonName() {
        System.out.println("Ten cua ban la : " + PersonName);
    }
    public void inGender() {
        System.out.println("Gioi tinh: " + Gender);
    }
    public void inAddress() {
        System.out.println("Dia chi cua ban la : " + Address);
    }
}