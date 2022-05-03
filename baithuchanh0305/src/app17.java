import java.util.ArrayList;

public class app17 {
    public static void main(String[] args){
        ArrayList<Integer> arrIntegers = new ArrayList<>();

        arrIntegers.add(0);
        arrIntegers.add(12);
        arrIntegers.add(3);
        arrIntegers.add(4);

        System.out.println("cac phan tu trong arraylists la:");
        for(int number: arrIntegers){
            System.out.println(number +"\t");
        }
    } 
}
