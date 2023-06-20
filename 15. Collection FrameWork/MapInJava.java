import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapInJava {
    public static void main(String args[]){
        HashMap<String ,Integer> hp = new HashMap<>();
        hp.put("India", 140);
        hp.put("China" , 142);
        hp.put("US", 33);
        hp.put("Pakistan", 100);

        // search
        if(hp.containsKey("India")){
            System.out.println("Key is present");
        }else{
            System.out.println("Key is not present");
        }
        
        // for creating the set for key and value;
        for(Map.Entry<String , Integer> e : hp.entrySet()){
            System.out.print(e.getKey()+ " ");
            System.out.println(e.getValue()+ "");
        }

        // for creating a set of key
        Set<String> st = new HashSet<String>();
        st = hp.keySet();
        Iterator it = st.iterator();
        while(it.hasNext()){
           System.out.print(it.next()+ " ");
        }
        System.out.println();
        hp.remove("Pakistan");
        System.out.println(hp);
    }
}
