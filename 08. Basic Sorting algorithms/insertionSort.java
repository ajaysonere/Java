import java.util.*;

public class insertionSort {
    public static void main(String args[]){
        // insertion sort
        Scanner in = new Scanner(System.in);
        // enter the size of the array
        int size = in.nextInt();
        // declaring the array
        int arr[] = new int[size];
        // enter values of the arr
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        // Calling the insertion function
        insertionSortOnArray(arr);

        // printing the element of the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        in.close();
    }
}
