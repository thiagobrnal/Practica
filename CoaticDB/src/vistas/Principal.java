package vistas;

import modelo.*;
import javax.swing.*;
import java.awt.*;

public class Principal extends javax.swing.JFrame {

    private formularioAreas areaForm = null;
    private formularioCursos cursoForm = null;
    private formularioAlumnos alumnosForm = null;
    private Coatic coatic;
    
    public Principal(Coatic c) {
        this.coatic = c;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dPanel = new javax.swing.JDesktopPane() {
            ImageIcon icon = new ImageIcon("src\\images\\icon.jpg");
            Image image = icon.getImage();

            Image logo = image.getScaledInstance(392, 420, Image.SCALE_SMOOTH);

            @Override
            protected void paintComponent(Graphics g){

                super.paintComponent(g);
                g.drawImage(logo, 54, 10, this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAreas = new javax.swing.JMenuItem();
        jmiCursos = new javax.swing.JMenuItem();
        jmiAlumnos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Red CoaTic");
        setPreferredSize(new java.awt.Dimension(515, 500));
        setResizable(false);

        javax.swing.GroupLayout dPanelLayout = new javax.swing.GroupLayout(dPanel);
        dPanel.setLayout(dPanelLayout);
        dPanelLayout.setHorizontalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        dPanelLayout.setVerticalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jMenu1.setText("Coatic");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioAreas(evt);
            }
        });

        jmiAreas.setText("Areas");
        jmiAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioAreas(evt);
            }
        });
        jMenu1.add(jmiAreas);

        jmiCursos.setText("Cursos");
        jmiCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioCursos(evt);
            }
        });
        jMenu1.add(jmiCursos);

        jmiAlumnos.setText("Alumnos");
        jmiAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioAlumnos(evt);
            }
        });
        jMenu1.add(jmiAlumnos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formularioAreas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioAreas
        if (areaForm == null || areaForm.isClosed()) {
            areaForm = new formularioAreas(coatic);
            this.dPanel.add(areaForm);
            
        }
        areaForm.setVisible(true);
    }//GEN-LAST:event_formularioAreas

    private void formularioCursos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioCursos
        if (cursoForm == null || cursoForm.isClosed()) {
            cursoForm = new formularioCursos(coatic);
            this.dPanel.add(cursoForm);
            
        }
        cursoForm.setVisible(true);
    }//GEN-LAST:event_formularioCursos

    private void formularioAlumnos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioAlumnos
        if (alumnosForm == null || alumnosForm.isClosed()) {
            alumnosForm = new formularioAlumnos(coatic);
            this.dPanel.add(alumnosForm);
            
        }
        alumnosForm.setVisible(true);
    }//GEN-LAST:event_formularioAlumnos


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiAlumnos;
    private javax.swing.JMenuItem jmiAreas;
    private javax.swing.JMenuItem jmiCursos;
    // End of variables declaration//GEN-END:variables
}
