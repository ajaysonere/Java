import java.util.Scanner;

public class bubblesort {
    public static void bubblesortOnArray(int arr[]){
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        // bubble sort
        Scanner in = new Scanner(System.in);
        // enter the size of the input
        int size = in.nextInt();
        // declaring array
        int arr[] = new int[size];
        // input in array
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        bubblesortOnArray(arr);
        
        System.out.println("Bubble Sort ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
