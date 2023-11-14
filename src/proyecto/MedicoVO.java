package proyecto;

import proyecto.PersonaVO;

public class MedicoVO extends PersonaVO {

    private String lugarEstudio;

    public String getLugarEstudio() {
        return lugarEstudio;
    }

    public void setLugarEstudio(String lugarEstudio) {
        this.lugarEstudio = lugarEstudio;
    }

    public MedicoVO() {
        this.lugarEstudio = "";
    }

    public MedicoVO(String lugarEstudio, String nombre, String apellido, String tipoID, int numeroID, String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.lugarEstudio = lugarEstudio;
    }
}
