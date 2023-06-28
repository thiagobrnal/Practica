import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Java35 extends JFrame implements ActionListener{
 
 private JLabel lab1, lab2, lab3;
 private JComboBox combo1, combo2, combo3;
 private JButton btn1, btn2;

 public Java35(){
  setLayout(null);
  lab1 = new JLabel("Rojo:");
  lab1.setBounds(10,10,100,10);
  add(lab1);
  
  combo1 = new JComboBox();
  combo1.setBounds(120,10,50,30);
  for(int i = 0; i<=255 ; i++){
   combo1.addItem(String.valueOf(i));
  }
  add(combo1);

  lab2 = new JLabel("Verde:");
  lab2.setBounds(10,50,100,10);
  add(lab2);
  
  combo2 = new JComboBox();
  combo2.setBounds(120,50,50,30);
  for(int i = 0; i<=255 ; i++){
   combo2.addItem(String.valueOf(i));
  }
  add(combo2);

  lab3 = new JLabel("Azul:");
  lab3.setBounds(10,90,100,10);
  add(lab3);
  
  combo3 = new JComboBox();
  combo3.setBounds(120,90,50,30);
  for(int i = 0; i<=255 ; i++){
   combo3.addItem(String.valueOf(i));
  }
  add(combo3);

  btn1 = new JButton("Fijar color");
  btn1.setBounds(10,130,100,30);
  add(btn1);
  btn1.addActionListener(this);

  btn2 = new JButton("Cerrar");
  btn2.setBounds(120,130,100,30);
  add(btn2);
  btn2.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   String cad1 = combo1.getSelectedItem().toString();
   String cad2 = combo2.getSelectedItem().toString();
   String cad3 = combo3.getSelectedItem().toString();

   int rojo = Integer.parseInt(cad1);
   int verde = Integer.parseInt(cad2);
   int azul = Integer.parseInt(cad3);

   Color color1 = new Color(rojo,verde,azul);

   Container a = this.getContentPane();

   a.setBackground(color1);
   btn1.setBackground(color1);
  }
  if(e.getSource() == btn2){
   System.exit(0);
  }
 }

 public static void main(String args[]){
  Java35 form1 = new Java35();
  form1.setBounds(0,0,250,210);
  form1.setTitle("Java35");
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setLocationRelativeTo(null);
 }
}