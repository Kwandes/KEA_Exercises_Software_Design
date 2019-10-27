import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

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
   private JList ageList;
   private JComboBox empCombo;
   private JCheckBox citizenCheck;
   private JTextField taxField;
   private JLabel taxLabel;
   private JRadioButton maleRadio;
   private JRadioButton femaleRadio;
   private JRadioButton otherRadio;
   private ButtonGroup genderGroup;
   
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
      ageList = new JList();
      empCombo = new JComboBox();
      citizenCheck = new JCheckBox();
      taxField = new JTextField(10);
      taxLabel = new JLabel("Tax ID: ");
      
      maleRadio = new JRadioButton("male");
      maleRadio.setActionCommand("male");
      femaleRadio = new JRadioButton("female");
      femaleRadio.setActionCommand("female");
      otherRadio = new JRadioButton("other");
      otherRadio.setActionCommand("other");
      genderGroup = new ButtonGroup();
      
      // Set up gender radio
      genderGroup.add(maleRadio);
      genderGroup.add(femaleRadio);
      genderGroup.add(otherRadio);
      otherRadio.setSelected(true);
      
      // Set up Tax ID
      taxLabel.setEnabled(false);
      taxField.setEnabled(false);
      
      citizenCheck.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
            boolean isTicked = citizenCheck.isSelected();
            taxLabel.setEnabled(isTicked);
            taxField.setEnabled(isTicked);
         }
      });
      
      // Setup age list
      DefaultListModel ageModel = new DefaultListModel();
      ageModel.addElement(new AgeCategory(0,"Under 18"));
      ageModel.addElement(new AgeCategory(1,"18 to 65"));
      ageModel.addElement(new AgeCategory(2,"65 or over"));
      ageList.setModel(ageModel);
      
      ageList.setPreferredSize(new Dimension(110, 60));
      ageList.setBorder(BorderFactory.createEtchedBorder());
      ageList.setSelectedIndex(1);
      
      // Setup combo box
      DefaultComboBoxModel empModel = new DefaultComboBoxModel();
      empModel.addElement("employed");
      empModel.addElement("self-employed");
      empModel.addElement("unemployed");
      empCombo.setModel(empModel);
      empCombo.setSelectedIndex(0);
      
      btnOk = new JButton("OK");
      
      btnOk.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            String name = nameField.getText();
            String occupation = occupationField.getText();
            AgeCategory ageCat = (AgeCategory)ageList.getSelectedValue();
            String empCat = (String)empCombo.getSelectedItem();
            String taxId = taxField.getText();
            boolean euCitizen = citizenCheck.isSelected();
            String genderCommand = genderGroup.getSelection().getActionCommand();
            
            System.out.println(empCat);
            
            FormEvent ev = new FormEvent(this, name, occupation, ageCat.getId(),
                  empCat, taxId, euCitizen, genderCommand);
            
            if( formListener != null)
            {
               formListener.formEventOccured(ev);
            }
         }      
      });
      
            
      layoutComponents();
   }
   
   public void layoutComponents()
   {
      setLayout(new GridBagLayout());
      
      GridBagConstraints gc = new GridBagConstraints();
      
      ///////////////// First Row /////////////////
      gc.gridy = 0;
      
      gc.weightx = 1.0;
      gc.weighty = 0.1;
      
      gc.gridx = 0;
      gc.fill = GridBagConstraints.NONE;
      gc.anchor = GridBagConstraints.LINE_END;
      gc.insets = new Insets(0,0,0,5);
      
      add(nameLabel, gc);
      
      gc.gridx = 1;
      gc.anchor = GridBagConstraints.LINE_START;
      
      gc.insets = new Insets(0,0,0,0);
      
      add(nameField, gc);
      
      ///////////////// Second Row /////////////////
      gc.gridy++;
      
      gc.weightx = 1.0;
      gc.weighty = 0.1;
      
      gc.gridx = 0;
      gc.anchor = GridBagConstraints.LINE_END;
      gc.insets = new Insets(0,0,0,5);
      
      add(occupationLabel, gc);
      
      gc.gridx = 1;
      gc.gridy = 1;
      gc.anchor = GridBagConstraints.LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(occupationField, gc);
      
      ///////////////// Third Row /////////////////
      gc.gridy++;
      
      gc.weightx = 1.0;
      gc.weighty = 0.1;
      
      gc.gridx = 0;
      gc.anchor = GridBagConstraints.FIRST_LINE_END;
      gc.insets = new Insets(0,0,0,5);
      add(new JLabel("Age: "), gc);
      
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      gc.insets = new Insets(0,0,0,0);
      gc.gridx = 1;
      
      add(ageList, gc);
      
      ///////////////// Next Row /////////////////
      gc.gridy++;
      
      gc.weightx = 1.0;
      gc.weighty = 0.2;
      
      gc.gridx = 0;
      gc.anchor = GridBagConstraints.FIRST_LINE_END;
      gc.insets = new Insets(0,0,0,5);
      add(new JLabel("Employment: "), gc);
      
      gc.gridx = 1;
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(empCombo, gc);
      
      ///////////////// Next Row /////////////////
      gc.gridy++;
      
      gc.weightx = 1.0;
      gc.weighty = 0.2;
      
      gc.gridx = 0;
      gc.anchor = GridBagConstraints.FIRST_LINE_END;
      gc.insets = new Insets(0,0,0,5);
      add(new JLabel("EU Citizen: "), gc);
      
      gc.gridx = 1;
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(citizenCheck, gc);
      
      ///////////////// Next Row /////////////////
      gc.gridy++;
      
      gc.weightx = 1.0;
      gc.weighty = 0.2;
      
      gc.gridx = 0;
      gc.anchor = GridBagConstraints.FIRST_LINE_END;
      gc.insets = new Insets(0,0,0,5);
      add(taxLabel, gc);
      
      gc.gridx = 1;
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(taxField, gc);
      
      ///////////////// Next Row /////////////////
      gc.gridy++;
      
      gc.weightx = 1.0;
      gc.weighty = 0.05;
      
      gc.gridx = 0;
      gc.anchor = GridBagConstraints.FIRST_LINE_END;
      gc.insets = new Insets(0,0,0,5);
      add(new JLabel("Gender: "), gc);
      
      gc.gridx = 1;
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(maleRadio, gc);
      
      ///////////////// Next Row /////////////////
      gc.gridy++;
      
      gc.weightx = 1.0;
      gc.weighty = 0.05;
      
      gc.gridx = 1;
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(femaleRadio, gc);
      
      ///////////////// Next Row /////////////////
      gc.gridy++;
      
      gc.weightx = 1.0;
      gc.weighty = 0.05;
      
      gc.gridx = 1;
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(otherRadio, gc);
      
      ///////////////// Next Row /////////////////
      gc.gridy++;
      
      gc.weightx = 1.0;
      gc.weighty = 2.0;
      
      gc.gridx = 1;
      gc.anchor = GridBagConstraints.FIRST_LINE_START;
      gc.insets = new Insets(0,0,0,0);
      
      add(btnOk, gc);
   }
   
   public void setFormListener(FormListener listener)
   {
      this.formListener = listener;
   }   
   
   class AgeCategory{
      private int id;
      private String text;
      
      public AgeCategory(int id, String text)
      {
         this.id = id;
         this.text = text;
      }
      
      public String toString()
      {
         return text;
      }   
      
      public int getId()
      {
         return id;
      }
   }
}