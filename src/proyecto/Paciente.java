package proyecto;

import javax.swing.JOptionPane;

public class Paciente extends Persona {

    private String tipoSangre;
    private String optSintoma1;
    private String optSintoma2;
    private String optSintoma3;
    Enfermero obj;

    public Paciente(String tipoSangre, String optSintoma1, String optSintoma2, String optSintoma3, String nombre, 
            String apellido, String tipoID, int numeroID, String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.tipoSangre = tipoSangre;
        this.optSintoma1 = optSintoma1;
        this.optSintoma2 = optSintoma2;
        this.optSintoma3 = optSintoma3;
        
    }
    
    public Paciente() {
        this.tipoSangre = "";
        this.optSintoma1 = " ";
        this.optSintoma2 = "";
        this.optSintoma3 = "";
       
    }
    

    public String getOptSintoma1() {
        return optSintoma1;
    }

    public void setOptSintoma1(String optSintoma1) {
        this.optSintoma1 = optSintoma1;
    }

    public String getOptSintoma2() {
        return optSintoma2;
    }

    public void setOptSintoma2(String optSintoma2) {
        this.optSintoma2 = optSintoma2;
    }

    public String getOptSintoma3() {
        return optSintoma3;
    }

    public void setOptSintoma3(String optSintoma3) {
        this.optSintoma3 = optSintoma3;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public void agregarInfo() {
        super.agregarInfo();
        this.setTipoSangre(JOptionPane.showInputDialog(null, "Ingrese tipo de sangre",
                "Tipo sangre", 1));
        consultarSintomas();
    }

    public void consultarSintomas() {
        String[] sintoma1 = {"Selecciona", "Cansancio", "Congestion nasal", "Circulos oscuros debajo de los ojos"};
        String[] sintoma2 = {"Selecciona", "Conjuntivitis", "Diarrea", "Dificultad para respirar"};
        String[] sintoma3 = {"Selecciona", "Dolor articular", "Tos", "Mareo"};

        this.setOptSintoma1(JOptionPane.showInputDialog(null, "Seleccione el primer sintoma: ",
                "Primer sintoma", JOptionPane.PLAIN_MESSAGE, null, sintoma1,
                "Selecciona").toString());

        this.setOptSintoma2(JOptionPane.showInputDialog(null, "Seleccione el segundo sintoma: ",
                "Segundo sintoma", JOptionPane.PLAIN_MESSAGE, null, sintoma2,
                "Selecciona").toString());

        this.setOptSintoma3(JOptionPane.showInputDialog(null, "Seleccione el tercer sintoma: ",
                "Tercer sintoma", JOptionPane.PLAIN_MESSAGE, null, sintoma3,
                "Selecciona").toString ());

        obj = new Enfermero(getOptSintoma1(), getOptSintoma2(), getOptSintoma3());
        obj.diagnosticoEnfermedad();

    }

    @Override
    public String toString() {
        return super.toString() + " " + "(" + getTipoSangre() +")\n"
                +obj.guardarDianostico()+"\n";
    }

}
