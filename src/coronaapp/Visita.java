package coronaapp;

import java.util.ArrayList;
import java.util.Date;

public class Visita {

    private Date data; // Formato Date já armazena tudo necessário
    private String cpfEquipeMedica;
    private String cpfPaciente;

    public Visita() {

    }

    public Visita(Date data, String cpfEquipeMedica, String cpfPaciente) {
        this.data = data;
        this.cpfEquipeMedica = cpfEquipeMedica;
        this.cpfPaciente = cpfPaciente;
        agendarVisita();
    }

    private void agendarVisita() {
        CoronaApp.visitasAgendadas.add(this);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }
}
