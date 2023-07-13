import java.util.*;
public class arrayList {
    public static void main(String args[]){
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(3,5);
        for(int x : list1){
            System.out.print(x+" ");
        }
        System.out.println();
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.add(45);
        for(int x : list2){
            System.out.print(x + " ");
        }
        System.out.println();
        List<Integer> list3 = new LinkedList<>();
        list3.addAll(list2);
        for(int x : list3){
            System.out.print(x+" ");
        }
        Integer temp = 20;
        list3.remove(temp);
        System.out.println("\n"+list3.get(3));
        
        System.out.println(list3.indexOf(5));


        Iterator<Integer> it = list3.iterator();
        while(it.hasNext()){
            Integer next = it.next();
            System.out.print(next + " ");
        }
        
    }
}
