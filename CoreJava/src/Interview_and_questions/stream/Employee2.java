package Interview_and_questions.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Employee2 {
    int id;
    String name;
    String dept;
    double sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Employee2(int id, String name, String dept, double sal){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.sal=sal;
    }
    @Override
    public String toString() {
        return "Employee2={id = '" + id + "'  name='" + name + "'dept='" + dept + " sal ='" + sal + "'}";

    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 that = (Employee2) o;
        return id == that.id && Double.compare(sal, that.sal) == 0 && Objects.equals(name, that.name) && Objects.equals(dept, that.dept);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name,dept,sal);
    }


//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }

    public static void main(String[] args) {
        List<Employee2> list = List.of(
                new Employee2(10,"Nilesh","HR",10000),
                new Employee2(20,"Mahen","Finance",20000),
                new Employee2(30,"Chetanya","IT",15000),
                new Employee2(40,"Vijay","HR",50000),
                new Employee2(50,"Akash","IT",80000),
                new Employee2(60,"Akshay","Engineering",80000)
        );
        //Q1.  Print names of all employees.
        // list.stream().map(Employee2::getName).forEach(System.out::println);
        //Q2.  Get all employees from "Pune".

        //Q3.Count total number of employees.
//        long count=list.stream().count();
//        System.out.println("number of employees: "+count);

        //   Q4.  Get all employees with salary > 70000.

       // list.stream().filter(e->e.getSal()>7000).forEach(System.out::println);
     //Q5.  Print all distinct cities.

       // Q6.  Get names of all HR employees.
       list.stream().filter(e->e.getDept().equals("HR")).forEach(System.out::println);

       //   Q7.  Check if any employee earns more than 90000.
       boolean res= list.stream().anyMatch(e->e.getSal()>9000);
        System.out.println(res);

        //Q8.  Get employee with the highest salary.
        list.stream().sorted(Comparator.comparing(Employee2::getSal).reversed()).findFirst().ifPresent(System.out::println);
        list.stream().max(Comparator.comparing(Employee2::getSal)).ifPresent(System.out::println);

        OptionalDouble maxsal=list.stream().mapToDouble(Employee2::getSal).max();
        System.out.println(maxsal);

        //List<Employee2> result=list.stream().filter(e->e.getSal())

        // Q9.  Sort employees by name alphabetically.
        list.stream().sorted(Comparator.comparing(Employee2::getName)).forEach(System.out::println);

         //Q10. Get total salary of all employees
        double sum=list.stream().collect(Collectors.summarizingDouble(Employee2::getSal)).getSum();
        System.out.println("total sal"+sum);

//    Q11. Get employees sorted by salary descending.
       list.stream().sorted(Comparator.comparing(Employee2::getSal).reversed()).forEach(System.out::println);
        System.out.println("___---------____-------____-------____------____----__----_-________--____-------___----");

//        Q12. Get names of top 3 highest paid employees.
         list.stream().sorted(Comparator.comparingDouble(Employee2::getSal).reversed()).limit(3).forEach(System.out::println);


//                Q13. Group employees by department.
       Map<String,Map<String,List<Employee2>>> collect1=list.stream().collect(Collectors.groupingBy(Employee2::getDept,Collectors.groupingBy(Employee2::getName)));
        System.out.println(collect1);

//                Q14. Count employees in each department.
        Map<String, Long> countEmp=list.stream().collect(Collectors.groupingBy(Employee2::getDept,Collectors.counting()));
        System.out.println(countEmp);

//        Q15. Get average salary of Engineering department.
        double sal=list.stream().filter(e->e.getDept().equals("Engineering")).collect(Collectors.averagingDouble(Employee2::getSal));
        System.out.println("avg "+sal);
        System.out.println("***************************************************");

//        Q16. Get employees whose age is between 25 and 35.
//        Q17. Get all employee names joined by " | ".

//        Q18. Find employee with the lowest salary in HR.
       Optional<Employee2> hr=list.stream().filter(e->e.getDept().equals("HR")).sorted(Comparator.comparing(Employee2::getSal)).findFirst();
        System.out.println(hr);
        System.out.println("***************************************************");
//        Q19. Get department wise total salary.
        Map<String,Double> total=list.stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.summingDouble(Employee2::getSal)));
        System.out.println(total);

//        Q20. Get list of employees from Mumbai sorted by salary.

        list.stream().collect(Collectors.groupingBy(Employee2::getDept,Collectors.maxBy(Comparator.comparing(Employee2::getSal))));

        list.stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.maxBy(Comparator.comparing(Employee2::getSal))));









    }
}
