import java.util.*;

public class AsciiToChar {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        // Numbers 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        // corresponding value
        System.out.println();
        for(int i=0; i<arr.length; i++){
            
            System.out.print((char)arr[i] + " ");
        }
        in.close();
    }
}
