
public class Endereço {

String rua ;
String bairro;
String cidade;
String nome_do_ap;

public Endereço(String r, String bair, String cit, String apn) {
	super();
	this.setRua(r);
	this.setBairro(bair);
	this.setCidade(cit);
	this.setNome_do_ap(apn);
}

public String getRua() {
	return rua;
}

public void setRua(String r) {
	this.rua = r;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bair) {
	this.bairro = bair;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cit) {
	this.cidade = cit;
}

public String getNome_do_ap() {
	return nome_do_ap;
}

public void setNome_do_ap(String apn) {
	this.nome_do_ap = apn;
}


}
