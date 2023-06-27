import javax.swing.*;
import java.awt.event.*;

 //Programa con swing con scroll dentro de un text area
public class Java31 extends JFrame implements ActionListener{

 private JButton btn1;
 private JTextField txtf;
 private JTextArea txta;
 private JScrollPane scroll;

 public Java31(){
  setLayout(null);
  txtf = new JTextField();
  txtf.setBounds(10,10,150,30);
  add(txtf);
  
  txta = new JTextArea();
  //El setBounds en 0 porque el ScrollPane ya le da las medidas
  txta.setBounds(0,0,0,0);
  add(txta);
  
  btn1 = new JButton("Cerrar");
  btn1.setBounds(10,370,100,30);
  add(btn1);
  btn1.addActionListener(this);
  
  scroll = new JScrollPane(txta);
  scroll.setBounds(10,50,350,300);
  add(scroll);
  }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   System.exit(0);
  }
 }
 
 public static void main(String args[]){
  
  Java31 form1 = new Java31();
  form1.setBounds(0,0,400,450);
  form1.setTitle("Java31");
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setLocationRelativeTo(null);
 }

}