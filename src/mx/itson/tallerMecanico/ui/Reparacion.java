/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.tallerMecanico.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import mx.itson.tallerMecanico.entidades.Logica;

/**
 *
 * @author Hector
 */
public class Reparacion extends javax.swing.JPanel {
    
    /**
     * Creates new form Reparacion
     */
    public Reparacion() {
        initComponents();
        
        Logica logica = new Logica();
        logica.mostrarTablaReparacion();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReparacion = new javax.swing.JTable();
        pnlAgregar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlEliminar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlModificar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlReparado = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Autos en reparación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/tallerMecanico/imagenes/logo_cars_2_250x210_1_100x80.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 100, 80));

        tblReparacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "marca", "modelo", "año", "color", "combustible", "detalle"
            }
        ));
        jScrollPane1.setViewportView(tblReparacion);
        if (tblReparacion.getColumnModel().getColumnCount() > 0) {
            tblReparacion.getColumnModel().getColumn(0).setMaxWidth(50);
            tblReparacion.getColumnModel().getColumn(1).setMaxWidth(80);
            tblReparacion.getColumnModel().getColumn(2).setMaxWidth(80);
            tblReparacion.getColumnModel().getColumn(3).setMaxWidth(80);
            tblReparacion.getColumnModel().getColumn(4).setMaxWidth(80);
            tblReparacion.getColumnModel().getColumn(5).setMinWidth(80);
            tblReparacion.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 720, 320));

        pnlAgregar.setBackground(new java.awt.Color(18, 90, 173));
        pnlAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAgregarMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agregar auto");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlAgregarLayout = new javax.swing.GroupLayout(pnlAgregar);
        pnlAgregar.setLayout(pnlAgregarLayout);
        pnlAgregarLayout.setHorizontalGroup(
            pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        pnlAgregarLayout.setVerticalGroup(
            pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(pnlAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 170, 50));

        pnlEliminar.setBackground(new java.awt.Color(18, 90, 173));
        pnlEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlEliminarMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Eliminar");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlEliminarLayout = new javax.swing.GroupLayout(pnlEliminar);
        pnlEliminar.setLayout(pnlEliminarLayout);
        pnlEliminarLayout.setHorizontalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        pnlEliminarLayout.setVerticalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(pnlEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, -1, -1));

        pnlModificar.setBackground(new java.awt.Color(18, 90, 173));
        pnlModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlModificarMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Modificar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlModificarLayout = new javax.swing.GroupLayout(pnlModificar);
        pnlModificar.setLayout(pnlModificarLayout);
        pnlModificarLayout.setHorizontalGroup(
            pnlModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        pnlModificarLayout.setVerticalGroup(
            pnlModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(pnlModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, -1, -1));

        pnlReparado.setBackground(new java.awt.Color(18, 90, 173));
        pnlReparado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlReparadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlReparadoMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reparado");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlReparadoLayout = new javax.swing.GroupLayout(pnlReparado);
        pnlReparado.setLayout(pnlReparadoLayout);
        pnlReparadoLayout.setHorizontalGroup(
            pnlReparadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        pnlReparadoLayout.setVerticalGroup(
            pnlReparadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(pnlReparado, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAgregarMouseEntered
        pnlAgregar.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_pnlAgregarMouseEntered

    private void pnlAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAgregarMouseExited
        pnlAgregar.setBackground(new Color(18,90,173));
    }//GEN-LAST:event_pnlAgregarMouseExited

    private void pnlEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEliminarMouseEntered
        pnlEliminar.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_pnlEliminarMouseEntered

    private void pnlEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEliminarMouseExited
        pnlEliminar.setBackground(new Color(18,90,173));
    }//GEN-LAST:event_pnlEliminarMouseExited

    private void pnlModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModificarMouseEntered
        pnlModificar.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_pnlModificarMouseEntered

    private void pnlModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModificarMouseExited
        pnlModificar.setBackground(new Color(18,90,173));
    }//GEN-LAST:event_pnlModificarMouseExited

    private void pnlReparadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReparadoMouseEntered
        pnlReparado.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_pnlReparadoMouseEntered

    private void pnlReparadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReparadoMouseExited
        pnlReparado.setBackground(new Color(18,90,173));
    }//GEN-LAST:event_pnlReparadoMouseExited

    private void pnlAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAgregarMouseClicked
        Logica.setColor(Main.pnlIngreso);
        Logica.resetColor(Main.pnlReparacion);
        Logica.resetColor(Main.pnlArreglados);
        
        Ingreso p1 = new Ingreso();
        p1.setSize(1010, 450);
        p1.setLocation(0,0);
        
        Main.pnlJFrames.removeAll();
        Main.pnlJFrames.add(p1, BorderLayout.CENTER);
        Main.pnlJFrames.revalidate();
        Main.pnlJFrames.repaint();
    }//GEN-LAST:event_pnlAgregarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlAgregar;
    private javax.swing.JPanel pnlEliminar;
    private javax.swing.JPanel pnlModificar;
    private javax.swing.JPanel pnlReparado;
    public static javax.swing.JTable tblReparacion;
    // End of variables declaration//GEN-END:variables
}
