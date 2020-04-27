package coronaapp;

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
}
