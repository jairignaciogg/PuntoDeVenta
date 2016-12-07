/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Conexion;
import Clases.Operaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Partes Gonzalez
 */
public class Usuarios extends javax.swing.JFrame {

    int seleccion = 0;
    Connection con;
    Operaciones op;
    Conexion cn;
    public Object[][] dtRef;
    private DefaultTableModel datosRef;
    String TipoUser;

    public Usuarios(java.awt.Frame parent, boolean modal) {

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
        tabla = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtUserN = new javax.swing.JTextField();
        txtApeP = new javax.swing.JTextField();
        labelRound1 = new org.edisoncor.gui.label.LabelRound();
        labelRound2 = new org.edisoncor.gui.label.LabelRound();
        labelRound3 = new org.edisoncor.gui.label.LabelRound();
        labelRound4 = new org.edisoncor.gui.label.LabelRound();
        btAceptar = new org.edisoncor.gui.button.ButtonColoredAction();
        btCancelar = new org.edisoncor.gui.button.ButtonColoredAction();
        labelRound5 = new org.edisoncor.gui.label.LabelRound();
        txtApeM = new javax.swing.JTextField();
        labelRound6 = new org.edisoncor.gui.label.LabelRound();
        tipoUser = new org.edisoncor.gui.comboBox.ComboBoxRound();
        txtNombre = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuarios");
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
        jPanel1.add(buttonTask1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        buttonTask2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        buttonTask2.setText("Modificar");
        buttonTask2.setDescription("  ");
        buttonTask2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask2ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTask2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 190, -1));

        buttonTask3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        buttonTask3.setText("Eliminar");
        buttonTask3.setDescription(" ");
        buttonTask3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask3ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTask3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 200, 50));

        buttonTask4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        buttonTask4.setText("Actualizar");
        buttonTask4.setDescription("  ");
        buttonTask4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask4ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTask4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 170, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
            Tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 130));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtUserN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 287, 29));
        jPanel2.add(txtApeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 287, 29));

        labelRound1.setForeground(new java.awt.Color(0, 0, 0));
        labelRound1.setText("Apellido Paterno");
        jPanel2.add(labelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 150, 29));

        labelRound2.setForeground(new java.awt.Color(0, 0, 0));
        labelRound2.setText("Contraseña");
        jPanel2.add(labelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 150, 29));

        labelRound3.setForeground(new java.awt.Color(0, 0, 0));
        labelRound3.setText("Nombre");
        jPanel2.add(labelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, 29));

        labelRound4.setForeground(new java.awt.Color(0, 0, 0));
        labelRound4.setText("Username");
        jPanel2.add(labelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 30));

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

        labelRound5.setForeground(new java.awt.Color(0, 0, 0));
        labelRound5.setText("Tipo de Usuario");
        jPanel2.add(labelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 150, 29));
        jPanel2.add(txtApeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 287, 29));

        labelRound6.setForeground(new java.awt.Color(0, 0, 0));
        labelRound6.setText("Apellido Materno");
        jPanel2.add(labelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 150, 29));

        tipoUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione tipo de usuario", "Administrador", "Usuario" }));
        jPanel2.add(tipoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 290, 30));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 287, 29));
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 287, 29));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 780, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        txtUserN.setText("");
        txtPass.setText("");
        txtNombre.setText("");
        txtApeP.setText("");
        txtApeM.setText("");
        tipoUser.setSelectedIndex(0);
        desacTxt();


    }//GEN-LAST:event_btAceptarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        txtUserN.setText("");
        txtPass.setText("");
        txtNombre.setText("");
        txtApeP.setText("");
        txtApeM.setText("");
        tipoUser.setSelectedIndex(0);
        desacTxt();
    }//GEN-LAST:event_btCancelarActionPerformed

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
            txtUserN.setText(Tabla.getValueAt(fila, 0).toString());
            txtPass.setText(Tabla.getValueAt(fila, 1).toString());
            txtNombre.setText(Tabla.getValueAt(fila, 2).toString());
            txtApeP.setText(Tabla.getValueAt(fila, 3).toString());
            txtApeM.setText(Tabla.getValueAt(fila, 4).toString());

            if ("Administrador".equals(Tabla.getValueAt(fila, 5).toString())) {
                tipoUser.setSelectedIndex(1);
            } else {
                tipoUser.setSelectedIndex(2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se selecciono ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
            desacTxt();
        }
    }//GEN-LAST:event_buttonTask2ActionPerformed

    private void buttonTask3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask3ActionPerformed
        activarTxt();
        seleccion = 3;

        int fila = Tabla.getSelectedRow();
        if (fila >= 0) {
            txtUserN.setText(Tabla.getValueAt(fila, 0).toString());
            txtPass.setText(Tabla.getValueAt(fila, 1).toString());
            txtNombre.setText(Tabla.getValueAt(fila, 2).toString());
            txtApeP.setText(Tabla.getValueAt(fila, 3).toString());
            txtApeM.setText(Tabla.getValueAt(fila, 4).toString());

            if ("Administrador".equals(Tabla.getValueAt(fila, 5).toString())) {
                tipoUser.setSelectedIndex(1);
            } else {
                tipoUser.setSelectedIndex(2);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No se selecciono ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
            desacTxt();
        }
        txtUserN.setEditable(false);
        txtPass.setEditable(false);
        txtNombre.setEditable(false);
        txtApeP.setEditable(false);
        txtApeM.setEditable(false);
        tipoUser.setEditable(false);
    }//GEN-LAST:event_buttonTask3ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Usuarios().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.edisoncor.gui.label.LabelRound labelRound1;
    private org.edisoncor.gui.label.LabelRound labelRound2;
    private org.edisoncor.gui.label.LabelRound labelRound3;
    private org.edisoncor.gui.label.LabelRound labelRound4;
    private org.edisoncor.gui.label.LabelRound labelRound5;
    private org.edisoncor.gui.label.LabelRound labelRound6;
    private javax.swing.JScrollPane tabla;
    private org.edisoncor.gui.comboBox.ComboBoxRound tipoUser;
    private javax.swing.JTextField txtApeM;
    private javax.swing.JTextField txtApeP;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUserN;
    // End of variables declaration//GEN-END:variables

    private void eliminar() {
        int fila = Tabla.getSelectedRow();
        String cod;
        cod = Tabla.getValueAt(fila, 0).toString();
        String q = "DELETE FROM Usuarios WHERE username='" + cod + "'";
        try {
            PreparedStatement pst = con.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Eliminado correctamente");
            actuTablaCli();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void modificar() {
        String q = "UPDATE Usuarios SET username='" + txtUserN.getText() + "',password='" + txtPass.getText() + "',nombre='" + txtNombre.getText() + "',apelm='" + txtApeP.getText() + "',apelp='" + txtApeM.getText() + "',permisos='Administrador' WHERE username='" + txtUserN.getText() + "'";
        String p = "UPDATE Usuarios SET username='" + txtUserN.getText() + "',password='" + txtPass.getText() + "',nombre='" + txtNombre.getText() + "',apelm='" + txtApeP.getText() + "',apelp='" + txtApeM.getText() + "',permisos='Usuario' WHERE username='" + txtUserN.getText() + "'";

        if (tipoUser.getSelectedIndex() == 1) {
            try {
                PreparedStatement pst = con.prepareStatement(q);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Modificado correctamente");
                actuTablaCli();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                PreparedStatement pst = con.prepareStatement(p);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Modificado correctamente");
                actuTablaCli();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void añadir() {
        if ("".equals(txtUserN.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Username debe ser llenado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if ("".equals(txtPass.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Contraseña debe ser llenado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if ("".equals(txtNombre.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Nombre debe ser llenado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if ("".equals(txtApeP.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Apellido Paterno debe ser llenado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if ("".equals(txtApeM.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Apellido Materno debe ser llenado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (tipoUser.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Se debe de seleccionar el Tipo de Usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (tipoUser.getSelectedIndex() == 1) {
                op.insert("Usuarios", "username,password,nombre,apelm,apelp,permisos", "'" + txtUserN.getText() + "','" + txtPass.getText() + "','" + txtNombre.getText() + "','" + txtApeP.getText() + "','" + txtApeM.getText() + "','Administrador'", con);
            } else {
                op.insert("Usuarios", "username,password,nombre,apelm,apelp,permisos", "'" + txtUserN.getText() + "','" + txtPass.getText() + "','" + txtNombre.getText() + "','" + txtApeP.getText() + "','" + txtApeM.getText() + "','Usuario'", con);
            }
        }
        JOptionPane.showMessageDialog(this, "Agregado correctamente");
        actuTablaCli();
    }

    private void desacTxt() {
        btAceptar.setEnabled(false);
        btCancelar.setEnabled(false);
        btAceptar.setVisible(false);
        btCancelar.setVisible(false);
        txtUserN.setEnabled(false);
        txtPass.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApeP.setEnabled(false);
        txtApeM.setEnabled(false);
        tipoUser.setEnabled(false);

    }

    private void actuTablaCli() {
        String[] columNames = {"USERNAME", "CONTRASEÑA", "NOMBRE", "APELLIDO P.", "APELLIDO M.", "PERMISOS"};
        // se utiliza la funcion
        dtRef = op.getUsuarios(con);

        // se colocan los datos en la tabla
        datosRef = new DefaultTableModel(dtRef, columNames);
        Tabla.setModel(datosRef);
    }

    private void activarTxt() {
        txtUserN.setEnabled(true);
        txtPass.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApeP.setEnabled(true);
        txtApeM.setEnabled(true);
        tipoUser.setEnabled(true);
        btAceptar.setEnabled(true);
        btCancelar.setEnabled(true);
        btAceptar.setVisible(true);
        btCancelar.setVisible(true);
        txtUserN.setEditable(true);
        txtPass.setEditable(true);
        txtNombre.setEditable(true);
        txtApeP.setEditable(true);
        txtApeM.setEditable(true);

    }

}