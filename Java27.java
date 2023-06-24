import javax.swing.*;
import java.awt.event.*;

public class Java27 extends JFrame implements ActionListener{
 
 JButton btn1;

 public Java27(){
  setLayout(null);
  btn1 = new JButton("Cerrar");
  btn1.setBounds(300,250,100,30);
  add(btn1);
  btn1.addActionListener(this);
 }
 
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   System.exit(0);
  }
 }

 public static void main(String args[]){
  Java27 form1 = new Java27();
  form1.setBounds(0,0,450,350);
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setLocationRelativeTo(null);
 }

}