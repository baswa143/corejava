package basic_sorting;

import java.io.PushbackInputStream;
import java.util.Arrays;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int ar[]={1,2,0,4,3,0,5,0};
        pushzerostoEnd(ar);
        System.out.println(Arrays.toString(ar           ));
    }
    static void pushzerostoEnd(int[]ar){
        int n=ar.length;
        int j=0;
        for (int i=0;i<n;i++){
            if(ar[i]!=0){
                if(i!=j){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
                j++;
            }
        }
    }

}
