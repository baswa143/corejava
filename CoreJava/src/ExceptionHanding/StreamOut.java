package ExceptionHanding;

import java.io.*;

public class StreamOut {
    public static void main(String[] args) throws IOException {
        OutputStream as=System.out;
//        try(OutputStreamWriter osw=new OutputStreamWriter(System.out))
//        {
//            osw.write("Hello world");
//            osw.write(89);
//            osw.write(10);
//            osw.write('\n');
//            char[]arr="hello world".toCharArray();
//            osw.write(arr);
//            //osw.write(😂); range is exceeded
//        }
//        catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }

        try(FileWriter fw=new FileWriter("./resources./notes.txt",true))
        {
            fw.write("Hare kriahna");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("./resources./notes.txt",true)))
        {
            bw.write("now we have to go time is up");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
