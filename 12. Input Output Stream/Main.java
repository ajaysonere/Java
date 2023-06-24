import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedWriter wr = new BufferedWriter(new FileWriter("D:\\Source Code\\Java\\12. Input Output Stream\\input.txt"));
            wr.write("Hi , 👋 My name is Ajay\n");
            wr.write("Nice to meet you\n");
            wr.write("Thank you \n");
            wr.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
