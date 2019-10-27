import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.util.ArrayList;

import java.awt.Color;

public class ContentPanel extends JPanel {

   private JTextArea textArea;
   private JTable userTable;
   private UserTableModel tableModel;

   public ContentPanel()
   {
      tableModel = new UserTableModel();
      userTable = new JTable(tableModel);
         
      textArea = new JTextArea();
      
      setLayout(new BorderLayout());
      
      add(new JScrollPane(textArea), BorderLayout.NORTH);
      add(userTable, BorderLayout.CENTER);
   }
   
   public void setTheme(Color backgroundColor, Color foregroundColor, Color textColor)
   {
      
   }
   
   public void appendText(String text)
   {
      textArea.append(text);
      //System.out.println(text);
   }
   
   public void refresh()
   {
   
   }
   
   public void setNewData(ArrayList<User> userList)
   {
      
   }
}