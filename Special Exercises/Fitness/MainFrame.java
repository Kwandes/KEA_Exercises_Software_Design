import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.KeyEvent;        // Mnemonic
import javax.swing.JOptionPane;
import java.awt.Dimension;
import javax.swing.JFileChooser;

// Events
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;

// Misc
import java.awt.Color;

public class MainFrame extends JFrame{

   private TextPanel textPanel;
   private Toolbar toolbar;
   private FormPanel formPanel;
   private TablePanel tablePanel;
   private JFileChooser fileChooser;

   public MainFrame()
   {
      super("Default Title");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setMinimumSize(new Dimension(420, 69*8));
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
      tablePanel = new TablePanel();
      fileChooser = new JFileChooser();
      fileChooser.addChoosableFileFilter(new PersonFileFilter());
      
      // Set up menu bar
      setJMenuBar(createMenuBar());
      
      
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
      //add(textPanel, BorderLayout.CENTER);
      add(tablePanel, BorderLayout.CENTER);
      add(formPanel, BorderLayout.WEST);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(width, height);
      setMinimumSize(new Dimension(420, 69*8));
      setVisible(true);
   }
   
   private JMenuBar createMenuBar()
   {
      JMenuBar menuBar = new JMenuBar();
      
      JMenu fileMenu = new JMenu("File");
      JMenuItem exportDataItem = new JMenuItem("Export Data...");
      JMenuItem importDataItem = new JMenuItem("Import Data...");
      JMenuItem exitItem = new JMenuItem("Exit");
      
      exitItem.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
            int action = JOptionPane.showConfirmDialog(MainFrame.this, "Do you Really want to yeet out?", "Yeet out?", JOptionPane.OK_CANCEL_OPTION);
            if(action == JOptionPane.OK_OPTION)
            {
               System.out.println("<<<YEET>>>");
               System.exit(0);
            }
         }
      });
      
      fileMenu.add(exportDataItem);
      fileMenu.add(importDataItem);
      fileMenu.addSeparator();
      fileMenu.add(exitItem);
      
      JMenu windowMenu = new JMenu("Window");
      
      JMenu showMenu = new JMenu("Show");
      JCheckBoxMenuItem showFormItem = new JCheckBoxMenuItem("Person Form");
      
      showMenu.add(showFormItem);
      windowMenu.add(showMenu);
      
      menuBar.add(fileMenu);
      menuBar.add(windowMenu);
      
      showFormItem.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e)
         {
            JCheckBoxMenuItem menuItem = (JCheckBoxMenuItem)e.getSource();
            
            formPanel.setVisible(menuItem.isSelected());
         }
      });
      
      fileMenu.setMnemonic(KeyEvent.VK_F);
      exitItem.setMnemonic(KeyEvent.VK_X);
      exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
      
      importDataItem.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
            if(fileChooser.showOpenDialog(MainFrame.this) == JFileChooser.APPROVE_OPTION)
            {
               System.out.println(fileChooser.getSelectedFile());
            }
         }
      });
      
      exportDataItem.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
            if(fileChooser.showSaveDialog(MainFrame.this) == JFileChooser.APPROVE_OPTION)
            {
               System.out.println(fileChooser.getSelectedFile());
            }
         }
      });
      
      return menuBar;  
   }
}