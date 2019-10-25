import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.Color;

// Events
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Icon
import javax.swing.ImageIcon;
import java.awt.Image;


public class MenuPanel extends JPanel implements ActionListener {

   private JLabel labelTitle;
   private JButton btnOption1;
   private JButton btnOption2;
   private JButton btnOption3;
   private JButton btnQuit;
   
   private ImageIcon icon;
   
   private StringListener textListener;
   
   public MenuPanel(Color backgroundColor, Color foregroundColor, Color textColor)
   {
      labelTitle = new JLabel("System Managem,enemt");
      
      icon  = new ImageIcon("defaultContentImage.png");
      Image image = icon.getImage().getScaledInstance(300, 180,  java.awt.Image.SCALE_SMOOTH);
      icon = new ImageIcon(image);
      labelTitle.setIcon(icon);
      
      labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      labelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      
      btnOption1 = new JButton("Option 1");
      btnOption2 = new JButton("Option 2");
      btnOption3 = new JButton("Change Theme");
      btnQuit    = new JButton("YEET OUT");
      
      btnOption1.addActionListener(this);
      btnOption2.addActionListener(this);
      btnOption3.addActionListener(this);
      btnQuit.addActionListener(this);
      
      setTheme(backgroundColor, foregroundColor, textColor);
      
      setLayout(new GridBagLayout());
      GridBagConstraints gc = new GridBagConstraints();
      
      gc.gridx = 0;
      gc.gridy = 0;
      gc.weightx = 1.0;
      gc.weighty = 1.0;
      gc.fill = GridBagConstraints.NONE;
      
      /////////////// TITLE //////////////////
      
      labelTitle.setHorizontalAlignment(JLabel.CENTER);
      
      gc.gridy = 0;
      gc.weighty = 0.3;
      gc.fill = GridBagConstraints.BOTH;
      
      add(labelTitle, gc);
      
      /////////////// OPTIONS //////////////////
      
      gc.gridy = 1;
      gc.weighty = 0.2;
      gc.fill = GridBagConstraints.BOTH;
      
      add(btnOption1, gc);
      
      gc.gridy = 2;
      add(btnOption2, gc);
      
      gc.gridy = 3;
      add(btnOption3, gc);
      
      
      /////////////// QUIT //////////////////
      
      gc.gridy = 4;
      gc.weighty = 0.15;
      gc.fill = GridBagConstraints.BOTH;
      
      add(btnQuit, gc);
   }
   
   public void setTheme(Color backgroundColor, Color foregroundColor, Color textColor)
   {
      this.setBackground(backgroundColor);
      
      labelTitle.setForeground(textColor);
      
      btnOption1.setBackground(foregroundColor);
      btnOption1.setForeground(textColor);
      btnOption2.setBackground(foregroundColor);
      btnOption2.setForeground(textColor);
      btnOption3.setBackground(foregroundColor);
      btnOption3.setForeground(textColor);
      btnQuit.setBackground(foregroundColor);
      btnQuit.setForeground(textColor);
   }
   
   public void setStringListener(StringListener listener)
   {
      this.textListener = listener;   
   }
   
   @Override
   public void actionPerformed(ActionEvent e)
   {
      JButton clicked = (JButton)e.getSource();
            
      if(clicked == btnOption1)
      {
         System.out.println(">>>clicked btnOption1");
         if(this.textListener != null)
         {
            textListener.textEmitted("Option 1\n");
         }
      }
      else if(clicked == btnOption2)
      {
         System.out.println(">>>clicked btnOption2");
         if(this.textListener != null)
         {
            textListener.textEmitted("Option 2\n");
         }
         
      }
      else if(clicked == btnOption3)
      {
         System.out.println(">>>clicked btnOption3");
         if(this.textListener != null)
         {
            textListener.textEmitted("changeTheme\n");
         }
         
      }
            else if(clicked == btnQuit)
      {
         System.out.println(">>>clicked YEET OUT");
         if(this.textListener != null)
         {
            textListener.textEmitted("YEEEEEEEEEEEEEEET\n");
            System.exit(0);
         }
         
      }
   }
}
