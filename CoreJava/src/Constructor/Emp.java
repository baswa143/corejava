package Constructor;

public class Emp {
    //instance variable
    int eid;
    String ename;
    double salary;
    String company;
    String address;

    Emp(int eid, String ename, double salary, String company, String address)// loc variable
            // assign the local data to instance data
    {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.company = company;
        this.address = address;
    }

    void status()
    {
        if(salary>15000){
            System.out.println("Employee is very good");
        }
        else {
            System.out.println("Employee is good");
        }
    }

    public static void main(String[] args) {
        Emp em=new Emp(121,"baswa",160000,"TCS","HYD");
        em.status();
    }
}
//1. variables are use to store the data.
//2. Method are used to write the business logics of the applications.
//3. Constructors are used to initialize the data during object creation.