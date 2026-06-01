package Interview_and_questions.stream;

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
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee3 that = (Employee3) o;
        return id == that.id && Double.compare(sal, that.sal) == 0 && Objects.equals(name, that.name) && Objects.equals(dept, that.dept)&& Objects.equals(age,that.age) ;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name,dept,sal,age);
    }

    public static void main(String[] args) {
        List<Emp> empData = Arrays.asList(
                new Emp("Amit Sharma", 101, 55000, "IT", 28),
                new Emp("Priya Mehta", 102, 48000, "HR", 32),
                new Emp("Rohit Verma", 103, 62000, "Finance", 35),
                new Emp("Sneha Kulkarni", 104, 45000, "Marketing", 24),
                new Emp("Karan Singh", 105, 70000, "IT", 29),
                new Emp("Neha Gupta", 106, 53000, "Finance", 27),
                new Emp("Vikram Rao", 107, 47000, "HR", 40),
                new Emp("Ananya Desai", 108, 51000, "Marketing", 26)
        );

        //find the max sal
        double maxsal=empData
                .stream()
                .mapToDouble(Emp::getSal)
                .max()
                .orElse(0.0);
        System.out.println(maxsal);

        //Each dept of max sal
//        Map<String, Emp> collect = empData.stream()
//                .collect(Collectors.groupingBy(Emp::getDept,Collectors
//                                .collectingAndThen(Collectors.maxBy(Comparator.comparing(Emp::getSal)),Optional::get))
//                        );
//        System.out.println(collect);

        //Q11. Get names that contain letter 'a' (case insensitive).
         List<String> name=List.of("Apple","Ball","Cat","Ant");
         name.stream().filter(e->e.contains("A")).forEach(System.out::println);
        //Q12. Get distinct names ignoring case.
        name.stream().distinct().forEach(System.out::println);

        //Q13. Join all names with " , " separator.
        //Q14. Get names sorted by their length.
        //Q15. Get longest name in the list.
        //Q16. Get shortest name in the list.
        //Q17. Count names that start with vowel (a, e, i, o, u).
        //Q18. Reverse each name and print.
        //Q19. Get names whose length is even.
        //Q20. Check if all names have length greater than 2.

        //5. Find First Non-Repeated Character in a String
        //Question: Find the first non-repeated character in a string.
        String str ="swiess";
        Character c1 = str.chars().mapToObj(c -> (char) c).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().orElse(null);
        System.out.println(c1);

        //6. Convert List of Strings to Uppercase
        //Question: Convert all strings in a list to uppercase.
        List<String> names = Arrays.asList("java", "stream", "api");
        List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<String> collect1 = names.stream().map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.toList());
        System.out.println(collect1);


    }
}
