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
     * @param cidade
     * @param estado
     * @param senha
     */
    public Paciente(String prioridade, String status, int idPessoa, String nome, String email, String cpf, String telefone, String cidade, String estado, String senha) {
        super(idPessoa, nome, email, cpf, telefone, cidade, estado, senha);
        this.prioridade = prioridade;
        this.status = status;
    }
}
