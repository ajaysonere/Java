import java.io.ObjectInputFilter.Status;
import java.util.*;

public class reverseArray {

    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        // taking input
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Before reversing the array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nAfter the reversing the array");
        reverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}
