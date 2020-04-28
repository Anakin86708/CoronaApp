package coronaapp;

import coronaapp.View.Login;
import java.util.Date;
import java.util.List;

public class Relatorio {

    private final String tipoFiltro;
    private final String filtro;
    private final Date data;
    private int valor = 0;

    public Relatorio(String tipoFiltro, String filtro, Date data) {
        this.tipoFiltro = tipoFiltro;
        this.filtro = filtro;
        this.data = data;
        calcularValor();
    }

    private void calcularValor() {
        switch (tipoFiltro) {
            case "Sintomas":
             List<String> sintomasApresentados;
                for (Paciente item : Login.pacientesInstanciados) {
                    Sintomas itemsSintomas = item.getSintomas();
                    sintomasApresentados = itemsSintomas.getSintomasApresentadosList();
                    for (String sintoma : sintomasApresentados) {
                        if (sintoma.equals(filtro)) {
                            valor++;
                        }
                    }
                }
                break;
            case "Regiao":
                for (Paciente item : Login.pacientesInstanciados) {
                    if (item.getEstado().equals(filtro)) {
                        valor++;
                    }
                }
                break;
            case "Hospitais":
                for (EquipeMedica item : Login.equipeMedicasInstanciados) {
                    if (item.getCodigoLocalTrabalho().equals(filtro)) {
                        valor++;
                    }
                }
                break;
        }
    }

    public int getValor() {
        return valor;
    }

}
