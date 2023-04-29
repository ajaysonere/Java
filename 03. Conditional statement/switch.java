import java.util.*;
public class Switch{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       int spin = in.nextInt();
       switch(spin){
          case 1: System.out.println("You get 5% discount");
                  break;
          case 2: System.out.println("You get 10% discount");
                  break;
          case 3: System.out.println("You get 20% Max discount");
                  break;
          default : System.out.println("Sorry ! better luck next time :) ");
       }
    }
}
