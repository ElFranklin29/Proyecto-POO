
package Presentacion;

import java.util.Hashtable;
import javax.swing.JOptionPane;

import proyecto.PacienteDAO;
import proyecto.PacienteVO;


public class RecetarMedicamentos extends javax.swing.JFrame {
    PacienteVO pacienteVO;
    PacienteDAO pacienteDAO;

   
    public RecetarMedicamentos(Hashtable<Integer, PacienteVO> infoPaciente, int codigo, PacienteDAO pacienteDAO) {
        initComponents();
        super.setLocationRelativeTo(null);
        
         pacienteVO = infoPaciente.get(codigo);
        
        labelNombre.setText(pacienteVO.getNombre());
        labelApellido.setText(pacienteVO.getApellido());
        labelGenero.setText(pacienteVO.getGenero());
        labelSangre.setText(pacienteVO.getTipoSangre());
        labelEnfermedad.setText(pacienteVO.getEnfermedad());
        
        
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panelnfoPersonal = new javax.swing.JPanel();
        txtMedicamento1 = new javax.swing.JLabel();
        fieldMedicamento1 = new javax.swing.JTextField();
        txtMedicamento2 = new javax.swing.JLabel();
        fieldMedicamento2 = new javax.swing.JTextField();
        txtMedicamento3 = new javax.swing.JLabel();
        fieldMedicamento3 = new javax.swing.JTextField();
        fieldPrecioMedicamento3 = new javax.swing.JTextField();
        fieldPrecioMedicamento2 = new javax.swing.JTextField();
        fieldPrecioMedicamento1 = new javax.swing.JTextField();
        txtMedicamento4 = new javax.swing.JLabel();
        txtMedicamento5 = new javax.swing.JLabel();
        txtMedicamento6 = new javax.swing.JLabel();
        txtMedicamento7 = new javax.swing.JLabel();
        txtMedicamento8 = new javax.swing.JLabel();
        txtMedicamento9 = new javax.swing.JLabel();
        fieldCantidadMedicamentos2 = new javax.swing.JTextField();
        fieldCantidadMedicamentos1 = new javax.swing.JTextField();
        fieldCantidadMedicamentos3 = new javax.swing.JTextField();
        btnRegistrarMedicamentos = new javax.swing.JButton();
        txtRecetar = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        txtSangre = new javax.swing.JLabel();
        txtGenero = new javax.swing.JLabel();
        txtEnfermedad = new javax.swing.JLabel();
        txtInformacionPaciente = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelGenero = new javax.swing.JLabel();
        labelSangre = new javax.swing.JLabel();
        labelEnfermedad = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelnfoPersonal.setBackground(new java.awt.Color(235, 245, 251));

        txtMedicamento1.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtMedicamento1.setText("Digite medicamento 1");

        fieldMedicamento1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        txtMedicamento2.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtMedicamento2.setText("Digite medicamento 2");

        fieldMedicamento2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        txtMedicamento3.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtMedicamento3.setText("Digite medicamento 3");

        fieldMedicamento3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldPrecioMedicamento3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        fieldPrecioMedicamento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPrecioMedicamento3ActionPerformed(evt);
            }
        });

        fieldPrecioMedicamento2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldPrecioMedicamento1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        txtMedicamento4.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtMedicamento4.setText("Cantidad");

        txtMedicamento5.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        txtMedicamento5.setText("(Separar cifras con punto)");

        txtMedicamento6.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        txtMedicamento6.setText("$");

        txtMedicamento7.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        txtMedicamento7.setText("$");

        txtMedicamento8.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        txtMedicamento8.setText("$");

        txtMedicamento9.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtMedicamento9.setText("Digite precio");

        fieldCantidadMedicamentos2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldCantidadMedicamentos1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldCantidadMedicamentos3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelnfoPersonalLayout = new javax.swing.GroupLayout(panelnfoPersonal);
        panelnfoPersonal.setLayout(panelnfoPersonalLayout);
        panelnfoPersonalLayout.setHorizontalGroup(
            panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMedicamento1)
                        .addGap(18, 18, 18)
                        .addComponent(fieldMedicamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                                .addComponent(txtMedicamento2)
                                .addGap(18, 18, 18)
                                .addComponent(fieldMedicamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                                .addComponent(txtMedicamento3)
                                .addGap(18, 18, 18)
                                .addComponent(fieldMedicamento3)))))
                .addGap(27, 27, 27)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtMedicamento9)
                        .addGap(117, 117, 117))
                    .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                        .addComponent(txtMedicamento5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMedicamento4)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                        .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMedicamento6)
                            .addComponent(txtMedicamento7)
                            .addComponent(txtMedicamento8))
                        .addGap(18, 18, 18)
                        .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldPrecioMedicamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPrecioMedicamento3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPrecioMedicamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelnfoPersonalLayout.createSequentialGroup()
                                .addComponent(fieldCantidadMedicamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldCantidadMedicamentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCantidadMedicamentos3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        panelnfoPersonalLayout.setVerticalGroup(
            panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMedicamento9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtMedicamento4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelnfoPersonalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedicamento5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldMedicamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMedicamento1)
                        .addComponent(txtMedicamento6)
                        .addComponent(fieldCantidadMedicamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldPrecioMedicamento1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldMedicamento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedicamento2)
                    .addComponent(txtMedicamento7)
                    .addComponent(fieldCantidadMedicamentos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPrecioMedicamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldMedicamento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedicamento3)
                    .addComponent(fieldPrecioMedicamento3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedicamento8)
                    .addComponent(fieldCantidadMedicamentos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnRegistrarMedicamentos.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnRegistrarMedicamentos.setText("Recetar");
        btnRegistrarMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMedicamentosActionPerformed(evt);
            }
        });

        txtRecetar.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        txtRecetar.setText("Recetar medicamentos ");

        txtNombre.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtNombre.setText("Nombre del paciente:");

        txtApellido.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtApellido.setText("Apellido del paciente:");

        txtSangre.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtSangre.setText("Tipo de sangre:");

        txtGenero.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtGenero.setText("Genero:");

        txtEnfermedad.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtEnfermedad.setText("Enfermedad:");

        txtInformacionPaciente.setFont(new java.awt.Font("OCR A Extended", 1, 17)); // NOI18N
        txtInformacionPaciente.setText("Informacion del paciente");

        labelNombre.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        labelApellido.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        labelGenero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        labelSangre.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        labelEnfermedad.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelnfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrarMedicamentos)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtRecetar)
                        .addGap(198, 198, 198))))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInformacionPaciente)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSangre)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(txtEnfermedad)
                            .addComponent(txtGenero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelApellido)
                            .addComponent(labelGenero)
                            .addComponent(labelSangre)
                            .addComponent(labelEnfermedad))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtRecetar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInformacionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido)
                    .addComponent(labelApellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSangre)
                    .addComponent(labelSangre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero)
                    .addComponent(labelGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnfermedad)
                    .addComponent(labelEnfermedad))
                .addGap(18, 18, 18)
                .addComponent(panelnfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarMedicamentos)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMedicamentosActionPerformed
        recetarMedicamentos();
        JOptionPane.showMessageDialog(null, "se recetaron los medicamentos con exito",
                "Medicamentos", JOptionPane.INFORMATION_MESSAGE);
        super.dispose();
    }//GEN-LAST:event_btnRegistrarMedicamentosActionPerformed

    private void fieldPrecioMedicamento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPrecioMedicamento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPrecioMedicamento3ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarMedicamentos;
    private javax.swing.JTextField fieldCantidadMedicamentos1;
    private javax.swing.JTextField fieldCantidadMedicamentos2;
    private javax.swing.JTextField fieldCantidadMedicamentos3;
    private javax.swing.JTextField fieldMedicamento1;
    private javax.swing.JTextField fieldMedicamento2;
    private javax.swing.JTextField fieldMedicamento3;
    private javax.swing.JTextField fieldPrecioMedicamento1;
    private javax.swing.JTextField fieldPrecioMedicamento2;
    private javax.swing.JTextField fieldPrecioMedicamento3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelEnfermedad;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSangre;
    private javax.swing.JPanel panelnfoPersonal;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtEnfermedad;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtInformacionPaciente;
    private javax.swing.JLabel txtMedicamento1;
    private javax.swing.JLabel txtMedicamento2;
    private javax.swing.JLabel txtMedicamento3;
    private javax.swing.JLabel txtMedicamento4;
    private javax.swing.JLabel txtMedicamento5;
    private javax.swing.JLabel txtMedicamento6;
    private javax.swing.JLabel txtMedicamento7;
    private javax.swing.JLabel txtMedicamento8;
    private javax.swing.JLabel txtMedicamento9;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtRecetar;
    private javax.swing.JLabel txtSangre;
    // End of variables declaration//GEN-END:variables

    private void recetarMedicamentos() {
       pacienteVO.setMedicamento1(fieldMedicamento1.getText());
       pacienteVO.setMedicamento2(fieldMedicamento2.getText());
       pacienteVO.setMedicamento3(fieldMedicamento3.getText());
       
       
       pacienteVO.setPrecioMedicamento1(Integer.parseInt(fieldPrecioMedicamento1.getText()));
       pacienteVO.setPrecioMedicamento2(Integer.parseInt(fieldPrecioMedicamento2.getText()));
       pacienteVO.setPrecioMedicamento3(Integer.parseInt(fieldPrecioMedicamento3.getText()));
       
       pacienteVO.setCantidadMedicamento1(Integer.parseInt(fieldCantidadMedicamentos1.getText()));
       pacienteVO.setCantidadMedicamento2(Integer.parseInt(fieldCantidadMedicamentos2.getText()));
       pacienteVO.setCantidadMedicamento3(Integer.parseInt(fieldCantidadMedicamentos3.getText()));
        
        
    
    
    }
}
