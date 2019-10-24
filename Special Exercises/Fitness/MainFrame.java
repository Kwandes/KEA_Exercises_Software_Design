import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;

// Events
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Misc
import java.awt.Color;

public class MainFrame extends JFrame{

   private TextPanel textPanel;
   private Toolbar toolbar;
   private FormPanel formPanel;

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
      
      setLayout(new BorderLayout());
      
      toolbar = new Toolbar();
      textPanel = new TextPanel();
      formPanel = new FormPanel();
      
      toolbar.setStringListener(new StringListener() {
         public void textEmitted(String text)
         {  
            textPanel.appendText(text);
         }
      });
      
      formPanel.setFormListener(new FormListener() {
         public void formEventOccured(FormEvent e)
         {
            String name = e.getName();
            String occupation = e.getOccupation();
            
            textPanel.appendText(name + " - " + occupation + "\n");
         }      
      });
      
      add(toolbar, BorderLayout.NORTH);
      add(textPanel, BorderLayout.CENTER);
      add(formPanel, BorderLayout.WEST);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(width, height);
      setVisible(true);
   }


}