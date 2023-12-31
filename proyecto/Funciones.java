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
 String nombreAdmin = "";

 public Funciones(){
  setLayout(null);

  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Sistema Vacacional");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  Principal ventanaBienvenida = new Principal();
  nombreAdmin = ventanaBienvenida.texto;

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
  ImageIcon image = new ImageIcon("images/logo-cocan.png");
  lab1 = new JLabel(image);
  lab1.setBounds(150,10,300,100);
  add(lab1);

  lab2 = new JLabel("Bienvenido "+ nombreAdmin);
  lab2.setBounds(185,100,300,30);
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
  txta1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
  txta1.setForeground(new Color(100,100,100));
  scroll1 = new JScrollPane(txta1);
  scroll1.setBounds(250,320,320,100);
  add(scroll1);
 }

 public void actionPerformed(ActionEvent e){

  Container contentPane = getContentPane();

  if(e.getSource() == item1){
   contentPane.setBackground(new Color(212,0,48));
   lab3.setForeground(new Color(255,255,255));
   lab4.setForeground(new Color(255,255,255));
   lab5.setForeground(new Color(255,255,255));
   lab6.setForeground(new Color(255,255,255));
   lab7.setForeground(new Color(255,255,255));
   lab8.setForeground(new Color(255,255,255));
   lab9.setForeground(new Color(255,255,255));

  }
  if(e.getSource() == item2){
   contentPane.setBackground(new Color(240,240,240));
   lab3.setForeground(new Color(0,0,0));
   lab4.setForeground(new Color(0,0,0));
   lab5.setForeground(new Color(0,0,0));
   lab6.setForeground(new Color(0,0,0));
   lab7.setForeground(new Color(0,0,0));
   lab8.setForeground(new Color(0,0,0));
   lab9.setForeground(new Color(0,0,0));
  }
  if(e.getSource() == item3){
   contentPane.setBackground(new Color(102,0,161));
   lab3.setForeground(new Color(255,255,255));
   lab4.setForeground(new Color(255,255,255));
   lab5.setForeground(new Color(255,255,255));
   lab6.setForeground(new Color(255,255,255));
   lab7.setForeground(new Color(255,255,255));
   lab8.setForeground(new Color(255,255,255));
   lab9.setForeground(new Color(255,255,255));
  }
  if(e.getSource() == item4){
   String nombreTrabajador = txtf1.getText();
   String aP = txtf2.getText();
   String aM = txtf3.getText();
   String dep = combo1.getSelectedItem().toString();
   String antiguedad = combo2.getSelectedItem().toString();
   
   if(nombreTrabajador.equals("") || aP.equals("") || aM.equals("") || dep.equals("") || antiguedad.equals("")){

    JOptionPane.showMessageDialog(null, "Debes rellenar los campos");

   }else{

    if(dep.equals("Atención al cliente")){
 
      if(antiguedad.equals("1 año")){
      	txta1.setText("\n   El trabajador "+nombreTrabajador+" "+aP+" "+aM+
        	      "\n   quien trabaja en "+dep+" con "+antiguedad+" de servicio"+
                      "\n   recibe 6 días de vacaciones.");
      }    
 
      if(antiguedad.equals("2 a 6 años")){
      	txta1.setText("\n   El trabajador "+nombreTrabajador+" "+aP+" "+aM+
        	      "\n   quien trabaja en "+dep+" con "+antiguedad+" de servicio"+
                      "\n   recibe 14 días de vacaciones.");
      }  

      if(antiguedad.equals("7 años")){
      	txta1.setText("\n   El trabajador "+nombreTrabajador+" "+aP+" "+aM+
        	      "\n   quien trabaja en "+dep+" con "+antiguedad+" de servicio"+
                      "\n   recibe 20 días de vacaciones.");
      }  
    }

    if(dep.equals("Logística")){
 
      if(antiguedad.equals("1 año")){
      	txta1.setText("\n   El trabajador "+nombreTrabajador+" "+aP+" "+aM+
        	      "\n   quien trabaja en "+dep+" con "+antiguedad+" de servicio"+
                      "\n   recibe 7 días de vacaciones.");
      }    
 
      if(antiguedad.equals("2 a 6 años")){
      	txta1.setText("\n   El trabajador "+nombreTrabajador+" "+aP+" "+aM+
        	      "\n   quien trabaja en "+dep+" con "+antiguedad+" de servicio"+
                      "\n   recibe 15 días de vacaciones.");
      }  

      if(antiguedad.equals("7 años")){
      	txta1.setText("\n   El trabajador "+nombreTrabajador+" "+aP+" "+aM+
        	      "\n   quien trabaja en "+dep+" con "+antiguedad+" de servicio"+
                      "\n   recibe 22 días de vacaciones.");
      }  
    }

    if(dep.equals("Gerentes")){
 
      if(antiguedad.equals("1 año")){
      	txta1.setText("\n   El trabajador "+nombreTrabajador+" "+aP+" "+aM+
        	      "\n   quien trabaja en "+dep+" con "+antiguedad+" de servicio"+
                      "\n   recibe 10 días de vacaciones.");
      }    
 
      if(antiguedad.equals("2 a 6 años")){
      	txta1.setText("\n   El trabajador "+nombreTrabajador+" "+aP+" "+aM+
        	      "\n   quien trabaja en "+dep+" con "+antiguedad+" de servicio"+
                      "\n   recibe 20 días de vacaciones.");
      }  

      if(antiguedad.equals("7 años")){
      	txta1.setText("\n   El trabajador "+nombreTrabajador+" "+aP+" "+aM+
        	      "\n   quien trabaja en "+dep+" con "+antiguedad+" de servicio"+
                      "\n   recibe 30 días de vacaciones.");
      }  
    }

   }
  }
  if(e.getSource() == item5){
        JOptionPane.showMessageDialog(null, "Hecho por BlockWizard");
  }
  if(e.getSource() == item6){
   txtf1.setText("");
   txtf2.setText("");
   txtf3.setText("");
   combo1.setSelectedIndex(0);
   combo2.setSelectedIndex(0);
   txta1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
  }
  if(e.getSource() == item7){
   Principal form1 = new Principal();
   form1.setBounds(0,0,370,450);
   form1.setVisible(true);
   form1.setResizable(false);
   form1.setLocationRelativeTo(null);
   this.setVisible(false);
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