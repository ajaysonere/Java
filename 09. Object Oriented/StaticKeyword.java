class Human{
    String name;
    String gender;
    String address;
    static int population;

    Human(String name, String gender , String address){
        this.name = name;
        this.gender = gender;
        this.address = address;
        Human.population += 1;
    }

    void display(){
        System.out.println("Name is :"+name);
        System.out.println("Gender is : "+gender);
        System.out.println("Address is :"+address);
    }
}

public class StaticKeyword {
    public static void main(String args[]){
        Human ajay = new Human("Ajay","Male", "Pidhay");
        Human vijay = new Human("Vijay", "Male", "Pidhay");
        Human Anjali = new Human("Anjali", "Female", "Pidhay Bujurag");

        ajay.display();
        System.out.println();
        vijay.display();
        System.out.println();
        Anjali.display();
        System.out.println();

        System.out.println("Population is :" + Human.population);

    }
}
