package proyecto;

import javax.swing.JOptionPane;

public class PersonaVO {

    private String nombre;
    private String apellido;
    private String tipoID;
    private int numeroID;
    private String genero;

    public PersonaVO(String nombre, String apellido, String tipoID, int numeroID, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoID = tipoID;
        this.numeroID = numeroID;
        this.genero = genero;
    }

    public PersonaVO() {
        this.nombre = " ";
        this.apellido = "";
        this.tipoID = " ";
        this.numeroID = 0;
        this.genero = " ";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoID() {
        return tipoID;
    }

    public void setTipoID(String tipoID) {
        this.tipoID = tipoID;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
