package Presentacion;

import java.util.Hashtable;
import javax.swing.JOptionPane;
import proyecto.MedicoDAO;
import proyecto.MedicoVO;

public class ActualizarMedico extends javax.swing.JFrame {

    MedicoVO medicoVO;
    MedicoDAO medicoDAO;
    int codigo;

    public ActualizarMedico(Hashtable<Integer, MedicoVO> infoMedico, int codigo, MedicoDAO medicoDAO) {
        initComponents();
        super.setLocationRelativeTo(null);
        this.medicoDAO = medicoDAO;
        medicoVO = infoMedico.get(codigo);
        labelNumeroID.setText(Integer.toString(medicoVO.getNumeroID()));
        boxTipoDoc.setSelectedItem(medicoVO.getTipoID());
        fieldNombre.setText(medicoVO.getNombre());
        fieldApellido.setText(medicoVO.getApellido());
        boxGenero.setSelectedItem(medicoVO.getGenero());
        fieldLugarEstudio.setText(medicoVO.getLugarEstudio());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        boxTipoDoc = new javax.swing.JComboBox<>();
        fieldNombre = new javax.swing.JTextField();
        fieldApellido = new javax.swing.JTextField();
        fieldLugarEstudio = new javax.swing.JTextField();
        boxGenero = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        labelNumeroID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        jLabel1.setText("FAST AND CAREFUL (F&C)");

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel2.setText("Actualizar medico");

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        jLabel3.setText("Numero de documento");

        jPanel1.setBackground(new java.awt.Color(235, 245, 251));

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 15)); // NOI18N
        jLabel5.setText("Informacion Personal");

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        jLabel6.setText("Tipo de documento");

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        jLabel7.setText("Primer nombre");

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        jLabel8.setText("Primer apellido");

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        jLabel9.setText("Genero");

        jLabel10.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        jLabel10.setText("Lugar de estudio");

        boxTipoDoc.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Documento", "Cedula", "Tarjeta De Identidad", "Otro" }));
        boxTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoDocActionPerformed(evt);
            }
        });

        fieldNombre.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldApellido.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldLugarEstudio.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        boxGenero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Genero", "Masculino", "Femenino" }));
        boxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxGeneroActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnActualizar.setText("Modificar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldLugarEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnActualizar)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(boxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fieldLugarEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnActualizar))
        );

        labelNumeroID.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNumeroID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel2)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(labelNumeroID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoDocActionPerformed

    private void boxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxGeneroActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
     actualizarMedico();
        JOptionPane.showMessageDialog(null, "Los datos fueron actualizados con exito",
                "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
        super.dispose();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGenero;
    private javax.swing.JComboBox<String> boxTipoDoc;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldLugarEstudio;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNumeroID;
    // End of variables declaration//GEN-END:variables

private void actualizarMedico() {
       
        MedicoVO medicoVO = new MedicoVO();
        
        medicoVO.setNumeroID(Integer.parseInt(labelNumeroID.getText()));
        medicoVO.setTipoID((String) boxTipoDoc.getSelectedItem());
        medicoVO.setNombre(fieldNombre.getText());
        medicoVO.setApellido(fieldApellido.getText());
        medicoVO.setGenero((String) boxGenero.getSelectedItem());
        medicoVO.setLugarEstudio(fieldLugarEstudio.getText());
        
        medicoDAO.modificarMedico(medicoVO);
    }
}