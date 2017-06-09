package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitor implements AutoCloseable{
	
	private final BufferedReader bufferedReader;
	
	public Leitor() {
		this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));	
	}

	public String lerDoTeclado(String msg){
		String result = null;
		System.out.println(msg);
		try {
			result = bufferedReader.readLine().toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;	
	}

	@Override
	public void close() throws Exception {		
		this.bufferedReader.close();
	}

}
