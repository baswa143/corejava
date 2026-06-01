package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Emp {
    String name;
    int id;
    String dept;
    double sal;
    int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Emp( String name,int id,double sal, String dept ,int age){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.sal=sal;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employee2={id = '" + id + "'  name='" + name + "'dept='" + dept + " sal ='" + sal + "'}";

    }
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee3 that = (Employee3) o;
//        return id == that.id && Double.compare(sal, that.sal) == 0 && Objects.equals(name, that.name) && Objects.equals(dept, that.dept)&& Objects.equals(age,that.age) ;
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Double.compare(sal, emp.sal) == 0 && age == emp.age && Objects.equals(name, emp.name) && Objects.equals(dept, emp.dept);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name,dept,sal,age);
    }

    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(
                new Emp("Amit Sharma", 101, 55000, "IT", 28),
                new Emp("Priya Mehta", 102, 48000, "HR", 32),
                new Emp("Rohit Verma", 103, 62000, "Finance", 35),
                new Emp("Sneha Kulkarni", 104, 45000, "Marketing", 24),
                new Emp("Karan Singh", 105, 70000, "IT", 29),
                new Emp("Neha Gupta", 106, 53000, "Finance", 27),
                new Emp("Vikram Rao", 107, 47000, "HR", 40),
                new Emp("Ananya Desai", 108, 51000, "Marketing", 26)
        );
        //  Print names of all employees.
        //Q2.  Get all employees from "Pune".
        //Q3.  Count total number of employees.
        //Q4.  Get all employees with salary > 70000.
        //Q5.  Print all distinct cities.
        //Q6.  Get names of all HR employees.
        //Q7.  Check if any employee earns more than 90000.
        //Q8.  Get employee with the highest salary.
        //Q9.  Sort employees by name alphabetically.
        //Q10. Get total salary of all employees.

        //1
        Map<String, List<Emp>> collect = list.stream().collect(Collectors.groupingBy(Emp::getName));
        System.out.println(collect);
        //2
        list.stream().count();

        //3
        list.stream().filter(e->e.sal<70000).forEach(System.out::println);

        //6
      list.stream().filter(e->e.getDept().equals("HR")).forEach(System.out::println);

      //7
        list.stream().filter(e->e.sal>90000).forEach(System.out::println);
        //8

        System.out.println("_________------________------_____");
        list.stream().sorted(Comparator.comparing(Emp::getSal).reversed()).findFirst().ifPresent(System.out::println);

        //9
        List<Emp> collect1 = list.stream().sorted(Comparator.comparing(Emp::getName)).collect(Collectors.toList());
        System.out.println(collect1);

        //10
        double sum = list.stream().collect(Collectors.summarizingDouble(Emp::getSal)).getMin();
        System.out.println(sum);
        System.out.println("---------------------------------");

        //Q11. Get employees sorted by salary descending.
        //Q12. Get names of top 3 highest paid employees.
        //Q13. Group employees by department.
        //Q14. Count employees in each department.
        //Q15. Get average salary of Engineering department.
        //Q16. Get employees whose age is between 25 and 35.
        //Q17. Get all employee names joined by " | ".
        //Q18. Find employee with lowest salary in HR.
        //Q19. Get department wise total salary.
        //Q20. Get list of employees from Mumbai sorted by salary.

        //11
        list.stream().sorted(Comparator.comparing(Emp::getSal,Comparator.reverseOrder())).forEach(System.out::println);

        //12
        list.stream().sorted(Comparator.comparing(Emp::getSal,Comparator.reverseOrder())).limit(3).forEach(System.out::println);

        //13
        list.stream().collect(Collectors.groupingBy(Emp::getDept));

        //14
        Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.counting()));
        System.out.println(collect2);

        //15
        Double engineering = list.stream().filter(e -> e.getDept().equals("IT")).collect(Collectors.averagingDouble(Emp::getSal));
        System.out.println("avg "+engineering);

        //16
        list.stream().filter(e->e.getAge()>=25 && e.getAge()<=35 ).forEach(System.out::println);

        //17
        String collect3 = list.stream().map(Emp::getName).collect(Collectors.joining("|"));
        System.out.println(collect3);

        //18
        list.stream().sorted(Comparator.comparing(Emp::getSal)).limit(1).forEach(System.out::println);
        
        //19
        Map<String, Double> collect4 = list.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.summingDouble(Emp::getSal)));
        System.out.println(collect4);

        System.out.println("-----------part2 completed--------------------");
        //Q21. Find employees earning above their department average.
        //Q22. Get department with highest average salary.
        //Q23. Get top 2 earners from each department.
        //Q24. Find second highest salary overall.
        //Q25. Get city wise count of employees.
        //Q26. Partition employees — salary above and below 60000.
        //Q27. Find department with maximum number of employees.
        //Q28. Get names of employees sorted by salary desc, then name asc.
        //Q29. Check if all departments have at least one employee above 50000.
        //Q30. Get oldest employee from each department

        //21
        Map<String, Double> collect5 = list.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.averagingDouble(Emp::getSal)));
        System.out.println(collect5);

        //22
        Optional<Map.Entry<String, Double>> max = list.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.averagingDouble(Emp::getSal))).entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(max);

        //23
        Map<String, List<Emp>> collect6 = list.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors
                .collectingAndThen(Collectors.toList(), Emplist -> Emplist.stream()
                        .sorted(Comparator.comparing(Emp::getSal)
                                .reversed()).limit(2).collect(Collectors.toList()))));
        System.out.println(collect6);

        //24
        Optional<Emp> first = list.stream().sorted(Comparator.comparing(Emp::getSal).reversed()).skip(1).findFirst();
        System.out.println(first);

        //25
        System.out.println("*******************************************************************");

        //26
        Map<Boolean, List<Emp>> collect7 = list.stream().collect(Collectors.partitioningBy(e -> e.getSal() > 60000));
        System.out.println(collect7);

        //27
        Optional<Map.Entry<String, Long>> max1 = list.stream()
                .collect(Collectors.groupingBy(Emp::getDept, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(max1);

        //28
        List<String> collect8 = list.stream().sorted(Comparator.comparing(Emp::getSal).reversed().thenComparing(Emp::getName)).map(Emp::getName).collect(Collectors.toList());
        System.out.println(collect8);

        //29
        boolean b = list.stream().collect(Collectors.groupingBy(Emp::getDept)).values().stream().allMatch(emplist -> emplist.stream().anyMatch(e -> e.getSal() > 50000));
        System.out.println(b);

        //30
        Map<String, Optional<Emp>> collect9 = list.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.maxBy(Comparator.comparing(Emp::getAge))));
        System.out.println(collect9);


    }
}