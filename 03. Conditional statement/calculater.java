import java.util.*;
public class calculater{
    public static void main(String args[]){
        System.out.println("Simply Calculater ");
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        String sign = in.next();
        switch(sign){
            case "+" : System.out.println("Addition "+(firstNumber+secondNumber));
                       break;
            case "-" : System.out.println("Substraction "+(firstNumber-secondNumber));
                       break;
            case "*" : System.out.println("Multiplication "+(firstNumber*secondNumber));
                       break;
            case "/" : System.out.println("Division "+(firstNumber/secondNumber));
                       break;
            case "%" : System.out.println("Modulo "+(firstNumber%secondNumber));
                       break;
            default : System.out.println("Invalid sign ");

        }
        in.close();
    }
}