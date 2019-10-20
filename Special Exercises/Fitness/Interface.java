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

   int FRAME_SIZE_MULTIPLIER = 8;
   int FRAME_WIDTH = 160 * FRAME_SIZE_MULTIPLIER;
   int FRAME_HEIGHT = (FRAME_WIDTH/16) * 9;
   String FRAME_TITLE = "GUI MK 1.0";
   
   final Color DISCORD_DARK_GREY = new Color(44,47,51);
   final Color DISCORD_GREY = new Color(54,57,62);
   final Color DISCORD_LIGHT_GREY = new Color(153,170,181);
   final Color DISCORD_BLURPLE = new Color(114,137,218);
   
   Color backgroundColor = DISCORD_GREY;
   Color foregroundColor = DISCORD_DARK_GREY;
   Color textColor = Color.WHITE;
   

   public Interface() {};

   public void display()
   {
      // Init frame
      JFrame frame = new JFrame(FRAME_TITLE);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      
      // Color Theme
      setWhiteTheme(false);
      
      
      // Main Display panel
      JPanel panelMain = new JPanel();
      
      GridBagLayout gridbag = new GridBagLayout();
      GridBagConstraints c = new GridBagConstraints();
      panelMain.setLayout(gridbag);
      
      panelMain.setBackground(foregroundColor);
      
         // Menu section
         JPanel panelMenu = new JPanel();
         panelMenu.setLayout(new GridBagLayout());
         panelMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         panelMenu.setBackground(backgroundColor);
         
            // add title panel
            JPanel panelTitle = new JPanel();
            panelTitle.setLayout(new GridBagLayout());
            panelTitle.setBackground(backgroundColor);
            
            panelTitle.add(createLabel("System Management", textColor), c);
               
         c.fill = GridBagConstraints.HORIZONTAL;
         c.weightx = 1.0;
         c.ipady = FRAME_HEIGHT / 6;
         c.gridy = 0;
         c.anchor = GridBagConstraints.NORTH;
         c.weighty = 1.0;
         panelMenu.add(panelTitle, c);
            
            // Menu Options panel
            JPanel panelMenuOptions = new JPanel();
            panelMenuOptions.setLayout(new GridBagLayout());
            panelMenuOptions.setBackground(backgroundColor);
            
            // layout for menuOptions buttons
            c.ipady = (FRAME_HEIGHT/3)/3;
            c.weightx = 1.0;
            c.weighty = 0.0;
            c.fill = GridBagConstraints.HORIZONTAL;
               
            c.gridy = 1;
            panelMenuOptions.add(createButton("Search Users", foregroundColor, textColor), c);
               
            c.gridy = 2;
            panelMenuOptions.add(createButton("Add Users", foregroundColor, textColor), c);
               
            c.gridy = 3;
            panelMenuOptions.add(createButton("Modify Users", foregroundColor, textColor), c);
         
         c.ipady = 0;
         c.gridy = 1;
         c.anchor = GridBagConstraints.CENTER;
         panelMenu.add(panelMenuOptions, c);
            
            // add quit panel
            JPanel panelQuit = new JPanel();
            panelQuit.setLayout(new GridBagLayout());
            panelQuit.setBackground(backgroundColor);
            panelQuit.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            
            c.ipady = FRAME_HEIGHT / 6;
            c.weightx = 1.0;
            c.fill  = GridBagConstraints.HORIZONTAL;
            panelQuit.add(createButton("YEET OUT", foregroundColor, textColor), c);
               
         
         c.ipady = 0;
         c.gridy = 3;
         c.fill = GridBagConstraints.HORIZONTAL;
         c.weightx = 1.0;
         c.anchor = GridBagConstraints.SOUTH;
         c.weighty = 1.0;
         panelMenu.add(panelQuit, c);
      
      c.fill = GridBagConstraints.BOTH;
      c.weighty = 0.5;
      c.anchor = GridBagConstraints.LINE_START;
      c.gridy = 0;
      c.weightx = 0.3;
      c.anchor = c.EAST;     
      panelMain.add(panelMenu, c);
            
            
         // Content section
         JPanel panelContent = new JPanel();
         panelContent.setLayout(new BorderLayout());
         panelContent.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         panelContent.setBackground(backgroundColor);
            
         panelContent.add(createLabel("Content", textColor), BorderLayout.NORTH);
            
            try{
            BufferedImage imgDefaultContent = ImageIO.read(new File("defaultContentImage.png"));
            JLabel labelDefaultImage = new JLabel(new ImageIcon(imgDefaultContent));
            panelContent.add(labelDefaultImage, BorderLayout.CENTER);
            }
            catch (IOException e) {}
         
      c.ipady = 0;
      c.fill = GridBagConstraints.BOTH;
      c.weightx = 1.0;
      c.gridx = 1;
      c.gridy = 0;
      panelMain.add(panelContent, c);
      
      frame.add(panelMain);
      frame.setVisible(true);
      
   }
   
   public JButton createButton(String btnText, Color backgroundColor, Color textColor)
   {
      JButton button = new JButton(btnText);
      button.setAlignmentX(Component.CENTER_ALIGNMENT);
      button.setBackground(backgroundColor);
      button.setForeground(textColor);
      
      return button;
   }
   
   public JLabel createLabel(String labelText, Color textColor)
   {
      JLabel label = new JLabel(labelText);
      label.setAlignmentX(Component.CENTER_ALIGNMENT);
      label.setForeground(textColor);
      return label;
   }
   
   public void setWhiteTheme(boolean doYouReallyWantLightTheme)
   {
      if (doYouReallyWantLightTheme)
      {
         // Light Theme
         backgroundColor = Color.WHITE;
         foregroundColor = DISCORD_LIGHT_GREY;
         textColor = DISCORD_GREY;   
      }
      else
      {
         // Dark Theme - the better one
         backgroundColor = DISCORD_GREY;
         foregroundColor = DISCORD_DARK_GREY;
         textColor = Color.WHITE;
      }
   }
}