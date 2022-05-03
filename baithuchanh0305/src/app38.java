import java.util.LinkedList;

public class app38 {
    public static void main(String[] args){
        LinkedList<String> List = new LinkedList<String>();
        
       List.add("PHP");
       List.add("HTML");
       List.add("java");
       List.add("C#");

        System.out.println("vi du su dung phuong thuc addAll()");
        System.out.println("----------------------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(List);
        System.out.print("listA:");
        ShowList(listA);

        System.out.println("\nvi du su dung phuong thuc retainAll()");
        System.out.println("----------------------------");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java");
        listA.retainAll(listB);
        System.out.print("listA:");
        ShowList(listA);

        System.out.println("\nvi du su dung phuong thuc removeAll()");
        System.out.println("----------------------------");
        List.removeAll(listB);
        System.out.print("list:");
        ShowList(List);
    }
    private static void ShowList(LinkedList<String> list) {
        for(String obj : list){
            System.out.println("\t"+obj+",");
        }
        System.out.println();
    }
}

