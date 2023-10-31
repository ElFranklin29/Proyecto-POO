package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Enfermero extends Persona {

    private String lugarEstudio;
    private String medicina;
    Enfermero[] infoEnfermero = new Enfermero[4];
  
    
    ArrayList<String> infoDiagnosticos = new ArrayList<>();
    
    private boolean cama;
    String[] triage1 = {"Síndrome de fatiga crónica", "Gripe", "Blefaritis", "Artritis reumatoide",
        "Novovirus", "Deshidratación severa", "Lupus", "Neumonía", "Anemia"};

    public Enfermero(String sintoma1, String sintoma2, String sintoma3) {
       
    }

  
    
    public Enfermero(String lugarEstudio, String medicina, String nombre, String apellido, String tipoID, String numeroID,
            String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.lugarEstudio = lugarEstudio;
        this.medicina = medicina;

    }

    public Enfermero() {
        this.lugarEstudio = " ";
        this.medicina = " ";
       
        this.cama = false;
    }

    public boolean isCama() {
        return cama;
    }

    public void setCama(boolean cama) {
        this.cama = cama;
    }

    

    public String getLugarEstudio() {
        return lugarEstudio;
    }

    public void setLugarEstudio(String lugarEstudio) {
        this.lugarEstudio = lugarEstudio;
    }

    public String getMedicina() {
        return medicina;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }

    public Enfermero[] infoEnfermeros() {

        infoEnfermero[0] = new Enfermero("Manuela Beltran", "Null", "Felix",
                "Montiel", "Cedula", "4563538", "Maculino");
        infoEnfermero[1] = new Enfermero("U.Distrital", "Null", "Alejandro",
                "Parra", "Cedula", "1325668", "Maculino");
        infoEnfermero[2] = new Enfermero("Manuela Beltran", "Null", "Sofia",
                "Buritica", "Cedula", "363598", "Femenino");
        infoEnfermero[3] = new Enfermero("U.Nacional", "Null", "Karen",
                "Molano", "Cedula", "986545" , "Femenino");
        return infoEnfermero;
    }

  

  
    @Override
    public String toString() {
        return super.toString() + " " + "Cama: " + getMedicina();
    }

}
