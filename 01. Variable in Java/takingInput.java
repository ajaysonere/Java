import java.util.*;
public class takingInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // for string
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println( "Name is : "+ name);
        // for integer
        System.out.println(age);
        sc.close();
    }
}