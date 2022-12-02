
//Hierarchical Inheritance
class Shape{  //Base Class
    float l,b,r;
}

class  Rect extends  Shape{ //Derived class
    public Rect(float length , float breadth){
        l=length;
        b = breadth;
    }
    float rectangle_area(){
        return  l * l;
    }
}

class Circle extends  Shape{ // Derived Class
    public  Circle(float radius){
        r = radius;
    }
    float circle_area(){
        return  3.14f * r;
    }
}

class Square extends  Shape{ // Derived Class
    public  Square(float length){
        l = length;
    }
    float square_area(){
        return  l*l;
    }
}


public  class Inheritance3
{
    public static void main(String[] args) {
        Rect r1 = new Rect(5,5);
        System.out.println("Area of Rectangle : " + r1.rectangle_area());

        Circle c1 = new Circle(3);
        System.out.println("Area of Circle : " + c1.circle_area());

        Square s1 = new Square(5);
        System.out.println("Area of Square : " + s1.square_area());
    }
}


