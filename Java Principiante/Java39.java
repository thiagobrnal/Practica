import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Java39 extends JFrame implements ActionListener, ChangeListener{

 private JLabel lab1;
 private JCheckBox box1;
 private JButton btn1;

 public Java39(){
  setLayout(null);
  lab1 = new JLabel("Aceptar terminos y condiciones");
  lab1.setBounds(10,10,400,30);
  add(lab1);

  box1 = new JCheckBox("Aceptar");
  box1.setBounds(10,50,100,30);
  box1.addChangeListener(this);
  add(box1);

  btn1 = new JButton("Continuar");
  btn1.setBounds(10,100,100,30);
  btn1.addActionListener(this);
  add(btn1);
  btn1.setEnabled(false);
 }

 public void stateChanged(ChangeEvent e){
  if(box1.isSelected() == true){
   btn1.setEnabled(true);
  }else{
   btn1.setEnabled(false);
  }
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   System.exit(0);
  }
 }


 public static void main(String args[]){
  Java39 form1 = new Java39();
  form1.setTitle("Java39");
  form1.setResizable(false);
  form1.setBounds(0,0,350,200);
  form1.setVisible(true);
  form1.setLocationRelativeTo(null);
 } 
}