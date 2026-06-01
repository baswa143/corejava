package serializable;//package Serializable;
//import java.lang.Cloneable;
//import java.io.Serializable;
//
//public class Person implements Serializable {
//    public Person() {
//        System.out.println("person object created");
//    }
//
//}
//
//class Animal{
//    public Animal() {
//        System.out.println("animal object created");
//    }
//}
//
//class Greeks{
//    public static void main(String[] args) {
//        Person p=new Person();
//        Animal a=new Animal();
//
//        if(p instanceof Serializable){
//            System.out.println("person is a serializable");
//        }
//
//        else {
//            System.out.println("person is not a serializable");
//        }
//        if(a instanceof Serializable){
//            System.out.println("animal is a serializable");
//        }
//        else {
//            System.out.println("animal is not a serializable");
//        }
//    }
//
//}
//
//
//
//// Making class A cloneable using cloneable interface
//class A implements Cloneable
//{
//    int i;
//
//    // A class constructor
//    public A(int i) {
//        this.i = i;
//    }
//
//    // Overriding clone() method by simply calling Object class clone() method.
//    @Override
//    protected Object clone()
//            throws CloneNotSupportedException
//    {

import java.io.*;

////        return super.clone();
//    }
//}
//
// class Geeks
//{
//    public static void main(String[] args)
//            throws CloneNotSupportedException
//    {
//        A a = new A(20);
//
//        // cloning 'a' and holding new cloned object reference in b
//
//        // down-casting as clone() return type is Object
//        A b = (A)a;
//
//        System.out.println(b.i);
//    }
//}
//
//
//
class Person implements Serializable{
    int i;
    String name;
    Person(int i,String name){
        this.i=i;
        this.name=name;
    }
}
class Greeks {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person(12,"vignesh");

        //serializable

        FileOutputStream fos = new FileOutputStream("notes.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(p1);

        //Deserializable
        FileInputStream fis = new FileInputStream("data.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person p = (Person) ois.readObject();

        System.out.println(p.i+" "+p.name);
        oos.close();
        fis.close();

    }
}

