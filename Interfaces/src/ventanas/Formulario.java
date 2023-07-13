
package ventanas;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
    
    private JTextField txtf1;
    private JLabel lab1;
    private JButton btn1;
    
    public Formulario(){
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        lab1 = new JLabel("Mensaje");
        lab1.setBounds(15, 10, 100, 30);
        add(lab1);
        
        txtf1 = new JTextField();
        txtf1.setBounds(80, 16, 190, 20);
        add(txtf1);
        
        btn1 = new JButton("Mostrar");
        btn1.setBounds(10, 60, 100, 30);
        add(btn1);
        btn1.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (btn1 == e.getSource()) {
            String cadena = txtf1.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
        
    }
    
    public static void main(String[] args) {
        Formulario form1 = new Formulario();
        form1.setVisible(true);
        form1.setBounds(0, 0, 300, 150);
        form1.setLocationRelativeTo(null);
        form1.setTitle("Formulario");
    }
}