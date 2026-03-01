package FileHandling.FileReading;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferRead {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("data/student.txt"))){
            String line;
            while((line= reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
