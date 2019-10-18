// Fitness Exercise, User Interface setup
// Jan Bogoryja-Zakrzewski, Dat19i

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.BoxLayout;
import javax.swing.BorderFactory;   // for Borders

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;          // for Alignment

import java.awt.Color;              // for Borders

// testing, imported code
import java.awt.Container;
import java.awt.ComponentOrientation;
import java.awt.Insets;



public class GUI{

   
   int FRAME_WIDTH = 640;
   int FRAME_HEIGHT = (FRAME_WIDTH/16) * 9;
   String FRAME_TITLE = "GUI MK 1.0";
   
   final Color DISCORD_DARK_GREY = new Color(44,47,51);
   final Color DISCORD_GREY = new Color(54,57,62);
   final Color DISCORD_BLURPLE = new Color(114,137,218);
   
   
   public GUI() {};

   public void display()
   {
      // Init frame
      JFrame frame = new JFrame(FRAME_TITLE);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      
      JPanel panel = new JPanel();
   
      GridBagLayout gridbag = new GridBagLayout();
      GridBagConstraints c = new GridBagConstraints();
      panel.setLayout(gridbag);      
      
      panel.setBackground(DISCORD_DARK_GREY);
      
         JButton btn = new JButton("Button");
      c.fill = GridBagConstraints.BOTH;
      c.weightx = 0.5;
      c.fill = GridBagConstraints.HORIZONTAL;
      //c.gridx = 0;
      //c.gridy = 0;
      panel.add(btn, c);
      
      
      frame.add(panel);
      frame.setVisible(true);
   }
       //-----------------------------------------
   

   /*public void display()  
   {
   
      JFrame frame = new JFrame(FRAME_TITLE);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
   
      JPanel pane = new JPanel(new GridBagLayout());
      GridBagConstraints c = new GridBagConstraints();
       
      //For each component to be added to this container:
      //...Create the component...
      //...Set instance variables in the GridBagConstraints instance...
      
      boolean shouldFill = false;
      boolean shouldWeightX = false;
      
      JButton button;
      pane.setLayout(new GridBagLayout());
      if (shouldFill) {
                      //natural height, maximum width
                      c.fill = GridBagConstraints.HORIZONTAL;
      }
       
         button = new JButton("Button 1");
         if (shouldWeightX) {
                            c.weightx = 0.5;
         }
         c.fill = GridBagConstraints.HORIZONTAL;
         c.gridx = 0;
         c.gridy = 0;
         pane.add(button, c);
      /*
       
      button = new JButton("Button 2");
      c.fill = GridBagConstraints.HORIZONTAL;
      c.weightx = 0.5;
      c.gridx = 1;
      c.gridy = 0;
      pane.add(button, c);
       
      button = new JButton("Button 3");
      c.fill = GridBagConstraints.HORIZONTAL;
      c.weightx = 0.5;
      c.gridx = 2;
      c.gridy = 0;
      pane.add(button, c);
       
      button = new JButton("Long-Named Button 4");
      c.fill = GridBagConstraints.HORIZONTAL;
      c.ipady = 40;      //make this component tall
      c.weightx = 0.0;
      c.gridwidth = 3;
      c.gridx = 0;
      c.gridy = 1;
      pane.add(button, c);
       
      button = new JButton("5");
      c.fill = GridBagConstraints.HORIZONTAL;
      c.ipady = 0;       //reset to default
      c.weighty = 1.0;   //request any extra vertical space
      c.anchor = GridBagConstraints.PAGE_END; //bottom of space
      c.insets = new Insets(10,0,0,0);  //top padding
      c.gridx = 1;       //aligned with button 2
      c.gridwidth = 2;   //2 columns wide
      c.gridy = 2;       //third row
      pane.add(button, c);
      
      
      frame.add(pane);
      frame.setVisible(true);
   }
   */

}