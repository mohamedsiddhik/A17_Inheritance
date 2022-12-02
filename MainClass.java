
package  hybridInheritance;

public class MainClass
{
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        System.out.println("-------------Main Method--------------");
        System.out.println("Student Name : " + parentClass.name);
        System.out.println("Student RollNo : " + parentClass.rollNo);

        ChildClassOne childClassOne = new ChildClassOne();
        System.out.println("------------- Child Class One ----------------");
        System.out.println("Student Name via ChildClassOne : " + childClassOne.name);
        System.out.println("Student RollNo via ChildClassOne: " + childClassOne.rollNo);
        System.out.println("Student Address via ChildClassOne : " + childClassOne.address);

        ChildClassTwo childClassTwo = new ChildClassTwo();
        System.out.println("------------- Child Class Two ----------------");
        System.out.println("Student Name via ChildClassTwo : " + childClassTwo.name);
        System.out.println("Student RollNo via ChildClassTwo : " + childClassTwo.rollNo);

        SubClassOne subClassOne = new SubClassOne();
        System.out.println("------------- Sub Class One ----------------");
        System.out.println("Student Name via SubClass : " + subClassOne.name);
        System.out.println("Student RollNo  via SubClass : " + subClassOne.rollNo);
        System.out.println("Student Address via SubClass : " + subClassOne.address);
    }
}