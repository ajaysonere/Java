import java.util.*;
public class linearSearch {

    public static boolean linearSearchInArray(int arr[], int key , int size){
        for(int i=0; i<size; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        int key = in.nextInt();
        if(linearSearchInArray(arr , key , size)){
            System.out.println("Element is present");
        }else{
            System.out.println("Element is not present ");
        }
        in.close();
    }
}
