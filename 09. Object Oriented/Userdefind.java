class Student{

    String name ;
    String  DOB;

    public Student(String name , String DOB){
        this.name = name;
        this.DOB = DOB;
    }    

    // void setInfo(String name , int dob){
    //     this.name = name;
    //     this.DOB = dob;
    // }

    void getInfo(){
        System.out.println("Name is  :" + this.name);
        System.out.println("Date of Birth is :" + this.DOB);
    }
}

public class Userdefind{
      public static void main(String args[]){
          Student s1 = new Student("Ajay Sonere" , "12-05-2001");
        //   s1.setInfo("Ajay","12052001");
          s1.getInfo();
      } 
};
