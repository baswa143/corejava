package loop;

import static java.util.Arrays.compare;

public class SwitchCaseExpression {
    public static void main(String[] args) {
        int number=-10;
//        switch (Integer.compare(number,0)){
//            case -1:
//                System.out.println("number is negative");
//                break;
//            case 0:
//                System.out.println("number is zero");
//                break;
//            case 1:
//                System.out.println("number is positive");
//                break;
//
//        }

//        switch (Integer.compare(number,0)){
//            case -1 -> System.out.println("number is negative");
//            case 0 -> System.out.println("number is zero");
//            case 1 -> System.out.println("number is positive");
//
//        }
        String result=" ";
        switch (Integer.compare(number,0)){
            case -1 ->result="Negative";
            case 0 ->result="Zero";
            case 1 ->result="Positive";
        }
        System.out.println("the given number"+number+" is " +result);

//        result=switch (Integer.compare(number,0)){
//            case -1 ->"Negative";
//            case 0 ->"Zero";
//            case 1 ->"Positive";
//            default -> throw new IllegalStateException("Unexpected value: " + Integer.compare(number,0));
//        };
    }

}
