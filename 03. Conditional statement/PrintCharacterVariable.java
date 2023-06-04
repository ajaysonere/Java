

public class PrintCharacterVariable {
    public static void main(String args[]){
        char value = (args[0]).charAt(0);

        if(Character.isDigit(value)){
            System.out.println("Digit");
        }else if(Character.isLetter(value)){
            System.out.print("Alphabet");
        }else{
            System.out.println("Special Character");
        }
    }
}
