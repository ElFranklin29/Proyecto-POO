package proyecto;

import Presentacion.ActualizarPaciente;
import Presentacion.VentanaCamas;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Camas {

    private Hashtable<Integer, PacienteVO> infoCamas;
    Camas camas;
    
    public Camas(Hashtable<Integer, PacienteVO> infoCamas) {
        this.infoCamas = infoCamas;

    }

public Camas() {
        this.infoCamas = new Hashtable<>();

    }

    public Hashtable<Integer, PacienteVO> getInfoCamas() {
        return infoCamas;
    }

    public void setInfoCamas(Hashtable<Integer, PacienteVO> infoCamas) {
        this.infoCamas = infoCamas;
    }

    public void asignarCama(PacienteVO pacienteVO, Camas camas) {
        infoCamas.put(pacienteVO.getNumeroID(), pacienteVO);
        setInfoCamas(infoCamas);
        this.camas=camas;
    }
    
    public void ventanaCamas(){
        VentanaCamas ventana= new VentanaCamas(getInfoCamas(), camas);
        ventana.setVisible(true);
    
    }

    public void eliminarCama(int codigo) {
        
        if (getInfoCamas().containsKey(codigo) == true) {
         getInfoCamas().remove(codigo);
         JOptionPane.showMessageDialog(null, "Se elimino correctamente",
                    "Resgistrar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El documento se encuentra registrado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
    }

}
