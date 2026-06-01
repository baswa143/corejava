package loop;
import java.util.Scanner;
public class Largest {
    public void result()
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max=Math.max(a,Math.max(c,b));
        System.out.println(max);
//        if(b>max){
//            max=b;
//        }
//        if(c>max)
//        {
//            max=c;
//        }
//        System.out.println(max);
    }

    public static void main(String[] args) {
        Largest l=new Largest();
        l.result();

    }
}
