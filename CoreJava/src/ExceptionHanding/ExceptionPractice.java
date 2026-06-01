package ExceptionHanding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;

//Exception is an event that disrupts the normal flow of the program.It is an Object throw at runtime.
public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            File file=new File("./data.txt/");
            file.createNewFile();
            System.out.println(file.exists());
            BufferedReader br=new BufferedReader(new FileReader(file));


            ArrayList<String> list =new ArrayList<>();
        }
        catch(Exception e){
            System.out.println("file not found"+e.getMessage());
        }



    }


}
