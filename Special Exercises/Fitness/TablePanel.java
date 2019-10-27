import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class TablePanel extends JPanel{
   
   private JTable table;
   private PersonTableModel tableModel;
   
   public TablePanel()
   {
      tableModel = new PersonTableModel();
      table = new JTable(tableModel);
      
      setLayout(new BorderLayout());
      
            
      
      add(table, BorderLayout.CENTER);
   }  
}