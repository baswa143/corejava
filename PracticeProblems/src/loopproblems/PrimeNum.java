package loopproblems;

public class PrimeNum {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int n=100;
        for (int i=2;i<=n;i++){
            if (isprime(i)){
                System.out.println(i+" is a prime");
            }
        }


    }
}

class Prime{

    public static void main(String[] args) {
        int n=7; int temp = 0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                temp=temp+1;
            }
        }
        if(temp>0){
            System.out.println("not a prime number");
        }
        else {
            System.out.println("is a prime number");
        }

    }
}

