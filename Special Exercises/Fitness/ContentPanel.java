import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ContentPanel extends JPanel {

   private JTextArea textArea;

   public ContentPanel()
   {
      textArea = new JTextArea();
      
      setLayout(new BorderLayout());
      
      add(new JScrollPane(textArea), BorderLayout.CENTER);
   }
   
   public void appendText(String text)
   {
      textArea.append(text);
      //System.out.println(text);
   }
}