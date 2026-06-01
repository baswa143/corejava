package Collection;

import java.util.*;

public class ArraylistProblems {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(2,4,6,8,10,20,33,40,55,60,80,3,5,7,9 ));

//        for (int i=list.size()-1;i>=0;i--)
//        {
//            if(list.get(i)%2==0)
//            {
//                list.remove(i);
//            }
//        }
        list.removeIf(n->n%2==0);
        System.out.println(list);

    }
}
//secnond max number in arraylist
class Second{
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>(Arrays.asList(12,35,1,10,34,1));
//        if(set.size()<2){
//            System.out.println("no longest number");
//        }

            set.pollLast();
            System.out.println("second largest number:"+set.last());

            ArrayList<Integer> list=new ArrayList<>(Arrays.asList(12,35,1,10,34,1));
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;

            for(Integer i:list){
                if (i > max) {
                    min=max;
                    max=i;
                }
                else {
                    min=i;
                }

            }
        System.out.println(min);

    }

}
//print the max number
class Max_Number{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 35, 1, 10, 34, 1, 50));
        int max = Integer.MIN_VALUE;
        for (Integer m : list) {
            if (m > max) {
                max = m;
            }
        }
        System.out.println(max);

        //remove the duplicate values
        ArrayList<Integer> list2 = new ArrayList<>();
        for(Integer i:list){
            if(!list2.contains(i)){
                list2.add(i);
            }
            }
        System.out.println(list2);
    }

    }
// remove the duplicate values of string
    class DuplicateValue{
        public static void main(String[] args) {
            ArrayList<String>  value=new ArrayList<>(Arrays.asList("Ankit", "Vijay", "Ankit"));
            ArrayList<String>  value1=new ArrayList<>();

            for(String str:value){
                if(!value1.contains(str)){
                    value1.add(str);
                }
            }
            System.out.println(value1);

        }
    }

    //Search for an Element: Write a program that takes a name as input and
// returns the index of that name in the ArrayList. If not found, return -1.

class SearchElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String>value=new ArrayList<>(Arrays.asList("Ankit", "Vijay", "Ankit"));
//        if(value.contains(str)){
//
//            System.out.println(value);
//        }
//        else {
//            System.out.println("-1");
//        }
        System.out.println(value.contains(str)?value:"-1");
    }
}

//Filter the even number
class EvenNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        ArrayList<Integer>value=new ArrayList<>();
        ArrayList<Integer>value1=new ArrayList<>();
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            value.add(num);
        }
        for (Integer i:value){
            if(i%2==0){
                value1.add(i);
            }
        }
        System.out.println(value);
        System.out.println(value1);

    }
}

class Even{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Enter the number");

        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        Iterator<Integer> it= list.iterator();
        while (it.hasNext()){
            Integer num=it.next();


            if(num%2!=0){
                it.remove();
            }
        }
        System.out.println(list);
        sc.close();
    }

}
class Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        ArrayList<Integer>n=new ArrayList<>();
        while (sc.hasNextInt())
        {
            n.add(sc.nextInt());
        }
        System.out.println(n);

        Iterator<Integer> it= n.iterator();

//        while (it.hasNext()){
//            Integer num=it.next();
//
//            if(num%2==0){
//                it.remove();
//            }
//        }
        n.removeIf(num->num%2==0);
//        for(Integer num:n){ //This is another way to do
//            if(num%2==0){
//                n.remove(num);
//            }
//        }
        Collections.sort(n);
        System.out.println(n);


    }
}


// 45, 65,22,12,34,56

class Sort
{
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[size];
       for(int i=0;i<size;i++)
       {
           arr[i]=sc.nextInt();
       }
        System.out.println("---------------------------------------------");
       for(int i=0;i<size;i++)
       {
           System.out.println(arr[i]);
       }
    }
}


