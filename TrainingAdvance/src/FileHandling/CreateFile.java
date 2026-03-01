package FileHandling;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File file= new File("data/student.txt");
        try{
            if(file.createNewFile()){
                    System.out.println("File Created Successfully");
            }else{
                System.out.println("File already exists");
            }
        }catch (Exception e){
            e.printStackTrace();
//            System.out.println();
        }
    }
}
