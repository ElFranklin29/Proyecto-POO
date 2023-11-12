package proyecto;

import proyecto.Persona;

public class EnfermeroVO extends Persona{
    private String lugarEstudio;
    private String medicina;

    public String getLugarEstudio() {
        return lugarEstudio;
    }

    public void setLugarEstudio(String lugarEstudio) {
        this.lugarEstudio = lugarEstudio;
    }
    
    public EnfermeroVO() {
        this.lugarEstudio = "";
    }

    public String getMedicina() {
        return medicina;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }

    public EnfermeroVO(String lugarEstudio, String medicina, String nombre, String apellido, String tipoID, int numeroID, String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.lugarEstudio = lugarEstudio;
        this.medicina = medicina;
    }
}
