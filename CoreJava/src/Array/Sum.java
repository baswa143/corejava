package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public void show()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int rowsize=sc.nextInt();
        int colsize=sc.nextInt();
        System.out.println("Enter the"+rowsize+" elements");
        int ar[][]=new int[rowsize][];

        for(int i=0;i<rowsize;i++)
        {
            System.out.println("enter the "+i+"row elements");
            ar[i]=new int[colsize];
            System.out.println("enter the "+i+"col elements");
            for(int j=0;j<colsize;j++){
                ar[i][j]=sc.nextInt();
            }

        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(Arrays.toString(ar[i]));

        }
        int sum=0;
        for(int i=0;i< ar.length;i++){
            for(int j=0;j<ar.length;j++){
                sum+=ar[i][j];
                System.out.print(ar[i][j]+" ");

            }
            System.out.println("sum of the array[i][j] "+sum);
        }

//        for(int i=0;i< ar.length;i++){
//            int rowsum=0;
//            for(int j=0;j<ar.length;j++)
//            {
//                rowsum+=ar[i][j];
//            }
//            for(int j=0;j<colsize;j++)
//            {
//                int colsum=0;
//                colsum+=ar[i][j];
////                for(int i=0;i<rowsize;i++)
////                {
////
////                }
//                int sum=rowsum+colsum;
//                System.out.println("sum="+i +" "+sum);
//            }
//        }

        sc.close();
    }

    public static void main(String[] args) {
        Sum obj=new Sum();
        obj.show();

    }



}

