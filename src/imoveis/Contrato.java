package imoveis;

public class Contrato {
	
	private int numero;
	private int year;
	private Imovel imovel;
	private double corretagem;
	
	public Contrato(Imovel imovel, int numero) {
		
		this.year = 2024;
		this.imovel = imovel;
		this.numero = numero;
		this.corretagem = calculoCorretagem();
		
		
	}
	
	public Contrato(Imovel imovel, int year, int numero) {
		this.year = year;
		this.imovel = imovel;
		this.numero = numero;
		this.corretagem = calculoCorretagem();
	}
	
	
	private double calculoCorretagem() {
		
		
		double corretagemc;
		
		if(year > 2020 || imovel.getPreco() >= 1000000) {
			corretagemc = imovel.getPreco() * 5/100;

		}
		else {
			corretagemc = imovel.getPreco()/10;	
		}
		
		return corretagemc;
		
	}
	
	
	public void imprimeContrato() {
		
		System.out.println("Numero do contrato: " + numero);
		System.out.println("Ano do contrato: "+ year);
		System.out.println("Preço do Imóvel: " + imovel.getPreco());
		System.out.println("Preço da Corretagem: " + this.corretagem);
		
		System.out.println("Proprietários-");
		for(Proprietario a:imovel.getProprietario()) {
			System.out.println("     Nome: " + a.getNome());
			System.out.println("     Idade: " + a.getIdade());
		}
		
	}

}
