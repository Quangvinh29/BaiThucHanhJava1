import java.util.ArrayList;
import java.util.ListIterator;

public class app19 {
    public static void main(String[] args){
        ArrayList<Character> array = new ArrayList<>();
        array.add('a');
        array.add('b');
        array.add('c');
        array.add('d');
        array.add('e');

        ListIterator<Character> listIterator = array.listIterator();

        System.out.println("cac phan tu trong array la");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next() +"'\t");
        }
    }
}
