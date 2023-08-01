//frame manipulaions Classes and packages
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

//making it look beautiful 
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;


class Main{
  JFrame frame;
  JPanel studentPanel,regularPanel,dropoutPanel;
  public Main(){
    frame=new JFrame("college Coursework");
    Toolkit kit=Toolkit.getDefaultToolkit();
    Dimension screenDimension=kit.getScreenSize();
    int screenWidth=screenDimension.width;
    int screenHeight=screenDimension.height;
    frame.setSize(screenWidth,screenHeight );



    //working with studentPanel
    studentPanel=new JPanel();
    studentPanel.setSize(400,600);
    studentPanel.setBackground(Color.ORANGE);
    studentPanel.setLocation(50,25);
    frame.add(studentPanel);
    
    //working with regularPanel
    regularPanel=new JPanel();
    regularPanel.setSize(400,600);
    regularPanel.setBackground(new Color(0,128,128));
    regularPanel.setLocation(500,25);
    frame.add(regularPanel);







    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  public static void main(String args[]){
    Main object=new Main();
  }
}
