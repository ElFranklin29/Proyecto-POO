package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Enfermero extends Persona {

    private String lugarEstudio;
    private String medicina;
    Enfermero[] infoEnfermero = new Enfermero[4];
    private String enfermedad;
    private String medicamentos;
    private String sintoma1;
    private String sintoma2;
    private String sintoma3;
    private String triage;
    ArrayList<String> infoDiagnosticos = new ArrayList<>();
    private String diagnostico;
    private boolean cama;
    String[] triage1 = {"Síndrome de fatiga crónica", "Gripe", "Blefaritis", "Artritis reumatoide",
        "Novovirus", "Deshidratación severa", "Lupus", "Neumonía", "Anemia"};

    public Enfermero(String sintoma1, String sintoma2, String sintoma3) {
        this.sintoma1 = sintoma1;
        this.sintoma2 = sintoma2;
        this.sintoma3 = sintoma3;
    }

    public void setInfoDiagnosticos(ArrayList<String> infoDiagnosticos, String diagnosticos) {
        this.infoDiagnosticos = infoDiagnosticos;
        this.diagnostico = diagnosticos;
    }
    
    public Enfermero(String lugarEstudio, String medicina, String nombre, String apellido, String tipoID, int numeroID,
            String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.lugarEstudio = lugarEstudio;
        this.medicina = medicina;

    }

    public Enfermero() {
        this.lugarEstudio = " ";
        this.medicina = " ";
        this.enfermedad = " ";
        this.medicamentos = " ";
        this.sintoma1 = " ";
        this.sintoma2 = "";
        this.sintoma3 = " ";
        this.diagnostico = "";
        this.cama = false;
    }

    public boolean isCama() {
        return cama;
    }

    public void setCama(boolean cama) {
        this.cama = cama;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public ArrayList<String> getInfoDiagnosticos() {
        return infoDiagnosticos;
    }

    public String getSintoma1() {
        return sintoma1;
    }

    public void setSintoma1(String sintoma1) {
        this.sintoma1 = sintoma1;
    }

    public String getSintoma2() {
        return sintoma2;
    }

    public void setSintoma2(String sintoma2) {
        this.sintoma2 = sintoma2;
    }

    public String getSintoma3() {
        return sintoma3;
    }

    public void setSintoma3(String sintoma3) {
        this.sintoma3 = sintoma3;
    }

  

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
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
                "Montiel", "Cedula", 4563538, "Maculino");
        infoEnfermero[1] = new Enfermero("U.Distrital", "Null", "Alejandro",
                "Parra", "Cedula", 1325668, "Maculino");
        infoEnfermero[2] = new Enfermero("Manuela Beltran", "Null", "Sofia",
                "Buritica", "Cedula", 363598, "Femenino");
        infoEnfermero[3] = new Enfermero("U.Nacional", "Null", "Karen",
                "Molano", "Cedula", 986545, "Femenino");
        return infoEnfermero;
    }

    public void diagnosticoEnfermedad() {

        if ("Cansancio".equals(sintoma1) && "Conjuntivitis".equals(sintoma2)
                && "Dolor articular".equals(sintoma3)) {
            enfermedad = " Síndrome de fatiga crónica";
            medicamentos = "Paracetamol, ibuprofeno, tramadol";
            triage = "Grado 2";
        }

        if ("Cansancio".equals(sintoma1) && "Conjuntivitis".equals(sintoma2)
                && "Tos".equals(sintoma3)) {
            enfermedad = "Gripe";
            medicamentos = " Ibuprofeno, paracetamol, acetaminofén";
            triage = "Grado 1";
        }

        if ("Cansancio".equals(sintoma1) && "Conjuntivitis".equals(sintoma2)
                && "Mareo".equals(sintoma3)) {
            enfermedad = "Blefaritis";
            medicamentos = "Eritromicida y limpiador de párpados";
            triage = "Grado 2";
        }

        if ("Cansancio".equals(sintoma1) && "Diarrea".equals(sintoma2)
                && "Dolor articular".equals(sintoma3)) {
            enfermedad = "Artritis reumatoide";
            medicamentos = " Voltaren, prednisona";
            triage = "Grado 3";
        }

        if ("Cansancio".equals(sintoma1) && "Diarrea".equals(sintoma2)
                && "Mareo".equals(sintoma3)) {
            enfermedad = "Deshidratación severa";
            medicamentos = "Suero ";
            triage = "Grado 1";
        }

        if ("Cansancio".equals(sintoma1) && "Diarrea".equals(sintoma2)
                && "Tos".equals(sintoma3)) {
            enfermedad = "Novovirus";
            medicamentos = "Reposición de líquidos y electrolitos";
            triage = "Grado 1";
        }

        if ("Cansancio".equals(sintoma1) && "Dificultad para respirar".equals(sintoma2)
                && "Dolor articular".equals(sintoma3)) {
            enfermedad = "Lupus";
            medicamentos = "Prednisona, ibuprofeno, aspirina";
            triage = "Grado 2";
        }

        if ("Cansancio".equals(sintoma1) && "Dificultad para respirar".equals(sintoma2)
                && "Tos".equals(sintoma3)) {
            enfermedad = "Neumonía";
            medicamentos = "Amoxicilina, ceftriaxona y azitromicina";
            triage = "Grado 3";
        }

        if ("Cansancio".equals(sintoma1) && "Dificultad para respirar".equals(sintoma2)
                && "Dolor articular".equals(sintoma3)) {
            enfermedad = "Gripe";
            medicamentos = "Ibuprofeno, paracetamol, acetaminofén ";
            triage = "Grado 1";
        }

        if ("Cansancio".equals(sintoma1) && "Dificultad para respirar".equals(sintoma2)
                && "Mareo".equals(sintoma3)) {
            enfermedad = "Anemia";
            medicamentos = "Hierro, vitamina B12 ";
            triage = "Grado 3";
        }

        if ("Congestion nasal".equals(sintoma1) && "Conjuntivitis".equals(sintoma2)
                && "Tos".equals(sintoma3)) {
            enfermedad = " Esclerosis múltiple";
            medicamentos = "Fingolimod y ocrelizumab";
        }

        if ("Congestion nasal".equals(sintoma1) && "Conjuntivitis".equals(sintoma2)
                && "Mareo".equals(sintoma3)) {
            enfermedad = "Neuritis vestibular  ";
            medicamentos = "Difenhidramina ";
            triage = "Grado 3";
        }

        if ("Congestion nasal".equals(sintoma1) && "Diarrea".equals(sintoma2)
                && "Dolor articular".equals(sintoma3)) {
            enfermedad = "Gastroenteritis viral   ";
            medicamentos = "Loperamida, subsalicilato, de dismuto  ";
            triage = "Grado 3";
        }

        if ("Congestion nasal".equals(sintoma1) && "Diarrea".equals(sintoma2)
                && "Tos".equals(sintoma3)) {
            enfermedad = "Gripe";
            medicamentos = "Ibuprofeno, Paracetamol y Acetaminofen";
            triage = "Grado 1";
        }

        if ("Congestion nasal".equals(sintoma1) && "Diarrea".equals(sintoma2)
                && "Mareo".equals(sintoma3)) {
            enfermedad = "Gastroenteritis Viral";
            medicamentos = "Loperamida y Subsalicilato de Dismuto   ";
            triage = "Grado 3";
        }

        if ("Congestion nasal".equals(sintoma1) && "Dificultad para respirar".equals(sintoma2)
                && "Dolor articular".equals(sintoma3)) {
            enfermedad = "Artritis Reumatoide";
            medicamentos = "Voltaren y Prednison";
            triage = "Grado 3";
        }

        if ("Congestion nasal".equals(sintoma1) && "Dificultad para respirar".equals(sintoma2)
                && "Tos".equals(sintoma3)) {
            enfermedad = "Asma";
            medicamentos = "Teufilina y Corticosteroide";
            triage = "Grado 2";
        }

        if ("Congestion nasal".equals(sintoma1) && "Dificultad para respirar".equals(sintoma2)
                && "Mareo".equals(sintoma3)) {

            enfermedad = "Hipertensión arterial";
            medicamentos = "Banazpril y Acebutalol";
            triage = "Grado 2";
        }

        if ("Circulos oscuros debajo de los ojos".equals(sintoma1) && "Conjuntivitis".equals(sintoma2)
                && "Dolor articular".equals(sintoma3)) {
            enfermedad = "Lupus";
            medicamentos = "Prednisona, Ibuprofeno y Aspirina ";
            triage = "Grado 2";
        }

        if ("Circulos oscuros debajo de los ojos".equals(sintoma1) && "Conjuntivitis".equals(sintoma2)
                && "Tos".equals(sintoma3)) {
            enfermedad = "Dermatitis de Contacto";
            medicamentos = "Cefalexina y Loratadina";
            triage = "Grado 2";
        }

        if ("Circulos oscuros debajo de los ojos".equals(sintoma1) && "Conjuntivitis".equals(sintoma2)
                && "Mareo".equals(sintoma3)) {
            enfermedad = "Glaucoma";
            medicamentos = "Lotanoprost y Binzolamida";
            triage = "Grado 3";
        }

        if ("Circulos oscuros debajo de los ojos".equals(sintoma1) && "Diarrea".equals(sintoma2)
                && "Dolor articular".equals(sintoma3)) {
            enfermedad = "Crohn";
            medicamentos = "Acetaminofén y Papsona";
            triage = "Grado 2";
        }

        if ("Circulos oscuros debajo de los ojos".equals(sintoma1) && "Diarrea".equals(sintoma2)
                && "Tos".equals(sintoma3)) {
            enfermedad = "Gripa";
            medicamentos = "Ibuprofeno, Paracetamol y Acetaminofén";
            triage = "Grado 1";
        }

        if ("Circulos oscuros debajo de los ojos".equals(sintoma1) && "Diarrea".equals(sintoma2)
                && "Mareo".equals(sintoma3)) {
            enfermedad = "Reflujo Gastroesofágico";
            medicamentos = "Maalox Y Rabeprazol";
            triage = "Grado 3";
        }

        if ("Circulos oscuros debajo de los ojos".equals(sintoma1) && "Dificultad para respirar".equals(sintoma2)
                && "Dolor articular".equals(sintoma3)) {
            enfermedad = "Fibrosis pulmonar";
            medicamentos = "Pirfemidona y Nintedanib";
            triage = "Grado 3";
        }

        if ("Circulos oscuros debajo de los ojos".equals(sintoma1) && "Dificultad para respirar".equals(sintoma2)
                && "Tos".equals(sintoma3)) {
            enfermedad = "EPOC";
            medicamentos = "Albuterol y Bromuro de Ipratropio";
            triage = "Grado 1";
        }

        if ("Circulos oscuros debajo de los ojos".equals(sintoma1) && "Dificultad para respirar".equals(sintoma2)
                && "Mareo".equals(sintoma3)) {
            enfermedad = "Arritmia";
            medicamentos = " Amiodoroma y Metoprolol Diagnostico";
            triage = "Grado 3";
        }

        diagnostico = "Sus sintomas son " + getSintoma1() + ", " + getSintoma2() + " y " + getSintoma3() + "\n"
                + "Enfermedad: " + enfermedad + "\n"
                + "Medicamentos: " + medicamentos + "\n"
                + " Nivel Triage: " + triage;

        JOptionPane.showMessageDialog(null, diagnostico,
                "Diagnostico", 1);

        Medico obj = new Medico();
        if ("Grado 3".equals(triage)) {
            obj.asignarCama();
        }

        String[] opc = {"Si", "No"};
        int opt = JOptionPane.showOptionDialog(null, "¿Desea volver al menu?", "Volver al menu",
                0, 1, null, opc, 0);
        if (opt == 1) {
            System.exit(0);

        }

    }

    public String guardarDianostico() {
        return diagnostico;

    }

    @Override
    public String toString() {
        return super.toString() + " " + "Cama: " + getMedicina();
    }

}
