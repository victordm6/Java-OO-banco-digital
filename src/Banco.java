import java.util.List;

class Banco {

	private String nome;
	private List<Conta> contas;

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	List<Conta> getContas() {
		return contas;
	}

	void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
