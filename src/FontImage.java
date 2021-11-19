import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FontImage {
    public static void createFongImg(String path,String fontValue,int fontSize) throws IOException {
        BufferedImage image = ImageIO.read(new File(path));
        BufferedImage newImage = new BufferedImage(image.getWidth(),image.getHeight(),image.getType());
        Graphics2D graphics2D = (Graphics2D) newImage.getGraphics();
        graphics2D.setFont(new Font("宋体",Font.BOLD,fontSize));
        int index = 0;
        for(int y = 0; y < image.getHeight(); y += fontSize){
            for (int x = 0; x < image.getWidth(); x += fontSize){
                int pxcolor = image.getRGB(x,y);
                int r = (pxcolor & 0xff0000) >> 16,
                        g = (pxcolor & 0xff00) >> 8,
                        b = pxcolor & 0xff;
                graphics2D.setColor(new Color(r, g, b));
                graphics2D.drawString(String.valueOf(fontValue.charAt(index % fontValue.length())), x, y);
                index++;
            }
        }
        ImageIO.write(newImage, "JPG", new FileOutputStream(path));
    };
}