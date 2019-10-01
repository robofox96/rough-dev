import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;

public class Application {
    public static void main(String[] args){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        String file = "/Users/anuragvijaygupta/Downloads/MICR 2 copy.jpg";
        Mat matrix = Imgcodecs.imread(file);
        Imgproc.resize(matrix,matrix, new Size(1230,644));
        Rect rectCrop = new Rect(615,322,1030,444);
        Mat croppedImage = new Mat(matrix, rectCrop);
        //Imgproc.resize(matrix,matrix, new Size(1030,444));
        Imgcodecs.imwrite("/Users/anuragvijaygupta/Downloads/scale_output.jpg",croppedImage);
        System.out.println("Image processed");
    }
}
