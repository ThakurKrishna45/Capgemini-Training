package FileHandling.FileWrite;

import java.io.FileWriter;

public class WriteIntoFile {
    public static void main(String[] args) {
        try(FileWriter writer=new FileWriter("data/student.txt", true)){
            writer.write("\nName: James");
            writer.write("\nCourse : Golang");
            System.out.println("Data written using FileWriter");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
