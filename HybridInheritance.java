
package inheritance;
class A {
    A() {
        System.out.println("I am in class A! I have two children B and C");
    }
}
class B extends A {
    B() {
        System.out.println("I am in class B! I have 1 child D and I am the child class of A");
    }
}
class C extends A {
    C() {
        System.out.println("I am in class C. I am the child class of A");
    }
}
class D extends B {
    D() {
        System.out.println("I am in D class which is the extension of B class");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        D d = new D();
        B b = new B();
        C c = new C();
    }
}