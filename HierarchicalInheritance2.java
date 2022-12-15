package inheritance;
class Employee{
    float salary = 45000;
    void display(){
        System.out.println("The Employee salary is : " + salary);
    }
}
class PermanentEmployee extends Employee {
    double hike = 0.5;
    void increment(){
        System.out.println("The permanent employee salary is : " +(salary+(salary*hike)) );
    }
}
class TemporaryEmployee extends Employee{
    double hike = 0.35;
    void increment(){
        System.out.println("The temporary Employee salary is : " + (salary+(salary*hike)));
    }
}
public class HierarchicalInheritance2
{
    public static void main(String[] args) {
        TemporaryEmployee te = new TemporaryEmployee();
        PermanentEmployee pe = new PermanentEmployee();
        te.display();
        te.increment();
        pe.display();
        pe.increment();
    }
}