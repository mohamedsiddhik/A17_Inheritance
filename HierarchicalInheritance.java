package inheritance;

class Father2 {
    String familyName;
    String houseaddress;
    Father2() {
        familyName = "Good Family";
        houseaddress = "Tirunelveli";
    }
}
class Son extends Father2 {
    Son() {
        System.out.println("I am the Son");
        System.out.println("My family name is " + this.familyName + " and I am from " + this.houseaddress);
    }
}
class Daughter extends Father2 {
    Daughter() {
        System.out.println("I am the Daughter");
        System.out.println("My family name is " + this.familyName + " and I am from " + this.houseaddress);
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        Daughter d = new Daughter();
    }
}