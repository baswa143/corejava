package Array;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        int ar[]={2,4,5,5,2,1,41};
        int ar1[]=new int[5];
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]==ar[j]){

                }
                System.out.println(ar[i]+" ");

                }
            }

        }
    }
class C{
    public static void main(String[] args) {
        int ar[]={2,3,4,5,12,2,4,2,4,4};
        Set set=new HashSet();
        for(int i=0;i<ar.length;i++){
            set.add(ar[i]);
        }
        System.out.println(set);

    }
}

class swap{
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,6,7};
        int temp=0;
        temp=arr[0];
        arr[0]=arr[4];
        arr[4]=temp;
        System.out.println(Arrays.toString(arr));


    }
}


