
package proyecto;


public class PacienteVO extends Persona{
    private String tipoSangre;

    public PacienteVO(String tipoSangre, String nombre, String apellido, String tipoID, int numeroID, String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.tipoSangre = tipoSangre;
    }
    
    public PacienteVO() {
        this.tipoSangre = "";
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    
       
}
