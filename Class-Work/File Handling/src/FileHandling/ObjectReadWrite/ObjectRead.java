package FileHandling.ObjectReadWrite;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectRead {
    public static void main(String[] args) {
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("data/student.txt"))){
            while(true) {
                try {
                    Student s = (Student) in.readObject();
                    System.out.println(s);
                } catch (EOFException e) {
                    System.out.println("File finished");
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}