package  aggregation;

public  class Main
{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.first="Mohamed";
        s1.last="Siddhik";
        s1.section = 1;
        s1.email = "mohamed@gmail.com";
        s1.laptop = new Laptop();
        s1.laptop.modelName="HP Pavilion";
        s1.laptop.modelNumber=1234;

        s1.details();
        s1.laptopDetails();
    }
}