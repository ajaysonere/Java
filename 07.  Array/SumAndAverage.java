import java.util.*;
public class SumAndAverage {

    public static int sumOfArray(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    static int averageOfArray(int arr[] , int sumOfArrayElement){
        int average = 0;
        int numberOfElementInArray = arr.length;
        average = (sumOfArrayElement/numberOfElementInArray);
        return average;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // size of the array
        int size = in.nextInt();
        // initializing the array
        int arr[] = new int[size];
        // 
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        
        int sumOfArrayElement = sumOfArray(arr);
        int averageOfArrayElement = averageOfArray(arr , sumOfArrayElement);
        System.out.println("Sum of the array element " + sumOfArrayElement);
        System.out.println("Average of the array element " + averageOfArrayElement);
        in.close();
    }
}
