package vistas;

import modelo.*;

public class formularioCursos extends javax.swing.JInternalFrame {

    
    private Coatic c;
    
    public formularioCursos(Coatic c) {
        this.c=c;
        initComponents();
        this.lstCursos.setListData(this.c.getCursos().toArray());
        
        for(Area a : this.c.getAreas())
            this.cmbAreas.addItem(a);
        
        this.cmbAreas.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstCursos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbAreas = new javax.swing.JComboBox();
        lblAlumnos = new javax.swing.JLabel();

        setClosable(true);

        lstCursos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCursos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                cursoSeleccionado(evt);
            }
        });
        jScrollPane1.setViewportView(lstCursos);

        jLabel1.setText("Nombre");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoCurso(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCurso(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCurso(evt);
            }
        });

        jLabel2.setText("Area");

        lblAlumnos.setBackground(new java.awt.Color(0, 0, 0));
        lblAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        lblAlumnos.setToolTipText("");
        lblAlumnos.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addComponent(cmbAreas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoCurso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoCurso
        Limpiar();
    }//GEN-LAST:event_nuevoCurso

    private void guardarCurso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCurso
        //Para verificar si hay algo seleccionado en mi lista
        if (this.lstCursos.isSelectionEmpty()) {
            //crear un area
            this.c.crearCurso(this.txtNombre.getText(), (Area)this.cmbAreas.getSelectedItem());
        }else{
            Curso cu = (Curso)this.lstCursos.getSelectedValue();
            this.c.modificarCurso(cu, this.txtNombre.getText(),(Area)this.cmbAreas.getSelectedItem());
        }
        Limpiar();
    }//GEN-LAST:event_guardarCurso

    private void eliminarCurso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCurso
         if (!this.lstCursos.isSelectionEmpty()){
             Curso cu = (Curso)this.lstCursos.getSelectedValue();
             this.c.eliminarCurso(cu);
             Limpiar();
         }
    }//GEN-LAST:event_eliminarCurso

    private void cursoSeleccionado(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_cursoSeleccionado
        if (!this.lstCursos.isSelectionEmpty()) {
            Curso cu = (Curso) this.lstCursos.getSelectedValue();
            //Asigna los valores de los atributos a los componentes
            this.txtNombre.setText(cu.getNombre());
            
            this.cmbAreas.setSelectedItem(cu.getArea());
            this.lblAlumnos.setText(cu.getAlumnos().toString());
        }
    }//GEN-LAST:event_cursoSeleccionado

    private void Limpiar(){
        //Limpiar las cajas de texto
        this.txtNombre.setText("");
        this.cmbAreas.setSelectedItem(null);
        System.out.println("Refrescando...");
        Coatic.getPersistencia().refrescar(this.c);
        System.out.println("Actualizado...");
        this.lstCursos.setListData(this.c.getCursos().toArray());
        this.lstCursos.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbAreas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlumnos;
    private javax.swing.JList lstCursos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
