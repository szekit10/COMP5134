package lab4;

 import javax.swing.*;

import java.awt.*;
import java.util.Vector;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 public class TextDemo extends JFrame {
 public static final long serialVersionUID=138938122;
 
 Vector<JButton> F=new  Vector<JButton>();
 Vector<JButton> D=new  Vector<JButton>();
 Vector<JLabel> L=new  Vector<JLabel>();
 
  public TextDemo(){
        super("Text Demo"); //同老豆藍本
        
        getContentPane().setLayout(new BorderLayout());
        

        JPanel panel=new JPanel(new GridLayout(3, 3));
        panel.setPreferredSize(new Dimension(40,20));
        panel.add(new JLabel("Flovar"));
        panel.add(new JLabel("Decorator"));
        panel.add(new JLabel("Decorator"));
        
        
        panel.add(new JLabel("Flovar"));
        panel.add(new JLabel("Decorator"));
        panel.add(new JLabel("Decorator"));
        
        
        
        
        
        
        
        panel.add(new JLabel("Flovar"));
        panel.add(new JLabel("Decorator"));
        panel.add(new JLabel("Decorator"));
        

        
        getContentPane().add(panel, BorderLayout.CENTER);
        this.setSize(500, 400);
        this.setLocation(100, 100);
        this.setVisible(true);
        }

 public static void main(String[] args) {
        new TextDemo(); //產生 
        }
 }