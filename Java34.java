import javax.swing.*;
import java.awt.event.*;

 class Java34 extends JFrame implements ItemListener, ActionListener{

 private JComboBox combo1;
 private JButton btn1;

 public Java34(){
  setLayout(null);

  btn1 = new JButton("Cerrar");
  btn1.setBounds(100,10,100,30);
  add(btn1); 
  btn1.addActionListener(this);
  

  combo1 = new JComboBox();
  combo1.setBounds(10,10,80,20);
  add(combo1);

  combo1.addItem("Rojo");
  combo1.addItem("Azul");
  combo1.addItem("Amarillo");
  combo1.addItem("Verde");
  combo1.addItem("Violeta");
  combo1.addItemListener(this);
 }
 
 public void itemStateChanged(ItemEvent e){
  if(e.getSource() == combo1){
   String seleccion = combo1.getSelectedItem().toString();
   setTitle(seleccion);
  }
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   System.exit(0);
  }
 }

 public static void main(String args[]){
  Java34 form1 = new Java34();
  form1.setBounds(0,0,300,150);
  form1.setVisible(true);
  form1.setLocationRelativeTo(null);
  form1.setResizable(false);
 }
}