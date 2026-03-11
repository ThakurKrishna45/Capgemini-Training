package FileHandling.ObjectReadWrite;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWrite {
    public static void main(String[] args) {
        Student s1=new Student(1,"John");
        Student s2=new Student(2,"Motu");
        Student s3=new Student(3,"Patlu");
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("data/student.txt",true))){
            out.writeObject(s1);
            out.writeObject(s2);
            out.writeObject(s3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}