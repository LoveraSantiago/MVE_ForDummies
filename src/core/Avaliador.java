package core;

public class Avaliador {
	
	public static boolean isSaida(String texto){
		return isComumResult("sair", texto);	
	}
	
	public static boolean isPrintarTudo(String texto){
		return isComumResult("listar", texto);		
	}
	
	private static boolean isComumResult(String textoProcurado, String texto){
		texto = textoValido(texto);
		if(texto.toLowerCase().contains(textoProcurado)) return true;
		return false;
	}
	
	private static String textoValido(String texto){
		if(texto == null || texto.isEmpty()) return "";
		return texto;
	}
}
