/*
 Author: rpate3 (Rahul Patel) 
 Assignment: Lab 4 
 Date Last Modified: Februrary 20, 2014
 Program Description: Reads in lena.jpg, peacock.jpg, or Azalea.jpg and outputs the image in a grayscale version and a sepia tone version. 
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.ImageOutputStream;

public class ChangeColor{//Reads in an image


  static BufferedImage readImage( String fname ) throws Exception {

	BufferedImage image = ImageIO.read( new File(fname) );
	return( image );
  }

 
  public static void saveImage( BufferedImage img, File file ) throws IOException {//Saves file

        ImageWriter      writer = null;
        java.util.Iterator iter = ImageIO.getImageWritersByFormatName("jpg");

        if( iter.hasNext() ){
            writer = (ImageWriter)iter.next();
        }

        ImageOutputStream ios = ImageIO.createImageOutputStream( file );
        writer.setOutput(ios);

        ImageWriteParam param = new JPEGImageWriteParam( java.util.Locale.getDefault() );
        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT) ;
        param.setCompressionQuality(0.98f);

        writer.write(null, new IIOImage( img, null, null ), param);

    }
	


  public static BufferedImage color2gray( BufferedImage inImage) {//Converts to grayscale
	  int red,green,blue, color, out_r, out_g, out_b;//Declare integers
    int            width    = inImage.getWidth();
    int            height   = inImage.getHeight();
    BufferedImage  outImage = new BufferedImage( width, height, BufferedImage.TYPE_3BYTE_BGR );
    int rgbvalue []= new int[3]; 

    for(int i =0; i<width; i++){ //Extracts the red, green, and blue value  from the input image
    	for(int j =0; j< height; j++){
    		color = inImage.getRGB(i,j);
    		red = ((color >> 16) & 0xFF) ; 
    		green = ((color >> 8)& 0xFF);
    		blue = ((color)& 0xFF);

    		rgbvalue[0] = red;//Stores the value  in the array
    		rgbvalue[1] = green; 
    		rgbvalue[2] = blue; 
    	
    		float  gray = (float) (red * 0.2126 + green * 0.7152 + blue * 0.0722);//Converts pixel to gray scale
		float newP = (float) gray/255; 

    		Color c = new Color (newP, newP, newP);//Create a class with gray pixels


   		int newPixel = c.getRGB(); //Obtain gray integer value
  		outImage.setRGB(i, j, newPixel);//replaces old color pixel with new gray pixel
    	}
    }
    return( outImage );

  }

public static BufferedImage color2sepia( BufferedImage inImage ) {//Converts to sepia

    int            width    = inImage.getWidth();//Declare integers
    int            height   = inImage.getHeight();
    BufferedImage  outImage = new BufferedImage( width, height, BufferedImage.TYPE_3BYTE_BGR );
    int rgbvalue [] = new int[3];

    for(int i =0; i<width; i++){ //Extracts red, green, and blue from input image
    	for(int j =0; j< height; j++){
    		int color = inImage.getRGB(i,j);
    		int red = ((color >> 16) & 0xFF) ; 
    		int green = ((color >> 8)& 0xFF);
    		int blue = ((color)& 0xFF); 
    		
    		rgbvalue[0] = red;//Stores value in array 
    		rgbvalue[1] = green; 
    		rgbvalue[2] = blue; 
    	
    		float out_r = ((red * .393f) + (green *.769f) + (blue * .189f))/255;//converts value to sepia
    		float out_g =((red * .349f) + (green *.686f) + (blue * .168f))/255;
		float out_b = ((red * .272f) + (green *.534f) + (blue * .131f))/255;
		
		if(out_r>1.0){ //Checks if value is greater than 1 
		   out_r=(float)1.0; 
		}
		if(out_g > 1.0) { 
		   out_g = (float)1.0; 
		}
		if(out_b > 1.0){ 
		   out_b=(float)1.0; 
		}

	    	Color c =new Color (out_r, out_g, out_b);//Creates a new pixel with sepia values
    		int NewPix = c.getRGB(); //Obtains the integer value
    		outImage.setRGB(i, j, NewPix); 	//replaces old color pixel with new sepia pixel 
   	 }	
    }	
    return( outImage );
  }

  public static void main(String[] args) throws Exception {//Main method
    
    BufferedImage colorImage, grayImage, sepiaImage;

    if (args.length != 1)
    	System.out.println( "usage is: java ChangeColor filename" );
    else
    {
        colorImage = readImage  ( args[0] );
	grayImage  = color2gray ( colorImage);
	sepiaImage = color2sepia( colorImage );

	saveImage( grayImage,  new File( "gray" + args[0] ) );
	saveImage( sepiaImage, new File( "sepia"+ args[0] ) );
    }
  }
    
}
