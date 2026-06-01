package loopproblems;

public class FibonacciSeries {
    //Each number is the sum of the previous two numbers
    static int fib(int n){
        if(n<=1) return n;
        int a=0, b=1;
        int c;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;

        }
        return b;
    }
    public static int fiba(int n){
        if(n<=1) return n;
        int a=0, b=1;
        int c;
        for (int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(fib(n));
        System.out.println(fiba(n));

    }
}
