package proyecto;

import Presentacion.ActualizarEnfermero;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class EnfermeroDAO {

    private Hashtable<Integer, EnfermeroVO> infoEnfermero;

    public EnfermeroDAO(Hashtable<Integer, EnfermeroVO> infoEnfermero) {
        this.infoEnfermero = infoEnfermero;
    }

    public EnfermeroDAO() {
        this.infoEnfermero = new Hashtable<>();

    }

    public Hashtable<Integer, EnfermeroVO> getInfoEnfermero() {
        return infoEnfermero;
    }

    public void setInfoEnfermero(Hashtable<Integer, EnfermeroVO> infoEnfermero) {
        this.infoEnfermero = infoEnfermero;
    }

    public void registrarMedico(EnfermeroVO enfermeroVO) {
        if (getInfoEnfermero().containsKey(enfermeroVO.getNumeroID()) == false) {
            infoEnfermero.put(enfermeroVO.getNumeroID(), enfermeroVO);
            setInfoEnfermero(infoEnfermero);
            JOptionPane.showMessageDialog(null, "Enfermero registrado correctamente",
                    "Resgistrar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El documento ya esta registrado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void eliminarEnfermero(int codigo) {

        if (getInfoEnfermero().containsKey(codigo) == true) {
            getInfoEnfermero().remove(codigo);
            JOptionPane.showMessageDialog(null, "Se elimino correctamente",
                    "Resgistrar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El documento se encuentra registrado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void actualizarEnfermero(int codigo, EnfermeroDAO enfermeroDAO) {

        if (getInfoEnfermero().containsKey(codigo) == true) {
            ActualizarEnfermero ventana = new ActualizarEnfermero(getInfoEnfermero(), codigo, enfermeroDAO);
            ventana.setVisible(true);
        } else {

            JOptionPane.showMessageDialog(null, "El documento no esta registrado",
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarEnfermero(EnfermeroVO enfermeroVO) {
        getInfoEnfermero().replace(enfermeroVO.getNumeroID(), enfermeroVO);
    }
}
