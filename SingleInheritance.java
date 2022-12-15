

package inheritance;
 class Faculty{
    float salary = 30000;
}
class Science extends Faculty{
     float bonus = 3000;
}

public class SingleInheritance
{
    public static void main(String[] args) {
        Science sc = new Science();
        System.out.println("Salary is : " + sc.salary);
        System.out.println("Bonus is : " + sc.bonus);

    }
}