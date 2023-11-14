package Presentacion;

import javax.swing.JOptionPane;
import proyecto.Camas;
import proyecto.Diagnostico;
import proyecto.EnfermeroDAO;
import proyecto.EnfermeroVO;
import proyecto.MedicoDAO;
import proyecto.MedicoVO;
import proyecto.PacienteDAO;
import proyecto.PacienteVO;

public class MenuPrincipal extends javax.swing.JFrame {

    PacienteDAO pacienteDAO = new PacienteDAO();
    MedicoDAO medicoDAO = new MedicoDAO();
    EnfermeroDAO enfermeroDAO= new EnfermeroDAO();
    Camas camas = new Camas();

    public MenuPrincipal() {
        initComponents();
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelPaciente = new javax.swing.JPanel();
        panelnfoPersonal = new javax.swing.JPanel();
        txtNumeroDocumentoPaciente = new javax.swing.JLabel();
        fieldNumeroDocumentoPaciente = new javax.swing.JTextField();
        txtTipoDocumentoPaciente = new javax.swing.JLabel();
        boxTipoDocPaciente = new javax.swing.JComboBox<>();
        txtNombrePaciente = new javax.swing.JLabel();
        fieldNombrePaciente = new javax.swing.JTextField();
        txtApellidoPaciente = new javax.swing.JLabel();
        fieldApellidoPaciente = new javax.swing.JTextField();
        txtGeneroPaciente = new javax.swing.JLabel();
        boxGeneroPaciente = new javax.swing.JComboBox<>();
        txtSangrePaciente = new javax.swing.JLabel();
        fieldSangrePaciente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelSintomas = new javax.swing.JPanel();
        txtSistemaRepiratorio = new javax.swing.JLabel();
        boxRepiratorios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtCirculatorio = new javax.swing.JLabel();
        txtSistemaDigestivo = new javax.swing.JLabel();
        txtAbdomen = new javax.swing.JLabel();
        boxDigestivos = new javax.swing.JComboBox<>();
        boxGenerales = new javax.swing.JComboBox<>();
        txtSistemaRepiratorio2 = new javax.swing.JLabel();
        btnRegistrarPaciente = new javax.swing.JButton();
        btnMostrarPaciente = new javax.swing.JButton();
        btnEliminarPaciente = new javax.swing.JButton();
        btnModificarPaciente = new javax.swing.JButton();
        txtTituloPaciente = new javax.swing.JLabel();
        txtRegistrarPaciente = new javax.swing.JLabel();
        panelEnfermero = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTipoDocumentoEnfermero = new javax.swing.JLabel();
        txtNumeroDocumentoEnfermero = new javax.swing.JLabel();
        txtNombreEnfermero = new javax.swing.JLabel();
        txtApellidoEnfermero = new javax.swing.JLabel();
        txtGeneroEnfermero = new javax.swing.JLabel();
        txtLugarEstudioEnfermero = new javax.swing.JLabel();
        boxTipoDocEnfermero = new javax.swing.JComboBox<>();
        fieldNumeroDocumentoEnfermero = new javax.swing.JTextField();
        fieldNombreEnfermero = new javax.swing.JTextField();
        fieldApellidoEnfermero = new javax.swing.JTextField();
        fieldLugarEstudioEnfermero = new javax.swing.JTextField();
        boxGeneroEnfermero = new javax.swing.JComboBox<>();
        btnRegistrarEnfermero = new javax.swing.JButton();
        btnEliminarEnfermero = new javax.swing.JButton();
        btnMostrarEnfermero = new javax.swing.JButton();
        btnAdministrarCamas = new javax.swing.JButton();
        btnModificarEnfermero = new javax.swing.JButton();
        panelDoctor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTipoDocumentoMedico = new javax.swing.JLabel();
        txtNumeroDocumentoMedico = new javax.swing.JLabel();
        txtNombreMedico = new javax.swing.JLabel();
        txtApellidoMedico = new javax.swing.JLabel();
        txtGeneroMedico = new javax.swing.JLabel();
        txtLugarEstudioMedico = new javax.swing.JLabel();
        boxTipoDocMedico = new javax.swing.JComboBox<>();
        boxGeneroMedico = new javax.swing.JComboBox<>();
        fieldNumeroDocumentoMedico = new javax.swing.JTextField();
        fieldNombreMedico = new javax.swing.JTextField();
        fieldApellidoMedico = new javax.swing.JTextField();
        fieldLugarEstudio = new javax.swing.JTextField();
        btnRecetarMedicamentos = new javax.swing.JButton();
        btnRegistrarMedico = new javax.swing.JButton();
        btnEliminarMedico = new javax.swing.JButton();
        btnMostrarMedicos = new javax.swing.JButton();
        btnModificarMedico = new javax.swing.JButton();
        txTituloDoctor = new javax.swing.JLabel();
        panelFactura = new javax.swing.JPanel();
        btnGenerarFactura = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTipoDocumentoMedico1 = new javax.swing.JLabel();
        txtTipoDocumentoMedico2 = new javax.swing.JLabel();
        txtTipoDocumentoMedico3 = new javax.swing.JLabel();
        txtTipoDocumentoMedico4 = new javax.swing.JLabel();
        txtTipoDocumentoMedico5 = new javax.swing.JLabel();
        txtTipoDocumentoMedico6 = new javax.swing.JLabel();
        fastAndCareful = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(235, 241, 245));

        panelPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        panelnfoPersonal.setBackground(new java.awt.Color(235, 245, 251));

        txtNumeroDocumentoPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtNumeroDocumentoPaciente.setText("Numero de documento");

        fieldNumeroDocumentoPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        fieldNumeroDocumentoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNumeroDocumentoPacienteActionPerformed(evt);
            }
        });

        txtTipoDocumentoPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtTipoDocumentoPaciente.setText("Tipo de documento");

        boxTipoDocPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxTipoDocPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Documento", "Cedula", "Tarjeta De Identidad", "Otro" }));

        txtNombrePaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtNombrePaciente.setText("Primer nombre");

        fieldNombrePaciente.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        fieldNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombrePacienteActionPerformed(evt);
            }
        });

        txtApellidoPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtApellidoPaciente.setText("Primer apellido");

        fieldApellidoPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        txtGeneroPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtGeneroPaciente.setText("Genero");

        boxGeneroPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxGeneroPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione genero", "Masculino", "Femenino" }));

        txtSangrePaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtSangrePaciente.setText("Tipo de sangre");

        fieldSangrePaciente.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

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
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroDocumentoPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTipoDocumentoPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombrePaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellidoPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGeneroPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSangrePaciente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxTipoDocPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxGeneroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNumeroDocumentoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldApellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSangrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelnfoPersonalLayout.setVerticalGroup(
            panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnfoPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDocumentoPaciente)
                    .addComponent(boxTipoDocPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroDocumentoPaciente)
                    .addComponent(fieldNumeroDocumentoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePaciente)
                    .addComponent(fieldNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldApellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoPaciente))
                .addGap(15, 15, 15)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneroPaciente)
                    .addComponent(boxGeneroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelnfoPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSangrePaciente)
                    .addComponent(fieldSangrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelSintomas.setBackground(new java.awt.Color(235, 245, 251));

        txtSistemaRepiratorio.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtSistemaRepiratorio.setText("Sistema respiratorio/");

        boxRepiratorios.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxRepiratorios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Presion arterial", "Taquicardia", "Tos" }));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 15)); // NOI18N
        jLabel2.setText("Sintomas");

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

        txtSistemaRepiratorio2.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtSistemaRepiratorio2.setText("Generales");

        javax.swing.GroupLayout panelSintomasLayout = new javax.swing.GroupLayout(panelSintomas);
        panelSintomas.setLayout(panelSintomasLayout);
        panelSintomasLayout.setHorizontalGroup(
            panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSintomasLayout.createSequentialGroup()
                .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSintomasLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSistemaRepiratorio)
                            .addComponent(txtCirculatorio))
                        .addGap(18, 18, 18)
                        .addComponent(boxRepiratorios, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSintomasLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel2))
                    .addGroup(panelSintomasLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSistemaDigestivo)
                            .addComponent(txtAbdomen)
                            .addComponent(txtSistemaRepiratorio2))
                        .addGap(18, 18, 18)
                        .addGroup(panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxDigestivos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxGenerales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelSintomasLayout.setVerticalGroup(
            panelSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSintomasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
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
                    .addComponent(txtSistemaRepiratorio2))
                .addGap(68, 68, 68))
        );

        btnRegistrarPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnRegistrarPaciente.setText("Registrar Paciente");
        btnRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPacienteActionPerformed(evt);
            }
        });

        btnMostrarPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnMostrarPaciente.setText("Mostrar Pacientes");
        btnMostrarPaciente.setToolTipText("");
        btnMostrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPacienteActionPerformed(evt);
            }
        });

        btnEliminarPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnEliminarPaciente.setText("Eliminar Paciente");
        btnEliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPacienteActionPerformed(evt);
            }
        });

        btnModificarPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnModificarPaciente.setText("Modificar Paciente");
        btnModificarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPacienteActionPerformed(evt);
            }
        });

        txtTituloPaciente.setFont(new java.awt.Font("OCR A Extended", 1, 28)); // NOI18N
        txtTituloPaciente.setText("PACIENTE");

        txtRegistrarPaciente.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        txtRegistrarPaciente.setText("Registrar un paciente");

        javax.swing.GroupLayout panelPacienteLayout = new javax.swing.GroupLayout(panelPaciente);
        panelPaciente.setLayout(panelPacienteLayout);
        panelPacienteLayout.setHorizontalGroup(
            panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacienteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPacienteLayout.createSequentialGroup()
                        .addComponent(panelnfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(panelSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPacienteLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnEliminarPaciente)
                        .addGap(47, 47, 47)
                        .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarPaciente)
                            .addGroup(panelPacienteLayout.createSequentialGroup()
                                .addComponent(btnMostrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnModificarPaciente))))
                    .addGroup(panelPacienteLayout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(txtRegistrarPaciente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPacienteLayout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(txtTituloPaciente)
                        .addGap(367, 367, 367)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelPacienteLayout.setVerticalGroup(
            panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacienteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtTituloPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegistrarPaciente)
                .addGap(20, 20, 20)
                .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelnfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarPaciente)
                .addGap(18, 18, 18)
                .addGroup(panelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarPaciente)
                    .addComponent(btnModificarPaciente)
                    .addComponent(btnEliminarPaciente))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Paciente", panelPaciente);

        panelEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 28)); // NOI18N
        jLabel3.setText("ENFERMERO");

        jPanel5.setBackground(new java.awt.Color(235, 241, 245));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 15)); // NOI18N
        jLabel4.setText("Informacion Personal");

        txtTipoDocumentoEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtTipoDocumentoEnfermero.setText("Tipo de documento");

        txtNumeroDocumentoEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtNumeroDocumentoEnfermero.setText("Numero de documento");

        txtNombreEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtNombreEnfermero.setText("Primer nombre");

        txtApellidoEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtApellidoEnfermero.setText("Primer apellido");

        txtGeneroEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtGeneroEnfermero.setText("Genero");

        txtLugarEstudioEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtLugarEstudioEnfermero.setText("Lugar de estudio");

        boxTipoDocEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxTipoDocEnfermero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Documento", "Cedula", "Tarjeta De Identidad", "Otro" }));

        fieldNumeroDocumentoEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldNombreEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        fieldNombreEnfermero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreEnfermeroActionPerformed(evt);
            }
        });

        fieldApellidoEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldLugarEstudioEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        boxGeneroEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxGeneroEnfermero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione genero", "Masculino", "Femenino" }));

        btnRegistrarEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnRegistrarEnfermero.setText("Registrar Enfermero");
        btnRegistrarEnfermero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEnfermeroActionPerformed(evt);
            }
        });

        btnEliminarEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnEliminarEnfermero.setText("Eliminar Enfermero");
        btnEliminarEnfermero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEnfermeroActionPerformed(evt);
            }
        });

        btnMostrarEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnMostrarEnfermero.setText("Mostrar Enfermeros");
        btnMostrarEnfermero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEnfermeroActionPerformed(evt);
            }
        });

        btnAdministrarCamas.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnAdministrarCamas.setText("Administrar Camas");
        btnAdministrarCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarCamasActionPerformed(evt);
            }
        });

        btnModificarEnfermero.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnModificarEnfermero.setText("Modificar Enfermero");
        btnModificarEnfermero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEnfermeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrarEnfermero)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtApellidoEnfermero)
                                    .addComponent(txtNombreEnfermero)
                                    .addComponent(txtGeneroEnfermero)
                                    .addComponent(txtLugarEstudioEnfermero))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldApellidoEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxGeneroEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldNombreEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldLugarEstudioEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTipoDocumentoEnfermero)
                                    .addComponent(txtNumeroDocumentoEnfermero))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldNumeroDocumentoEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxTipoDocEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(btnEliminarEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarEnfermero))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(btnMostrarEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdministrarCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel4)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDocumentoEnfermero)
                    .addComponent(boxTipoDocEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNumeroDocumentoEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroDocumentoEnfermero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNombreEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEnfermero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldApellidoEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoEnfermero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxGeneroEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroEnfermero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldLugarEstudioEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLugarEstudioEnfermero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEnfermero)
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdministrarCamas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarEnfermero)
                    .addComponent(btnEliminarEnfermero))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(379, 379, 379))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout panelEnfermeroLayout = new javax.swing.GroupLayout(panelEnfermero);
        panelEnfermero.setLayout(panelEnfermeroLayout);
        panelEnfermeroLayout.setHorizontalGroup(
            panelEnfermeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnfermeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEnfermeroLayout.setVerticalGroup(
            panelEnfermeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnfermeroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Enfermero(a)", panelEnfermero);

        panelDoctor.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(235, 245, 251));

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 15)); // NOI18N
        jLabel5.setText("Informacion Personal");

        txtTipoDocumentoMedico.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtTipoDocumentoMedico.setText("Tipo de documento");

        txtNumeroDocumentoMedico.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtNumeroDocumentoMedico.setText("Numero de documento");

        txtNombreMedico.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtNombreMedico.setText("Primer nombre");

        txtApellidoMedico.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtApellidoMedico.setText("Primer apellido");

        txtGeneroMedico.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtGeneroMedico.setText("Genero");

        txtLugarEstudioMedico.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtLugarEstudioMedico.setText("Lugar de estudio");

        boxTipoDocMedico.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxTipoDocMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo Documento", "Cedula", "Tarjeta De Identidad", "Otro" }));

        boxGeneroMedico.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        boxGeneroMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione genero", "Masculino", "Femenino" }));
        boxGeneroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxGeneroMedicoActionPerformed(evt);
            }
        });

        fieldNumeroDocumentoMedico.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldNombreMedico.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldApellidoMedico.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        fieldLugarEstudio.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        btnRecetarMedicamentos.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnRecetarMedicamentos.setText("Recetar Medicamentos");
        btnRecetarMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetarMedicamentosActionPerformed(evt);
            }
        });

        btnRegistrarMedico.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnRegistrarMedico.setText("Registrar Medico");
        btnRegistrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMedicoActionPerformed(evt);
            }
        });

        btnEliminarMedico.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnEliminarMedico.setText("Eliminar Medico");
        btnEliminarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMedicoActionPerformed(evt);
            }
        });

        btnMostrarMedicos.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnMostrarMedicos.setText("Mostrar Medicos");
        btnMostrarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMedicosActionPerformed(evt);
            }
        });

        btnModificarMedico.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnModificarMedico.setText("Modificar Medico");
        btnModificarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumeroDocumentoMedico)
                    .addComponent(txtTipoDocumentoMedico)
                    .addComponent(txtNombreMedico)
                    .addComponent(txtApellidoMedico)
                    .addComponent(txtGeneroMedico)
                    .addComponent(txtLugarEstudioMedico))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxTipoDocMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNumeroDocumentoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldApellidoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxGeneroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldLugarEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRegistrarMedico)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMostrarMedicos)
                            .addComponent(btnEliminarMedico))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarMedico)
                            .addComponent(btnRecetarMedicamentos))
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(148, 148, 148))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDocumentoMedico)
                    .addComponent(boxTipoDocMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNumeroDocumentoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroDocumentoMedico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreMedico)
                    .addComponent(fieldNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldApellidoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoMedico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGeneroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(boxGeneroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldLugarEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLugarEstudioMedico))))
                .addGap(16, 16, 16)
                .addComponent(btnRegistrarMedico)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarMedico)
                    .addComponent(btnMostrarMedicos))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarMedico)
                    .addComponent(btnRecetarMedicamentos))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        txTituloDoctor.setFont(new java.awt.Font("OCR A Extended", 1, 28)); // NOI18N
        txTituloDoctor.setText("Medico");

        javax.swing.GroupLayout panelDoctorLayout = new javax.swing.GroupLayout(panelDoctor);
        panelDoctor.setLayout(panelDoctorLayout);
        panelDoctorLayout.setHorizontalGroup(
            panelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoctorLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDoctorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txTituloDoctor)
                .addGap(400, 400, 400))
        );
        panelDoctorLayout.setVerticalGroup(
            panelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDoctorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txTituloDoctor)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Medico", panelDoctor);

        btnGenerarFactura.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        btnGenerarFactura.setText("Generar Factura");
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(235, 245, 251));

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 1, 15)); // NOI18N

        txtTipoDocumentoMedico1.setFont(new java.awt.Font("OCR A Extended", 1, 15)); // NOI18N
        txtTipoDocumentoMedico1.setText("¿Como se factura?");

        txtTipoDocumentoMedico2.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtTipoDocumentoMedico2.setText("1. El medico te debe haber recetado los medicamentos");

        txtTipoDocumentoMedico3.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtTipoDocumentoMedico3.setText("2. Se suma los medicamentos y se multiplican por sus ");

        txtTipoDocumentoMedico4.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtTipoDocumentoMedico4.setText("respectivas cantidades");

        txtTipoDocumentoMedico5.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtTipoDocumentoMedico5.setText("3. Si tu nivel de triage fue 3, se sumara 40000 al ");

        txtTipoDocumentoMedico6.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        txtTipoDocumentoMedico6.setText("total");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(148, 148, 148))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoDocumentoMedico5)
                            .addComponent(txtTipoDocumentoMedico3)
                            .addComponent(txtTipoDocumentoMedico2)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtTipoDocumentoMedico4)))
                        .addGap(0, 15, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtTipoDocumentoMedico6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTipoDocumentoMedico1)
                .addGap(164, 164, 164))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(txtTipoDocumentoMedico1)
                .addGap(15, 15, 15)
                .addComponent(txtTipoDocumentoMedico2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipoDocumentoMedico3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoDocumentoMedico4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipoDocumentoMedico5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoDocumentoMedico6)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
        panelFactura.setLayout(panelFacturaLayout);
        panelFacturaLayout.setHorizontalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnGenerarFactura))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        panelFacturaLayout.setVerticalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFacturaLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnGenerarFactura)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Factura", panelFactura);

        fastAndCareful.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        fastAndCareful.setText("FAST AND CAREFUL (F&C)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(fastAndCareful)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(fastAndCareful)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNumeroDocumentoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNumeroDocumentoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNumeroDocumentoPacienteActionPerformed

    private void fieldNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombrePacienteActionPerformed

    private void btnRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPacienteActionPerformed
        registrarPaciente();

        fieldNumeroDocumentoPaciente.setText("");
        fieldNombrePaciente.setText("");
        fieldApellidoPaciente.setText("");
        fieldSangrePaciente.setText("");
        boxTipoDocPaciente.setSelectedIndex(0);
        boxGeneroPaciente.setSelectedIndex(0);
        boxRepiratorios.setSelectedIndex(0);
        boxDigestivos.setSelectedIndex(0);
        boxGenerales.setSelectedIndex(0);
    }//GEN-LAST:event_btnRegistrarPacienteActionPerformed

    private void btnMostrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPacienteActionPerformed
        MostrarPaciente mostrar = new MostrarPaciente(pacienteDAO.getInfoPaciente(), pacienteDAO);
        mostrar.setVisible(true);
    }//GEN-LAST:event_btnMostrarPacienteActionPerformed

    private void btnEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPacienteActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del paciente que desea eliminar"));
        pacienteDAO.eliminarPaciente(codigo);
    }//GEN-LAST:event_btnEliminarPacienteActionPerformed

    private void btnModificarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPacienteActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del paciente que desea actualizar"));
        pacienteDAO.actualizarPaciente(codigo, pacienteDAO, camas);
    }//GEN-LAST:event_btnModificarPacienteActionPerformed

    private void btnAdministrarCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarCamasActionPerformed
        camas.ventanaCamas();
    }//GEN-LAST:event_btnAdministrarCamasActionPerformed

    private void btnRecetarMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetarMedicamentosActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del paciente al que desea recetar medicamentos"));
        pacienteDAO.diagnosticarMedicamentos(codigo, pacienteDAO);
    }//GEN-LAST:event_btnRecetarMedicamentosActionPerformed

    private void boxGeneroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxGeneroMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxGeneroMedicoActionPerformed

    private void btnRegistrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMedicoActionPerformed
        registrarMedico();
    }//GEN-LAST:event_btnRegistrarMedicoActionPerformed

    private void btnEliminarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMedicoActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del medico que desea eliminar"));
        medicoDAO.eliminarMedico(codigo);
    }//GEN-LAST:event_btnEliminarMedicoActionPerformed

    private void btnMostrarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMedicosActionPerformed
        MostrarMedico mostrar = new MostrarMedico(medicoDAO.getInfoMedico(), medicoDAO);
        mostrar.setVisible(true);
    }//GEN-LAST:event_btnMostrarMedicosActionPerformed

    private void btnRegistrarEnfermeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEnfermeroActionPerformed
        registrarEnfermero();
    }//GEN-LAST:event_btnRegistrarEnfermeroActionPerformed

    private void btnModificarEnfermeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEnfermeroActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del enfermero que desea actualizar"));
        enfermeroDAO.actualizarEnfermero(codigo, enfermeroDAO);
    }//GEN-LAST:event_btnModificarEnfermeroActionPerformed

    private void btnModificarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMedicoActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del Medico que desea actualizar"));
        medicoDAO.actualizarMedico(codigo, medicoDAO);
    }//GEN-LAST:event_btnModificarMedicoActionPerformed

    private void btnEliminarEnfermeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEnfermeroActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del enfermero que desea eliminar"));
        enfermeroDAO.eliminarEnfermero(codigo);
    }//GEN-LAST:event_btnEliminarEnfermeroActionPerformed

    private void btnMostrarEnfermeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEnfermeroActionPerformed
        MostrarEnfermero mostrar = new MostrarEnfermero(enfermeroDAO.getInfoEnfermero(), enfermeroDAO);
        mostrar.setVisible(true);
    }//GEN-LAST:event_btnMostrarEnfermeroActionPerformed

    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese documento del paciente que desea actualizar"));
        pacienteDAO.generaraFactura(codigo, pacienteDAO);
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    private void fieldNombreEnfermeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreEnfermeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreEnfermeroActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDigestivos;
    private javax.swing.JComboBox<String> boxGenerales;
    private javax.swing.JComboBox<String> boxGeneroEnfermero;
    private javax.swing.JComboBox<String> boxGeneroMedico;
    private javax.swing.JComboBox<String> boxGeneroPaciente;
    private javax.swing.JComboBox<String> boxRepiratorios;
    private javax.swing.JComboBox<String> boxTipoDocEnfermero;
    private javax.swing.JComboBox<String> boxTipoDocMedico;
    private javax.swing.JComboBox<String> boxTipoDocPaciente;
    private javax.swing.JButton btnAdministrarCamas;
    private javax.swing.JButton btnEliminarEnfermero;
    private javax.swing.JButton btnEliminarMedico;
    private javax.swing.JButton btnEliminarPaciente;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JButton btnModificarEnfermero;
    private javax.swing.JButton btnModificarMedico;
    private javax.swing.JButton btnModificarPaciente;
    private javax.swing.JButton btnMostrarEnfermero;
    private javax.swing.JButton btnMostrarMedicos;
    private javax.swing.JButton btnMostrarPaciente;
    private javax.swing.JButton btnRecetarMedicamentos;
    private javax.swing.JButton btnRegistrarEnfermero;
    private javax.swing.JButton btnRegistrarMedico;
    private javax.swing.JButton btnRegistrarPaciente;
    private javax.swing.JLabel fastAndCareful;
    private javax.swing.JTextField fieldApellidoEnfermero;
    private javax.swing.JTextField fieldApellidoMedico;
    private javax.swing.JTextField fieldApellidoPaciente;
    private javax.swing.JTextField fieldLugarEstudio;
    private javax.swing.JTextField fieldLugarEstudioEnfermero;
    private javax.swing.JTextField fieldNombreEnfermero;
    private javax.swing.JTextField fieldNombreMedico;
    private javax.swing.JTextField fieldNombrePaciente;
    private javax.swing.JTextField fieldNumeroDocumentoEnfermero;
    private javax.swing.JTextField fieldNumeroDocumentoMedico;
    private javax.swing.JTextField fieldNumeroDocumentoPaciente;
    private javax.swing.JTextField fieldSangrePaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelDoctor;
    private javax.swing.JPanel panelEnfermero;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JPanel panelPaciente;
    private javax.swing.JPanel panelSintomas;
    private javax.swing.JPanel panelnfoPersonal;
    private javax.swing.JLabel txTituloDoctor;
    private javax.swing.JLabel txtAbdomen;
    private javax.swing.JLabel txtApellidoEnfermero;
    private javax.swing.JLabel txtApellidoMedico;
    private javax.swing.JLabel txtApellidoPaciente;
    private javax.swing.JLabel txtCirculatorio;
    private javax.swing.JLabel txtGeneroEnfermero;
    private javax.swing.JLabel txtGeneroMedico;
    private javax.swing.JLabel txtGeneroPaciente;
    private javax.swing.JLabel txtLugarEstudioEnfermero;
    private javax.swing.JLabel txtLugarEstudioMedico;
    private javax.swing.JLabel txtNombreEnfermero;
    private javax.swing.JLabel txtNombreMedico;
    private javax.swing.JLabel txtNombrePaciente;
    private javax.swing.JLabel txtNumeroDocumentoEnfermero;
    private javax.swing.JLabel txtNumeroDocumentoMedico;
    private javax.swing.JLabel txtNumeroDocumentoPaciente;
    private javax.swing.JLabel txtRegistrarPaciente;
    private javax.swing.JLabel txtSangrePaciente;
    private javax.swing.JLabel txtSistemaDigestivo;
    private javax.swing.JLabel txtSistemaRepiratorio;
    private javax.swing.JLabel txtSistemaRepiratorio2;
    private javax.swing.JLabel txtTipoDocumentoEnfermero;
    private javax.swing.JLabel txtTipoDocumentoMedico;
    private javax.swing.JLabel txtTipoDocumentoMedico1;
    private javax.swing.JLabel txtTipoDocumentoMedico2;
    private javax.swing.JLabel txtTipoDocumentoMedico3;
    private javax.swing.JLabel txtTipoDocumentoMedico4;
    private javax.swing.JLabel txtTipoDocumentoMedico5;
    private javax.swing.JLabel txtTipoDocumentoMedico6;
    private javax.swing.JLabel txtTipoDocumentoPaciente;
    private javax.swing.JLabel txtTituloPaciente;
    // End of variables declaration//GEN-END:variables

    private void registrarPaciente() {
        PacienteVO pacienteVO = new PacienteVO();
        pacienteVO.setNumeroID(Integer.parseInt(fieldNumeroDocumentoPaciente.getText()));
        pacienteVO.setTipoID((String) boxTipoDocPaciente.getSelectedItem());
        pacienteVO.setNombre(fieldNombrePaciente.getText());
        pacienteVO.setApellido(fieldApellidoPaciente.getText());
        pacienteVO.setGenero((String) boxGeneroPaciente.getSelectedItem());
        pacienteVO.setTipoSangre(fieldSangrePaciente.getText());

        pacienteVO.setSintomaRespiratorio((String) boxRepiratorios.getSelectedItem());
        pacienteVO.setSintomaDigestivo((String) boxDigestivos.getSelectedItem());
        pacienteVO.setSintomaGeneral((String) boxGenerales.getSelectedItem());

        pacienteDAO.registrarPaciente(pacienteVO);

        Diagnostico diagnostico = new Diagnostico();
        diagnostico.dianosticarPaciente(pacienteVO);
        diagnostico.asignarCama(camas);
    }

    private void registrarMedico() {
        MedicoVO medicoVO = new MedicoVO();
        medicoVO.setNumeroID(Integer.parseInt(fieldNumeroDocumentoMedico.getText()));
        medicoVO.setTipoID((String) boxTipoDocMedico.getSelectedItem());
        medicoVO.setNombre(fieldNombreMedico.getText());
        medicoVO.setApellido(fieldApellidoMedico.getText());
        medicoVO.setGenero((String) boxGeneroMedico.getSelectedItem());
        medicoVO.setLugarEstudio(fieldLugarEstudio.getText());

        medicoDAO.registrarMedico(medicoVO);
    }

    
    private void registrarEnfermero() {
        EnfermeroVO enfermeroVO = new EnfermeroVO();
        enfermeroVO.setNumeroID(Integer.parseInt(fieldNumeroDocumentoEnfermero.getText()));
        enfermeroVO.setTipoID((String) boxTipoDocEnfermero.getSelectedItem());
        enfermeroVO.setNombre(fieldNombreEnfermero.getText());
        enfermeroVO.setApellido(fieldApellidoEnfermero.getText());
        enfermeroVO.setGenero((String) boxGeneroEnfermero.getSelectedItem());
        enfermeroVO.setLugarEstudio(fieldLugarEstudioEnfermero.getText());

        enfermeroDAO.registrarEnfermero(enfermeroVO);
    }


}
