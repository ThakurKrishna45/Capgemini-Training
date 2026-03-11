package FileHandling.FileWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteDemo {
    public static void main(String[] args) {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("data/student.txt"));
            writer.write("\nName : Rahul");
            writer.newLine();
            writer.write("Course : Spring");
            writer.close();
            System.out.println("Data written using BufferWriter");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
