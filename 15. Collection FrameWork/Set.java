import java.util.*;

public class Set {
    public static void main(String args[]){
        HashSet<Integer> st = new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);
        st.add(10);

        System.out.println(st);
        st.remove(10);
        System.out.println(st);

        if(st.contains(20))
           System.out.println("Present in set");
        else
           System.out.println("Not Present in Set");
        
        
        Iterator it = st.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

    }
}
