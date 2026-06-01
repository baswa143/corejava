package Patterns;

public class Practice {
    public  static void  hollowrectangle(){
        int n=4;
        int m=5;

        //outer loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void halfpyramid(){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedhalfpyramid(){
        int n=4;
        //outer loop
        for(int i=n;i>=1;i--){
            //inner loop star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rotatedhalfpyramid(){
        int n=4;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop space print
            for (int j=1;j>=n-i;j++){
                System.out.print(" ");
            }
            //inner loop star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedhalfpyramidnumber(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floydstriangle(){
        int n=4;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }

    public static void halfpyramidnumber(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void zerotoonetriangle(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
hollowrectangle();
        System.out.println();
halfpyramid();
        System.out.println();
invertedhalfpyramid();
        System.out.println();
       // rotatedhalfpyramid();
        System.out.println();
        halfpyramidnumber();
        System.out.println();
        invertedhalfpyramidnumber();
        System.out.println();
        floydstriangle();
        System.out.println();
        zerotoonetriangle();

    }
}

//mistake make a correct
class AdvancePattern{
    public static void butterfly( ){
        int n=5;
        //upper half
        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        butterfly();

    }
}

