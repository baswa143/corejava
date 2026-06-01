package Enum;

public class Program1 {
    public static void main(String[] args) {
//        enum days {
//            MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
//            int index;
//
//            private days( ){
//
//            }
//            private days(int index){
//                this.index = index;
//            }
//
//        }
        Week day = Week.MONDAY;
        Week arr[]=Week.values();//it will print the values
        for (Week week :arr){
            System.out.println(week+" "+week.ordinal()+" "+week.getClass()+" "+week.describeConstable()+week.compareTo(week));
        }
//        if (day == days.MONDAY ||
//                day == days.TUESDAY ||
//                day == days.WEDNESDAY ||
//                day == days.THURSDAY ||
//                day == days.FRIDAY) {
//            System.out.println("uff it a "+day);
//        } else if (day==days.SATURDAY || day==days.SUNDAY)
//        {
//            System.out.println("YAYY it a " + day);
//        }
//
//        switch(day){
//            case MONDAY:
//            case TUESDAY:
//            case WEDNESDAY:
//            case THURSDAY:
//            case FRIDAY:
//                System.out.println("Ufff its a weekday"+day);
//                break;
//            case SATURDAY:
//            case SUNDAY:
//                System.out.println("Yayy its a weekday"+day);
//        }

        switch (day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY-> System.out.println("Ufff its a weekday "+ day+"closing time : "+day.closingtime+"Opening time:  "+day.openingtime);
            case SUNDAY,SATURDAY -> System.out.println("yay its a weekday"+day.closingtime+" "+day.openingtime );
         }

    }

}
