import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Java38 extends JFrame implements ChangeListener, ActionListener{

 private JButton btn1;
 private JCheckBox box1, box2, box3;

 public Java38(){
  setLayout(null);
  box1 = new JCheckBox("Inglés");
  box1.setBounds(10,10,150,30);
  box1.addChangeListener(this);
  add(box1);

  box2 = new JCheckBox("Francés");
  box2.setBounds(10,50,150,30);
  box2.addChangeListener(this);
  add(box2);

  box3 = new JCheckBox("Alemán");
  box3.setBounds(10,90,150,30);
  box3.addChangeListener(this);
  add(box3);

  btn1 = new JButton("Cerrar");
  btn1.setBounds(10,130,100,30);
  btn1.addActionListener(this);
  add(btn1);
 }

 public void stateChanged(ChangeEvent a){
  
  String cad = "";
  if(box1.isSelected() == true){
    cad = cad + "Inglés-";
    
  }
  if(box2.isSelected() == true){
    cad = cad + "Francés-";
  }
  if(box3.isSelected() == true){
    cad = cad + "Alemán-";
  }
  setTitle(cad);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   System.exit(0);
  }
 }

 public static void main(String args[]){

  Java38 form1 = new Java38();  
  form1.setBounds(0,0,350,200);
  form1.setResizable(false);
  form1.setVisible(true);
  form1.setLocationRelativeTo(null);
 }
}