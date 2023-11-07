
package proyecto;


public class PacienteVO extends Persona{
    private String tipoSangre;
    private String sintomaRespiratorio;
    private String sintomaDigestivo;
    private String sintomaGeneral;
    private String triage;
    private String enfermedad;

    public PacienteVO(String tipoSangre, String sintomaRespiratorio, String sintomaDigestivo, String sintomaGeneral, String triage, String enfermedad, String nombre, String apellido, String tipoID, int numeroID, String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.tipoSangre = tipoSangre;
        this.sintomaRespiratorio = sintomaRespiratorio;
        this.sintomaDigestivo = sintomaDigestivo;
        this.sintomaGeneral = sintomaGeneral;
        this.triage = triage;
        this.enfermedad = enfermedad;
    }
   
    public PacienteVO(){
        this.tipoSangre = "";
        this.sintomaRespiratorio = "";
        this.sintomaDigestivo = "";
        this.sintomaGeneral = "";
        this.triage = "";
        this.enfermedad = "";
    }

    public String getTriage() {
        return triage;
    }

    public void setTriage(String triage) {
        this.triage = triage;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getSintomaRespiratorio() {
        return sintomaRespiratorio;
    }

    public void setSintomaRespiratorio(String sintomaRespiratorio) {
        this.sintomaRespiratorio = sintomaRespiratorio;
    }

    public String getSintomaDigestivo() {
        return sintomaDigestivo;
    }

    public void setSintomaDigestivo(String sintomaDigestivo) {
        this.sintomaDigestivo = sintomaDigestivo;
    }

    public String getSintomaGeneral() {
        return sintomaGeneral;
    }

    public void setSintomaGeneral(String sintomaGeneral) {
        this.sintomaGeneral = sintomaGeneral;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    
       
}
