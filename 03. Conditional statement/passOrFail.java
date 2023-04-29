import java.util.*;
public class passOrFail {
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       float marks = in.nextFloat();
       if(marks >33.0){
          System.out.println("Greade : Pass");
       }else{
          System.out.println("Greade :Fail");
       }

       String isPass = (marks>33)?"Pass":"Fail";
       System.out.println("Greade : "+isPass);
    }
}
