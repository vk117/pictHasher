import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * pictHasher - RGBPixelData
 *
 * This program takes in an image and gets all
 * of the RGB values from it. All of the RGB values
 * are then added up and the resulting sum is then
 * multiplied by 3 and returned. This value is the basis
 * for the password that is generated in this project.
 *
 * @author Vikram Pasumarti, vpasuma@purdue.edu
 * @version 23 October 2016
 */
public class RGBPixelData extends PassSequence {

    long sum;

    public RGBPixelData(String imageFile) {

        try {
            File f = new File(imageFile);
            BufferedImage img = ImageIO.read(f);
            int maxPixels = img.getHeight() * img.getWidth();
            int[] rgbPixels = new int[maxPixels];

            int k = 0;
            for (int i = 0; i < img.getHeight(); i++) {
                for (int j = 0; j < img.getWidth(); j++) {
                    rgbPixels[k] = img.getRGB(j, i);
                    k++;
                }
            }
            for (int i = 0; i < rgbPixels.length; i++) {
                sum = sum + rgbPixels[i];
            }
            if (sum < 0) {
                sum = sum * -3;
            }
            else {
                sum = sum * 3;
            }

        } catch (Exception e) {
            System.out.println("Image does not exist");
        }
    }
}
