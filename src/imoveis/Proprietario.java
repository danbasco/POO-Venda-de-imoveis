package imoveis;

public class Proprietario {
	
	private String nome;
	private int idade;
	
	public Proprietario(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
}
