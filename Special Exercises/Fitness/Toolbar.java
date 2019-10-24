import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;

// Events
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Toolbar extends JPanel implements ActionListener {

   private JButton btnHello;
   private JButton btnGoodbye;
   
   private StringListener textListener;
   
   public Toolbar()
   {
      setBorder(BorderFactory.createEtchedBorder());
      btnHello = new JButton("Hello");
      btnGoodbye = new JButton("Goodbye");
      
      btnHello.addActionListener(this);
      btnGoodbye.addActionListener(this);
      
      setLayout(new FlowLayout(FlowLayout.LEFT));
      
      add(btnHello);
      add(btnGoodbye);
   }
   
   public void setStringListener(StringListener listener)
   {
      this.textListener = listener;   
   }
   
   @Override
   public void actionPerformed(ActionEvent e)
   {
      JButton clicked = (JButton)e.getSource();
            
      if(clicked == btnHello)
      {
         System.out.println(">>>clicked btnHello");
         if(this.textListener != null)
         {
            textListener.textEmitted("Hello\n");
         }
      }
      else if(clicked == btnGoodbye)
      {
         System.out.println(">>>clicked btnGoodbye");
         if(this.textListener != null)
         {
            textListener.textEmitted("Bye\n");
         }
         
      }
   }
}
