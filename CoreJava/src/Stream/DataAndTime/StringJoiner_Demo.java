package Stream.DataAndTime;

import java.util.StringJoiner;
/*
Example delimiter:

","

"-"

" " (space)
 */

public class StringJoiner_Demo {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",");
        sj.add("java");
        sj.add("python");
        sj.add("datascience");
        sj.add("aws");
        System.out.println(sj);

        /*
        StringJoiner with Prefix and Suffix

         */
        StringJoiner sj1 = new StringJoiner(",","[","]");
        sj1.add("A");
        sj1.add("B");
        sj1.add("c");
        System.out.println(sj1);

        /*
        Important Methods of StringJoiner
Method	Use
add()	Add element
merge()	Join two StringJoiners
toString()	Convert to string
length()	Get length
         */

        //merge
        StringJoiner s=new StringJoiner(",","[","]");
        s.add("A");
        s.add("C");
        StringJoiner j=new StringJoiner(",");
        j.add("B");
        j.add("D");
        s.merge(j);
        System.out.println(s);

    }
}
