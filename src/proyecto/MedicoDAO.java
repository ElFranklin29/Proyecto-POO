package proyecto;

import Presentacion.ActualizarMedico;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class MedicoDAO {

    private Hashtable<Integer, MedicoVO> infoMedico;

    public MedicoDAO(Hashtable<Integer, MedicoVO> infoMedico) {
        this.infoMedico = infoMedico;
    }

    public MedicoDAO() {
        this.infoMedico = new Hashtable<>();

    }

    public Hashtable<Integer, MedicoVO> getInfoMedico() {
        return infoMedico;
    }

    public void setInfoMedico(Hashtable<Integer, MedicoVO> infoMedico) {
        this.infoMedico = infoMedico;
    }

    public void registrarMedico(MedicoVO medicoVO) {
        if (getInfoMedico().containsKey(medicoVO.getNumeroID()) == false) {
            infoMedico.put(medicoVO.getNumeroID(), medicoVO);
            setInfoMedico(infoMedico);
            JOptionPane.showMessageDialog(null, "Medico registrado correctamente",
                    "Resgistrar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El documento ya esta registrado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void eliminarMedico(int codigo) {

        if (getInfoMedico().containsKey(codigo) == true) {
            getInfoMedico().remove(codigo);
            JOptionPane.showMessageDialog(null, "Se elimino correctamente",
                    "Resgistrar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El documento se encuentra registrado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void actualizarMedico(int codigo, MedicoDAO medicoDAO) {

        if (getInfoMedico().containsKey(codigo) == true) {
            ActualizarMedico ventana = new ActualizarMedico(getInfoMedico(), codigo, medicoDAO);
            ventana.setVisible(true);
        } else {

            JOptionPane.showMessageDialog(null, "El documento no esta registrado",
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarMedico(MedicoVO medicoVO) {
        getInfoMedico().replace(medicoVO.getNumeroID(), medicoVO);
    }
}
