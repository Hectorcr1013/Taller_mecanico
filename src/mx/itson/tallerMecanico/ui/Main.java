/**
 * Paquete utilizado para utilizar cualquier tipo de java swing
 */
package mx.itson.tallerMecanico.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import mx.itson.tallerMecanico.entidades.*;

/**
 * Esta es el JFrame principal en el que se mostraran todos los paneles
 * @author Hector
 */
public class Main extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        LocalDate hoy = LocalDate.now();
        int anio = hoy.getYear();
        int dia = hoy.getDayOfMonth();
        int mes = hoy.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre",
             "Octubre", "Noviembre", "Diciemrbre"};
        lblFecha.setText("Hoy es " + dia + " de " + meses[mes - 1] + " de " + anio);
        
        Ingreso p1 = new Ingreso();
        p1.setSize(1010, 450);
        p1.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p1, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlIngreso = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlReparacion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlArreglados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlBarra = new javax.swing.JPanel();
        pnlSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pnlJFrames = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 71, 161));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/tallerMecanico/imagenes/logo_cars_2_250x210.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 210));

        pnlIngreso.setBackground(new java.awt.Color(21, 101, 192));
        pnlIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlIngresoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlIngresoMouseExited(evt);
            }
        });
        pnlIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/tallerMecanico/imagenes/entrar.png"))); // NOI18N
        pnlIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingreso a taller");
        pnlIngreso.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 40));

        jPanel1.add(pnlIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 60));

        pnlReparacion.setBackground(new java.awt.Color(18, 90, 173));
        pnlReparacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlReparacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReparacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlReparacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlReparacionMouseExited(evt);
            }
        });
        pnlReparacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/tallerMecanico/imagenes/configuraciones.png"))); // NOI18N
        pnlReparacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("En reparación");
        pnlReparacion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 40));

        jPanel1.add(pnlReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 270, 60));

        pnlArreglados.setBackground(new java.awt.Color(18, 90, 173));
        pnlArreglados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlArreglados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlArregladosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlArregladosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlArregladosMouseExited(evt);
            }
        });
        pnlArreglados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/tallerMecanico/imagenes/reparacion-de-la-casa.png"))); // NOI18N
        pnlArreglados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Arreglados");
        pnlArreglados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 40));

        jPanel1.add(pnlArreglados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 270, 60));

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 720));

        pnlBarra.setBackground(new java.awt.Color(255, 255, 255));
        pnlBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBarraMouseDragged(evt);
            }
        });
        pnlBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBarraMousePressed(evt);
            }
        });

        pnlSalir.setBackground(new java.awt.Color(255, 255, 255));

        lblSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 0, 0));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("x");
        lblSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlSalirLayout = new javax.swing.GroupLayout(pnlSalir);
        pnlSalir.setLayout(pnlSalirLayout);
        pnlSalirLayout.setHorizontalGroup(
            pnlSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        pnlSalirLayout.setVerticalGroup(
            pnlSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBarraLayout = new javax.swing.GroupLayout(pnlBarra);
        pnlBarra.setLayout(pnlBarraLayout);
        pnlBarraLayout.setHorizontalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraLayout.createSequentialGroup()
                .addGap(0, 1250, Short.MAX_VALUE)
                .addComponent(pnlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBarraLayout.setVerticalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addComponent(pnlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        Fondo.add(pnlBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        jPanel2.setBackground(new java.awt.Color(25, 118, 210));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Hoy es 03 de noviembre del 2022");
        jPanel2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Taller Automotriz");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 62, 240, 29));

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 1010, 180));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Fondo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 286, 270, 60));

        pnlJFrames.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlJFramesLayout = new javax.swing.GroupLayout(pnlJFrames);
        pnlJFrames.setLayout(pnlJFramesLayout);
        pnlJFramesLayout.setHorizontalGroup(
            pnlJFramesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        pnlJFramesLayout.setVerticalGroup(
            pnlJFramesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Fondo.add(pnlJFrames, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 1010, 450));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Remate solo por hoy cualquier falla a solo $1000");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 1010, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_pnlBarraMousePressed

    private void pnlBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-xMouse,y-yMouse);
        
    }//GEN-LAST:event_pnlBarraMouseDragged

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        pnlSalir.setBackground(Color.white);
        lblSalir.setForeground(Color.black);
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        pnlSalir.setBackground(Color.red);
        lblSalir.setForeground(Color.white);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void pnlIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresoMouseEntered
        if(pnlIngreso.getBackground().getRGB() == -15574355)
            Auto.setColor(pnlIngreso);
    }//GEN-LAST:event_pnlIngresoMouseEntered

    private void pnlReparacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReparacionMouseEntered
        if(pnlReparacion.getBackground().getRGB() == -15574355)
            Auto.setColor(pnlReparacion);
    }//GEN-LAST:event_pnlReparacionMouseEntered

    private void pnlArregladosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlArregladosMouseEntered
        if(pnlArreglados.getBackground().getRGB() == -15574355)
            Auto.setColor(pnlArreglados);
    }//GEN-LAST:event_pnlArregladosMouseEntered

    private void pnlIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresoMouseExited
        if(pnlReparacion.getBackground().getRGB() != -15574355 || pnlArreglados.getBackground().getRGB() != -15574355)
            Auto.resetColor(pnlIngreso);
    }//GEN-LAST:event_pnlIngresoMouseExited

    private void pnlReparacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReparacionMouseExited
        if(pnlIngreso.getBackground().getRGB() != -15574355 || pnlArreglados.getBackground().getRGB() != -15574355)
            Auto.resetColor(pnlReparacion);
    }//GEN-LAST:event_pnlReparacionMouseExited

    private void pnlArregladosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlArregladosMouseExited
        if(pnlIngreso.getBackground().getRGB() != -15574355 || pnlReparacion.getBackground().getRGB() != -15574355)
            Auto.resetColor(pnlArreglados);
    }//GEN-LAST:event_pnlArregladosMouseExited

    private void pnlIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresoMouseClicked
        
        Auto.setColor(pnlIngreso);
        Auto.resetColor(pnlReparacion);
        Auto.resetColor(pnlArreglados);
        
        Ingreso p1 = new Ingreso();
        p1.setSize(1010, 450);
        p1.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p1, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
    }//GEN-LAST:event_pnlIngresoMouseClicked

    private void pnlReparacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReparacionMouseClicked
        
        Auto.setColor(pnlReparacion);
        Auto.resetColor(pnlIngreso);
        Auto.resetColor(pnlArreglados);
        
        Reparacion p2 = new Reparacion();
        p2.setSize(1010, 450);
        p2.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p2, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
    }//GEN-LAST:event_pnlReparacionMouseClicked

    private void pnlArregladosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlArregladosMouseClicked
        Auto.setColor(pnlArreglados);
        Auto.resetColor(pnlIngreso);
        Auto.resetColor(pnlReparacion);
        
        Arreglado p3 = new Arreglado();
        p3.setSize(1010, 450);
        p3.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p3, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
    }//GEN-LAST:event_pnlArregladosMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblSalir;
    public static javax.swing.JPanel pnlArreglados;
    private javax.swing.JPanel pnlBarra;
    public static javax.swing.JPanel pnlIngreso;
    public static javax.swing.JPanel pnlJFrames;
    public static javax.swing.JPanel pnlReparacion;
    private javax.swing.JPanel pnlSalir;
    // End of variables declaration//GEN-END:variables
}
