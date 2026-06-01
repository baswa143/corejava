package Interview_and_questions.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Employee3 {
    public Object age;
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

    public Employee3(int id, String name, String dept, double sal){
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
        Employee3 that = (Employee3) o;
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
        List<Employee3> list = List.of(
                new Employee3(10, "Nilesh", "HR", 10000),
                new Employee3(20, "Mahen", "Finance", 20000),
                new Employee3(30, "Chetanya", "HR", 15000),
                new Employee3(40, "Vijay", "HR", 50000),
                new Employee3(50, "Akash", "IT", 80000),
                new Employee3(60, "Akshay", "Engineering", 80000)
        );
        //Q1.  Print names of all employees.
        Map<String, List<Employee3>> name =list.stream().collect(Collectors.groupingBy(Employee3::getName));
        System.out.println(name);
        list.stream().map(Employee3::getName).forEach(System.out::println);

        //Q2.  Get all employees from "Pune".
     //  List<Employee3>city= list.stream().filter(e->"pune".equals(e.getCity())).collect(Collectors.toList());

        //Q3.  Count total number of employees.
        long count=list.stream().count();
        System.out.println(count);
        //Q4.  Get all employees with salary > 70000.
        list.stream().filter(e->e.getSal()>70000).map(Employee3::getSal).forEach(System.out::println);
        //Q5.  Print all distinct cities.

        //Q6.  Get names of all HR employees.
        list.stream().filter(e->e.equals("HR")).map(Employee3::getName).forEach(System.out::println);
        //Q7.  Check if any employee earns more than 90000.
        boolean sal =list.stream().anyMatch(e->e.getSal()>90000);
        System.out.println(sal);

        //Q8.  Get employee with the highest salary.
        list.stream().sorted(Comparator.comparing(Employee3::getSal,Comparator.reverseOrder())).limit(1).forEach(System.out::println);

        //Q9.  Sort employees by name alphabetically.
        list.stream().sorted(Comparator.comparing(Employee3::getName)).forEach(System.out::println);

        //Q10. Get total salary of all employees.
        Double total= list.stream().collect(Collectors.summingDouble(Employee3::getSal));
        System.out.println(total);

        //Q11. Get employees sorted by salary descending.
        list.stream().sorted(Comparator.comparing(Employee3::getName,Comparator.reverseOrder())).forEach(System.out::println);
        //Q12. Get names of top 3 highest paid employees.
        list.stream().sorted(Comparator.comparing(Employee3::getSal,Comparator.reverseOrder())).limit(3).forEach(System.out::println);
        //Q13. Group employees by department.
        Map<String, List<Employee3>> dept=list.stream().collect(Collectors.groupingBy(Employee3::getDept));
        System.out.println(dept);
        //Q14. Count employees in each department.
       Map<String,Long> count1= list.stream().collect(Collectors.groupingBy(Employee3::getDept,Collectors.counting()));
        System.out.println(count1);
        //Q15. Get average salary of Engineering department.
        Double avg =list.stream().filter(e->e.getDept().equals("Engineering"))
                        .mapToDouble(Employee3::getSal).average().orElse(0);
        System.out.println("avg"+avg);

        //Q16. Get employees whose age is between 25 and 35
        //list.stream().filter(e->e.getAge()>=25 && e.getAge()<=35);
        // .
        //Q17. Get all employee names joined by " | ".
        String join=list.stream().map(Employee3::getName).collect(Collectors.joining("|"));
        System.out.println("join  "+join);

        //Q18. Find employee with lowest salary in HR.
        list.stream().filter(e->e.getDept().equals("HR")).sorted(Comparator.comparing(Employee3::getSal)).limit(1).forEach(System.out::println);
        //Q19. Get department wise total salary.
       double total1= list.stream().collect(Collectors.summingDouble(Employee3::getSal));
        System.out.println(total1);
        //Q20. Get list of employees from Mumbai sorted by salary.

        //Q21. Find employees earning above their department average.
        Map<String,Double>average=list.stream().collect(Collectors.groupingBy(Employee3::getDept,Collectors.averagingDouble(Employee3::getSal)));
        System.out.println(average);

        //Q22. Get department with highest average salary.
        list.stream().collect(Collectors.groupingBy(Employee3::getDept,Collectors.averagingDouble(Employee3::getSal)))
                .entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);

        //Q23. Get top 2 earners from each department.
        Map<String,List<Employee3>>top2=list.stream().collect(Collectors.groupingBy(Employee3::getDept,Collectors.collectingAndThen(Collectors.toList(),
                inner->inner.stream().sorted(Comparator.comparing(Employee3::getSal,Comparator.reverseOrder())).limit(2).toList())));
        System.out.println(top2);
        //Q24. Find second highest salary overall.
        list.stream().sorted(Comparator.comparing(Employee3::getSal,Comparator.reverseOrder())).limit(1).forEach(System.out::println);
        //Q25. Get city wise count of employees.

        //Q26. Partition employees — salary above and below 60000.
        Map<Boolean, List<Employee3>> partition=list.stream().collect(Collectors.partitioningBy(e->e.getSal()<=6000));
        System.out.println(partition);

        //Q27. Find department with maximum number of employees.
        list.stream().collect(Collectors.groupingBy(Employee3::getDept, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);

        //Q28. Get names of employees sorted by salary desc, then name asc.
        list.stream().sorted(Comparator.comparing(Employee3::getSal,Comparator.reverseOrder()).thenComparing(Employee3::getName))
                .map(Employee3::getName).forEach(System.out::println);

        list.stream().sorted(Comparator.comparing(Employee3::getSal).reversed().thenComparing(Employee3::getName)).forEach(System.out::println);


        //Q29. Check if all departments have at least one employee above 50000.
      Map<String,List<Employee3>>listMap =  list.stream().collect(Collectors.groupingBy(Employee3::getDept));
         boolean resu=     listMap.keySet().stream().allMatch(K->listMap.get(K).stream().anyMatch(e->e.getSal()>5000));
        System.out.println(resu);

        //Q30. Get oldest employee from each department
        System.out.println("**************************------ENd----------********************************************");

        List<String> words = Arrays.asList("Java", null, "Stream", null, "API");
        List<String>word =words.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(word);

        String input = "swiss";
       Map<Character,Long> inp= input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(inp);

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
       double avg1= numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg1);

        Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);
        map.entrySet().stream().filter(e->e.getValue()>10).map(Map.Entry::getKey).collect(Collectors.toList());

       List<String>i= map.entrySet().stream().filter(e->e.getValue()>10).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(i);

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
        Set<Integer> unique=new HashSet<>();
       Set<Integer>uni= numbers4.stream().filter(e->unique.add(e)).collect(Collectors.toSet());
        System.out.println(uni);

        //Find the Longest Word from a Sentence
        //Question: Find the longest word in a sentence using Streams.
        String sentence = "Java Stream API is very powerful";
        String value=Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(value);

        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 2, 4, 3, 5,6,7,8,9,10);

numbers5.stream().filter(e->e%2==0).map(e->e*2).forEach(System.out::println);

list.stream().collect(Collectors.groupingBy(Employee3::getDept,Collectors.counting()));








    }
}
class prime{
    public static void main(String[] args) {
        IntStream.rangeClosed(2, 100).filter(e -> IntStream.rangeClosed(2, (e/2)+1).allMatch(x -> e % x != 0)).forEach(System.out::println);
    }
}
