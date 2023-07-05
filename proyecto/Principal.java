import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

 private JTextField txtf1;
 private JLabel lab1, lab2, lab3, lab4;
 private JButton btn1;
 public static String texto = "";
 
 public Principal(){
  setLayout(null);

  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Bienvenido");
  getContentPane().setBackground(new Color(255,0,0));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  ImageIcon image = new ImageIcon("images/logo-coca.png");
  lab1 = new JLabel(image);
  lab1.setBounds(25,15,300,150);
  add(lab1);

  lab2 = new JLabel("Sistema de Control Vacacional");
  lab2.setBounds(35,135,300,30);
  lab2.setFont(new Font("Montserrat", 3, 18));
  lab2.setForeground(new Color(255,255,255));
  add(lab2);
 
  lab3 = new JLabel("Ingrese su nombre");
  lab3.setBounds(45,212,200,30);
  lab3.setFont(new Font("Montserrat", 2, 12));
  lab3.setForeground(new Color(255,255,255));
  add(lab3);

  lab4 = new JLabel("©2023 The Coca-Cola Company");
  lab4.setBounds(85,375,300,30);
  lab4.setFont(new Font("Montserrat", 1, 12));
  lab4.setForeground(new Color(255,255,255));
  add(lab4);

  txtf1 = new JTextField();
  txtf1.setBounds(45,240,255,25);
  txtf1.setBackground(new Color(224,224,224));
  txtf1.setFont(new Font("Montserrat", 1, 14));
  txtf1.setForeground(new Color(255,0,0));
  add(txtf1); 

  btn1 = new JButton("Ingresar");
  btn1.setBounds(125,280,100,30);
  btn1.setBackground(new Color(255,255,255));
  btn1.setFont(new Font("Montserrat", 1, 14));
  btn1.setForeground(new Color(255,0,0));
  btn1.addActionListener(this);
  add(btn1);

 }

 public void actionPerformed(ActionEvent e){

  if(e.getSource() == btn1){
   texto = txtf1.getText().trim();
   if(texto.equals("")){
    JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
   }else{
      Licencia form1 = new Licencia();
      form1.setBounds(0,0,615,370);
      form1.setVisible(true);
      form1.setResizable(false);
      form1.setLocationRelativeTo(null);
      this.setVisible(false);
   }
  }

 }

 public static void main(String args[]){

  Principal form1 = new Principal();
  form1.setBounds(0,0,370,450);
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setLocationRelativeTo(null);

 }
}