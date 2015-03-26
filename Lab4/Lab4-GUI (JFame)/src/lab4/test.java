package lab4;
import javax.swing.*;

import java.awt.*;

public class test extends JFrame{
	 public static final long serialVersionUID=138938122;

	 public test(){
		 super("Text Demo"); //同老豆藍本
		 setLayout(null); //choose which kind of content pane 1 line only
		 
		 JLabel lblNewLabel = new JLabel("New label");
		 lblNewLabel.setBounds(76, 75, 46, 14);
		 getContentPane().add(lblNewLabel);
		 
		
	 }
	 
	 public static void main(String[] args) {
	        new test(); //產生 
	        }
}
