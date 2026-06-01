package Constructor;

public class BIke {
    int price;
    String name;
    String color;

    public BIke()
    {
        System.out.println("BIke 1st Constructor");
    }
    public  BIke(int price,String name,String color)
    {
        this.price=price;
        this.name=name;
        this.color=color;
        System.out.println("BIke 2nd Constructor");
    }

    public static void main(String[] args) {
        BIke b=new BIke();
        BIke b1=new BIke(20000,"KTM","ORange");
        System.out.println(b1.price );
        System.out.println(b1.name);
        System.out.println(b1.color);
    }


}
