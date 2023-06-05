import java.util.*;

public class SumOfElementWithCondition {

    public static int sumOfElementInCondition(int arr[]){
        int sum = 0;
        int tempSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 6){
                for(; i<arr.length; i++){
                    if(arr[i] == 7){
                        tempSum = 0;
                        break;
                    }else{
                        tempSum += arr[i];
                    }
                }
            }else{
                sum += arr[i];
            }
        }

        return sum+tempSum;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int sumOfElement = sumOfElementInCondition(arr);
        System.out.println("sum of the element is " + sumOfElement);
        
        in.close();
    }
}
