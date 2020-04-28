package coronaapp;

import java.util.Arrays;

public class EquipeMedica extends Pessoa {

    private String codigoLocalTrabalho;
    private int[] prioridades;
    
    /**
     *
     * @param codigoLocalTrabalho
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
    public EquipeMedica(String codigoLocalTrabalho, int idPessoa, String nome, String email, String cpf, String telefone, int idioma, String bairro, String cidade, String estado, String pais, String senha){
        super(idPessoa, nome, email, cpf, telefone, idioma, bairro, cidade, estado, pais, senha);
        this.codigoLocalTrabalho = codigoLocalTrabalho;
    }

    public void cadastrarMembro(int idPessoa) {
    }
    public Relatorio gerarRelatorio (char tipo){
         return null; // ALTERAR
    }
    public Paciente filtrarSintoma(){
        return null; // ALTERAR
    }
    public void agendarVisita (char data, int horario){
        
    }
    public Paciente filtrarPrioridade (int prioridade){
    	for (int i=0; i > 10;i++) {
    		prioridades[i] = prioridade;
    	}
    	Arrays.sort(prioridades);
        return null;
    }

    public String getCodigoLocalTrabalho() {
        return codigoLocalTrabalho;
    }

    public void setCodigoLocalTrabalho(String codigoLocalTrabalho) {
        this.codigoLocalTrabalho = codigoLocalTrabalho;
    }
    
    
}
