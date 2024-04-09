package main;
import imoveis.*;

public class Main {

	public static void main(String[] args) {
	
		
		//CONTRATO 1:
		
		//Pessoas
		
		Proprietario[] p1 = {
				
				new Proprietario("Clotário III", 18), 
				new Proprietario("Eduarda", 20)
				
				};
		
		//Imovel
		
		Imovel i1 = new Imovel(12, 120000, p1);
		
		

		//CONTRATO 2:
		
		//Pessoas
		
		Proprietario[] p2 = {
				
				new Proprietario("João Gabriel", 33), 
				new Proprietario("Miguelita", 99),
				new Proprietario("Enzo (filho de João)", 4)
				
				};
		
		//Imovel
		
		
		Imovel i2 = new Imovel(125, 2000000, p2);
		
		
		Contrato[] contratos = {
				new Contrato(i1, 1999, 30), 
				new Contrato(i2, 137)
				};
		
		
		//Printar contratos
		for(Contrato c: contratos) {
			c.imprimeContrato();
			System.out.println("\n");
		}
		
		
		
	}

}
