import javax.swing.*;
import java.awt.event.*;

public class Java28 extends JFrame implements ActionListener{
 
 private JButton btn1, btn2, btn3, btnexit;
 private JLabel lab1;

 public Java28(){
  setLayout(null);
  btn1 = new JButton("Opcion 1");
  btn1.setBounds(10,100,100,30);
  add(btn1);
  btn1.addActionListener(this);
  
  btn2 = new JButton("Opcion 2");
  btn2.setBounds(120,100,100,30);
  add(btn2);
  btn2.addActionListener(this);

  btn3 = new JButton("Opcion 3");
  btn3.setBounds(230,100,100,30);
  add(btn3);
  btn3.addActionListener(this);

  btnexit = new JButton("Cerrar");
  btnexit.setBounds(200,10,90,30);
  add(btnexit);
  btnexit.addActionListener(this);

 lab1 = new JLabel("En espera...");
 lab1.setBounds(10,10,300,30);
 add(lab1);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   lab1.setText("Has presionado el botón 1");
  }

  if(e.getSource() == btn2){
   lab1.setText("Has presionado el botón 2");
  }

  if(e.getSource() == btn3){
   lab1.setText("Has presionado el botón 3");
  }
  
  if(e.getSource() == btnexit){
   System.exit(0);
  }
 } 

 public static void main(String args[]){
 Java28 form1 = new Java28();
 form1.setBounds(0,0,400,200);
 form1.setVisible(true);
 form1.setResizable(false);
 form1.setLocationRelativeTo(null);
 }
}