package Array;

import java.util.Scanner;

//pair with sum to find the target
public class TwoSum {
    public static boolean pair(int ar[],int target)
    {
      for(int i=0;i<ar.length;i++)
      {
          for(int j=i+1;j<ar.length;j++)
          {
              if(ar[i]+ar[j]==target){
                  return true;
              }
          }
      }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter size of array");
        int ar[]=new int[size];
        int n = ar.length;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("Enter element of target array");
        int target = sc.nextInt();
        boolean result = pair(ar,target);
        System.out.println(result);

    }
}
