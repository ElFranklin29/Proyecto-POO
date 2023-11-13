package proyecto;

import Presentacion.MostrarFactura;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Factura {

    private int precioCama;
    private int totalMedicamento1;
    private int totalMedicamento2;
    private int totalMedicamento3;
    PacienteVO pacienteVO;

    public Factura(int precioCama, int totalMedicamento1, int totalMedicamento2, int totalMedicamento3, int total) {
        this.precioCama = precioCama;
        this.totalMedicamento1 = totalMedicamento1;
        this.totalMedicamento2 = totalMedicamento2;
        this.totalMedicamento3 = totalMedicamento3;
        this.total = total;
    }

    public Factura() {
        this.precioCama = 0;
        this.totalMedicamento1 = 0;
        this.totalMedicamento2 = 0;
        this.totalMedicamento3 = 0;
        this.total = 0;
    }

    public int getTotalMedicamento1() {
        return totalMedicamento1;
    }

    public void setTotalMedicamento1(int totalMedicamento1) {
        this.totalMedicamento1 = totalMedicamento1;
    }

    public int getTotalMedicamento2() {
        return totalMedicamento2;
    }

    public void setTotalMedicamento2(int totalMedicamento2) {
        this.totalMedicamento2 = totalMedicamento2;
    }

    public int getTotalMedicamento3() {
        return totalMedicamento3;
    }

    public void setTotalMedicamento3(int totalMedicamento3) {
        this.totalMedicamento3 = totalMedicamento3;
    }
    

    public int getPrecioCama() {
        return precioCama;
    }

    public void setPrecioCama(int precioCama) {
        this.precioCama = precioCama;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    private int total;

    public void generarFactura(Hashtable<Integer, PacienteVO> infoPaciente, int codigo, PacienteDAO pacienteDAO) {

        pacienteVO = infoPaciente.get(codigo);

        if (pacienteVO.getTriage().equals("Triage 3")) {
            precioCama = 40000;
            setPrecioCama(precioCama);        
        }
        
        if (pacienteVO.getPrecioMedicamento1()!=0) {
            totalMedicamento1=pacienteVO.getPrecioMedicamento1()*pacienteVO.getCantidadMedicamento1();
            totalMedicamento2=pacienteVO.getPrecioMedicamento2()*pacienteVO.getCantidadMedicamento2();
            totalMedicamento3=pacienteVO.getPrecioMedicamento3()*pacienteVO.getCantidadMedicamento3();
            setTotalMedicamento1(totalMedicamento1);
            setTotalMedicamento2(totalMedicamento2);
            setTotalMedicamento3(totalMedicamento3);
            
            total=getTotalMedicamento1()+getTotalMedicamento2()+getTotalMedicamento3()+getPrecioCama()+getPrecioCama();
            setTotal(total);
            
            MostrarFactura factura= new MostrarFactura(pacienteVO, getTotalMedicamento1(), getTotalMedicamento2(), getTotalMedicamento3(), getTotal(), getPrecioCama());
            factura.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Primero recete medicamentos al paciente",
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }

}
