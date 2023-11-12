package proyecto;

import Presentacion.MenuPrincipal;
import javax.swing.JOptionPane;



public class Diagnostico extends PacienteDAO {

    private String enfermedad;
    private String triage;
    private boolean cama;
    PacienteVO pacienteVO;
    Camas camas;
   

    public Diagnostico(String enfermedad, String triage, boolean cama) {
        this.enfermedad = enfermedad;
        this.triage = triage;
        this.cama = cama;
    }
    
    public Diagnostico() {
        this.enfermedad = "";
        this.triage = "";
        this.cama = false;
    }

     

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getTriage() {
        return triage;
    }

    public void setTriage(String triage) {
        this.triage = triage;
    }

    public void dianosticarPaciente(PacienteVO pacienteVO) {
        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 2";
            enfermedad = "Gastroenteritis viral";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 1";
            enfermedad = "Infeccion viral";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 1";
            enfermedad = "Infeccion viral";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 3";
            enfermedad = "Infeccion gastrointestinal";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 2";
            enfermedad = "Estreñimiento cronico";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 3";
            enfermedad = "Sindrome de instestino irritable";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 3";
            enfermedad = "Infeccion gastrointestinal";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 2";
            enfermedad = "Infeccion gastrointestinal";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 3";
            enfermedad = "Sindrome de intestino irritable";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 2";
            enfermedad = "Infeccion sistemica";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 3";
            enfermedad = "Hipertension";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 1";
            enfermedad = "Falta de sueño";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Presion arterial") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 3";
            enfermedad = "Insuficiencia cardíaca";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }
        
        
        this.pacienteVO=pacienteVO;
 
        
       
    }
    
    
    public void asignarCama(Camas camas){
        if (triage.equals("Triage 3")) {
            camas.asignarCama(pacienteVO, camas);
            JOptionPane.showMessageDialog(null, "Su nivel de Triage es nivel 3, por lo tanto se le asignara una cama",
                    "Asignar Cama", JOptionPane.INFORMATION_MESSAGE);
            
        }
    
    
    }
    
      
    

}
