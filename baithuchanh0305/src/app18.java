import java.util.ArrayList;

public class app18 {
    public static void main(String[] args){
        ArrayList<Float> arraylistFloats = new ArrayList<>();
        arraylistFloats.add(7.4f);
        arraylistFloats.add(5f);
        arraylistFloats.add(3.67f);
        arraylistFloats.add(1.43f);

        java.util.Iterator<Float> iterator = arraylistFloats.iterator();

        System.out.println("cac phan tu trong arraylists la:");
        while(iterator.hasNext()){
        System.out.print(iterator.next() + "\t");    
        }
    }
}
