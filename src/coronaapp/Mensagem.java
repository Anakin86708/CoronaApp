package coronaapp;

import static coronaapp.View.Mensagens.mensagens;
import static coronaapp.View.Login.equipeMedicasInstanciados;
import static coronaapp.View.Login.pacientesInstanciados;
import java.util.Date;

public class Mensagem {
	private Date data;
	private String texto;
	private int idRemetente;
	private int idDestinatario;
        
   public Mensagem(Date data, String texto, int idRemetente, int idDestinatario){
       this.data = data;
       this.texto = texto;
       this.idRemetente = idRemetente;
       this.idDestinatario = idDestinatario;
   }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getRemetente() {
        return idRemetente;
    }

    public void setRemetente(int idRemetente) {
        this.idRemetente = idRemetente;
    }

    public int getDestinatario() {
        return idDestinatario;
    }

    public void setDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public String toString(boolean ver) {
        String textoItemMensagem = null;
        if(!ver){
            for(EquipeMedica em : equipeMedicasInstanciados){
                if(this.getRemetente() == em.getIdPessoa()){
                    String nomeRemetente = em.getNome();
                    textoItemMensagem = "Data: "+this.getData()+" Remetente: "+nomeRemetente+" Texto: "+this.getTexto();
                    break;
                }
            }
        } else {
            for(Paciente p : pacientesInstanciados){
                if(this.getRemetente() == p.getIdPessoa()){
                    String nomeRemetente = p.getNome();
                    textoItemMensagem = "Data: "+this.getData()+" Remetente: "+nomeRemetente+" Texto: "+this.getTexto();
                    break;
                }
            }
        }
        return textoItemMensagem;
    }
    
}
