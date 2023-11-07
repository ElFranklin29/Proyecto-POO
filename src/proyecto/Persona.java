package proyecto;


import javax.swing.JOptionPane;

public class Persona {

    private String nombre;
    private String apellido;
    private String tipoID;
    private int numeroID;
    private String genero;
    

    public Persona(String nombre, String apellido, String tipoID, int numeroID, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoID = tipoID;
        this.numeroID = numeroID;
        this.genero = genero;
    }

    
 

    public Persona() {
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

    public void agregarInfo() {

        String[] tipoid = {"Tarjeta de identidad", "Cedula"};
        int optID = JOptionPane.showOptionDialog(null, "Seleccione tipo de ID: ",
                "Tipo ID", 0, JOptionPane.QUESTION_MESSAGE, null, tipoid, "");
        if (optID == 0) {
            this.setTipoID("Tarjeta de identidad");
        } else {
            this.setTipoID("Cedula");
        }

        this.setNumeroID(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero ID ",
                "Numero ID", 1)));

        this.setNombre(JOptionPane.showInputDialog(null, "Ingrese nombre ",
                "Nombre", 1));

        this.setApellido(JOptionPane.showInputDialog(null, "Ingrese apellido ",
                "Apellido", 1));

        String[] tipoGenero = {"Masculino", "Femenino"};
        int optGenero = JOptionPane.showOptionDialog(null, "Seleccione su genero: ",
                "Genero", 0, JOptionPane.QUESTION_MESSAGE, null, tipoGenero, "");
        if (optGenero == 0) {
            this.setGenero("Maculino");
        } else {
            this.setGenero("Femenino");
        }

    }

   
    
 

}
