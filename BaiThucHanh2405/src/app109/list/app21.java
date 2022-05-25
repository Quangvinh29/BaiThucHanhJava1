package app109.list;

import java.util.ArrayList;

public class app21 {
    public static void main(String[] args){
        ArrayList<String> Array = new ArrayList<>();
        Array.add("Red");
        Array.add("brown");
        Array.add("black");
        Array.add("yellow");
        Array.remove("yellow");
        Array.add("green");
        Array.add("pink");

        System.out.println(Array.get(1));
        System.out.println(Array.contains("Pink"));
        System.out.println(Array.size());
        System.out.println(Array);
    }
}
