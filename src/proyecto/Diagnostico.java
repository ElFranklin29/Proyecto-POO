package proyecto;

import javax.swing.JOptionPane;

public class Diagnostico {

    private String enfermedad;
    private String medicamentos;
    private String sintoma1;
    private String sintoma2;
    private String sintoma3;
    private String triage;
    private String diagnostico;

    public Diagnostico(String enfermedad, String medicamentos, String sintoma1, String sintoma2, String sintoma3, String triage, String diagnostico) {
        this.enfermedad = enfermedad;
        this.medicamentos = medicamentos;
        this.sintoma1 = sintoma1;
        this.sintoma2 = sintoma2;
        this.sintoma3 = sintoma3;
        this.triage = triage;
        this.diagnostico = diagnostico;
    }

    public Diagnostico() {
        this.enfermedad = "";
        this.medicamentos = "";
        this.sintoma1 = "";
        this.sintoma2 = "";
        this.sintoma3 = "";
        this.triage = "";
        this.diagnostico = "";
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
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

    public String getTriage() {
        return triage;
    }

    public void setTriage(String triage) {
        this.triage = triage;
    }

    public void consultarSintomas() {
        String[] sintoma1 = {"Selecciona", "Cansancio", "Congestion nasal", "Circulos oscuros debajo de los ojos"};
        String[] sintoma2 = {"Selecciona", "Conjuntivitis", "Diarrea", "Dificultad para respirar"};
        String[] sintoma3 = {"Selecciona", "Dolor articular", "Tos", "Mareo"};

        this.setSintoma1(JOptionPane.showInputDialog(null, "Seleccione el primer sintoma: ",
                "Primer sintoma", JOptionPane.PLAIN_MESSAGE, null, sintoma1,
                "Selecciona").toString());

        this.setSintoma2(JOptionPane.showInputDialog(null, "Seleccione el segundo sintoma: ",
                "Segundo sintoma", JOptionPane.PLAIN_MESSAGE, null, sintoma2,
                "Selecciona").toString());

        this.setSintoma3(JOptionPane.showInputDialog(null, "Seleccione el tercer sintoma: ",
                "Tercer sintoma", JOptionPane.PLAIN_MESSAGE, null, sintoma3,
                "Selecciona").toString());
    }

    public void diagnosticoEnfermedad() {

        if ("Cansancio".equals(getSintoma1()) && "Conjuntivitis".equals(getSintoma2())
                && "Dolor articular".equals(getSintoma3())) {
            enfermedad = " Síndrome de fatiga crónica";
            medicamentos = "Paracetamol, ibuprofeno, tramadol";
            triage = "Grado 2";

        }

        if ("Cansancio".equals(getSintoma1()) && "Conjuntivitis".equals(getSintoma2())
                && "Tos".equals(getSintoma3())) {
            enfermedad = "Gripe";
            medicamentos = " Ibuprofeno, paracetamol, acetaminofén";
            triage = "Grado 1";

        }

        if ("Cansancio".equals(getSintoma1()) && "Conjuntivitis".equals(getSintoma2())
                && "Mareo".equals(getSintoma3())) {
            enfermedad = "Blefaritis";
            medicamentos = "Eritromicida y limpiador de párpados";
            triage = "Grado 2";

        }

        if ("Cansancio".equals(getSintoma1()) && "Diarrea".equals(getSintoma2())
                && "Dolor articular".equals(getSintoma3())) {
            enfermedad = "Artritis reumatoide";
            medicamentos = " Voltaren, prednisona";
            triage = "Grado 3";

        }

        if ("Cansancio".equals(getSintoma1()) && "Diarrea".equals(getSintoma2())
                && "Mareo".equals(getSintoma3())) {
            enfermedad = "Deshidratación severa";
            medicamentos = "Suero ";
            triage = "Grado 1";

        }

        if ("Cansancio".equals(getSintoma1()) && "Diarrea".equals(getSintoma2())
                && "Tos".equals(getSintoma3())) {
            enfermedad = "Novovirus";
            medicamentos = "Reposición de líquidos y electrolitos";
            triage = "Grado 1";

        }

        if ("Cansancio".equals(getSintoma1()) && "Dificultad para respirar".equals(getSintoma2())
                && "Dolor articular".equals(getSintoma3())) {
            enfermedad = "Lupus";
            medicamentos = "Prednisona, ibuprofeno, aspirina";
            triage = "Grado 2";

        }

        if ("Cansancio".equals(getSintoma1()) && "Dificultad para respirar".equals(getSintoma2())
                && "Tos".equals(getSintoma3())) {
            enfermedad = "Neumonía";
            medicamentos = "Amoxicilina, ceftriaxona y azitromicina";
            triage = "Grado 3";

        }

        if ("Cansancio".equals(getSintoma1()) && "Dificultad para respirar".equals(getSintoma2())
                && "Dolor articular".equals(getSintoma3())) {
            enfermedad = "Gripe";
            medicamentos = "Ibuprofeno, paracetamol, acetaminofén ";
            triage = "Grado 1";

        }

        if ("Cansancio".equals(getSintoma1()) && "Dificultad para respirar".equals(getSintoma2())
                && "Mareo".equals(getSintoma3())) {
            enfermedad = "Anemia";
            medicamentos = "Hierro, vitamina B12 ";
            triage = "Grado 3";

        }

        if ("Congestion nasal".equals(getSintoma1()) && "Conjuntivitis".equals(getSintoma2())
                && "Tos".equals(getSintoma3())) {
            enfermedad = " Esclerosis múltiple";
            medicamentos = "Fingolimod y ocrelizumab";

        }

        if ("Congestion nasal".equals(getSintoma1()) && "Conjuntivitis".equals(getSintoma2())
                && "Mareo".equals(getSintoma3())) {
            enfermedad = "Neuritis vestibular  ";
            medicamentos = "Difenhidramina ";
            triage = "Grado 3";

        }

        if ("Congestion nasal".equals(getSintoma1()) && "Diarrea".equals(getSintoma2())
                && "Dolor articular".equals(getSintoma3())) {
            enfermedad = "Gastroenteritis viral   ";
            medicamentos = "Loperamida, subsalicilato, de dismuto  ";
            triage = "Grado 3";

        }

        if ("Congestion nasal".equals(getSintoma1()) && "Diarrea".equals(getSintoma2())
                && "Tos".equals(getSintoma3())) {
            enfermedad = "Gripe";
            medicamentos = "Ibuprofeno, Paracetamol y Acetaminofen";
            triage = "Grado 1";

        }

        if ("Congestion nasal".equals(getSintoma1()) && "Diarrea".equals(getSintoma2())
                && "Mareo".equals(getSintoma3())) {
            enfermedad = "Gastroenteritis Viral";
            medicamentos = "Loperamida y Subsalicilato de Dismuto   ";
            triage = "Grado 3";

        }

        if ("Congestion nasal".equals(getSintoma1()) && "Dificultad para respirar".equals(getSintoma2())
                && "Dolor articular".equals(getSintoma3())) {
            enfermedad = "Artritis Reumatoide";
            medicamentos = "Voltaren y Prednison";
            triage = "Grado 3";

        }

        if ("Congestion nasal".equals(getSintoma1()) && "Dificultad para respirar".equals(getSintoma2())
                && "Tos".equals(getSintoma3())) {
            enfermedad = "Asma";
            medicamentos = "Teufilina y Corticosteroide";
            triage = "Grado 2";

        }

        if ("Congestion nasal".equals(getSintoma1()) && "Dificultad para respirar".equals(getSintoma2())
                && "Mareo".equals(getSintoma3())) {

            enfermedad = "Hipertensión arterial";
            medicamentos = "Banazpril y Acebutalol";
            triage = "Grado 2";

        }

        if ("Circulos oscuros debajo de los ojos".equals(getSintoma1()) && "Conjuntivitis".equals(getSintoma2())
                && "Dolor articular".equals(getSintoma3())) {
            enfermedad = "Lupus";
            medicamentos = "Prednisona, Ibuprofeno y Aspirina ";
            triage = "Grado 2";

        }

        if ("Circulos oscuros debajo de los ojos".equals(getSintoma1()) && "Conjuntivitis".equals(getSintoma2())
                && "Tos".equals(getSintoma3())) {
            enfermedad = "Dermatitis de Contacto";
            medicamentos = "Cefalexina y Loratadina";
            triage = "Grado 2";

        }

        if ("Circulos oscuros debajo de los ojos".equals(getSintoma1()) && "Conjuntivitis".equals(getSintoma2())
                && "Mareo".equals(getSintoma3())) {
            enfermedad = "Glaucoma";
            medicamentos = "Lotanoprost y Binzolamida";
            triage = "Grado 3";

        }

        if ("Circulos oscuros debajo de los ojos".equals(getSintoma1()) && "Diarrea".equals(getSintoma2())
                && "Dolor articular".equals(getSintoma3())) {
            enfermedad = "Crohn";
            medicamentos = "Acetaminofén y Papsona";
            triage = "Grado 2";

        }

        if ("Circulos oscuros debajo de los ojos".equals(getSintoma1()) && "Diarrea".equals(getSintoma2())
                && "Tos".equals(getSintoma3())) {
            enfermedad = "Gripa";
            medicamentos = "Ibuprofeno, Paracetamol y Acetaminofén";
            triage = "Grado 1";

        }

        if ("Circulos oscuros debajo de los ojos".equals(getSintoma1()) && "Diarrea".equals(getSintoma2())
                && "Mareo".equals(getSintoma3())) {
            enfermedad = "Reflujo Gastroesofágico";
            medicamentos = "Maalox Y Rabeprazol";
            triage = "Grado 3";

        }

        if ("Circulos oscuros debajo de los ojos".equals(getSintoma1()) && "Dificultad para respirar".equals(getSintoma2())
                && "Dolor articular".equals(getSintoma3())) {
            enfermedad = "Fibrosis pulmonar";
            medicamentos = "Pirfemidona y Nintedanib";
            triage = "Grado 3";

        }

        if ("Circulos oscuros debajo de los ojos".equals(getSintoma1()) && "Dificultad para respirar".equals(getSintoma2())
                && "Tos".equals(getSintoma3())) {
            enfermedad = "EPOC";
            medicamentos = "Albuterol y Bromuro de Ipratropio";
            triage = "Grado 1";

        }

        if ("Circulos oscuros debajo de los ojos".equals(getSintoma1()) && "Dificultad para respirar".equals(getSintoma2())
                && "Mareo".equals(getSintoma3())) {
            enfermedad = "Arritmia";
            medicamentos = " Amiodoroma y Metoprolol Diagnostico";
            triage = "Grado 3";

        }
        
        setEnfermedad(enfermedad);
        setMedicamentos(medicamentos);
        setTriage(triage);

    }

    
    public String imprimir() {

        return "Sus sintomas son: "+getSintoma1()+", "+getSintoma2()+" y "+ getSintoma3()+"\n"
              +"Enfermedad: dsadsds\n"
              +"Medicamentos: "+getMedicamentos() +"\n"
              +"Triage: "+getTriage()+"\n"  ;
    }

}
