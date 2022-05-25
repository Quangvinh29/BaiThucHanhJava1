package app109.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class app19 {
    public static void main(String[] args){
        ArrayList<Character> arrayList = new ArrayList<>();

        arrayList.add('a');
        arrayList.add('e');
        arrayList.add('b');
        arrayList.add('c');
        
        ListIterator<Character> listIterator = arrayList.listIterator();


        System.out.println("cac phan tu trong arraylist la:");
        while(listIterator.hasNext()){
        System.out.println(listIterator.next() + "\t");
        }
    }
}
