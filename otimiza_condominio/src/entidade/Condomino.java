package entidade;

public class Condomino {
	private int cpf;
	private String nome;
	private int telefone;
	public int num_ap;
	public int num_bloco;
	
	public Condomino(int cpf, String nome, int telefone, int num_ap, int num_bloco) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.num_ap = num_ap;
		this.num_bloco = num_bloco;	
	}

	public Condomino() {
		
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getNum_ap() {
		return num_ap;
	}

	public void setNum_ap(int num_ap) {
		this.num_ap = num_ap;
	}

	public int getNum_bloco() {
		return num_bloco;
	}

	public void setNum_bloco(int num_bloco) {
		this.num_bloco = num_bloco;
	}

	public String nextLine() {
		
		return null;
	}

	public int nextInt() {
		
		return 0;
	}		


}
