package Patterns;

public class Pattern1 {
    public void pattern(){                 //condition(true)
        for(int i=1;i<=5;i++) // i=1 1<=10 i=2
        {                                //condition(true)
            for(int j=i;j<5;j++){ //j=1 1<10 j=2
                System.out.print(" "); //                        space *
                                                                //    ***
                                                                 //   ****
            }
            for(int j=1;j<=(2*i-1);j++) // j=1 j<=2*1-1=1
                                        // j=2 j<=2*2-2=3
            {
                System.out.print("*");

            }
            System.out.println();
        }

    }
    public void pattern1()
    {
       for(int row=1;row<=5;row++)
       {
           for(int space=1;space<=5-row;space++)
           {
               System.out.print(" ");
           }

           for(int col=1;col<=row;col++)
           {
               System.out.print(col);
           }
           for(int col=row-1;col>=1;col--){
               System.out.print(col);
           }
           System.out.println();
       }
    }

    public static void main(String[] args) {
        Pattern1 p=new Pattern1();
        p.pattern1();

    }
}
