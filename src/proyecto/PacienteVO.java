
package proyecto;


public class PacienteVO extends Persona{
    private String tipoSangre;
    private String sintomaRespiratorio;
    private String sintomaDigestivo;
    private String sintomaGeneral;
    private String triage;
    private String enfermedad;
    private String medicamento1;
    private String medicamento2;
    private String medicamento3;
    private double precioMedicamento1;
     private double precioMedicamento2;
     private double precioMedicamento3;

    public PacienteVO(String tipoSangre, String sintomaRespiratorio, String sintomaDigestivo, String sintomaGeneral, String triage, String enfermedad, String medicamento1, String medicamento2, String medicamento3, double precioMedicamento1, double precioMedicamento2, double precioMedicamento3, String nombre, String apellido, String tipoID, int numeroID, String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.tipoSangre = tipoSangre;
        this.sintomaRespiratorio = sintomaRespiratorio;
        this.sintomaDigestivo = sintomaDigestivo;
        this.sintomaGeneral = sintomaGeneral;
        this.triage = triage;
        this.enfermedad = enfermedad;
        this.medicamento1 = medicamento1;
        this.medicamento2 = medicamento2;
        this.medicamento3 = medicamento3;
        this.precioMedicamento1 = precioMedicamento1;
        this.precioMedicamento2 = precioMedicamento2;
        this.precioMedicamento3 = precioMedicamento3;
    }

    
   
    
     public PacienteVO(){
        
         this.tipoSangre = "";
        this.sintomaRespiratorio = "";
        this.sintomaDigestivo = "";
        this.sintomaGeneral = "";
        this.triage = "";
        this.enfermedad = "";
        this.medicamento1 = "No se ha asignado medicamento";
        this.medicamento2 = "No se ha asignado medicamento";
        this.medicamento3 = "No se ha asignado medicamento";
    }
     
     public double getPrecioMedicamento1() {
        return precioMedicamento1;
    }

    public void setPrecioMedicamento1(double precioMedicamento1) {
        this.precioMedicamento1 = precioMedicamento1;
    }

    public double getPrecioMedicamento2() {
        return precioMedicamento2;
    }

    public void setPrecioMedicamento2(double precioMedicamento2) {
        this.precioMedicamento2 = precioMedicamento2;
    }

    public double getPrecioMedicamento3() {
        return precioMedicamento3;
    }

    public void setPrecioMedicamento3(double precioMedicamento3) {
        this.precioMedicamento3 = precioMedicamento3;
    }

     
     public String getMedicamento1() {
        return medicamento1;
    }

    public void setMedicamento1(String medicamento1) {
        this.medicamento1 = medicamento1;
    }

    public String getMedicamento2() {
        return medicamento2;
    }

    public void setMedicamento2(String medicamento2) {
        this.medicamento2 = medicamento2;
    }

    public String getMedicamento3() {
        return medicamento3;
    }

    public void setMedicamento3(String medicamento3) {
        this.medicamento3 = medicamento3;
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
