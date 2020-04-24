package coronaapp;

public class Pessoa {
	private int idPessoa;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	private String cidade;
	private String estado;
	private String senha;

    public Pessoa(int idPessoa, String nome, String email, String cpf, String telefone, String cidade, String estado, String senha) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.senha = senha;
    }
}
