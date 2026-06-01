package Practice;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();
        if(day.equals("Monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("Thursday")){
            System.out.println("UFF's its a weekday");
        } else if (day.equals("saturday")||day.equals("sunday"))

        {
            System.out.println("Yaa its a weekend");

        }
    }
}
