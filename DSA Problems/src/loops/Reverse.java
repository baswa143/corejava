package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int sum=n;

        int rem=0;
        while(n!=0)
        {//1234
            rem*=10;
             rem+=n%10;

            n=n/10;

        }
        System.out.println(sum);
        System.out.println(rem);
        System.out.println(sum+rem);
    }
}

class A{
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
       int ans[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=ar[i];
        }
        System.out.println();
        System.out.println("Reversed array");
        System.out.println(Arrays.toString(ans));
    }
}

class c{
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
        int temp=0;
        int k=0;
        for(int i= n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                temp=ar[j];
                ar[j]=ar[i];
                ar[i]=temp;
                i--;
                k++;
                n--;
                if(k<(n-1)){
                    break;
                }
            }
            System.out.println(Arrays.toString(ar));
        }
        System.out.println();
            System.out.println(Arrays.toString(ar));
    }
}
