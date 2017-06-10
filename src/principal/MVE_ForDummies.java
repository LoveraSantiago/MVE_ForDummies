package principal;

import static conteudo.Abreviacoes.myValueOf;
import static core.Avaliador.isPrintarTudo;
import static core.Avaliador.isSaida;
import static java.util.Arrays.asList;

import conteudo.Abreviacoes;
import core.Leitor;

public class MVE_ForDummies {
	
	public static void main(String[] args) {		
		try(Leitor leitor = new Leitor()){
			while(true){				
				String comando = leitor.lerDoTeclado("Digite a abreviação, listar ou sair");
				if(isSaida(comando)) System.exit(0);
				if(isPrintarTudo(comando))asList(Abreviacoes.values()).forEach(System.out::println);
				else{					
					try{			
						System.out.println(myValueOf(comando));
					}catch(IllegalArgumentException e){
						System.out.println("Abreviação não encontrada. Maiusculas e minusculas são diferenciados.");
					}
				}
				System.out.println();
			}
		}catch (Exception e) { e.printStackTrace(); }	
		finally{System.out.println("Tchau tchau");}
	}
}
