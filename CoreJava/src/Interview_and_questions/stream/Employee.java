package Interview_and_questions.stream;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Employee {
    int id;
    String name;
    int sal;

    public Employee(int id, String name, int sal) {
        this.id=id;
        this.name=name;
        this.sal=sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sal);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && sal == employee.sal && Objects.equals(name, employee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

}

class Example {

    public static void main(String[] args) {

        List<Employee> list = List.of(
                new Employee(101,"natha",10000),
                new Employee(102,"shiv",15000),
                new Employee(103,"veer",20000),
                new Employee(103,"Veer",20000)
        );

        List<String> names=  list.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println("names of the employee is : " + names);

        System.out.println("get the employee sal as a double");
        list.stream().map(e->e.getSal()*2).forEach(System.out::println);

        // uppserCase
        list.stream().map(Employee::getName).map(String::toUpperCase).forEach(System.out::println);

        // convert  a first letter as capital letter
        System.out.println("=====convert  a first letter as capital letter =====");
        list.stream().map(Employee::getName).map(e->e.substring(0,1).toUpperCase()+ e.substring(1)).forEach(System.out::println);

        // Half of sal
        list.stream().mapToInt(e-> e.getSal()/2).forEach(System.out::println);

        System.out.println("Max sal");
        IntStream maxres  = list.stream().mapToInt(e-> e.getSal());
        System.out.println("Max is "+ maxres);



        // removing duplicates object
        System.out.println("========================");
        list.stream().distinct().forEach(System.out::println);

        List<Integer> li = List.of(1,2,2,3,3,4,5,5,2);
        li.stream().distinct().forEach(System.out::println);

        // list.stream().collect(Collectors.groupingBy(Employee::name))


        // System.out.println("BB".hashCode());

//        Average Salary by Gender
//        Find the average salary of male and female employees separately.
//        list.stream().collect(Collectors.groupingBy(Emp::male, Collectors.collectingAndThen(Collectors.groupingBy(Emp::female,Collectors.averagingDouble(Emp::getSal)))));
//        list.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.averagingDouble(Emp::getSal)));

        //Finding First Non-Repeating Character
        //Find the first non-repeating character in a string using Streams. If all characters repeat, return an empty Optional.
        String str="swisses";
        str.chars().mapToObj(c->(char)c).filter(e-> str.indexOf(e)==str.lastIndexOf(e)).forEach(System.out::println);

        //Find the first non-repeating character in a string using Streams. If all characters repeat, return an empty Optional.
       // str.chars().mapToObj(c->(char)c).filter()

//        Merging Maps with Conflict Resolution
//        Given two Map<String, Integer>, merge them into a single map. If a key exists in both, the value should be the sum of the values from both maps.
//list.stream().flatMap(List::stream).collect(Collectors.toList());


        //Average Salary by Gender
        //Find the average salary of male and female employees separately.
        //Messages sent to everyone will be saved in a new post-meeting chat, which can be seen by all its members.
        //
        //Training_One 13:05
        //Finding First Non-Repeating Character
        //Find the first non-repeating character in a string using Streams. If all characters repeat, return an empty Optional.
        //Finding the Most Experienced Employee
        //Find the employee who has been with the company the longest (based on yearOfJoining).
        //Merging Maps with Conflict Resolution
        //Given two Map<String, Integer>, merge them into a single map. If a key exists in both, the value should be the sum of the values from both maps.
        //Find employees whose salary is greater than average salary
        //Flatten nested list using flatMap
        //
        //Training_One 13:09


    }
}

