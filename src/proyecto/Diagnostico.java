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
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
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

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 2";
            enfermedad = "Infeccion sistematica";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 2";
            enfermedad = "Enfermedad viral";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 1";
            enfermedad = "problemas gastro intestinales";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 2";
            enfermedad = "Enfermedad inflamatoria";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 2";
            enfermedad = "Problemas gastrointestinales";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 3";
            enfermedad = "Sindrome de instestino irritable";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 3";
            enfermedad = "Enfermedad inflamatoria";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 2";
            enfermedad = "Problemas gastrointestinales";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 3";
            enfermedad = "Sindrome de intestino irritable";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 2";
            enfermedad = "Infeccion sistemica";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 3";
            enfermedad = "Problemas cardiacos";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Taquicardia") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 3";
            enfermedad = "Problemas cardiacos";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 1";
            enfermedad = "Gripa";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 2";
            enfermedad = "Sinusitis";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 1";
            enfermedad = "Gripa";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 3";
            enfermedad = "Infeccion gastrointestinal";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 3";
            enfermedad = "Infeccion respiratoria";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 3";
            enfermedad = "Infeccion respiratoria";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 2";
            enfermedad = "Efecto por medicamentos";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 3";
            enfermedad = "Infeccion respiratoria";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 2";
            enfermedad = "Infeccion bacteriana";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 1";
            enfermedad = "Infeccion viral";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 1";
            enfermedad = "Alergia";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 1";
            enfermedad = "Resfriado comun";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 3";
            enfermedad = "Bronquitis";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Tos") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 2";
            enfermedad = "Alergia";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 2";
            enfermedad = "Infeccion viral";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 3";
            enfermedad = "Infeccion gastrointestinal";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);

        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Vomito")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 2";
            enfermedad = "Intoxicacion alimentaria";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 2";
            enfermedad = "Proceso inflamatorio";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 3";
            enfermedad = "Sindrome de intestino irritable";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 1";
            enfermedad = "Deshidratacion";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Estreñimiento")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 2";
            enfermedad = "Trastornos gatrointestinales";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 2";
            enfermedad = "Enfermedad inflamatoria";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 2";
            enfermedad = "Fatiga cronica";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Ruidos intestinales")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Triage 1";
            enfermedad = "Trastornos gastrointestinales";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Fiebre")) {
            triage = "Triage 2";
            enfermedad = "Enfermedad autoinmune";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Dolor de cabeza")) {
            triage = "Triage 1";
            enfermedad = "Migraña";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Cansancio")) {
            triage = "Triage 1";
            enfermedad = "Fatiga cronica";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        if (pacienteVO.getSintomaRespiratorio().equals("Ninguno") && pacienteVO.getSintomaDigestivo().equals("Ninguno")
                && pacienteVO.getSintomaGeneral().equals("Ninguno")) {
            triage = "Ninguno";
            enfermedad = "Ninguno";
            pacienteVO.setTriage(triage);
            pacienteVO.setEnfermedad(enfermedad);
        }

        this.pacienteVO = pacienteVO;

    }

    public void asignarCama(Camas camas) {
        if (triage.equals("Triage 3")) {
            camas.asignarCama(pacienteVO, camas);
            JOptionPane.showMessageDialog(null, "Su nivel de Triage es nivel 3, por lo tanto se le asignara una cama",
                    "Asignar Cama", JOptionPane.INFORMATION_MESSAGE);

        }

    }

}
