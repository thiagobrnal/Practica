import javax.swing.*;
import java.awt.event.*;

public class Java29 extends JFrame implements ActionListener{

 private JTextField textf1;
 private JLabel lab1;
 private JButton btn1, btn2;

 public Java29(){
 setLayout(null);
 lab1 = new JLabel("Usuario:");
 lab1.setBounds(10,10,100,30);
 add(lab1);

 textf1 = new JTextField();
 textf1.setBounds(120,17,150,20);
 add(textf1);

 btn1 = new JButton("Aceptar");
 btn1.setBounds(10,75,100,30);
 add(btn1);
 btn1.addActionListener(this);

 btn2 = new JButton("Cerrar");
 btn2.setBounds(120,75,100,30);
 add(btn2);
 btn2.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  
  if(e.getSource() == btn1){
   String txt = textf1.getText();
   setTitle(txt);
   textf1.setText("");
  }
  if(e.getSource() == btn2){
   System.exit(0);
  }
 }
 
 public static void main(String args[]){

 Java29 form1 = new Java29();
 form1.setBounds(0,0,300,150); 
 form1.setVisible(true);
 form1.setResizable(false);
 form1.setLocationRelativeTo(null);
 }
}