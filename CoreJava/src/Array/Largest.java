package Array;

public class Largest {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int []ar={33,45,63,23,53};
        int min=Integer.MAX_VALUE;

        for(int num:ar){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Max number: "+max);

        for(int num:ar){
            if(num<min){
               min=num;
            }
        }
        System.out.println("Min number: "+min);
    }
}
