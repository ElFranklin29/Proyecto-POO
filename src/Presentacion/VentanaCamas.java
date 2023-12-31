package Presentacion;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyecto.Camas;
import proyecto.PacienteVO;


public class VentanaCamas extends javax.swing.JFrame {
    
    Camas camas;
   
    /**
     * Creates new form VentanaCamas
     * @param infoCamas
     */
    public VentanaCamas(Hashtable<Integer, PacienteVO> infoCamas, Camas camas) {
        initComponents();
        super.setLocationRelativeTo(null);
        this.camas=camas;
        llenarTabla(infoCamas);
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCamas = new javax.swing.JTable();
        btnEliminarCama = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaCamas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de documento", "Numero de cama", "Nombre", "Apellido", "Genero", "Tipo de Sangre", "Sintoma 1", "Sintoma 2", "Sintoma 3", "Enfermedad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCamas);

        btnEliminarCama.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnEliminarCama.setText("Eliminar Cama");
        btnEliminarCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEliminarCama)
                        .addGap(251, 251, 251))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarCama)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCamaActionPerformed
        super.dispose(); 
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del paciente que desea remover de la cama"));
         camas.eliminarCama(codigo);
         
    }//GEN-LAST:event_btnEliminarCamaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarCama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCamas;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla(Hashtable<Integer, PacienteVO> infoCamas) {
        DefaultTableModel mt = new DefaultTableModel(new String[]{"Numero de documento","Numero de cama", "Nombre",
            "Apellido", "Genero","Tipo de sangre","Sintoma 1", "Sintoma 2", "Sintoma 3", "Enfermedad"}, infoCamas.size());

        tablaCamas.setModel(mt);

        Enumeration<PacienteVO> Pacientes = infoCamas.elements();

        TableModel modeloDatos = tablaCamas.getModel();
        for (int i = 0; i < infoCamas.size(); i++) {
            PacienteVO e = Pacientes.nextElement();
            modeloDatos.setValueAt(e.getNumeroID(), i, 0);
            modeloDatos.setValueAt(i, i, 1);
            modeloDatos.setValueAt(e.getNombre(), i, 2);
            modeloDatos.setValueAt(e.getApellido(), i, 3);
            modeloDatos.setValueAt(e.getGenero(), i, 4);
            modeloDatos.setValueAt(e.getTipoSangre(), i, 5);
            modeloDatos.setValueAt(e.getSintomaRespiratorio(), i, 6);
            modeloDatos.setValueAt(e.getSintomaDigestivo(), i, 7);
            modeloDatos.setValueAt(e.getSintomaGeneral(), i, 8);
            modeloDatos.setValueAt(e.getEnfermedad(), i, 9);
        }
    }
}
