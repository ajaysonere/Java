public class decimalToBinary {
    public static void main(String args[]){
        // decimal to binary
        int d = 5;
        int ans = 0;
        int pow = 0;
        while(d>0){
            int rem = d%2;
            ans = ans+(rem*(int)Math.pow(10, pow));
            pow++;
            d = d/2;
        }
        System.out.println("Binary is : "+ ans);
    }
}
