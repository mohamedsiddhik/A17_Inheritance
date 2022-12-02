// Multi-level Inheritance

class  GrandFather{  //Based Class
      void  house(){
        System.out.println("3BHK House");
    }
}
class Father2 extends  GrandFather{ //Derived Class
    public  void  land(){
        System.out.println("5 Acres Land");
    }
}
class  Son2 extends  Father2{ //Derived class
    public  void  bike(){
        System.out.println("RE bike");
    }
}



public  class Inheritance2
{
    public static void main(String[] args) {
        Son2 s2 = new Son2(); //create an object
        s2.bike();
        s2.house();
        s2.land();
    }
}