package Practice;

public class Recursion {
    // Recursion method call to itself
    public  static int factorial(int n){
//        if(n==0) {
//            return 1;
//        }
//        return n*factorial(n-1);
        int result = 1;
        for(int i=1;i<=n;i++){
          result*=i;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }
}
