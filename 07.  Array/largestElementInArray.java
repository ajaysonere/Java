import java.util.*;

public class largestElementInArray {

    public static int findMaxElement(int arr[] , int size){
        int largest = 0;
        for(int i=0; i<size; i++){
           if(arr[i]>largest){
             largest = arr[i];
           }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        // taking input
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        int maxElement = findMaxElement(arr,size);
        System.out.print("Largest Element in array "+ maxElement);
        in.close();
    }
}
