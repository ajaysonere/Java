public class PrimeNumberInRange {
    public static boolean isPrimeNumber(int number){
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        
        for(int i=firstNumber; i<secondNumber; i++){
            if(isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
}
