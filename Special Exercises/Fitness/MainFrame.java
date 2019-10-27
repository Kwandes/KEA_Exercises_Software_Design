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
            if(text.equals("Hello"))
            {
               textPanel.appendText(text+"\n");
            }
            else if(text.equals("Bye"));
            {
               System.out.println("<<<Yeet>>>");
               System.exit(0);
            }
         }
      });
      
      formPanel.setFormListener(new FormListener() {
         public void formEventOccured(FormEvent e)
         {
            String name = e.getName();
            String occupation = e.getOccupation();
            int ageCat = e.getAgeCategory();
            String empCat = e.getEmpCategory();
            String gender = e.getGender();
            
            String displayInfo = name + " - " + occupation + " | " + ageCat + " | " + empCat + " | " + gender;
            
            boolean euCitizen = e.getCitizenStatus();
            if(euCitizen)
            {
               String taxId = e.getTaxId();
               displayInfo += " | Eu Citizen. Tax ID: " + taxId;
            }
            else
            {
               displayInfo += " | Not a EU Citizen";
            }
            
            displayInfo += "\n";
            if(!name.equals(""))
            {
               textPanel.appendText(displayInfo);
            }
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