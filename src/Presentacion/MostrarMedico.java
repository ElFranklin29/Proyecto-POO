package Presentacion;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyecto.MedicoDAO;
import proyecto.MedicoVO;

public class MostrarMedico extends javax.swing.JFrame {

    public MostrarMedico(Hashtable<Integer, MedicoVO> infoMedico, MedicoDAO medicoDAO) {
        initComponents();
        llenarTabla(infoMedico);
        
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedico = new javax.swing.JTable();
        btnCerraVentana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaMedico.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        tablaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tipo de documento", "Numero de documento", "Primer nombre", "Primer apellido", "Genero", "Lugar de estudio"
            }
        ));
        tablaMedico.setToolTipText("");
        jScrollPane1.setViewportView(tablaMedico);

        btnCerraVentana.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnCerraVentana.setText("Cerrar ventana");
        btnCerraVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerraVentanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerraVentana)
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnCerraVentana)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerraVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerraVentanaActionPerformed
       super.dispose();
    }//GEN-LAST:event_btnCerraVentanaActionPerformed

    public void llenarTabla(Hashtable<Integer, MedicoVO> infoMedico) {
        
        DefaultTableModel mt = new DefaultTableModel(new String[]{"Tipo Documento", "Numero Documento", "Nombre","Apellido","Genero",
            "Lugar de estudio"}, infoMedico.size());

        
        
        tablaMedico.setModel(mt);     
        
         Enumeration <MedicoVO> Pacientes = infoMedico.elements();
        
        TableModel modeloDatos = tablaMedico.getModel();
        for (int i = 0; i < infoMedico.size(); i++) {
            MedicoVO e = Pacientes.nextElement();
            modeloDatos.setValueAt(e.getTipoID(), i, 0);
            modeloDatos.setValueAt( e.getNumeroID(), i, 1);
            modeloDatos.setValueAt( e.getNombre(), i, 2);
            modeloDatos.setValueAt( e.getApellido(), i, 3);
            modeloDatos.setValueAt(e.getGenero(), i, 4);
            modeloDatos.setValueAt(e.getLugarEstudio(), i, 5);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerraVentana;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMedico;
    // End of variables declaration//GEN-END:variables
}