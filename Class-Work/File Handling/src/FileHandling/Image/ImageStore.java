package FileHandling.Image;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageStore {
    public static void main(String[] args) {
        String sourcePath= "Image/img.png";
        String destinationPath="Image/copied.png";
        try {
            FileInputStream fis=new FileInputStream(sourcePath);
            FileOutputStream fos= new FileOutputStream(destinationPath);
            byte[] buffer= new byte[1024];
            int byteRead;
            while ((byteRead=fis.read(buffer))!=-1){
                fos.write(buffer,0,byteRead);
            }
            fis.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
