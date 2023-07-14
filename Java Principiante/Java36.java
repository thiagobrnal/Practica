import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Java36 extends JFrame implements ActionListener{

 private JMenuBar menuBar;
 private JMenu menu1;
 private JMenuItem item1, item2, item3; 
 private JButton btn1;

 public Java36(){
  setLayout(null);

  menuBar = new JMenuBar();
  setJMenuBar(menuBar);

  menu1 = new JMenu("Opciones");
  menuBar.add(menu1);

  item1 = new JMenuItem("Rojo");
  item1.addActionListener(this);
  menu1.add(item1);
  item2 = new JMenuItem("Verde");
  item2.addActionListener(this);
  menu1.add(item2);
  item3 = new JMenuItem("Azul");
  item3.addActionListener(this);
  menu1.add(item3);

 btn1 = new JButton("Cerrar");
 btn1.setBounds(10,10,100,30);
 add(btn1);
 btn1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  Container a = this.getContentPane();
  
  if(e.getSource() == item1){
   a.setBackground(new Color(255,0,0));
  }
  if(e.getSource() == item2){
   a.setBackground(new Color(0,255,0));
  }
  if(e.getSource() == item3){
   a.setBackground(new Color(0,0,255));
  }
  if(e.getSource() == btn1){
   System.exit(0);
  }
 }
 
 public static void main(String args[]){
  Java36 form1 = new Java36();
  form1.setBounds(0,0,400,300);
  form1.setVisible(true);
  form1.setLocationRelativeTo(null);
  form1.setResizable(true);
  form1.setTitle("Java36");
 }
}