package Person;

import java.util.Scanner;

public class Person {
        public String PersonID;
        public String PersonName;
        Scanner sc = new Scanner(System.in);
    
        public Person(){}
    
        public void nhapPersonID(){
            System.out.println(" nhap PersonID ");
            Scanner sc = new Scanner(System.in);
            PersonID = sc.nextLine();
            sc.close();
        }
    
        public void nhapPersonName() {
           System.out.println("nhap ten:");
            Scanner sc = new Scanner(System.in);
            PersonName = sc.nextLine();
            sc.close();
        }
    }