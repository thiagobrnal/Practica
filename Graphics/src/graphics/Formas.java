
package graphics;

import java.awt.Color;
import java.awt.Graphics;


public class Formas extends javax.swing.JFrame {

    
    public Formas() {
        initComponents();
        this.setBounds(0,0,600,400);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(Formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void paint(Graphics g){
        super.paint(g);
        
        //Defino el color de la linea
        g.setColor(Color.BLUE);
        //Dibujo una linea desde la cord (0;70) hasta(100;70)
        g.drawLine(0, 70, 100, 70);
        
        //Dibujar un recrangulo cord (150;70)de donde empieza el rectangulo y (50;70) el alto y ancho del rectangulo
        g.drawRect(150, 70, 50, 70);
        //Dibujar un rectangulo con los bordes redondeados, los ultimos dos parametros son el redondeo de los vertices del rectangulo
        g.drawRoundRect(250, 70, 50, 70, 6, 6);
        
        //Dibuja un ovalo
        g.drawOval(350, 70, 50, 70);
        
        //para dibujar un triangulo se necesitan vectores
        //definimos desde donde empieza el triangulo hasta donde termina
        int vectorX [] = {500, 550, 450};
        int vectorY [] = {70, 120, 120};
        //3 es la cantidad de lineas
        g.drawPolygon(vectorX, vectorY, 3);
        
        
        //Rellena la figura geometrica
        g.setColor(Color.YELLOW);
        g.fillRect(150, 270, 50, 70);
        g.fillRoundRect(250, 270, 50, 70, 6, 6);
        g.fillOval(350, 270, 50, 70);
        
        int vectorX2 [] = {500, 550, 450};
        int vectorY2 [] = {270, 320, 320};
        g.fillPolygon(vectorX2, vectorY2,3);
    }

}
