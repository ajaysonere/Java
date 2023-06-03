import java.util.*;
public class evenorodd{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number%2 == 0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd ");
        }
        in.close();

        if(args.length == 0){
            System.out.println("No value");
        }else{
            System.out.println("Length is :"+ args.length);
        }
    }
}