import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

public class ContentPanel extends JPanel {

   private JTextArea textArea;

   public ContentPanel()
   {
      textArea = new JTextArea();
      
      setLayout(new BorderLayout());
      
      add(new JScrollPane(textArea), BorderLayout.CENTER);
   }
   
   public void setTheme(Color backgroundColor, Color foregroundColor, Color textColor)
   {
   
   }
   
   public void appendText(String text)
   {
      textArea.append(text);
      //System.out.println(text);
   }
}