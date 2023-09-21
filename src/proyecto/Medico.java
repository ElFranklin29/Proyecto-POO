package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Medico extends Persona {

    private String lugarEstudio;
    private boolean asignarCama;
    Medico[] infoMedico = new Medico[4];
    
    public Medico(String lugarEstudio, boolean asignarCama, String nombre, String apellido, String tipoID, int numeroID, String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.lugarEstudio = lugarEstudio;
        this.asignarCama = asignarCama;
    }

    public Medico() {
        this.lugarEstudio = " ";
        this.asignarCama = false;
    }

    public String getLugarEstudio() {
        return lugarEstudio;
    }

    public void setLugarEstudio(String lugarEstudio) {
        this.lugarEstudio = lugarEstudio;
    }

    public boolean isAsignarCama() {
        return asignarCama;
    }

    public void setAsignarCama(boolean asignarCama) {
        this.asignarCama = asignarCama;
    }

    public Medico[] infoMedicos() {
        infoMedico[0] = new Medico("Manuela Beltran", false, "Jorge",
                "Gutierrez", "Cedula", 778654, "Maculino");
        infoMedico[1] = new Medico("Manuela Beltran", false, "Hernan",
                "Gonzales", "Cedula", 978325, "Maculino");
        infoMedico[2] = new Medico("Manuela Beltran", false, "Lucia",
                "Clavijo", "Cedula", 897854, "Femenino");
        infoMedico[3] = new Medico("Manuela Beltran", false, "Valentina",
                "Mora", "Cedula", 798213, "Femenino");
        return infoMedico;
    }

    public void asignarCama() {
       
        JOptionPane.showMessageDialog(null, "Su grado de Triage fue 3, por lo tanto se le asignara una cama", "Asignar Cama", 1);
      
       
     
    }
    
    

    @Override
    public String toString() {
        return super.toString() + " " + "Cama: " + isAsignarCama();
    }

}
