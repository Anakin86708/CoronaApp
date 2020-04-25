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
     * @param bairro
     * @param cidade
     * @param estado
     * @param pais
     * @param senha
     */
    public EquipeMedica(String codigoLocalTrabalho, int idPessoa, String nome, String email, String cpf, String telefone, String bairro, String cidade, String estado, String pais, String senha) {
        super(idPessoa, nome, email, cpf, telefone, bairro, cidade, estado, pais, senha);
        this.codigoLocalTrabalho = codigoLocalTrabalho;
    }

    public String getCodigoLocalTrabalho() {
        return codigoLocalTrabalho;
    }

    public void setCodigoLocalTrabalho(String codigoLocalTrabalho) {
        this.codigoLocalTrabalho = codigoLocalTrabalho;
    }
    
    
}
