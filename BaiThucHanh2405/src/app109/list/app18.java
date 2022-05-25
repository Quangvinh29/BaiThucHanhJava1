package app109.list;

import java.util.ArrayList;
import java.util.Iterator;

public class app18{
    public static void main(String[] arrgs){
    ArrayList<Float> arrayListFloats = new ArrayList<>();

    arrayListFloats.add(0.7f);
    arrayListFloats.add(7.26f);
    arrayListFloats.add(1.02f);
    arrayListFloats.add(9.3f);
    
    Iterator<Float> iterator = arrayListFloats.iterator();

    System.out.println("cac phan tu trong arrlistfloat la:");
    while(iterator.hasNext()){
        System.out.println(iterator.next() + "\t");
    }
    }
}