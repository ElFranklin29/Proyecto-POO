/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import javax.swing.JOptionPane;
import proyecto.Paciente;

public class RegistrarPaciente extends javax.swing.JFrame {

    Paciente paciente= new Paciente();
    
    public RegistrarPaciente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTipoDocumento = new javax.swing.JLabel();
        boxTipoDoc = new javax.swing.JComboBox<>();
        txtNumeroDocumento = new javax.swing.JLabel();
        fieldNumeroDocumento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JLabel();
        fieldApellido = new javax.swing.JTextField();
        txtGenero = new javax.swing.JLabel();
        fieldGenero = new javax.swing.JTextField();
        txtSangre = new javax.swing.JLabel();
        fieldSangre = new javax.swing.JTextField();
        fastAndCareful = new javax.swing.JLabel();
        txtRegistrar = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtTipoDocumento.setFont(new java.awt.Font("OCR A Extended", 0, 17)); // NOI18N
        txtTipoDocumento.setText("Tipo de documento");

        boxTipoDoc.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        boxTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Documento", "Cedula", "Tarjeta De Identidad", "Otro" }));

        txtNumeroDocumento.setFont(new java.awt.Font("OCR A Extended", 0, 17)); // NOI18N
        txtNumeroDocumento.setText("Numero de documento");

        fieldNumeroDocumento.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        fieldNumeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNumeroDocumentoActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("OCR A Extended", 0, 17)); // NOI18N
        txtNombre.setText("Primer nombre");

        fieldNombre.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("OCR A Extended", 0, 17)); // NOI18N
        txtApellido.setText("Primer apellido");

        fieldApellido.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N

        txtGenero.setFont(new java.awt.Font("OCR A Extended", 0, 17)); // NOI18N
        txtGenero.setText("Genero");

        fieldGenero.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N

        txtSangre.setFont(new java.awt.Font("OCR A Extended", 0, 17)); // NOI18N
        txtSangre.setText("Tipo de sangre");

        fieldSangre.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N

        fastAndCareful.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        fastAndCareful.setText("FAST AND CAREFUL (F&C)");

        txtRegistrar.setFont(new java.awt.Font("OCR A Extended", 0, 20)); // NOI18N
        txtRegistrar.setText("Registrar nuevo paciente");

        btnRegistrar.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnRegistrar.setText("Registrar Paciente");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(fastAndCareful))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(txtRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSangre)
                            .addComponent(txtGenero)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(txtTipoDocumento)
                            .addComponent(txtNumeroDocumento))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fieldGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(fieldSangre)
                                .addComponent(fieldApellido)
                                .addComponent(fieldNumeroDocumento)
                                .addComponent(fieldNombre))
                            .addComponent(boxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(fastAndCareful)
                .addGap(18, 18, 18)
                .addComponent(txtRegistrar)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDocumento)
                    .addComponent(boxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroDocumento)
                    .addComponent(fieldNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido)
                    .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero)
                    .addComponent(fieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSangre)
                    .addComponent(fieldSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNumeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNumeroDocumentoActionPerformed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrarPaciente();
        
        VentanaPaciente obj = new VentanaPaciente();
        obj.setVisible(true);
        System.out.println(paciente.toString());
        
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoDoc;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel fastAndCareful;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldGenero;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldNumeroDocumento;
    private javax.swing.JTextField fieldSangre;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNumeroDocumento;
    private javax.swing.JLabel txtRegistrar;
    private javax.swing.JLabel txtSangre;
    private javax.swing.JLabel txtTipoDocumento;
    // End of variables declaration//GEN-END:variables

    private void registrarPaciente() {
        paciente.setTipoID((String) boxTipoDoc.getSelectedItem());
        paciente.setNumeroID(fieldNumeroDocumento.getText());
        paciente.setNombre(fieldNombre.getText());
        paciente.setApellido(fieldApellido.getText());
        paciente.setGenero(fieldGenero.getText());
        paciente.setTipoSangre(fieldSangre.getText());
       
        
        
    }
}
