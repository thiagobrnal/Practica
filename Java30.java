import javax.swing.*;
import java.awt.event.*;
public class Java30 extends JFrame implements ActionListener{

 private JButton btn1;
 private JTextField txtf;
 private JTextArea txta;

 public Java30(){
  setLayout(null);
  txtf = new JTextField();
  txtf.setBounds(10,10,150,30);
  add(txtf);
  
  txta = new JTextArea();
  txta.setBounds(10,50,300,250);
  add(txta);
  
  btn1 = new JButton("Cerrar");
  btn1.setBounds(10,320,100,30);
  add(btn1);
  btn1.addActionListener(this);
  }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   System.exit(0);
  }
 }
 
 public static void main(String args[]){
  
  Java30 form1 = new Java30();
  form1.setBounds(0,0,350,400);
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setLocationRelativeTo(null);
 }

}