package Stream.DataAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) {
        LocalTime time= LocalTime.now();
        System.out.println(time);
        LocalTime time1=LocalTime.of(10, 30);
        System.out.println(time1);

        //date and time
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        //period
        LocalDate date=LocalDate.of(1998,05,10);
        LocalDate date1=LocalDate.now();
        Period p=Period.between(date,date1);
        System.out.println(p.getYears()+"years");

        //Duration time
        LocalTime start=LocalTime.of(1, 50);
        LocalTime end=LocalTime.of(12,00);
        Duration d=Duration.between(start,end);
        System.out.println(d.toHours()+" hours:= "+d.toMinutes()+" min");

        //DateTimeFormatter

        LocalDate ld=LocalDate.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MMMM-yy");
        String formatted=ld.format(f);
        System.out.println(formatted);
    }
}
