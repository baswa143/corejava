package ExceptionHanding;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User{
    public static void main(String[] args) throws IOException {
//        try(InputStreamReader str=new InputStreamReader(System.in)) {
//            System.out.println(("Enter some letters:"));
//            int letters= str.read();
//            while(letters!=-1){
//                System.out.print((char) letters);
//                letters=str.read();
//            }
//            System.out.println();
//        }
//        catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try(FileReader fr=new FileReader(".\\resorces.\\notes.txt")){
//            int letter=fr.read();
//
//
//            while(fr.ready()){
//                System.out.println((char) letter);
//                letter=fr.read();
//            }
//            System.out.println();
//        }
//        catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }

        //practice
        try(InputStreamReader isr=new InputStreamReader(System.in)){
            System.out.println("Enter some letters");
            int letters=isr.read();
            while(letters!=-1){
                System.out.print((char)letters);
                letters=isr.read();

            }
            System.out.println();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }


    }
}
