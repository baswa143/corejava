package loop;

public class reverse {
    public static void main(String[] args) {
        int n=1235455;
        int num=0;
        while(n>0)
        {
            int rem =n%10;
            n=n/10;
            num=num*10+rem; // 0*10+5=5 5*10+5=55 55*10+4=554 .........554532*10+1=554321
        }
    }
}
