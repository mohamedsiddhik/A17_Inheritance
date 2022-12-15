

package inheritance;
class Salary{

    float total_sal =0, salary = 30000;
}
class HRA extends Salary{
    public float hra= 4000;
}
class DA extends HRA{
    public float da = 2500;
}
class Bonus extends DA{
    public float bonus = 1700;
}
public class MultilevelInheritance
{
    public static void main(String[] args) {
        Bonus bo = new Bonus();
        bo.total_sal = bo.salary + bo.da + bo.hra + bo.bonus;
        System.out.println("Total salary is : " + bo.total_sal);
    }
}