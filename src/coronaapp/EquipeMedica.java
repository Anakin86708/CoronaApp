package coronaapp;

public class EquipeMedica extends Pessoa {

    private String codigoLocalTrabalho;

    /**
     * 
     * @param codigoLocalTrabalho
     * @param idPessoa
     * @param nome
     * @param email
     * @param cpf
     * @param telefone
     * @param cidade
     * @param estado
     * @param senha 
     */
    public EquipeMedica(String codigoLocalTrabalho, int idPessoa, String nome, String email, String cpf, String telefone, String cidade, String estado, String senha) {
        super(idPessoa, nome, email, cpf, telefone, cidade, estado, senha);
        this.codigoLocalTrabalho = codigoLocalTrabalho;
    }
}
