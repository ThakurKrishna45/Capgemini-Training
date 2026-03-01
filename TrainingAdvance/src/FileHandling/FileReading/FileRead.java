package FileHandling.FileReading;

import java.io.FileReader;

public class FileRead {
    public static void main(String[] args) {
        try(FileReader reader=new FileReader("data/student.txt")){
            int data;
            while((data=reader.read())!=-1){
                System.out.print((char)data);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
