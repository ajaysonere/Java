import java.util.Scanner;

public class binarySearch {

    public static int binarySearchInArray(int arr[] , int key){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(); 
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        int key = in.nextInt();
        int result = binarySearchInArray(arr,key);
        if(result == -1){
            System.out.println("Element is not present ");
        }else{
            System.out.println("Element is present at index "+ result);
        }
        in.close();
    }
}
