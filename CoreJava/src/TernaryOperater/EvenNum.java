package TernaryOperater;

public class EvenNum {
    public static void main(String[] args) {
        int num=20;
        System.out.println((num%2==0)?"it is a even number":"it is a odd number");//ternary Operator
    }
}

class MaxNum{
    public static void main(String[] args) {
        int num=20;
        int num1=100;
        int max;
        max=(num>num1?num:num1);
        System.out.println(max);
    }
}
