
public class Main {
public static void main ( String[] args) {

	Pessoa p[] = new Pessoa[3];
	p[0] = new Pessoa("Roberto Silva",23,"masculino",933461132);
	p[1] = new Pessoa("John Peter",28,"masculino",926445577);
	p[2] = new Pessoa("Angela de Jesuis",34,"feminino",934112231);
	
//----------------------------------------------	

	Endere�o e[] = new Endere�o[3];
	e[0] = new Endere�o("Michel Freites","Praia Comprida","S�o Paulo","Getulio's Residence");
	e[1] = new Endere�o("Bernardo Guimar�es","Areias","S�o Jos�","Isadora Residence");
	e[2] = new Endere�o("Augustinho Fernandes","Palho�a","Queimado","4 Esta��es");

//----------------------------------------------	

	System.out.println(p[0].nome + " de " + p[0].idade + " anos, do sexo " + p[0].Sexo+" mora no bairro: "
			+ e[0].bairro + " na cidade de " + e[0].cidade + ", na rua " + e[0].rua + " e no apartamento " + e[0].nome_do_ap + " e seu "
					+ "numero de telefone � " + p[0].Tel + "." );
	//---------------------------------------------------------------------------------------------------	
	System.out.println(p[1].nome + " de " + p[1].idade + " anos, do sexo " + p[1].Sexo+" mora no bairro: "
			+ e[1].bairro + " na cidade de " + e[1].cidade + ", na rua " + e[1].rua + " e no apartamento " + e[1].nome_do_ap + " e seu "
					+ "numero de telefone � " + p[1].Tel + "." );
	//--------------------------------------------------------------------------------------------------	
	System.out.println(p[0].nome + " de " + p[2].idade + " anos, do sexo " + p[2].Sexo+" mora no bairro "
			+ e[2].bairro + "na cidade de " + e[2].cidade + ", na rua " + e[2].rua + " e no apartamento " + e[2].nome_do_ap + " e seu "
					+ "numero de telefone � " + p[2].Tel + "." );
	//---------------------------------------------------------------------------------------------------	
}}