package  aggregation;

public  class Student
{
    String first;
    String last;
    String email;
    int section;
    Laptop laptop;

    public  void  details(){
        System.out.println("Name : " + first);
        System.out.println("Last Name : " + last);
        System.out.println("Email : " + email);
        System.out.println("Section : " + section);
    }
    public  void  laptopDetails(){
        System.out.println("The Student : " + first + " has laptop of ModelName : " + laptop.modelName);
        System.out.println("The modelNumber of laptop of student : " + first + " is " + laptop.modelNumber );
    }
}