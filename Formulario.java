import javax.swing.*;

public class Formulario extends JFrame{

 private JLabel label1;

 public Formulario(){
  setLayout(null);
  label1 = new JLabel("Hola mundo?");
  label1.setBounds(50,50,100,100);
  add(label1);
 }
 public static void main(String args[]){
  Formulario form1 = new Formulario();
  form1.setBounds(0,0,400,300);
  form1.setVisible(true);
  form1.setLocationRelativeTo(null);
 }
}

 