package proyecto;

import java.io.*;

public class archivoTexto {

    File archivo;

    public void ArchivoTexto() {
      
    }
    
    
    public void prueba(){
        
    
    
    }

    public void crearArchivoDeTexto() {
        archivo = new File("archivoPaciente.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado con exito");
            }

        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }

    public void eliminarArchivoDeTexto() {
        if (archivo.delete()) {
            System.out.println("Archivo creado con exito");
        } else {
            System.out.println("Erro al eliminar archivo");
        }

    }

    public void escribirArchivo(PacienteDAO pacienteDAO) {
        try {
            FileWriter escritura = new FileWriter(archivo, true);
            
            
            escritura.write(pacienteDAO.toString());
            
            /*
            escritura.write(pacienteVO.getTipoID()+" "+pacienteVO.getNumeroID()+" "+ pacienteVO.getNombre()+" "+
                    pacienteVO.getApellido()+" "+pacienteVO.getGenero()+""+pacienteVO.getTipoSangre()+" "+
                    pacienteVO.getMedicamento1()+" "+pacienteVO.getMedicamento1()+" "+pacienteVO.getMedicamento2()+" "+
                    pacienteVO.getMedicamento3()+" "+pacienteVO.getSintomaDigestivo()+" "+pacienteVO.getSintomaGeneral()+" "+
                    pacienteVO.getSintomaRespiratorio()+" "+pacienteVO.getPrecioMedicamento1()+" "+pacienteVO.getPrecioMedicamento2()+" "+
                    pacienteVO.getPrecioMedicamento3());
            */

            escritura.close();
            System.out.println("Texto añadido con exito");
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);

        }

    }

    public void leerArchivo() {
        String contenido;

        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);

            contenido = lectura.readLine();
            while (contenido != null) {
                System.out.println(contenido);
                contenido = lectura.readLine();
            }

        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);

        }

    }

    
}
