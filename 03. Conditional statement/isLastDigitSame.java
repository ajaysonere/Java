public class isLastDigitSame {
    public static void main(String args[]){
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        if((firstNumber%10) == (secondNumber%10)){
            System.out.println("Last Digit is same ");
        }else{
            System.out.println("Last Digit is not same ");
        }
    }
}
