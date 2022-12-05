

package hybrid;

public class Derived implements Inter2 , Inter3 {
    @Override
    public void fun1() {
        System.out.println("Inter 1 : " + a);
    }

    @Override
    public void fun2() {
        System.out.println("Inter 2 : " + b);
    }

    @Override
    public void fun3() {
        System.out.println("Inter 3 : " + c);
    }
}