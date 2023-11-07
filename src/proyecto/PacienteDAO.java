package proyecto;

import Presentacion.ActualizarPaciente;
import java.util.Hashtable;
import javax.swing.JOptionPane;


public class PacienteDAO {

    private Hashtable<Integer, PacienteVO> infoPaciente;
    

    public PacienteDAO(Hashtable<Integer, PacienteVO> infoPaciente) {
        this.infoPaciente = infoPaciente;

    }

    public PacienteDAO() {
        this.infoPaciente = new Hashtable<>();

    }

    public Hashtable<Integer, PacienteVO> getInfoPaciente() {
        return infoPaciente;
    }

    public void setInfoPaciente(Hashtable<Integer, PacienteVO> infoPaciente) {
        this.infoPaciente = infoPaciente;
    }

    public void registrarPaciente(PacienteVO pacienteVO) {
        if (getInfoPaciente().containsKey(pacienteVO.getNumeroID()) == false) {
            infoPaciente.put(pacienteVO.getNumeroID(), pacienteVO);
            setInfoPaciente(infoPaciente);
            JOptionPane.showMessageDialog(null, "Paciente registrado correctamente",
                    "Resgistrar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El documento ya esta registrado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void eliminarPaciente(int codigo){
        
        if (getInfoPaciente().containsKey(codigo) == true) {
         getInfoPaciente().remove(codigo);
         JOptionPane.showMessageDialog(null, "Se elimino correctamente",
                    "Resgistrar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El documento se encuentra registrado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
   
    }
    
    public void actualizarPaciente(int codigo, PacienteDAO pacienteDAO){
        
         if (getInfoPaciente().containsKey(codigo) == true) {
            ActualizarPaciente ventana= new ActualizarPaciente(getInfoPaciente(), codigo, pacienteDAO);
            ventana.setVisible(true);
        } else {

            JOptionPane.showMessageDialog(null, "El documento no esta registrado",
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
        
       


    }

    public void modificarPaciente(PacienteVO pacienteVO) {
        Diagnostico diagnostico= new Diagnostico();
        diagnostico.dianosticarPaciente(pacienteVO);
        getInfoPaciente().replace(pacienteVO.getNumeroID(), pacienteVO);
    }

   

  
}
