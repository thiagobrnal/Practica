import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Funciones extends JFrame implements ActionListener, ItemListener{

 private JLabel lab1, lab2, lab3, lab4, lab5, lab6, lab7, lab8, lab9;
 private JMenuBar menuBar;
 private JMenu menuOpc, menuFunc, menuInfo, menuColor;
 private JMenuItem item1, item2, item3, item4, item5, item6, item7;
 private JTextField txtf1, txtf2, txtf3;
 private JComboBox combo1, combo2;
 private JTextArea txta1;
 private JScrollPane scroll1;

 public Funciones(){
  setLayout(null);

  setTitle("Sistema Vacacional");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

 //Menus y Submenus

  menuBar = new JMenuBar();
  setJMenuBar(menuBar);

  menuOpc = new JMenu("Opciones");
  menuBar.add(menuOpc);

  menuColor = new JMenu("Color de fondo");
  menuOpc.add(menuColor);

  menuFunc = new JMenu("Calcular");
  menuBar.add(menuFunc);

  menuInfo = new JMenu("Acerca de");
  menuBar.add(menuInfo);

  item1 = new JMenuItem("Coca-Cola");
  menuColor.add(item1);
  item1.addActionListener(this);

  item2 = new JMenuItem("Claro");
  menuColor.add(item2);
  item2.addActionListener(this);

  item3 = new JMenuItem("Oscuro");
  menuColor.add(item3);
  item3.addActionListener(this);

  item4 = new JMenuItem("Calcular");
  menuFunc.add(item4);
  item4.addActionListener(this);

  item5 = new JMenuItem("Acerca de");
  menuInfo.add(item5);
  item5.addActionListener(this);

  item6 = new JMenuItem("Nuevo");
  menuOpc.add(item6);
  item6.addActionListener(this);

  item7 = new JMenuItem("Salir");
  menuOpc.add(item7);
  item7.addActionListener(this);

  //fin menus y submenus

  //Label
  ImageIcon image = new ImageIcon("images/coca-cola.png");
  lab1 = new JLabel(image);
  lab1.setBounds(150,10,300,100);
  add(lab1);

  lab2 = new JLabel("Bienvenido");
  lab2.setBounds(248,100,300,30);
  lab2.setFont(new Font("Montserrat", 1, 18));
  lab2.setForeground(new Color(0,0,0));
  add(lab2);

  lab3 = new JLabel("Datos del trabajador para el cálculo de vacaciones");
  lab3.setBounds(75,125,450,30);
  lab3.setFont(new Font("Montserrat", 3, 16));
  lab3.setForeground(new Color(0,0,0));
  add(lab3);

  //Label y textfield
  lab4 = new JLabel("Nombre Completo");
  lab4.setBounds(20,165,200,30);
  lab4.setFont(new Font("Montserrat", 3, 12));
  lab4.setForeground(new Color(0,0,0));
  add(lab4);

  txtf1 = new JTextField();
  txtf1.setBounds(20,190,200,30);
  add(txtf1);

  lab5 = new JLabel("Apellido Paterno");
  lab5.setBounds(20,230,200,30);
  lab5.setFont(new Font("Montserrat", 3, 12));
  lab5.setForeground(new Color(0,0,0));
  add(lab5);

  txtf2 = new JTextField();
  txtf2.setBounds(20,255,200,30);
  add(txtf2);

  lab6 = new JLabel("Apellido Materno");
  lab6.setBounds(20,295,200,30);
  lab6.setFont(new Font("Montserrat", 3, 12));
  lab6.setForeground(new Color(0,0,0));
  add(lab6);

  txtf3 = new JTextField();
  txtf3.setBounds(20,320,200,30);
  add(txtf3);

  //combobox
  lab7 = new JLabel("Selecciona el Departamento");
  lab7.setBounds(250,165,200,30);
  lab7.setFont(new Font("Montserrat", 3, 12));
  lab7.setForeground(new Color(0,0,0));
  add(lab7);

  combo1 = new JComboBox();
  combo1.setBounds(250,190,160,25);
  add(combo1);

  combo1.addItem("");
  combo1.addItem("Atención al cliente");
  combo1.addItem("Logística");
  combo1.addItem("Gerentes");
  combo1.addItemListener(this);

  lab8 = new JLabel("Selecciona la Antiguedad");
  lab8.setBounds(250,230,200,30);
  lab8.setFont(new Font("Montserrat", 3, 12));
  lab8.setForeground(new Color(0,0,0));
  add(lab8);

  combo2 = new JComboBox();
  combo2.setBounds(250,255,160,25);
  add(combo2);

  combo2.addItem("");
  combo2.addItem("1 año");
  combo2.addItem("2 a 6 años");
  combo2.addItem("7 años");
  combo2.addItemListener(this);
  //fin combobox
  
  //textarea scrollpane

  lab9 = new JLabel("Resultado del cálculo");
  lab9.setBounds(250,295,200,30);
  lab9.setFont(new Font("Montserrat", 3, 12));
  lab9.setForeground(new Color(0,0,0));
  add(lab9);

  txta1 = new JTextArea();
  txta1.setEditable(false);
  txta1.setFont(new Font("Montserrat", 1, 10));
  txta1.setText("\n Aquí aparece el resultado del cálculo de las vacaciones.");
  txta1.setForeground(new Color(100,100,100));
  scroll1 = new JScrollPane(txta1);
  scroll1.setBounds(250,320,320,100);
  add(scroll1);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == item1){
   
  }
  if(e.getSource() == item2){
   
  }
  if(e.getSource() == item3){
   
  }
  if(e.getSource() == item4){
   
  }
  if(e.getSource() == item5){
   
  }
  if(e.getSource() == item6){
   txtf1.setText("");
   txtf2.setText("");
   txtf3.setText("");
   combo1.setSelectedIndex(-1);
   combo2.setSelectedIndex(-1);
  }
  if(e.getSource() == item7){
   System.exit(0);
  }
 }

 public void itemStateChanged(ItemEvent e){
  if(e.getSource() == combo1){
    
  }
  if(e.getSource() == combo2){
    
  }
 }

  public static void main(String args[]){

  Funciones form1 = new Funciones();
  form1.setBounds(0,0,615,500);
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setLocationRelativeTo(null);

 }
}