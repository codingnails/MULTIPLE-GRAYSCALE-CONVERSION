import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Uploadfile extends Grayscaleimage {

	
static String inputFile;
static String filename;
static int count;
	
	
	static void uploadfile(int x) {
	
    JFrame f1=new JFrame("UploadFile - Rupali Gupta"); 
    
    JButton b=new JButton("upload");  
    b.setBounds(100,100,195,30);    
    
    JTextField field1 = new JTextField("Uploaded Images : " + count);
    field1.setBounds(100, 50, 195, 30);
    field1.setEnabled(false);
    field1.setDisabledTextColor(Color.BLACK);
    f1.add(field1);
    
    
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
    	
    	try {
    		
    		
			chooser();
			count++;
			field1.setText("Uploaded Images : "+count);
    		
    		if(count==x)
    			f1.dispose();
    		
    		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	}
    });  
   f1.add(b); 
    
    
    f1.setSize(400,400);  
    f1.setLayout(null);  
    f1.setVisible(true);  
	}
	
	
	
	
	

	static void chooser() throws IOException {
	
	JFileChooser fc = new JFileChooser();
	fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

	if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
	inputFile=fc.getSelectedFile().getPath();
	filename=fc.getSelectedFile().getName();
	}

	File file = new File(inputFile); 
	FileInputStream fis;
	try {
		fis = new FileInputStream(file);
		BufferedImage image1 = ImageIO.read(fis);
		convertgreyscale(image1);

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	
}
