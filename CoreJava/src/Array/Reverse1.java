package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
//        for(int element:arr){
//            System.out.print(element+ " ");
//        }
    }
}

class A{
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int size=sc.nextInt();
//        System.out.println("Enter the elements of the array");
//        int ar[]=new int[size];
//        int n=ar.length;
//        for(int i=0;i<n;i++){
//            ar[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(ar[i]+" ");
//        }
//        int start=0;
//        int end=n-1;
//        while(start<end)
//        {
//            int temp=ar[start];
//            ar[start]=ar[end];
//            ar[end]=temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(ar));
//       for(int i=0;i<n;i++)
//       {
//           int temp=ar[start];
//           ar[start]=ar[end];
//           ar[end]=temp;
//       }
//        System.out.println(Arrays.toString(ar));
//        ArrayList<String> list=new ArrayList<>(Arrays.asList(Arrays.asList("Baswa","sandy","bandu","vikas")
//                                                                Arrays.asList("kittu","pranitha","pallu","vini")));
        ArrayList<String> list1=new ArrayList<>(Arrays.asList("kittu","pranitha","pallu","vini"));
//        List<List<String>> list = new ArrayList<>(Arrays.asList(
//                Arrays.asList("Baswa","sandy","bandu","vikas"),
//                Arrays.asList("kittu","pranitha","pallu","vini")
//        ));

                 list1.stream()
                .map(String ::toUpperCase)
//                .flatMap(inner -> inner.stream())   // flatten first
                     // then convert to uppercase
                .forEach(System.out::println);


    }


}
