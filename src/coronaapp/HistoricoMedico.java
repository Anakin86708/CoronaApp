package coronaapp;
import java.util.Date;

public class HistoricoMedico {
    private int idHistorico;
    private String diagnostico;
    private Date data;
    private String medicacao;
    private String exame;

    public HistoricoMedico(int idHistorico, String diagnostico, Date data, String medicacao, String exame) {
        this.idHistorico = idHistorico;
        this.diagnostico = diagnostico;
        this.data = data;
        this.medicacao = medicacao;
        this.exame = exame;
    }
    
    
        
    public int getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(int idHistorico) {
        this.idHistorico = idHistorico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }
}
