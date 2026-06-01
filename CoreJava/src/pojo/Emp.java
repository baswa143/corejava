package pojo;

public class Emp {
    private int ID;
    String name;
    double salary;

    public Emp()
    {
        System.out.println("no args enter in constructor");
    }
    public Emp(int ID)
    {
        this.ID=ID;
    }
    public void setID(int ID)
    {
        this.ID=ID;
    }
    public int getID(int id)
    {
        return ID;
    }
    public String toString()
    {
        return "Emp{" + "ID=" + ID + ", name=" + name + ", salary=" + salary + '}';
    }


}
