package Array;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    static void changeArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        changeArray(arr);

       for(int i=0;i<arr.length;i++) {
           System.out.println(arr[i]);
       }



    }

}

class PracticeProblems{
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter"+ size+"elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
//        for(int i=0;i<size;i++){
//            System.out.println(arr[i]);
//        }
        int arr2[]=arr;
        System.out.println("Original array");
        printArray(arr);
//        System.out.println(arr2);
        System.out.println("copy array");
        printArray(arr2);
        arr2=arr.clone();
        arr2[0]=0;
        arr2[1]=0;
        System.out.println("copy array");
        printArray(arr2);
        System.out.println("Original array");
        printArray(arr);

    }
}

// input is how many times repeated in arr the num if not repeated print 0?

class Problem2{
    static int countOccurences(int arr[],int x){
        int count=0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the x ");
        int x =sc.nextInt();

        System.out.println(countOccurences(arr,x));

    }
}

//find the last Occourance of the element in the array

class LastOccurence{
    public static int lastOccurences(int[] arr,int x){
        int lastindex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastindex=i;
            }
        }
        return lastindex;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the x ");
        int x =sc.nextInt();

        System.out.println(lastOccurences(arr,x));

    }
}

//Count the number of elements strictly greater than value x.

class Greater{
    public static int greater(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>x){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("Enter the x ");
        int x =sc.nextInt();

        System.out.println(greater(arr,x));

    }

}

// Check if the given array is sorted or not
class Sorted{
    public static boolean sorted(int[] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1]){
                check=false;
                break;

            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
        }


        System.out.println(sorted(arr));

    }

}

class Questions{
    static int [] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int []ans={ arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {


        }

         int ans[]=smallestAndLargestElement(arr);
        System.out.println(Arrays.toString(ans));
    }
    }


