import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.imageio.ImageIO;

public class Grayscaleimage {

	
	static int convertgreyscale(BufferedImage img) {
		  
	    int width = img.getWidth();
	    int height = img.getHeight();

	    
	    for(int y = 0; y < height; y++){
	      for(int x = 0; x < width; x++){
	        int p = img.getRGB(x,y);

	        int a = (p>>24)&0xff;
	        int r = (p>>16)&0xff;
	        int g = (p>>8)&0xff;
	        int b = p&0xff;


	        int avg = (r+g+b)/3;


	        p = (a<<24) | (avg<<16) | (avg<<8) | avg;

	        img.setRGB(x, y, p);
	      }
	    }
	    
	    writeimage(img);
	    
	  return 1;
}
	
	
	
	 static int writeimage(BufferedImage img) {

		    try{
		      File f = new File("C:\\Users\\rupaligupta\\Desktop\\Images\\img"+ java.time.LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddhhmmss")) +".jpg");
		      ImageIO.write(img, "jpg", f);
		      
		      
		      
		    }catch(IOException e){
		      System.out.println(e);
		    }
		  return 1;
	  }
	  
}
