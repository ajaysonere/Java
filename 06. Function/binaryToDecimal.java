public class binaryToDecimal {
    public static void main(String args[]){
        // binary to decimal
        int a = 101;
        int pow = 0;
        int ans = 0;
        while(a>0){
          int lastDigit = a%10;
          ans = ans + (lastDigit*(int)Math.pow(2, pow));
          pow++;
          a = a/10;
        }
        System.out.println("Decimal to binary "+ ans);
    }
}
