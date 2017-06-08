package conteudo;

public enum Abreviacoes {
	
	µA("Microampere"),
	µm("Micrometre"),
	µs("Microsecond"),
	a("Alphabetic (see section 4.3, Data Element Format Conventions)"),
	AAC("Application Authentication Cryptogram"),
	AAR("Application Authorisation Referral"),
	AC("Application Cryptogram"),
	ACK("Acknowledgment"),
	ADF("Application Definition File"),
	AEF("Application Elementary File"),
	AFL("Application File Locator"),
	AID("Application Identifier"),
	AIP("Application Interchange Profile"),
	an("Alphanumeric see section 4.3"),
	ans("Alphanumeric Special (see section 4.3)"),
	APDU("Application Protocol Data Unit"),
	API("Application Program Interface"),
	ARC("Authorisation Response Code"),
	ARPC("Authorisation Response Cryptogram"),
	ARQC("Authorisation Request Cryptogram"),
	ASI("Application Selection Indicator"),
	ASN("Abstract Syntax Notation");
	
	private String descricao;
	
	private Abreviacoes(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
