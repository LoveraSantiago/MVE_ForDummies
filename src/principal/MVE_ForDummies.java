package principal;

import core.Leitor;

public class MVE_ForDummies {
	
	public static void main(String[] args) {		
		try(Leitor leitor = new Leitor()){
			while(true)
				leitor.lerDoTeclado("Digite a abrevia��o.");
		} catch (Exception e) {			
			e.printStackTrace();
		}	
	}
}
