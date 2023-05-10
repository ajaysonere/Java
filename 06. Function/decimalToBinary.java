public class decimalToBinary {
    public static void main(String args[]){
        // decimal to binary
        int d = 5;
        int ans = 0;
        while(d>0){
            int temp = d%2;
            ans = ans*10+temp;
            d = d/2;
        }
    }
}
