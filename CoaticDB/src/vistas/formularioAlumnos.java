package vistas;

import modelo.*;

public class formularioAlumnos extends javax.swing.JInternalFrame {

    
    private Coatic c;
    
    public formularioAlumnos(Coatic c) {
        this.c=c;
        initComponents();
        this.lstAlumnos.setListData(this.c.getAreas().toArray());
        
        for(Curso cu : this.c.getCursos())
        this.cmbCursos.addItem(cur);
        
        this.cmbCursos.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstAlumnos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblCursos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbCursos = new javax.swing.JComboBox();
        btnInscribir = new javax.swing.JButton();

        setClosable(true);

        lstAlumnos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstAlumnos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                alumnoSeleccionada(evt);
            }
        });
        jScrollPane1.setViewportView(lstAlumnos);

        jLabel1.setText("Nombre");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoArea(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarArea(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarArea(evt);
            }
        });

        lblCursos.setBackground(new java.awt.Color(0, 0, 0));
        lblCursos.setForeground(new java.awt.Color(255, 255, 255));
        lblCursos.setToolTipText("");
        lblCursos.setOpaque(true);

        jLabel2.setText("Cursos");

        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirnuevoArea(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInscribir)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(btnEliminar))
                            .addComponent(cmbCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar))
                        .addGap(18, 18, 18)
                        .addComponent(lblCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInscribir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoArea
        Limpiar();
    }//GEN-LAST:event_nuevoArea

    private void guardarArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarArea
        //Para verificar si hay algo seleccionado en mi lista
        if (this.lstAlumnos.isSelectionEmpty()) {
            //crear un area
            this.c.crearAlumno(this.txtNombre.getText());
        }else{
             Alumno al = (Alumno) this.lstAlumnos.getSelectedValue();
            this.c.modificarAlumno(al, this.txtNombre.getText());
        }
        Limpiar();
    }//GEN-LAST:event_guardarArea

    private void eliminarArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarArea
         if (!this.lstAlumnos.isSelectionEmpty()){
              Alumno al = (Alumno) this.lstAlumnos.getSelectedValue();
             this.c.eliminarAlumno(al);
             Limpiar();
         }
    }//GEN-LAST:event_eliminarArea

    private void alumnoSeleccionada(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_alumnoSeleccionada
        if (!this.lstAlumnos.isSelectionEmpty()) {
            Alumno al = (Alumno) this.lstAlumnos.getSelectedValue();
            //Asigna los valores de los atributos a los componentes
            this.txtNombre.setText(al.getNombre());
            
            this.lblCursos.setText(al.getCursos().toString());
        }
    }//GEN-LAST:event_alumnoSeleccionada

    private void btnInscribirnuevoArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirnuevoArea
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInscribirnuevoArea

    private void Limpiar(){
        //Limpiar las cajas de texto
        this.txtNombre.setText("");
        System.out.println("Refrescando...");
        Coatic.getPersistencia().refrescar(this.c);
        System.out.println("Actualizado...");
        this.lstAlumnos.setListData(this.c.getAreas().toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCursos;
    private javax.swing.JList lstAlumnos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
