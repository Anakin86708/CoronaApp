package coronaapp;

public class Paciente extends Pessoa {

    private String prioridade;
    private String status;

    /**
     *
     * @param prioridade
     * @param status
     * @param idPessoa
     * @param nome
     * @param email
     * @param cpf
     * @param telefone
     * @param bairro
     * @param cidade
     * @param estado
     * @param pais
     * @param senha
     */
    public Paciente(String prioridade, String status, int idPessoa, String nome, String email, String cpf, String telefone, String bairro, String cidade, String estado, String pais, String senha) {
        super(idPessoa, nome, email, cpf, telefone, bairro, cidade, estado, pais, senha);
        this.prioridade = prioridade;
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
