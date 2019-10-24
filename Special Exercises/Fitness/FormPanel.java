import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

// Event handling

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormPanel extends JPanel {

   private JLabel nameLabel;
   private JLabel occupationLabel;
   private JTextField nameField;
   private JTextField occupationField;
   private JButton btnOk;
   
   private FormListener formListener;

   public FormPanel()
   {
      Dimension dim = getPreferredSize();
      dim.width = 250;
      setPreferredSize(dim);
      
      Border innerBorder = BorderFactory.createTitledBorder("Add Person");
      Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
      setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
      
      nameLabel = new JLabel("Name: ");
      occupationLabel = new JLabel("Occupation: ");
      nameField = new JTextField(10);
      occupationField = new JTextField(10);
      
      btnOk = new JButton("OK");
      
      btnOk.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            String name = nameField.getText();
            String occupation = occupationField.getText();
            
            FormEvent ev = new FormEvent(this, name, occupation);
            
            if( formListener != null)
            {
               formListener.formEventOccured(ev);
            }
         }      
      });
      
      setLayout(new GridBagLayout());
      
      GridBagConstraints gc = new GridBagConstraints();
      
      
      
      ///////////////// First Row /////////////////
      gc.weightx = 1.0;
      gc.weighty = 0.1;
      
      gc.gridx = 0;
      gc.gridy = 0;
      gc.fill = GridBagConstraints.NONE;
      gc.anchor = GridBagConstraints.LINE_END;
      gc.insets = new Insets(0,0,0,5);
      
      add(nameLabel, gc);
      
      gc.gridx = 1;
      gc.gridy = 0;
      gc.anchor = GridBagConstraints.LINE_START;
      
      gc.insets = new Insets(0,0,0,0);
      
      add(nameField, gc);
      
      ///////////////// Second Row /////////////////
      gc.weightx = 1.0;
      gc.weighty = 0.1;
      
      gc.gridx = 0;
      gc.gridy = 1;
      gc.anchor = GridBagConstraints.LINE_END;
      gc.insets = new Insets(0,0,0,5);
      
      add(occupationLabel, gc);
      
      gc.gridx = 1;
      gc.gridy = 1;
      gc.anchor = GridBagConstraints.LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(occupationField, gc);
      
      ///////////////// Third Row /////////////////
      gc.weightx = 1.0;
      gc.weighty = 1.0;
      
      gc.gridx = 1;
      gc.gridy = 2;
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(btnOk, gc);
   }
   
   public void setFormListener(FormListener listener)
   {
      this.formListener = listener;
   }   
}