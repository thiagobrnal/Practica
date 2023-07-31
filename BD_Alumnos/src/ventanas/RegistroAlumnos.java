package ventanas;

import java.sql.*;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class RegistroAlumnos extends javax.swing.JFrame {

    public RegistroAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_grupo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbl_status = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Grupo");

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistar(evt);
            }
        });

        jLabel3.setText("Ingrese el codigo del alumno:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar(evt);
            }
        });

        lbl_status.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N

        btnReporte.setText("Generar Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1)
                    .addComponent(lbl_status)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar))
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReporte)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addGap(19, 19, 19)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnReporte))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(lbl_status)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistar

        try {
            //crea objeto Connection y paso la conexion usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_ins", "root", "12345678");
            //creo la query
            PreparedStatement st = con.prepareStatement("INSERT INTO `alumnos` VALUES(?,?,?)");

            st.setString(1, "0");
            st.setString(2, txt_nombre.getText().trim());
            st.setString(3, txt_grupo.getText().trim());
            //ejecuta la query en la bd
            st.executeUpdate();

            txt_nombre.setText("");
            txt_grupo.setText("");
            lbl_status.setText("Registro Exitoso.");
        } catch (SQLException e) {
            lbl_status.setText("Registro Fallido.");
            System.out.println("No se hizo conexion" + e);
        }
    }//GEN-LAST:event_btnRegistar

    private void btnBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar
        try {
            //crea objeto Connection y paso la conexion usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_ins", "root", "12345678");
            //creo la query
            PreparedStatement st = con.prepareStatement("SELECT * FROM `alumnos` WHERE ID = ?");

            st.setString(1, txt_id.getText().trim());

            //ejecuta la query en la bd
            ResultSet rs = st.executeQuery();

            //comparo lo que tengo en el txtf con lo de la bd
            if (rs.next()) {
                txt_nombre.setText(rs.getString("NombreAlumno"));
                txt_grupo.setText(rs.getString("Grupo"));
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no registrado");
            }

            btnRegistrar.setEnabled(false);
            btnModificar.setEnabled(true);
            btnEliminar.setEnabled(true);

        } catch (SQLException e) {
            System.out.println("No se hizo conexion" + e);
        }
    }//GEN-LAST:event_btnBuscar

    private void btnModificar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar

        try {

            String id = txt_id.getText().trim();

            //crea objeto Connection y paso la conexion usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_ins", "root", "12345678");
            //creo la query
            //actualiza el nombrealumno, grupo cuando id sea igual al id que se modifica
            PreparedStatement st = con.prepareStatement("UPDATE `alumnos` SET NombreAlumno = ?, Grupo = ? WHERE ID = " + id);

            st.setString(1, txt_nombre.getText().trim());
            st.setString(2, txt_grupo.getText().trim());

            //ejecuta la query en la bd
            st.executeUpdate();

            lbl_status.setText("Modificacion Exitosa");

        } catch (SQLException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnModificar

    private void btnEliminar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar

        try {

            //crea objeto Connection y paso la conexion usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_ins", "root", "12345678");
            //creo la query
            PreparedStatement st = con.prepareStatement("DELETE FROM `alumnos` WHERE ID = ?");

            st.setString(1, txt_id.getText().trim());

            //ejecuta la query en la bd
            st.executeUpdate();

            txt_nombre.setText("");
            txt_grupo.setText("");
            txt_id.setText("");

            lbl_status.setText("Registro eliminado");

        } catch (SQLException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnEliminar

    private void btnReporte(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte
        Document documento = new Document();

        try {

            //guarda el pdf en la ruta especificada
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_alumnos.pdf"));
            documento.open();

            //crea la tabla del pdf
            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell("Codigo");
            tabla.addCell("Nombre del alumno");
            tabla.addCell("Grupo");
            
            //se hace la conexion a la bd
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_ins", "root", "12345678");
                PreparedStatement st = con.prepareStatement("SELECT * FROM `alumnos`");
                
                ResultSet rs = st.executeQuery();
                
                if (rs.next()) {
                    
                    do {                        
                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        
                    } while (rs.next());
                    
                    documento.add(tabla);
                    
                }
            } catch (DocumentException | SQLException e) {
            }
            
            //Cierra el documento
            documento.close();
            
            JOptionPane.showMessageDialog(null, "Reporte creado");
            
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }//GEN-LAST:event_btnReporte

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txt_grupo.setText("");
        this.txt_nombre.setText("");
        this.txt_id.setText("");
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JTextField txt_grupo;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
