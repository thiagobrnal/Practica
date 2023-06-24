import javax.swing.*;

public class Java26 extends JFrame{
 
 private JLabel lab1;
 private JLabel lab2;

 public Java26(){
  setLayout(null);
  lab1 = new JLabel("Interfaz Gráfica");
  lab1.setBounds(10,20,300,30);
  add(lab1);
  
  lab2 = new JLabel("Versión 1.0");
  lab2.setBounds(10,100,100,30);
  add(lab2);
 }

 public static void main(String args[]){
  Java26 form1 = new Java26();
  form1.setBounds(0,0,300,200);
  form1.setResizable(false);
  form1.setVisible(true);
  form1.setLocationRelativeTo(null);
 }
}