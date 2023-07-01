import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Java40 extends JFrame implements ActionListener, ChangeListener{

 private JRadioButton rad1, rad2, rad3;
 private ButtonGroup bg;
 private JButton btn1;

 public Java40(){
  setLayout(null);
  bg = new ButtonGroup();
  rad1 = new JRadioButton("640x480");
  rad1.setBounds(10,20,100,30);
  rad1.addChangeListener(this);
  add(rad1);
  bg.add(rad1);

  rad2 = new JRadioButton("800x600");
  rad2.setBounds(10,70,100,30);
  rad2.addChangeListener(this);
  add(rad2);
  bg.add(rad2);

  rad3 = new JRadioButton("1024x768");
  rad3.setBounds(10,120,100,30);
  rad3.addChangeListener(this);
  add(rad3);
  bg.add(rad3);

  btn1 = new JButton("Cerrar");
  btn1.setBounds(120,70,100,30);
  btn1.addActionListener(this);
  add(btn1);
 }

 public void stateChanged(ChangeEvent e){
  if(rad1.isSelected()){
   setSize(640,480);
  }
  if(rad2.isSelected()){
   setSize(800,600);
  }
  if(rad3.isSelected()){
   setSize(1024,768);
  }
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   System.exit(0);
  }
 }


 public static void main(String args[]){
  Java40 form1 = new Java40();
  form1.setBounds(0,0,350,230);
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setTitle("Java40");
 }
}