package coronaapp;

import java.util.Date;
import javax.swing.JOptionPane;

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
    
    public void agendarVisita (Date date, String cpfPaciente){
        try {
                Visita visita = new Visita(date, super.getCpf(), cpfPaciente);
                JOptionPane.showMessageDialog(null, "Visita agendada com sucesso!", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível agendar a visita!\nErro:" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
    }
    public Paciente filtrarPrioridade (){
        return null; // ALTERAR
    }

    public String getCodigoLocalTrabalho() {
        return codigoLocalTrabalho;
    }

    public void setCodigoLocalTrabalho(String codigoLocalTrabalho) {
        this.codigoLocalTrabalho = codigoLocalTrabalho;
    }
    
    
}
