package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Hospital {

    int opt = 0;
    Paciente paciente = new Paciente();
    ArrayList<String> infoPacientes = new ArrayList<>();
    Medico medico = new Medico();
    Enfermero enfermero = new Enfermero();
    

    public void menuPrincipal() {

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar Paciente\n"
                    + "2. Consultar Paciente\n"
                    + "3. Consultar Doctores(as)\n"
                    + "4. Consultar enfemeros(as)\n"
                    + "5. Salir", "Menu Principal", 1));
            switch (opt) {
                case 1:
                    paciente.agregarInfo();

                    infoPacientes.add(paciente.toString() + "\n");
                    System.out.println(enfermero.guardarDianostico());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Lista de pacientes:\n" + infoPacientes,
                            "Pacientes", 1);
                    
                    
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, medico.infoMedicos(),
                            "Listado Doctores(as)", 1);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, enfermero.infoEnfermeros(),
                            "Listado Enfermeros(as)", 1);
                    break;
            }
        } while (opt != 5);
        JOptionPane.showMessageDialog(null, "¡Hasta Luego!",
                "Salir", 1);
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.menuPrincipal();
    }
}
