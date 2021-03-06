package coronaapp;

import java.util.ArrayList;

public class Paciente extends Pessoa {

    private float prioridade;
    private String status;
    private Sintomas sintomas;
    private ArrayList<HistoricoMedico> listaHistoricoMedico;

    /**
     *
     * @param status
     * @param sintomas
     * @param idPessoa
     * @param nome
     * @param email
     * @param cpf
     * @param telefone
     * @param idioma
     * @param bairro
     * @param cidade
     * @param estado
     * @param pais
     * @param senha
     */
    public Paciente(String status,
            Sintomas sintomas,
            int idPessoa,
            String nome,
            String email,
            String cpf,
            String telefone,
            int idioma,
            String bairro,
            String cidade,
            String estado,
            String pais,
            String senha) {
        super(idPessoa, nome, email, cpf, telefone, idioma, bairro, cidade, estado, pais, senha);
        this.status = status;
        this.sintomas = sintomas;
        listaHistoricoMedico = new ArrayList<>();
    }

    public Sintomas getSintomas() {
        return sintomas;
    }

    public void setSintomas(Sintomas sintomas) {
        this.sintomas = sintomas;
    }

    public float getPrioridade() {
        setPrioridade();
        return prioridade;
    }

    public void setPrioridade() {
        this.prioridade = sintomas.getGravidade();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<HistoricoMedico> getListaHistoricoMedico() {
        return listaHistoricoMedico;
    }

    public void setListaHistoricoMedico(HistoricoMedico listaHistoricoMedico) {
        this.listaHistoricoMedico.add(listaHistoricoMedico);
    }

}
