/*
package proyecto;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Paciente extends Persona {

    private String tipoSangre;
    private Hashtable<String, String> infoPaciente;
    Diagnostico diagnostico = new Diagnostico();

    public Paciente(String tipoSangre,Hashtable<String, String> infoPaciente, String nombre, String apellido, String tipoID, 
            int numeroID, String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.tipoSangre = tipoSangre;
        this.infoPaciente = infoPaciente;
        
    }

    public Paciente() {
        this.tipoSangre = "";
        this.infoPaciente = new Hashtable<>();
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Hashtable<String, String> getInfoPaciente() {
        return infoPaciente;
    }

    public void setInfoPaciente(Hashtable<String, String> infoPaciente) {
        this.infoPaciente = infoPaciente;
    }

    @Override
    public void agregarInfo() {
        super.agregarInfo();
        this.setTipoSangre(JOptionPane.showInputDialog(null, "Ingrese tipo de sangre",
                "Tipo sangre", 1));
        diagnostico.consultarSintomas();
        
    }

    @Override
    public String toString() {

        infoPaciente.put(this.getNumeroID(), super.toString() + " " + getTipoSangre() +"\n "+diagnostico.imprimir());
        setInfoPaciente(infoPaciente);
        Enumeration<String> enummeration = getInfoPaciente().elements();
        String mensaje = "";
        while (enummeration.hasMoreElements()) {
            mensaje += enummeration.nextElement();

        }
        return mensaje;
    }

}
*/