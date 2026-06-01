package Array;

import java.util.Scanner;

//Find the total number of pairs in the array whose sum is equal to the given value x;
public class Target {
    public static int pairSum(int arr[], int target) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        System.out.println(pairSum(arr, target));

    }
}

//count the number of triples whose sum is equal to the given value x.

class TripleSum{
    static  int tripleSum(int [] arr, int target){
        int ans=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        System.out.println(tripleSum(arr, target));

    }

}

// Find the unique number in a given array where all the elements are being
// repeated twice with one value being unique.

class FindUnique{
    static int findUnique(int[] arr){
        int n = arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]!=-1){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("unique element");

        System.out.println(findUnique(arr));

    }
}

//Find the second-largest number
class SecondLargest{
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int findSecondMax(int[] arr){
        int mx = findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }

        }
        int SecondMax = findMax(arr);
      return SecondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        System.out.println();
    //    System.out.println("Second Max");
        System.out.println(findSecondMax(arr));

    }







//    public static void main(String[] args) {
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the size of the array");
//            int size = sc.nextInt();
//            System.out.println("Enter the elements of the array");
//            int[] arr = new int[size];
//            for (int i = 0; i < size; i++) {
//                arr[i] = sc.nextInt();
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            for(int i=0;i<arr.length;i++){
//                if(arr[i]>max){
//
//                    max=min;
//                    max=arr[i];
//                }
//                else{
//                    min=arr[i];
//                }
//            }
//        System.out.println(min);
//    }
}

//Given an array 'a' consisting of integers. return  the first value
//that is repeating in this array. If no value is being repeated, return -1.


class FirstRepeatingNumber{
    static int firstRepeat(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++ ){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("first repeating number");
        System.out.println(firstRepeat(arr));
    }
}

//Given an array 'a' consisting of integers. return  the last value
//that is repeating in this array. If no value is being repeated, return -1.
class LastRepeatingNumber{
    static int lastRepeat(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            int length = arr.length;
            for(int j=0; j<i;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Last repeating number");
        System.out.println(lastRepeat(arr));
    }
}