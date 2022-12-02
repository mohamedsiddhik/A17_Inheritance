class  Employee3
{
    float salary = 40000;
}
class Programmer extends  Employee3{
    int bonus = 5000;
}
public  class Inheritance
{
    public static void main(String[] args) {
//        Employee3 e = new Employee3();
        Programmer p = new Programmer();
        System.out.println("Employee salary is : " + p.salary);
        System.out.println("Employee Bonus is : " + p.bonus);
    }
}