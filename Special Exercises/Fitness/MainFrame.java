import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Events
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Misc
import java.awt.Color;
import javax.swing.BorderFactory;

public class MainFrame extends JFrame{

   private MenuPanel menuPanel;
   private ContentPanel contentPanel;
   
   // Color Themes
   
   final Color DISCORD_DARK_GREY = new Color(44,47,51);
   final Color DISCORD_GREY = new Color(54,57,62);
   final Color DISCORD_LIGHT_GREY = new Color(153,170,181);
   final Color DISCORD_BLURPLE = new Color(114,137,218);
   
   Color backgroundColor = DISCORD_GREY;
   Color foregroundColor = DISCORD_DARK_GREY;
   Color textColor = Color.WHITE;

   public MainFrame()
   {
      super("Default Title");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(420, 69 *3);
      setVisible(true);
   }
   
   public MainFrame(String title, int width, int height)
   {
      super(title);
      
      setSize(width, height);
      
      setLayout(new GridBagLayout());
      GridBagConstraints gc = new GridBagConstraints();
      
      menuPanel = new MenuPanel(backgroundColor, foregroundColor, textColor);
      contentPanel = new ContentPanel();
      
      gc.gridx = 0;
      gc.gridy = 0;
      gc.weightx = 0.3;
      gc.weighty = 1.0;
      gc.fill = GridBagConstraints.BOTH;
      gc.anchor = GridBagConstraints.CENTER;
      
      this.add(menuPanel, gc);
      
      gc.gridx = 1;
      gc.gridy = 0;
      gc.weightx = 0.7;
      gc.weighty = 1.0;
      gc.fill = GridBagConstraints.BOTH;
      //gc.anchor = GridBagConstraints.CENTER;
      
      this.add(contentPanel, gc);
      
      // Button click listener
      menuPanel.setStringListener(new StringListener() {
         public void textEmitted(String text)
         {  
            contentPanel.appendText(text);
         }
      });
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }


}