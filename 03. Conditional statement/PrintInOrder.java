import java.util.Scanner;

public class PrintInOrder{
    public static void main(String args[]){
        // Scanner in = new Scanner(System.in);
        // char a = in.next().charAt(0);
        // char b = in.next().charAt(0);

        char a = (args[0]).charAt(0);
        char b = (args[1]).charAt(0);
        boolean forA = false;
        if((int)a<(int)b){
            System.out.print(a + " ");
            forA = true;
        }else{
            System.out.print(b + " ");
        }

       if(forA == true){
           System.out.print(b);
       }else{
          System.out.print(a);
       }
        

        
        // in.close();

    }
}
