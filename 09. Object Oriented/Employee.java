class Company{
    int id;
    String name;
    float salary;

    // public Company(int id , String name , float salary){
    //     id = id;
    //     name = name;
    //     salary = salary;
    // }
    void setId(int id){
       this.id = id;
    }

    void setName(String name){
        this.name = name;
    }
    
    void setSalary(float salary){
        this.salary = salary;
    }

    void getEmployeeDetails(){
       System.out.println("Details Of Employee :");
       System.out.println("ID Of Emplyee " + id);
       System.out.println("Name of Employee "+ name);
       System.out.println("Salary is "+ salary);
    }
}
public class Employee {
    public static void main(String args[]){
        Company c1 = new Company();
        c1.setId(1);
        c1.setName("Ajay Sonere");
        c1.setSalary(35000);
        c1.getEmployeeDetails();
    }
}
