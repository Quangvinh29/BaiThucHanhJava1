import java.util.ArrayList;

public class app16{
     public static void main(String[] args) {
        ArrayList<String> arrayListsStrings = new ArrayList<>();

        arrayListsStrings.add("so 1");
        arrayListsStrings.add("so 2");
        arrayListsStrings.add("so 3");
        arrayListsStrings.add("so 4");
        arrayListsStrings.add("so 5");

        System.out.println("cac phan tu trong arraylist la:");
        for(int i=0; i<arrayListsStrings.size(); i++ ){
        System.out.println(arrayListsStrings.get(i) + "\t");
        }

        arrayListsStrings.set(4, "1 con so 5");
        System.out.println("cac phan tu trong arraylist sau khi thay doi la:");
        for(int i=0; i<arrayListsStrings.size(); i++ ){
        System.out.println(arrayListsStrings.get(i) + "\t");
        }
    }
}

