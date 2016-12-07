/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Conexion;
import Clases.Operaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Partes Gonzalez
 */
public class Refacciones extends javax.swing.JDialog {

    int seleccion = 0;
    Connection con;
    Operaciones op;
    Conexion cn;
    public Object[][] dtRef;
    private DefaultTableModel datosRef;

    public Refacciones(java.awt.Frame parent, boolean modal) {

        //super(parent, modal);

        initComponents();
        desacTxt();

        datosRef = new DefaultTableModel();
        cn = new Conexion();
        op = new Operaciones();
        this.setLocationRelativeTo(null);
        Tabla.setModel(datosRef);
        con = cn.AccederBD();
        actuTablaCli();

    }

    private void actuTablaCli() {
        String[] columNames = {"ID", "CANTIDAD", "DESCRIPCION", "PRECIO"};
        // se utiliza la funcion
        dtRef = op.getRefacciones(con);

        // se colocan los datos en la tabla
        datosRef = new DefaultTableModel(dtRef, columNames);
        Tabla.setModel(datosRef);

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
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask2 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask3 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask4 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask5 = new org.edisoncor.gui.button.ButtonTask();
        tabla = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txt_ID = new javax.swing.JTextField();
        txt_Desc = new javax.swing.JTextField();
        labelRound1 = new org.edisoncor.gui.label.LabelRound();
        labelRound2 = new org.edisoncor.gui.label.LabelRound();
        labelRound3 = new org.edisoncor.gui.label.LabelRound();
        labelRound4 = new org.edisoncor.gui.label.LabelRound();
        txt_cant = new javax.swing.JFormattedTextField();
        txt_Precio = new javax.swing.JFormattedTextField();
        btAceptar = new org.edisoncor.gui.button.ButtonColoredAction();
        btCancelar = new org.edisoncor.gui.button.ButtonColoredAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Refacciones");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/actividades.png")).getImage());
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonTask1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        buttonTask1.setText("Agregar");
        buttonTask1.setDescription("    ");
        buttonTask1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTask1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        buttonTask2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        buttonTask2.setText("Modificar");
        buttonTask2.setDescription("  ");
        buttonTask2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask2ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTask2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, -1));

        buttonTask3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        buttonTask3.setText("Eliminar");
        buttonTask3.setDescription(" ");
        buttonTask3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask3ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTask3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 140, 50));

        buttonTask4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        buttonTask4.setText("Actualizar");
        buttonTask4.setDescription("  ");
        buttonTask4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask4ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTask4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 170, -1));

        buttonTask5.setText("Buscar");
        buttonTask5.setDescription(" ");
        buttonTask5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask5ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTask5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setViewportView(Tabla);

        getContentPane().add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 190));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 287, 29));
        jPanel2.add(txt_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 287, 29));

        labelRound1.setForeground(new java.awt.Color(0, 0, 0));
        labelRound1.setText("PRECIO");
        jPanel2.add(labelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 150, 29));

        labelRound2.setForeground(new java.awt.Color(0, 0, 0));
        labelRound2.setText("CANTIDAD");
        jPanel2.add(labelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 150, 29));

        labelRound3.setForeground(new java.awt.Color(0, 0, 0));
        labelRound3.setText("DESCRIPCION");
        jPanel2.add(labelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, 29));

        labelRound4.setForeground(new java.awt.Color(0, 0, 0));
        labelRound4.setText("ID");
        jPanel2.add(labelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, 30));

        txt_cant.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel2.add(txt_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 290, 30));

        txt_Precio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        jPanel2.add(txt_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 290, 30));

        btAceptar.setBackground(new java.awt.Color(0, 204, 0));
        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 150, -1));

        btCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 780, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTask1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask1ActionPerformed
        activarTxt();
        seleccion = 1;

    }//GEN-LAST:event_buttonTask1ActionPerformed

    private void buttonTask4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask4ActionPerformed
        actuTablaCli();
    }//GEN-LAST:event_buttonTask4ActionPerformed

    private void buttonTask2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask2ActionPerformed
        activarTxt();
        seleccion = 2;

        int fila = Tabla.getSelectedRow();
        if (fila >= 0) {
            txt_ID.setText(Tabla.getValueAt(fila, 0).toString());
            txt_cant.setText(Tabla.getValueAt(fila, 1).toString());
            txt_Desc.setText(Tabla.getValueAt(fila, 2).toString());
            txt_Precio.setText(Tabla.getValueAt(fila, 3).toString());
        } else {
            JOptionPane.showMessageDialog(this, "No se selecciono ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
            desacTxt();
        }   
    }//GEN-LAST:event_buttonTask2ActionPerformed

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        if (seleccion == 1) {
            añadir();

        }
        if (seleccion == 2) {
            modificar();
        }
        if (seleccion == 3) {
            eliminar();
        }
        if(seleccion==5){
            Buscar(txt_ID.getText());
        }

        txt_Desc.setText("");
        txt_ID.setText("");
        txt_Precio.setText("");
        txt_cant.setText("");
        desacTxt();        
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        txt_Desc.setText("");
        txt_ID.setText("");
        txt_Precio.setText("");
        txt_cant.setText("");
        desacTxt();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void buttonTask3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask3ActionPerformed
        activarTxt();
        seleccion = 3;

        int fila = Tabla.getSelectedRow();
        if (fila >= 0) {
            txt_ID.setText(Tabla.getValueAt(fila, 0).toString());
            txt_cant.setText(Tabla.getValueAt(fila, 1).toString());
            txt_Desc.setText(Tabla.getValueAt(fila, 2).toString());
            txt_Precio.setText(Tabla.getValueAt(fila, 3).toString());
        } else {
            JOptionPane.showMessageDialog(this, "No se selecciono ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
            desacTxt();
        }
        txt_Desc.setEditable(false);
        txt_ID.setEditable(false);
        txt_Precio.setEditable(false);
        txt_cant.setEditable(false);

    }//GEN-LAST:event_buttonTask3ActionPerformed

    private void buttonTask5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask5ActionPerformed
        txt_ID.setEnabled(true);
        txt_ID.setEditable(true);
        btAceptar.setEnabled(true);
        btCancelar.setEnabled(true);
        btAceptar.setVisible(true);
        btCancelar.setVisible(true);
        seleccion=5;
    }//GEN-LAST:event_buttonTask5ActionPerformed

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
            java.util.logging.Logger.getLogger(Refacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Refacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Refacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Refacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private org.edisoncor.gui.button.ButtonColoredAction btAceptar;
    private org.edisoncor.gui.button.ButtonColoredAction btCancelar;
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private org.edisoncor.gui.button.ButtonTask buttonTask2;
    private org.edisoncor.gui.button.ButtonTask buttonTask3;
    private org.edisoncor.gui.button.ButtonTask buttonTask4;
    private org.edisoncor.gui.button.ButtonTask buttonTask5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.edisoncor.gui.label.LabelRound labelRound1;
    private org.edisoncor.gui.label.LabelRound labelRound2;
    private org.edisoncor.gui.label.LabelRound labelRound3;
    private org.edisoncor.gui.label.LabelRound labelRound4;
    private javax.swing.JScrollPane tabla;
    private javax.swing.JTextField txt_Desc;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JFormattedTextField txt_Precio;
    private javax.swing.JFormattedTextField txt_cant;
    // End of variables declaration//GEN-END:variables

    private void activarTxt() {

        txt_ID.setEnabled(true);
        txt_cant.setEnabled(true);
        txt_Desc.setEnabled(true);
        txt_Precio.setEnabled(true);
        btAceptar.setEnabled(true);
        btCancelar.setEnabled(true);
        btAceptar.setVisible(true);
        btCancelar.setVisible(true);
        txt_Desc.setEditable(true);
        txt_ID.setEditable(true);
        txt_Precio.setEditable(true);
        txt_cant.setEditable(true);
    }

    private void desacTxt() {
        txt_ID.setEnabled(false);
        txt_cant.setEnabled(false);
        txt_Desc.setEnabled(false);
        txt_Precio.setEnabled(false);
        btAceptar.setEnabled(false);
        btCancelar.setEnabled(false);
        btAceptar.setVisible(false);
        btCancelar.setVisible(false);
    }

    private void añadir() {
        if ("".equals(txt_ID.getText())) {
            JOptionPane.showMessageDialog(this, "El campo ID debe ser llenado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if ("".equals(txt_cant.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Cantidad debe ser llenado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if ("".equals(txt_Desc.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Descripcion debe ser llenado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if ("".equals(txt_Precio.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Precio debe ser llenado", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            op.insert("Refacciones", "id,cantidad,descripcion,precio", "'" + txt_ID.getText() + "','" + txt_cant.getText() + "','" + txt_Desc.getText() + "','" + txt_Precio.getText() + "'", con);
            JOptionPane.showMessageDialog(this, "Agregado correctamente");
            actuTablaCli();
        }
    }

    private void modificar() {
        String q = "UPDATE Refacciones SET id='" + txt_ID.getText() + "',cantidad='" + txt_cant.getText() + "',descripcion='" + txt_Desc.getText() + "',precio='" + txt_Precio.getText() + "' WHERE id='" + txt_ID.getText() + "'";
        try {
            PreparedStatement pst = con.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Modificado correctamente");
            actuTablaCli();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminar() {
        int fila = Tabla.getSelectedRow();
        String cod;
        cod = Tabla.getValueAt(fila, 0).toString();
        String q = "DELETE FROM Refacciones WHERE id='" + cod + "'";
        try {
            PreparedStatement pst = con.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Eliminado correctamente");
            actuTablaCli();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Buscar(String valor) {
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO");
        Tabla.setModel(modelo);
        String sql;
        sql="SELECT * FROM Refacciones WHERE id='"+valor+"'";
        String []datos = new String [4];
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
}
