import java.util.*;

import javax.swing.text.html.parser.Element;
public class BasicList {
    public static void main(String args[]){
       LinkedList<Integer> list = new LinkedList<Integer>();
       System.out.println("1. Enter 1 For Inserting the Element At First");
       System.out.println("2. Enter 2 For Inserting the Element At End");
       System.out.println("Enter -1 For Print the Liked List ");
       Scanner in = new Scanner(System.in);
       int Command = in.nextInt();
        do{
            int operation = in.nextInt();
            switch(operation){
                    case 1 : int insertFirst = in.nextInt();
                             list.addFirst(insertFirst);
                             break;
                    case 2 : int insertLast = in.nextInt();
                             list.add(insertLast);
                             break;
                    case 3 : 
                   }
            System.out.println("For continue Press -1");
            Command = in.nextInt();
        }while(Command == -1);
       
        System.out.print(list + " ");
    }
}
