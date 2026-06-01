package pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private int ID;
    private String name;
    private double salary;

    public Student() {
    }
    public Student(int ID, String name, double salary)
    {
        this.ID=ID;
        this.name=name;
        this.salary=salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString()
    {
        return "Emp{"+"ID="+ID+" "+name+" "+salary+'}';
    }
}
