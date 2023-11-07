package proyecto;



public class Medico extends Persona {

    private String lugarEstudio;
   
    Medico[] infoMedico = new Medico[4];

    public Medico(String lugarEstudio, String nombre, String apellido, String tipoID, int numeroID, String genero) {
        super(nombre, apellido, tipoID, numeroID, genero);
        this.lugarEstudio = lugarEstudio;
      
    }

    public Medico() {
        this.lugarEstudio = " ";
        
    }

    public String getLugarEstudio() {
        return lugarEstudio;
    }

    public void setLugarEstudio(String lugarEstudio) {
        this.lugarEstudio = lugarEstudio;
    }

    

 

    public Medico[] infoMedicos() {
        infoMedico[0] = new Medico("Manuela Beltran",  "Jorge",
                "Gutierrez", "Cedula", 778654, "Maculino");
        infoMedico[1] = new Medico("Manuela Beltran",  "Hernan",
                "Gonzales", "Cedula", 978325, "Maculino");
        infoMedico[2] = new Medico("Manuela Beltran", "Lucia",
                "Clavijo", "Cedula", 897854, "Femenino");
        infoMedico[3] = new Medico("Manuela Beltran", "Valentina",
                "Mora", "Cedula", 798213, "Femenino");
        return infoMedico;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Cama: ";
    }

}
