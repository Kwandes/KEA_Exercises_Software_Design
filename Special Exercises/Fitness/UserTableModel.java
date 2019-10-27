import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class UserTableModel extends AbstractTableModel {
   
   @Override
   public int getColumnCount()
   {
      return 0;
   }
   
   @Override
   public int getRowCount()
   {
      return 0;
   }
   
   public ArrayList<User> getValueAt(int row, int arg)
   {
      return null;
   }
}