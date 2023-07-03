import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
 
public class Licencia extends JFrame implements ActionListener, ChangeListener{

 private JTextArea txta1;
 private JButton btn1,btn2;
 private JCheckBox box1;
 private JScrollPane scroll1;
 private JLabel lab1, lab2;

 public Licencia(){
  setLayout(null);

  setTitle("Licencia de uso");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  lab1 = new JLabel("TÉRMINOS Y CONDICIONES");
  lab1.setBounds(190,5,300,30);
  lab1.setFont(new Font("Montserrat", 1, 16));
  lab1.setForeground(new Color(0,0,0));
  add(lab1);

  txta1 = new JTextArea();
  txta1.setEditable(false);
  txta1.setFont(new Font("Montserrat", 1, 9));
  txta1.setText("\n\n          TÉRMINOS Y CONDICIONES"+
                 "\n\n         A - No beba dentro del salón."+
                   "\n         B - No fume dentro del recinto.");
  txta1.setForeground(new Color(100,100,100));
  scroll1 = new JScrollPane(txta1);
  scroll1.setBounds(10,40,580,200);
  add(scroll1);

  box1 = new JCheckBox("Acepto");
  box1.setBounds(10,250,300,30);
  box1.addChangeListener(this);
  add(box1);

  btn1 = new JButton("Continuar");
  btn1.setBounds(10,290,100,30);
  btn1.addActionListener(this);
  add(btn1);
  btn1.setEnabled(false);

  btn2 = new JButton("No acepto");
  btn2.setBounds(120,290,100,30);
  btn2.addActionListener(this);
  add(btn2);
  btn2.setEnabled(true);

  ImageIcon image = new ImageIcon("images/coca-cola.png");
  lab2 = new JLabel(image);
  lab2.setBounds(315,135,300,300);
  add(lab2);
 }

 public void actionPerformed(ActionEvent e){

  if(e.getSource() == btn1){
     System.exit(0);
  }

 }

 public void stateChanged(ChangeEvent e){

  if(box1.isSelected() == true){
   btn1.setEnabled(true);
  }else{
   btn1.setEnabled(false);
  }

 }
  
 public static void main(String args[]){

  Licencia form1 = new Licencia();
  form1.setBounds(0,0,615,370);
  form1.setVisible(true);
  form1.setResizable(false);
  form1.setLocationRelativeTo(null);

 }
}