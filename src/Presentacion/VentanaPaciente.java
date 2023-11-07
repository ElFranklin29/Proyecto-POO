package Presentacion;

import javax.swing.JOptionPane;
import proyecto.PacienteDAO;
import proyecto.PacienteVO;

public class VentanaPaciente extends javax.swing.JFrame {

    PacienteDAO pacienteDAO = new PacienteDAO();

    
  
    
    public VentanaPaciente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        fastAndCareful = new javax.swing.JLabel();
        txtRegistrados = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        panelnfoPersonal = new javax.swing.JPanel();
        txtNumeroDocumento = new javax.swing.JLabel();
        fieldNumeroDocumento = new javax.swing.JTextField();
        txtTipoDocumento = new javax.swing.JLabel();
        boxTipoDoc = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JLabel();
        fieldApellido = new javax.swing.JTextField();
        txtGenero = new javax.swing.JLabel();
        boxGenero = new javax.swing.JComboBox<>();
        txtSangre = new javax.swing.JLabel();
        fieldSangre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelSintomas = new javax.swing.JPanel();
        txtSintomasRespiratorios = new javax.swing.JLabel();
        boxSintomasRespiratorios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boxSintomasRespiratorios1 = new javax.swing.JComboBox<>();
        txtSintomasRespiratorios1 = new javax.swing.JLabel();
        boxSintomasRespiratorios2 = new javax.swing.JComboBox<>();
        txtSintomasRespiratorios2 = new javax.swing.JLabel();
        btnEliminarPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnRegistrar.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnRegistrar.setText("Registrar Paciente");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnModificar.setText("Modificar Paciente");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        fastAndCareful.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        fastAndCareful.setText("FAST AND CAREFUL (F&C)");

        txtRegistrados.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        txtRegistrados.setText("Registrar un paciente");

        btnMostrar.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnMostrar.setText("Mostrar Pacientes");
        btnMostrar.setToolTipText("");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        panelnfoPersonal.setBackground(new java.awt.Color(235, 245, 251));

        txtNumeroDocumento.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtNumeroDocumento.setText("Numero de documento");

        fieldNumeroDocumento.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        fieldNumeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNumeroDocumentoActionPerformed(evt);
            }
        });

        txtTipoDocumento.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtTipoDocumento.setText("Tipo de documento");

        boxTipoDoc.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Documento", "Cedula", "Tarjeta De Identidad", "Otro" }));

        txtNombre.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtNombre.setText("Primer nombre");

        fieldNombre.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtApellido.setText("Primer apellido");

        fieldApellido.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        txtGenero.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtGenero.setText("Genero");

        boxGenero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE GENERO", "Masculino\t", "Femenino" }));

        txtSangre.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtSangre.setText("Tipo de sangre");

        fieldSangre.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 15)); // NOI18N
        jLabel1.setText("Informacion Personal");

        javax.swing.GroupLayout panelnfoPersonalLayout = new javax.swing.GroupLayout(panelnfoPersonal);
        panelnfoPersonal.setLayout(panelnfoPersonalLayout);
        panelnfoPersonalLayout.setHorizontalGroup(
            panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelnfoPersonalLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTipoDocumento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGenero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSangre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelnfoPersonalLayout.setVerticalGroup(
            panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDocumento)
                    .addComponent(boxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroDocumento)
                    .addComponent(fieldNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido))
                .addGap(15, 15, 15)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero)
                    .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSangre)
                    .addComponent(fieldSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelSintomas.setBackground(new java.awt.Color(235, 245, 251));

        txtSintomasRespiratorios.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtSintomasRespiratorios.setText("Sintomas Respiratorios");

        boxSintomasRespiratorios.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxSintomasRespiratorios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Documento", "Cedula", "Tarjeta De Identidad", "Otro" }));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 15)); // NOI18N
        jLabel2.setText("Sintomas");

        boxSintomasRespiratorios1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxSintomasRespiratorios1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Documento", "Cedula", "Tarjeta De Identidad", "Otro" }));

        txtSintomasRespiratorios1.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtSintomasRespiratorios1.setText("Sintomas Respiratorios");

        boxSintomasRespiratorios2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxSintomasRespiratorios2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Documento", "Cedula", "Tarjeta De Identidad", "Otro" }));

        txtSintomasRespiratorios2.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtSintomasRespiratorios2.setText("Sintomas Respiratorios");

        javax.swing.GroupLayout panelSintomasLayout = new javax.swing.GroupLayout(panelSintomas);
        panelSintomas.setLayout(panelSintomasLayout);
        panelSintomasLayout.setHorizontalGroup(
            panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSintomasLayout.createSequentialGroup()
                .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSintomasLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel2))
                    .addGroup(panelSintomasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelSintomasLayout.createSequentialGroup()
                                    .addComponent(txtSintomasRespiratorios2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boxSintomasRespiratorios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelSintomasLayout.createSequentialGroup()
                                    .addComponent(txtSintomasRespiratorios1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boxSintomasRespiratorios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelSintomasLayout.createSequentialGroup()
                                .addComponent(txtSintomasRespiratorios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxSintomasRespiratorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelSintomasLayout.setVerticalGroup(
            panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSintomasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSintomasRespiratorios)
                    .addComponent(boxSintomasRespiratorios, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSintomasRespiratorios1)
                    .addComponent(boxSintomasRespiratorios1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSintomasRespiratorios2)
                    .addComponent(boxSintomasRespiratorios2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        btnEliminarPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnEliminarPaciente.setText("Eliminar Paciente");
        btnEliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(panelnfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtRegistrados))
                            .addComponent(fastAndCareful)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnEliminarPaciente)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(btnModificar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fastAndCareful)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegistrados)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelnfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSintomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarPaciente)
                    .addComponent(btnModificar)
                    .addComponent(btnMostrar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrarPaciente();
        
        fieldNumeroDocumento.setText("");
        fieldNombre.setText("");
        fieldApellido.setText("");
        fieldSangre.setText("");
        boxTipoDoc.setSelectedIndex(0);
        boxGenero.setSelectedIndex(0);


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del paciente que desea actualizar"));
        pacienteDAO.actualizarPaciente(codigo, pacienteDAO);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void fieldNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNumeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNumeroDocumentoActionPerformed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
            MostrarPaciente mostrar= new MostrarPaciente(pacienteDAO.getInfoPaciente(), pacienteDAO);
            mostrar.setVisible(true);
            
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPacienteActionPerformed
        int codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del paciente que desea eliminar"));
        pacienteDAO.eliminarPaciente(codigo);
    }//GEN-LAST:event_btnEliminarPacienteActionPerformed
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
            java.util.logging.Logger.getLogger(Leer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaciente().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGenero;
    private javax.swing.JComboBox<String> boxSintomasRespiratorios;
    private javax.swing.JComboBox<String> boxSintomasRespiratorios1;
    private javax.swing.JComboBox<String> boxSintomasRespiratorios2;
    private javax.swing.JComboBox<String> boxTipoDoc;
    private javax.swing.JButton btnEliminarPaciente;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel fastAndCareful;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldNumeroDocumento;
    private javax.swing.JTextField fieldSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelSintomas;
    private javax.swing.JPanel panelnfoPersonal;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNumeroDocumento;
    private javax.swing.JLabel txtRegistrados;
    private javax.swing.JLabel txtSangre;
    private javax.swing.JLabel txtSintomasRespiratorios;
    private javax.swing.JLabel txtSintomasRespiratorios1;
    private javax.swing.JLabel txtSintomasRespiratorios2;
    private javax.swing.JLabel txtTipoDocumento;
    // End of variables declaration//GEN-END:variables

 

    private void registrarPaciente() {
        
        
        PacienteVO pacienteVO = new PacienteVO();
        pacienteVO.setNumeroID(Integer.parseInt(fieldNumeroDocumento.getText()));
        pacienteVO.setTipoID((String) boxTipoDoc.getSelectedItem());
        pacienteVO.setNombre(fieldNombre.getText());
        pacienteVO.setApellido(fieldApellido.getText());
        pacienteVO.setGenero((String) boxGenero.getSelectedItem());
        pacienteVO.setTipoSangre(fieldSangre.getText());

        pacienteDAO.registrarPaciente(pacienteVO);
        
        

    }

}
