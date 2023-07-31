package vistas;

import modelo.*;

public class formularioAreas extends javax.swing.JInternalFrame {

    
    private Coatic c;
    
    public formularioAreas(Coatic c) {
        this.c=c;
        initComponents();
        this.lstAreas.setListData(this.c.getAreas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstAreas = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblCursos = new javax.swing.JLabel();

        setClosable(true);

        lstAreas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstAreas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                areaSeleccionada(evt);
            }
        });
        jScrollPane1.setViewportView(lstAreas);

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
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar))
                        .addGap(18, 18, 18)
                        .addComponent(lblCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (this.lstAreas.isSelectionEmpty()) {
            //crear un area
            this.c.crearArea(this.txtNombre.getText());
        }else{
            Area a = (Area)this.lstAreas.getSelectedValue();
            this.c.modificarArea(a, this.txtNombre.getText());
        }
        Limpiar();
    }//GEN-LAST:event_guardarArea

    private void eliminarArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarArea
         if (!this.lstAreas.isSelectionEmpty()){
             Area a = (Area)this.lstAreas.getSelectedValue();
             this.c.eliminarArea(a);
             Limpiar();
         }
    }//GEN-LAST:event_eliminarArea

    private void areaSeleccionada(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_areaSeleccionada
        if (!this.lstAreas.isSelectionEmpty()) {
            Area a = (Area) this.lstAreas.getSelectedValue();
            //Asigna los valores de los atributos a los componentes
            this.txtNombre.setText(a.getNombre());
            
            this.lblCursos.setText(a.getCursos().toString());
        }
    }//GEN-LAST:event_areaSeleccionada

    private void Limpiar(){
        //Limpiar las cajas de texto
        this.txtNombre.setText("");
        System.out.println("Refrescando...");
        Coatic.getPersistencia().refrescar(this.c);
        System.out.println("Actualizado...");
        this.lstAreas.setListData(this.c.getAreas().toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCursos;
    private javax.swing.JList lstAreas;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
