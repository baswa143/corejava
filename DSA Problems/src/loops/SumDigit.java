package loops;

public class SumDigit {
    public static void main(String[] args) {
        int n=12344;
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }
        System.out.println((sum>0)?sum:-sum);
    }

}
