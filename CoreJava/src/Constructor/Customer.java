package Constructor;

public class Customer {
    //instance variable
    String cname;
    int pid;
    String pname;
    double pcost;
    int quantity;
    static int gst=10;
    static String Brand="honeywell";
    static double discount=5;

    Customer(String cname, int pid, String pname, double pcost, int quantity)
    {
        this.cname=cname;
        this.pid=pid;
        this.pname=pname;
        this.pcost=pcost;
        this.quantity=quantity;
    }
    public void total_bill()
    {
        double subtotal=pcost*quantity;
        int get = gst/100;
        double taxAmount=subtotal*gst;
        double totalWithTax=subtotal+taxAmount;

        double discountAmount=totalWithTax*( discount /100);
        double bill= totalWithTax-discountAmount;



    }

    public static void main(String[] args) {
        Customer c = new Customer("Baswa",201,"ghee",400,40);
        c.total_bill();
        System.out.println(c.cname+" "+c.pid+" "+c.pname+" "+c.pcost+" "+c.quantity+discount+" "+gst);
        Customer c1 = new Customer("baswa",201,"ghee",400,40);
    }


}
