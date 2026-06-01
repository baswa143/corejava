package Array;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int num[]={1,2,4,5,6};
        System.out.println(Arrays.toString(num));
        change(num); //mutable
        System.out.println(Arrays.toString(num));

    }
    static void change(int[] arr){

        arr[0]=99;
    }

}
