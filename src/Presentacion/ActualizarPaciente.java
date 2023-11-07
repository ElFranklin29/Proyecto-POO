
package Presentacion;

import java.util.Hashtable;
import javax.swing.JOptionPane;
import proyecto.PacienteDAO;
import proyecto.PacienteVO;


public class ActualizarPaciente extends javax.swing.JFrame {
    PacienteVO pacienteVO;
    PacienteDAO pacienteDAO;
    int codigo;
   
    public ActualizarPaciente(Hashtable<Integer, PacienteVO> infoPaciente, int codigo, PacienteDAO pacienteDAO) {
        initComponents();
        super.setLocationRelativeTo(null);
        this.pacienteDAO=pacienteDAO;
        
         pacienteVO = infoPaciente.get(codigo);
        boxTipoDoc.setSelectedItem(pacienteVO.getTipoID());
        fieldNombre.setText(pacienteVO.getNombre());
        fieldApellido.setText(pacienteVO.getApellido());
        boxGenero.setSelectedItem(pacienteVO.getGenero());
        fieldSangre.setText(pacienteVO.getTipoSangre());
        labelDocumento.setText(Integer.toString(pacienteVO.getNumeroID()));
        boxRepiratorios.setSelectedItem(pacienteVO.getSintomaRespiratorio());
        boxDigestivos.setSelectedItem(pacienteVO.getSintomaDigestivo());
        boxGenerales.setSelectedItem(pacienteVO.getSintomaGeneral());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelnfoPersonal = new javax.swing.JPanel();
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
        btnActualizar = new javax.swing.JButton();
        fastAndCareful = new javax.swing.JLabel();
        txtRegistrados = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JLabel();
        labelDocumento = new javax.swing.JLabel();
        panelSintomas = new javax.swing.JPanel();
        txtSistemaRepiratorio = new javax.swing.JLabel();
        boxRepiratorios = new javax.swing.JComboBox<>();
        txtSintomas = new javax.swing.JLabel();
        txtCirculatorio = new javax.swing.JLabel();
        txtSistemaDigestivo = new javax.swing.JLabel();
        txtAbdomen = new javax.swing.JLabel();
        boxDigestivos = new javax.swing.JComboBox<>();
        boxGenerales = new javax.swing.JComboBox<>();
        txtGenerales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelnfoPersonal.setBackground(new java.awt.Color(235, 245, 251));

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
        fieldSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSangreActionPerformed(evt);
            }
        });

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
            .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(423, 423, 423))
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
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btnActualizar.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnActualizar.setText("Modificar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        fastAndCareful.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        fastAndCareful.setText("FAST AND CAREFUL (F&C)");

        txtRegistrados.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        txtRegistrados.setText("Actualizar paciente");

        txtNumeroDocumento.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtNumeroDocumento.setText("Numero de documento");

        labelDocumento.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        panelSintomas.setBackground(new java.awt.Color(235, 245, 251));

        txtSistemaRepiratorio.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtSistemaRepiratorio.setText("Sistema respiratorio/");

        boxRepiratorios.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxRepiratorios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Presion arterial", "Taquicardia", "Tos" }));

        txtSintomas.setFont(new java.awt.Font("OCR A Extended", 1, 15)); // NOI18N
        txtSintomas.setText("Sintomas");

        txtCirculatorio.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtCirculatorio.setText("circulatorio");

        txtSistemaDigestivo.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtSistemaDigestivo.setText("Sistema digestivo/");

        txtAbdomen.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtAbdomen.setText("abdomen");

        boxDigestivos.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxDigestivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Vomito", "Estreñimiento", "Ruidos intestinales" }));

        boxGenerales.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxGenerales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Fiebre", "Dolor de cabeza", "Cansancio" }));

        txtGenerales.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtGenerales.setText("Generales");

        javax.swing.GroupLayout panelSintomasLayout = new javax.swing.GroupLayout(panelSintomas);
        panelSintomas.setLayout(panelSintomasLayout);
        panelSintomasLayout.setHorizontalGroup(
            panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSintomasLayout.createSequentialGroup()
                .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSintomasLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSistemaRepiratorio)
                            .addComponent(txtCirculatorio))
                        .addGap(18, 18, 18)
                        .addComponent(boxRepiratorios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSintomasLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(txtSintomas))
                    .addGroup(panelSintomasLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSistemaDigestivo)
                            .addComponent(txtAbdomen)
                            .addComponent(txtGenerales))
                        .addGap(18, 18, 18)
                        .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxDigestivos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxGenerales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        panelSintomasLayout.setVerticalGroup(
            panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSintomasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRepiratorios, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSistemaRepiratorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCirculatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxDigestivos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSistemaDigestivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenerales))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(panelnfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(txtRegistrados))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(fastAndCareful))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(txtNumeroDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(btnActualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(fastAndCareful)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegistrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroDocumento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelnfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarPaciente();
        JOptionPane.showMessageDialog(null, "Los datos fueron actualizados con exito",
                "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
        super.dispose();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void fieldSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSangreActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDigestivos;
    private javax.swing.JComboBox<String> boxGenerales;
    private javax.swing.JComboBox<String> boxGenero;
    private javax.swing.JComboBox<String> boxRepiratorios;
    private javax.swing.JComboBox<String> boxTipoDoc;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel fastAndCareful;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelDocumento;
    private javax.swing.JPanel panelSintomas;
    private javax.swing.JPanel panelnfoPersonal;
    private javax.swing.JLabel txtAbdomen;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtCirculatorio;
    private javax.swing.JLabel txtGenerales;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNumeroDocumento;
    private javax.swing.JLabel txtRegistrados;
    private javax.swing.JLabel txtSangre;
    private javax.swing.JLabel txtSintomas;
    private javax.swing.JLabel txtSistemaDigestivo;
    private javax.swing.JLabel txtSistemaRepiratorio;
    private javax.swing.JLabel txtTipoDocumento;
    // End of variables declaration//GEN-END:variables

    private void actualizarPaciente() {
       
        PacienteVO pacienteVO = new PacienteVO();
        
        pacienteVO.setTipoID((String) boxTipoDoc.getSelectedItem());
        pacienteVO.setNombre(fieldNombre.getText());
        pacienteVO.setApellido(fieldApellido.getText());
        pacienteVO.setGenero((String) boxGenero.getSelectedItem());
        pacienteVO.setTipoSangre(fieldSangre.getText());
        pacienteVO.setNumeroID(Integer.parseInt(labelDocumento.getText()));
        pacienteVO.setSintomaRespiratorio((String) boxRepiratorios.getSelectedItem());
        pacienteVO.setSintomaDigestivo((String) boxDigestivos.getSelectedItem());
        pacienteVO.setSintomaGeneral((String) boxGenerales.getSelectedItem());
        

        pacienteDAO.modificarPaciente(pacienteVO);
    }
}
