
public class Pessoa {
String nome;
Integer idade;
String Sexo;
Integer Tel;


public Pessoa(String n, Integer i, String s, Integer t) {
	this.setNome(n);
	this.setIdade(i);
	setSexo (s);
	setTel(t);
}
public String getNome() {
	return nome;
}
public void setNome(String n) {
	this.nome = n;
}
public Integer getIdade() {
	return idade;
}
public void setIdade(Integer i) {
	this.idade = i;
}
public String getSexo() {
	return Sexo;
}
public void setSexo(String s) {
	Sexo = s;
}
public Integer getTel() {
	return Tel;
}
public void setTel(Integer t) {
	Tel = t;
}}