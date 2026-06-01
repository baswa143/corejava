package loop;

public class Multi {
    // 3,5,6,9,10,12,15,18,20
    //logic (i%3==0)||(i%5==0)

    public static void main(String[] args) {
        for(int i=1;i<=15;i++)
        {
            //2,4,5,6,7,8,10,12,15
            if(i%2==0||i%5==0||i%7==0)
            {
                System.out.println(i);
            }
        }
    }
}
