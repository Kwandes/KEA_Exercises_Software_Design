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

// Image import and display
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;



public class Interface{

   int FRAME_SIZE_MULTIPLIER = 6;
   int FRAME_WIDTH = 160 * FRAME_SIZE_MULTIPLIER;
   int FRAME_HEIGHT = (FRAME_WIDTH/16) * 9;
   String FRAME_TITLE = "GUI MK 1.0";
   
   final Color DISCORD_DARK_GREY = new Color(44,47,51);
   final Color DISCORD_GREY = new Color(54,57,62);
   final Color DISCORD_BLURPLE = new Color(114,137,218);

   public Interface() {};

   public void display()
   {
      // Init frame
      JFrame frame = new JFrame(FRAME_TITLE);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      
      // Main Display panel
      JPanel panelMain = new JPanel();
      
      GridBagLayout gridbag = new GridBagLayout();
      GridBagConstraints c = new GridBagConstraints();
      panelMain.setLayout(gridbag);
      
      panelMain.setBackground(DISCORD_DARK_GREY);
      
         // Menu section
         JPanel panelMenu = new JPanel();
         panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.Y_AXIS));
         panelMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         panelMenu.setBackground(DISCORD_GREY);
         
            // add title panel
            JPanel panelTitle = new JPanel();
            panelTitle.setLayout(new FlowLayout());
            panelTitle.setBackground(DISCORD_GREY);
            
               JLabel labelTitle = new JLabel("System Management");
               labelTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
               labelTitle.setForeground(Color.white);
               
            panelTitle.add(labelTitle);
               
         panelMenu.add(panelTitle);
            
            // Menu Options panel
            JPanel panelMenuOptions = new JPanel();
            panelMenuOptions.setLayout(new BoxLayout(panelMenuOptions, BoxLayout.Y_AXIS));
            panelMenuOptions.setBackground(DISCORD_GREY);
            
               JButton btnOption1 = new JButton("Search Users");
               btnOption1.setAlignmentX(Component.CENTER_ALIGNMENT);
               btnOption1.setForeground(Color.white);
               btnOption1.setBackground(DISCORD_DARK_GREY);
               
            panelMenuOptions.add(btnOption1);
               
               JButton btnOption2 = new JButton("Add Users");
               btnOption2.setAlignmentX(Component.CENTER_ALIGNMENT);
               btnOption2.setForeground(Color.white);
               btnOption2.setBackground(DISCORD_DARK_GREY);
               
            panelMenuOptions.add(btnOption2);
               
               JButton btnOption3 = new JButton("Modify Users");
               btnOption3.setAlignmentX(Component.CENTER_ALIGNMENT);
               btnOption3.setForeground(Color.white);
               btnOption3.setBackground(DISCORD_DARK_GREY);
               
            panelMenuOptions.add(btnOption3);
            
         panelMenu.add(panelMenuOptions);
            
            // add quit panel
            JPanel panelQuit = new JPanel();
            panelQuit.setLayout(new FlowLayout());
            panelQuit.setBackground(DISCORD_GREY);
            
               JButton btnQuit = new JButton("YEET OUT");
               btnQuit.setAlignmentX(Component.CENTER_ALIGNMENT);
               btnQuit.setForeground(Color.white);
               btnQuit.setBackground(DISCORD_DARK_GREY);
               
            panelQuit.add(btnQuit);
               
         panelMenu.add(panelQuit);
      
      c.fill = GridBagConstraints.BOTH;
      //c.weightx = 0.1;
      c.weighty = 0.5;
      c.anchor = GridBagConstraints.LINE_START;
      c.gridx = 0;
      c.gridy = 0;
      c.weightx = 0.3;
      c.anchor = c.EAST;     
      panelMain.add(panelMenu, c);
            
            
         // Content section
         JPanel panelContent = new JPanel();
         panelContent.setLayout(new BorderLayout());
         panelContent.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         panelContent.setBackground(DISCORD_GREY);
         
            JLabel labelContent = new JLabel("Content");
            labelContent.setAlignmentX(Component.CENTER_ALIGNMENT);
            labelContent.setForeground(Color.white);
            
         panelContent.add(labelContent, BorderLayout.NORTH);
            
            try{
            BufferedImage imgDefaultContent = ImageIO.read(new File("defaultContentImage.png"));
            JLabel labelDefaultImage = new JLabel(new ImageIcon(imgDefaultContent));
            panelContent.add(labelDefaultImage, BorderLayout.CENTER);
            }
            catch (IOException e) {}
         
      c.ipady = 0;
      c.fill = GridBagConstraints.BOTH;
      //c.weighty = 0.5;
      c.weightx = 1;
      c.gridx = 1;
      c.gridy = 0;
      panelMain.add(panelContent, c);
      
      frame.add(panelMain);
      frame.setVisible(true);
      
   }
}