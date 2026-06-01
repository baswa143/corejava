package Inheritance;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Animal a=new Animal();
        Dog d=new Dog();
        Puppy p=new Puppy();
      //  System.out.println(a instanceof Object);
        //System.out.println(d instanceof Object);
        //System.out.println(p instanceof Object);

        //System.out.println(false);//if the relationship is parent to child : false
        //System.out.println(d instanceof Animal)// if the relationship is child to parent: true
    }

    public static class Fibonnci {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a=0;
            int b=1;
            for(int i=1;i<=n;i++){
                int temp=a; // temp=0 temp=1 a=1 2 3 4 5
                a=a+b;      //a=0+1  1+1 2 2+1 3+1 4+1 5+1
                b=temp;     //b=1 temp=1
            }
            System.out.println(a);
        }
    }
}
