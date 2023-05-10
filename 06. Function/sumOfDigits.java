public class sumOfDigits {
    public static void main(String args[]){
        int n = 452;
        int ans = 0;
        while(n>0){
            ans = ans + n%10;
            n = n/10; 
        }
        System.out.println("Sum of Digit is : " + ans);
    }
}
