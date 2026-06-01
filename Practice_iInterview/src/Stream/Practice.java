package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //1. Filter Even Numbers from a List
        //Question: Given a list of integers, filter the even numbers.
        List<Integer> collect = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        //2. Find Maximum in a List
        //Question: Find the maximum number from a list of integers.
        List<Integer> number = Arrays.asList(10, 20, 30, 40, 50);
        number.stream().sorted(Comparator.reverseOrder()).findFirst().stream().collect(Collectors.toList()).stream().forEach(System.out::println);
        Integer i = number.stream().max(Integer::compare).orElse(0);
        System.out.println(i);

        List<String> list = Arrays.asList("java", "spring", "hibernate");
        list.stream().min(Comparator.comparing(String::length)).ifPresent(System.out::println);




    }
}

class Employee{
    int id;
    String name;
    String dept;
    int sal;

    public Employee(int id, String name, String dept,int sal) {
        this.id=id;
        this.name=name;
        this.dept=dept;
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
                ", dept" +dept+
                ", sal=" + sal +
                '}';
    }

    public static void main(String[] args) {
        List <Employee>list = List.of(
                new Employee(10,"Nilesh","HR",10000),
                new Employee(20,"Mahen","Finance",20000),
                new Employee(30,"Chetanya","IT",15000),
                new Employee(40,"Vijay","HR",50000),
                new Employee(50,"Akash","IT",80000),
                new Employee(60,"Akshay","Engineering",80000)
        );
        //3. Find Employee with Highest Salary

        list.stream().max(Comparator.comparing(Employee::getSal)).ifPresent(e-> System.out.println(e.getName()));
    }
}
