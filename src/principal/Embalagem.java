package principal;
public class Embalagem {
	
	String caneta1, lapis1, borracha1, terousa1;
	String caneta = "-Caneta- \nValor: 250R$";
	String lapis  = "-Lapis- \nValor: 15R$";
	String borracha = "-Borracha- \nValor: 8R$";
	String tesoura = "-Tesoura- \nValor: 65R$";
	String tijolo = "-Unidade de Tijolo- \nValor: 4R$";
	String telha = "-Unidade de Telha- \nValor: 3R$";
	String cimento = "-Saco de Cimento- \nValor: 60R$";
	String argamassa = "-Argamassa- \nValor: 35R$";
	String gesso = "-Saco de Gesso- \nValor: 50R$";
	String comp;
	
	
	
public void	menu (){
		System.out.println("	**********************************************");
		System.out.println("	 Seja bem vindo A Loja Veríssimo Construções!!");
		System.out.println("	**********************************************\n");
		System.out.println("-------------------------------------");
}
public void pprodutos() {
		System.out.println("Digite 1 para comprar produtos");
		System.out.println("Digite 2 para ver produtos: ");
		System.out.println("Digite 3 para Sair");
		System.out.println("-------------------------------------");
		System.out.println("Digite a opção a seguir:");
}

		
	
	
public void comprar () {
	System.out.println("Digite o nome do produto que deseja comprar:\n");
}
	
public void ttudo() {
	menu();
	pprodutos();
	comprar();
	
}
	
	

	public void produtos() {
	System.out.println("-----------------------------------------------------------------------------");
	System.out.println("Nossos Produtos Disponíveis são os seguintes:");
	System.out.println("Matériais escolar: Caneta, Lápis, Borracha e Tesoura.");
	System.out.println("Matériais de construção: Tijolo, Telha, Saco De Cimento, Argamassa e Gesso.");
	System.out.println("-----------------------------------------------------------------------------");
	
	
	}
	
	public void selecionar() {
		System.out.println("Você adicionou o seguinte item:");
	}

}
