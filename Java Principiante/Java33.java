import javax.swing.*;
import java.awt.event.*;

public class Java33 extends JFrame implements ActionListener{

 private JButton btn1,btn2;
 private JTextField txtf1, txtf2;
 private JLabel lab1, lab2, lab3;

 public Java33(){
  setLayout(null);
  lab1 = new JLabel("Valor 1:"); 
  lab1.setBounds(50,5,100,30);
  add(lab1);

  lab2 = new JLabel("Valor 2:"); 
  lab2.setBounds(50,35,100,30);
  add(lab2);

  lab3 = new JLabel("Resultado:"); 
  lab3.setBounds(120,80,100,30);
  add(lab3);

  txtf1 = new JTextField();
  txtf1.setBounds(120,10,150,20);
  add(txtf1);
  
  txtf2 = new JTextField();
  txtf2.setBounds(120,40,150,20);
  add(txtf2);

  btn1 = new JButton("Sumar");
  btn1.setBounds(10,80,100,30);
  btn1.addActionListener(this);
  add(btn1);

  btn2 = new JButton("Cerrar");
  btn2.setBounds(120,120,100,30);
  btn2.addActionListener(this);
  add(btn2);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   int num1 = 0, num2 = 0, res = 0;

   num1 = Integer.parseInt(txtf1.getText());
   num2 = Integer.parseInt(txtf2.getText());

   res = num1 + num2;

   lab3.setText("Resultado: "+res);
  }
  if(e.getSource() == btn2){
   System.exit(0);
  }
 }

 public static void main(String args[]){
  Java33 form1 = new Java33();
  form1.setBounds(0,0,300,200);
  form1.setResizable(false);
  form1.setVisible(true);
  form1.setTitle("Java33");
  form1.setLocationRelativeTo(null);
 }
}