import java.util.*;
public class incomeTaxCalculater{
    public static void main(String args[]){
      System.out.println("Income Tax Calculater");
      Scanner in = new Scanner(System.in);
      int income = in.nextInt();
      if(income <= 500000){
        System.out.println("You are not eligible to pay income tax");
      }else if(income >500000 && income <= 1000000){
        System.out.println("YOur income tax is "+(income*0.2));
      }else{
        System.out.println("Your income tax is "+(income*0.3));
      }
      in.close();
    }
}