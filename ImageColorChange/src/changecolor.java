import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ChangeColor extends Uploadfile{
  public static void main(String args[])throws IOException{
    BufferedImage img = null;
    File f =  null;

    
    

    JFrame f1=new JFrame("Convert Multiple in Grayscale - Rupali Gupta");  
    
    
    JTextField field1 = new JTextField("Number of Files");
    field1.setBounds(100, 50, 195, 30);
    field1.setEnabled(false);
    field1.setDisabledTextColor(Color.BLACK);
    f1.add(field1);
    
    JTextField field = new JTextField();
    field.setBounds(100, 100, 195, 30);
    
    JButton b1=new JButton("Submit");  
    b1.setBounds(100,200,195,30);    
    b1.addActionListener(new ActionListener(){  
    	
    public void actionPerformed(ActionEvent e){
    	if((int)Double.parseDouble(field.getText())>0) {
    		uploadfile((int)Double.parseDouble(field.getText()));
    		f1.dispose();

    	}
    	else {
    		field1.setText("ENTER NO. OF FILES");
    		
    	}
        }  
    });  
  
    
    
    
    JButton b=new JButton("Close");  
    b.setBounds(100,250,195,30);    
    b.addActionListener(new ActionListener(){  
    	
    public void actionPerformed(ActionEvent e){
    	
    		f1.dispose();

    	}
        
    });  
   f1.add(b); 
   f1.add(b1); 
    
    
    f1.add(field);
    f1.setSize(400,400);  
    f1.setLayout(null);  
    f1.setVisible(true);   
 

  }
  
}