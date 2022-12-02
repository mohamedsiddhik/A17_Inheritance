

//Single Inheritance


class Father{ // base class
    public  void  house(){
        System.out.println("have a 2BHK House");
    }
}

class Son extends  Father{   //Derived Class
    public  void car(){
        System.out.println("Have a Own Audi car");
    }
}

public  class Inheritance1
{
    public static void main(String[] args) {
        Son s = new Son();
        s.house();
        s.car();
    }
}