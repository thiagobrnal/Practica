import javax.swing.*;
import java.awt.event.*;

public class Java32 extends JFrame implements ActionListener{
 
 private JButton btn1, btn2;
 private JTextField txtf;
 private JScrollPane scroll;
 private JTextArea txta;
 
 String texto = "";

 public Java32(){
  setLayout(null);
  txtf = new JTextField();
  txtf.setBounds(10,10,200,30);
  add(txtf);

 btn1 = new JButton("Agregar");
 btn1.setBounds(250,10,100,30);
 add(btn1);
 btn1.addActionListener(this);
  
 btn2 = new JButton("Cerrar");
 btn2.setBounds(370,10,100,30);
 add(btn2);
 btn2.addActionListener(this);
 
 txta = new JTextArea();
 scroll = new JScrollPane(txta);
 scroll.setBounds(10,50,400,300);
 add(scroll);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   texto += txtf.getText() + "\n";
   txta.setText(texto);
   txtf.setText("");
  }
  if(e.getSource() == btn2){
   System.exit(0);
  }
 }
 
 public static void main(String args[]){
  Java32 form1 = new Java32();
  form1.setBounds(0,0,540,400);
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setLocationRelativeTo(null);
  form1.setTitle("Java32");
 }
}