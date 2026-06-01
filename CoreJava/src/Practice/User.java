package Practice;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User customer details:");
        System.out.println("******************* ");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println(name);
       //String username = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println(age);
        System.out.println("Enter your location: ");
        String location =sc.nextLine();

        System.out.println(location);
    }
}
