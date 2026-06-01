package basic_sorting;

public class BubbleSort {
    public static void print(int [] arr){
        for(int ele : arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr ={0,4 ,5,2,3,1};
        int n= arr.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){ // we can also do n-1 but this is worst case and n-i-1 is this the best case because that decrease the time
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//
//        }
        //bubble srsoted
//        for(int i=0;i<n-1;i++){
//            boolean isSorted =true;
//            for(int j=0;j<n-i-1;i++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                    isSorted=false;
//                }
//            }
//            if(isSorted==true)break;
//        }
//        for(int i=0;i<n-1;i++){
//            boolean isSorted=true;
//            for(int j=0;j<n-i-1;j++){ // we can also do n-1 but this is worst case and n-i-1 is this the best case because that decrease the time
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                    isSorted=false;
//                }
//            }
//            if(isSorted==true)break;
//        }

        for(int i=0;i<n-1;i++){
            int swap=0;
            for(int j=0;j<n-i-1;j++){ // we can also do n-1 but this is worst case and n-i-1 is this the best case because that decrease the time
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0)break;

        }
        print(arr);

    }


}
