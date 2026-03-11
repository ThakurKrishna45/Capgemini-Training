package FileHandling;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File folder= new File("Image");
        if(!folder.exists()){
            boolean created=folder.mkdir();
            if(created){
                System.out.println("Folder Created Successfully");
            }else{
                System.out.println("Folder creation failed");
            }
        }else{
            System.out.println("Folder already exists");
        }
    }
}
