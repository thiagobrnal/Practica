import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Java37 extends JFrame implements ActionListener{

 private JMenuBar menuBar;
 private JMenu menu1, menu2, menu3;
 private JMenuItem item1, item2, item3, item4;
 private JButton btn1;

 public Java37(){
  setLayout(null);
 
  menuBar = new JMenuBar();
  setJMenuBar(menuBar);

  menu1 = new JMenu("Opciones");
  menuBar.add(menu1);

  menu2 = new JMenu("Tamaño de la ventana");
  menu1.add(menu2);

  menu3 = new JMenu("Color de fondo");
  menu1.add(menu3);

  item1 = new JMenuItem("300x200");
  menu2.add(item1);
  item1.addActionListener(this);

  item2 = new JMenuItem("640x480");
  menu2.add(item2);
  item2.addActionListener(this);

  item3 = new JMenuItem("Rojo");
  menu3.add(item3);
  item3.addActionListener(this);

  item4 = new JMenuItem("Verde");
  menu3.add(item4);
  item4.addActionListener(this);

  btn1 = new JButton("Cerrar");
  btn1.setBounds(10,10,100,30);
  add(btn1);
  btn1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){

 if(e.getSource() == item1){
   setSize(300,200);
  }
 if(e.getSource() == item2){
   setSize(640,480);
  }
 if(e.getSource() == item3){
   getContentPane().setBackground(new Color(255,0,0));
  }
 if(e.getSource() == item4){
   getContentPane().setBackground(new Color(0,255,0));
  }
 if(e.getSource() == btn1){
   System.exit(0);
  }
 } 

 public static void main(String args[]){
  Java37 form1 = new Java37();
  form1.setBounds(0,0,300,400);
  form1.setVisible(true);
  form1.setLocationRelativeTo(null);
  form1.setTitle("Java37");
  form1.setResizable(false);
 }
}