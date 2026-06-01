package Stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice7 {
    record Employee(String name, String dept, int salary, String city) {

    }


   public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Ravi", "IT", 80000, "Mumbai"),
                new Employee("Priya", "HR", 75000, "Delhi"),
                new Employee("Amit", "IT", 95000, "Mumbai"),
                new Employee("Sneha", "HR", 90000, "Pune"),
                new Employee("Kiran", "IT", 70000, "Delhi"),
                new Employee("Meera", "Finance", 85000, "Mumbai")
        );
        //Average salary of employee
        double avg=employees.stream()
                .mapToDouble(Employee::salary)
                .average()
                .orElse(0);
       System.out.println("Average sal"+avg);


      //Find the 3rd largest number
      int nlargest= employees.stream()
              .sorted((e1,e2)->Double.compare(e2.salary,e1.salary))
              .skip(2)
              .findFirst()
              .orElse(null).salary();
       System.out.println("3rd largest employee sal: "+nlargest);





    }
}
