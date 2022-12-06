/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.tallerMecanico.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import mx.itson.tallerMecanico.entidades.Auto;

/**
 *
 * @author Hector
 */
public class Ingreso2 extends javax.swing.JPanel {

    int id;
    
    /**
     * 
     * @param modal
     * @param idArreglado 
     */
    public Ingreso2( boolean modal, int idArreglado) {
        initComponents();
        
        this.id = idArreglado;
        if(id != 0){
            Auto auto = Auto.obtenerPorIdArreglado(idArreglado);
            txfMarca.setText(auto.getMarca());
            txfModelo.setText(auto.getModelo());
            txfAnio.setText(Integer.toString(auto.getAnio()));
            txfColor.setText(auto.getColor());
            cbxCombustible.setSelectedItem(auto.getCombustible());
            txfDetalle.setText(auto.getDetalle());
        }
    }
    
    
    /**
     * 
     */
    public Ingreso2(){
        initComponents();
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfModelo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txfAnio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txfMarca = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txfColor = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cbxCombustible = new javax.swing.JComboBox<>();
        pnlIngreso = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txfDetalle = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/tallerMecanico/imagenes/logo_cars_2_250x210_1_100x80.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 100, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Caracteristicas del auto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 100, -1));

        txfModelo.setBackground(new java.awt.Color(255, 255, 255));
        txfModelo.setForeground(new java.awt.Color(153, 153, 153));
        txfModelo.setText("Ingresa el modelo del auto");
        txfModelo.setBorder(null);
        txfModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfModeloMousePressed(evt);
            }
        });
        jPanel1.add(txfModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 180, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 180, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Modelo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 100, -1));

        txfAnio.setBackground(new java.awt.Color(255, 255, 255));
        txfAnio.setForeground(new java.awt.Color(153, 153, 153));
        txfAnio.setText("Ingresa el año del auto");
        txfAnio.setBorder(null);
        txfAnio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfAnioMousePressed(evt);
            }
        });
        jPanel1.add(txfAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 180, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 180, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Año");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 100, -1));

        txfMarca.setBackground(new java.awt.Color(255, 255, 255));
        txfMarca.setForeground(new java.awt.Color(153, 153, 153));
        txfMarca.setText("Ingresa la marca del auto");
        txfMarca.setBorder(null);
        txfMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfMarcaMousePressed(evt);
            }
        });
        txfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(txfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 180, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 180, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Detalle del auto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 110, 20));

        txfColor.setBackground(new java.awt.Color(255, 255, 255));
        txfColor.setForeground(new java.awt.Color(153, 153, 153));
        txfColor.setText("Ingresa el color del auto");
        txfColor.setBorder(null);
        txfColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfColorMousePressed(evt);
            }
        });
        jPanel1.add(txfColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 180, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 180, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 390, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Color");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 110, 20));

        cbxCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diésel" }));
        jPanel1.add(cbxCombustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 180, -1));

        pnlIngreso.setBackground(new java.awt.Color(18, 90, 173));
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlIngresoMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ingresar");

        javax.swing.GroupLayout pnlIngresoLayout = new javax.swing.GroupLayout(pnlIngreso);
        pnlIngreso.setLayout(pnlIngresoLayout);
        pnlIngresoLayout.setHorizontalGroup(
            pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pnlIngresoLayout.setVerticalGroup(
            pnlIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(pnlIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 180, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/tallerMecanico/imagenes/taller_mecanico_280x450.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 450));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Combustible");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 110, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 240, 10));

        txfDetalle.setBackground(new java.awt.Color(255, 255, 255));
        txfDetalle.setForeground(new java.awt.Color(153, 153, 153));
        txfDetalle.setText("Ingresa el detalle que tiene el auto");
        txfDetalle.setBorder(null);
        txfDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfDetalleMousePressed(evt);
            }
        });
        jPanel1.add(txfDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 240, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresoMouseEntered
        pnlIngreso.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_pnlIngresoMouseEntered

    private void pnlIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresoMouseExited
        pnlIngreso.setBackground(new Color(18,90,173));
    }//GEN-LAST:event_pnlIngresoMouseExited

    private void pnlIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresoMouseClicked
        
        String mar = txfMarca.getText().toUpperCase();
        String mod = txfModelo.getText().toUpperCase();
        String anio = txfAnio.getText();
        String col = txfColor.getText().toUpperCase();
        String com = cbxCombustible.getSelectedItem().toString();
        String det = txfDetalle.getText();
        
        try {
            if(mar.equals("") || mar.equals("Ingresa la marca del auto") || 
                    mod.equals("") || mod.equals("Ingresa el modelo del auto") || 
                    anio.equals("") || anio.equals("Ingresa el año del auto") || 
                    col.equals("") || col.equals("Ingresa el color del auto") || 
                    det.equals("") || det.equals("Ingresa el detalle que tiene el auto")){
                JOptionPane.showMessageDialog(null,"Faltan ingresar datos");
            } else {
                boolean resultado = this.id == 0 ?
                
                Auto.guardar(mar, mod, Integer.parseInt(anio), col, com, det):
                Auto.editarArreglado(this.id, mar, mod, Integer.parseInt(anio), col, com, det);
                
                if (resultado){
                    JOptionPane.showMessageDialog(this, "El auto se guardó correctamente", "Auto guardado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Ocurrio un error al guardar", "error", JOptionPane.ERROR_MESSAGE);
                }
                
                Auto.setColor(Main.pnlReparacion);
                Auto.resetColor(Main.pnlIngreso);
                Auto.resetColor(Main.pnlArreglados);
        
                Arreglado p3 = new Arreglado();
                p3.setSize(1010, 450);
                p3.setLocation(0,0);
        
                Main.pnlJFrames.removeAll();
                Main.pnlJFrames.add(p3, BorderLayout.CENTER);
                Main.pnlJFrames.revalidate();
                Main.pnlJFrames.repaint();
            
            }
        } catch (Exception e) {
            System.out.println("No se pudo agregar la fila: " + e);
        }
        
        
    }//GEN-LAST:event_pnlIngresoMouseClicked

    private void txfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfMarcaActionPerformed

    private void pnlIngresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresoMousePressed
        
    }//GEN-LAST:event_pnlIngresoMousePressed

    private void txfMarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfMarcaMousePressed
        if(txfModelo.getText().isEmpty()){
        txfModelo.setText("Ingresa el modelo del auto");
        txfModelo.setForeground(Color.GRAY);
        }
        if(txfAnio.getText().isEmpty()){
        txfAnio.setText("Ingresa el año del auto");
        txfAnio.setForeground(Color.GRAY);
        }
        if(txfColor.getText().isEmpty()){
        txfColor.setText("Ingresa el color del auto");
        txfColor.setForeground(Color.GRAY);
        }
        if (txfDetalle.getText().isEmpty()) {
        txfDetalle.setText("Ingresa el detalle que tiene el auto");
        txfDetalle.setForeground(Color.GRAY);
        }
        if(txfMarca.getText().equals("Ingresa la marca del auto")){
        txfMarca.setText("");
        txfMarca.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txfMarcaMousePressed

    private void txfModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfModeloMousePressed
        if(txfMarca.getText().isEmpty()){
        txfMarca.setText("Ingresa la marca del auto");
        txfMarca.setForeground(Color.GRAY);
        }
        if(txfAnio.getText().isEmpty()){
        txfAnio.setText("Ingresa el año del auto");
        txfAnio.setForeground(Color.GRAY);
        }
        if(txfColor.getText().isEmpty()){
        txfColor.setText("Ingresa el color del auto");
        txfColor.setForeground(Color.GRAY);
        }
        if (txfDetalle.getText().isEmpty()) {
        txfDetalle.setText("Ingresa el detalle que tiene el auto");
        txfDetalle.setForeground(Color.GRAY);
        }
        if(txfModelo.getText().equals("Ingresa el modelo del auto")){
        txfModelo.setText("");
        txfModelo.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txfModeloMousePressed

    private void txfAnioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfAnioMousePressed
        if(txfMarca.getText().isEmpty()){
        txfMarca.setText("Ingresa la marca del auto");
        txfMarca.setForeground(Color.GRAY);
        }
        if(txfModelo.getText().isEmpty()){
        txfModelo.setText("Ingresa el modelo del auto");
        txfModelo.setForeground(Color.GRAY);
        }
        if(txfColor.getText().isEmpty()){
        txfColor.setText("Ingresa el color del auto");
        txfColor.setForeground(Color.GRAY);
        }
        if (txfDetalle.getText().isEmpty()) {
        txfDetalle.setText("Ingresa el detalle que tiene el auto");
        txfDetalle.setForeground(Color.GRAY);
        }
        if(txfAnio.getText().equals("Ingresa el año del auto")){
        txfAnio.setText("");
        txfAnio.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txfAnioMousePressed

    private void txfColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfColorMousePressed
        if(txfMarca.getText().isEmpty()){
        txfMarca.setText("Ingresa la marca del auto");
        txfMarca.setForeground(Color.GRAY);
        }
        if(txfAnio.getText().isEmpty()){
        txfAnio.setText("Ingresa el año del auto");
        txfAnio.setForeground(Color.GRAY);
        }
        if(txfModelo.getText().isEmpty()){
        txfModelo.setText("Ingresa el modelo del auto");
        txfModelo.setForeground(Color.GRAY);
        }
        if (txfDetalle.getText().isEmpty()) {
        txfDetalle.setText("Ingresa el detalle que tiene el auto");
        txfDetalle.setForeground(Color.GRAY);
        }
        if(txfColor.getText().equals("Ingresa el color del auto")){
        txfColor.setText("");
        txfColor.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txfColorMousePressed

    private void txfDetalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfDetalleMousePressed
        if(txfMarca.getText().isEmpty()){
        txfMarca.setText("Ingresa la marca del auto");
        txfMarca.setForeground(Color.GRAY);
        }
        if(txfAnio.getText().isEmpty()){
        txfAnio.setText("Ingresa el año del auto");
        txfAnio.setForeground(Color.GRAY);
        }
        if(txfColor.getText().isEmpty()){
        txfColor.setText("Ingresa el color del auto");
        txfColor.setForeground(Color.GRAY);
        }
        if (txfModelo.getText().isEmpty()) {
        txfModelo.setText("Ingresa el modelo del auto");
        txfModelo.setForeground(Color.GRAY);
        }
        if(txfDetalle.getText().equals("Ingresa el detalle que tiene el auto")){
        txfDetalle.setText("");
        txfDetalle.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txfDetalleMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbxCombustible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel pnlIngreso;
    public static javax.swing.JTextField txfAnio;
    public static javax.swing.JTextField txfColor;
    public static javax.swing.JTextField txfDetalle;
    public static javax.swing.JTextField txfMarca;
    public static javax.swing.JTextField txfModelo;
    // End of variables declaration//GEN-END:variables
}
