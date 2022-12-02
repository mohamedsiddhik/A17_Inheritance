

interface Mens
{
    String men = "Mens Clothes are available";
    void fmens();
}
interface  Womens
{
    String women = "Womens Clothes are available";
    void fwomens();
}
class Fashion implements Mens,Womens
{
    String fmens1;
    String fwomens1;
    @Override
    public void fmens() {
         fmens1 = "T-shirt , Jeans";
    }

    @Override
    public void fwomens() {
         fwomens1 = "saree, chudi";
    }
    void  display()
    {
        System.out.println("Mens section : " + men);
        System.out.println("Womens Section : " + women);
        System.out.println("Mens section clothes : " + fmens1);
        System.out.println("Womnens section Clothes : " + fwomens1);
    }
}

public  class Inheritance4
{
    public static void main(String[] args) {
        Fashion f = new Fashion();
        f.display();
    }
}