package Presentacion;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyecto.EnfermeroDAO;
import proyecto.EnfermeroVO;

public class MostrarEnfermero extends javax.swing.JFrame {

    public MostrarEnfermero(Hashtable<Integer, EnfermeroVO> infoEnfermero, EnfermeroDAO enfermeroDAO) {
        initComponents();
        llenarTabla(infoEnfermero);

        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEnfermero = new javax.swing.JTable();
        btnCerrarVentanna = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        tablaEnfermero.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEnfermero);

        btnCerrarVentanna.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnCerrarVentanna.setText("Cerrar ventana");
        btnCerrarVentanna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVentannaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(btnCerrarVentanna)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarVentanna)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarVentannaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVentannaActionPerformed
        super.dispose();
    }//GEN-LAST:event_btnCerrarVentannaActionPerformed

    public void llenarTabla(Hashtable<Integer, EnfermeroVO> infoEnfermero) {

        DefaultTableModel mt = new DefaultTableModel(new String[]{"Tipo Documento", "Numero Documento", "Nombre", "Apellido", "Genero",
            "Lugar de estudio"}, infoEnfermero.size());

        tablaEnfermero.setModel(mt);

        Enumeration<EnfermeroVO> Pacientes = infoEnfermero.elements();

        TableModel modeloDatos = tablaEnfermero.getModel();
        for (int i = 0; i < infoEnfermero.size(); i++) {
            EnfermeroVO e = Pacientes.nextElement();
            modeloDatos.setValueAt(e.getTipoID(), i, 0);
            modeloDatos.setValueAt(e.getNumeroID(), i, 1);
            modeloDatos.setValueAt(e.getNombre(), i, 2);
            modeloDatos.setValueAt(e.getApellido(), i, 3);
            modeloDatos.setValueAt(e.getGenero(), i, 4);
            modeloDatos.setValueAt(e.getLugarEstudio(), i, 5);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarVentanna;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEnfermero;
    // End of variables declaration//GEN-END:variables
}
