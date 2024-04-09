package imoveis;

public class Imovel {
	
	private int numero;
	private double preco;
	private Proprietario[] proprietario;
	
	public Imovel(int numero, double preco, Proprietario[] proprietario){
		
		this.numero = numero;
		this.preco = preco;
		this.proprietario = proprietario;
		
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public Proprietario[] getProprietario() {
		return this.proprietario;
	}
	
	public int getNum() {
		return this.numero;
	}

}
