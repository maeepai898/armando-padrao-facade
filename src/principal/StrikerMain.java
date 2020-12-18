package principal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StrikerMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		Embalagem e1 = new Embalagem();
		ReduzirQuantidade r1 = new ReduzirQuantidade();
		Cliente c1 = new Cliente();
		NotaFiscal n1 = new NotaFiscal();
		EnviarEmail ee1 = new EnviarEmail();
		Date data = new Date(System.currentTimeMillis()); 
		SimpleDateFormat datadehoje = new SimpleDateFormat("dd-MM-yyyy"); 
		
		
		int op=0;
		do {
			e1.ttudo();
			op = entrada.nextInt();
			switch(op){
			case 1:
				e1.produtos();
				e1.comprar();
				e1.comp = entrada.next();
				if (e1.comp.equalsIgnoreCase("caneta")) {
					e1.selecionar();
					System.out.println(e1.caneta);
					r1.desejacomprar();
					e1.comp = entrada.next();
					if (e1.comp.equalsIgnoreCase("sim")) {
						c1.coletapnome();
						c1.setPnomecliente(entrada.next());
						c1.coletasnome();
						c1.setSnomecliente(entrada.next());
						c1.coletacpf();
						c1.setCpfcliente(entrada.next());
						c1.coletaidade();
						c1.setIdadecliente(entrada.next());
						c1.coletasexo();
						c1.setSexocliente(entrada.next());
						ee1.comprafeita();
						n1.notinha();
						System.out.println("Cliente: "+c1.getPnomecliente()+" "+c1.getSnomecliente()+"\nCPF Cliente: "+c1.cpfcliente + "\nN°-Unidade:01\nProduto: Caneta \nValor:250R$\nData Emissão: "+ datadehoje.format(data) +"\n--------------------------------------------------\n" );
					}
				} else if (e1.comp.equalsIgnoreCase("lapis")) {
					e1.selecionar();
					System.out.println(e1.lapis);
					r1.desejacomprar();
					e1.comp = entrada.next();
					if (e1.comp.equalsIgnoreCase("sim")) {
						c1.coletapnome();
						c1.setPnomecliente(entrada.next());
						c1.coletasnome();
						c1.setSnomecliente(entrada.next());
						c1.coletacpf();
						c1.setCpfcliente(entrada.next());
						c1.coletaidade();
						c1.setIdadecliente(entrada.next());
						c1.coletasexo();
						c1.setSexocliente(entrada.next());
						ee1.comprafeita();
						n1.notinha();
						System.out.println("Cliente: "+c1.getPnomecliente()+" "+c1.getSnomecliente()+"\nCPF Cliente: "+c1.cpfcliente + "\nN°-Unidade:01\nProduto: Lápis \nValor:15R$\nData Emissão: "+ datadehoje.format(data) +"\n--------------------------------------------------\n" );

					}
				}else if (e1.comp.equalsIgnoreCase("borracha")) {
					e1.selecionar();
					System.out.println(e1.borracha);
					r1.desejacomprar();
					e1.comp = entrada.next();
					if (e1.comp.equalsIgnoreCase("sim")) {
						c1.coletapnome();
						c1.setPnomecliente(entrada.next());
						c1.coletasnome();
						c1.setSnomecliente(entrada.next());
						c1.coletacpf();
						c1.setCpfcliente(entrada.next());
						c1.coletaidade();
						c1.setIdadecliente(entrada.next());
						c1.coletasexo();
						c1.setSexocliente(entrada.next());
						ee1.comprafeita();
						n1.notinha();
						System.out.println("Cliente: "+c1.getPnomecliente()+" "+c1.getSnomecliente()+"\nCPF Cliente: "+c1.cpfcliente + "\nN°-Unidade:01\nProduto: Borracha \nValor:8R$\nData Emissão: "+ datadehoje.format(data) +"\n--------------------------------------------------\n" );

					}
				}else if (e1.comp.equalsIgnoreCase("tesoura")) {
					e1.selecionar();
					System.out.println(e1.tesoura);
					r1.desejacomprar();
					e1.comp = entrada.next();
					if (e1.comp.equalsIgnoreCase("sim")) {
						c1.coletapnome();
						c1.setPnomecliente(entrada.next());
						c1.coletasnome();
						c1.setSnomecliente(entrada.next());
						c1.coletacpf();
						c1.setCpfcliente(entrada.next());
						c1.coletaidade();
						c1.setIdadecliente(entrada.next());
						c1.coletasexo();
						c1.setSexocliente(entrada.next());
						ee1.comprafeita();
						n1.notinha();
						System.out.println("Cliente: "+c1.getPnomecliente()+" "+c1.getSnomecliente()+"\nCPF Cliente: "+c1.cpfcliente + "\nN°-Unidade:01\nProduto: Tesoura \nValor:65R$\nData Emissão: "+ datadehoje.format(data) +"\n--------------------------------------------------\n" );

					}
				}else if (e1.comp.equalsIgnoreCase("tijolo")){
					e1.selecionar();
					System.out.println(e1.tijolo);
					r1.desejacomprar();
					e1.comp = entrada.next();
					if (e1.comp.equalsIgnoreCase("sim")) {
						c1.coletapnome();
						c1.setPnomecliente(entrada.next());
						c1.coletasnome();
						c1.setSnomecliente(entrada.next());
						c1.coletacpf();
						c1.setCpfcliente(entrada.next());
						c1.coletaidade();
						c1.setIdadecliente(entrada.next());
						c1.coletasexo();
						c1.setSexocliente(entrada.next());
						ee1.comprafeita();
						n1.notinha();
						System.out.println("Cliente: "+c1.getPnomecliente()+" "+c1.getSnomecliente()+"\nCPF Cliente: "+c1.cpfcliente + "\nN°-Unidade:01\nProduto: Tijolo \nValor:4R$\nData Emissão: "+ datadehoje.format(data) +"\n--------------------------------------------------\n" );

					}
				}else if (e1.comp.equalsIgnoreCase("telha")) {
					e1.selecionar();
					System.out.println(e1.telha);
					r1.desejacomprar();
					e1.comp = entrada.next();
					if (e1.comp.equalsIgnoreCase("sim")) {
						c1.coletapnome();
						c1.setPnomecliente(entrada.next());
						c1.coletasnome();
						c1.setSnomecliente(entrada.next());
						c1.coletacpf();
						c1.setCpfcliente(entrada.next());
						c1.coletaidade();
						c1.setIdadecliente(entrada.next());
						c1.coletasexo();
						c1.setSexocliente(entrada.next());
						ee1.comprafeita();
						n1.notinha();
						System.out.println("Cliente: "+c1.getPnomecliente()+" "+c1.getSnomecliente()+"\nCPF Cliente: "+c1.cpfcliente + "\nN°-Unidade:01\nProduto: Telha \nValor:3R$\nData Emissão: "+ datadehoje.format(data) +"\n--------------------------------------------------\n" );

					}
				}else if (e1.comp.equalsIgnoreCase("cimento")) {
					e1.selecionar();
					System.out.println(e1.cimento);
					r1.desejacomprar();
					e1.comp = entrada.next();
					if (e1.comp.equalsIgnoreCase("sim")) {
						c1.coletapnome();
						c1.setPnomecliente(entrada.next());
						c1.coletasnome();
						c1.setSnomecliente(entrada.next());
						c1.coletacpf();
						c1.setCpfcliente(entrada.next());
						c1.coletaidade();
						c1.setIdadecliente(entrada.next());
						c1.coletasexo();
						c1.setSexocliente(entrada.next());
						ee1.comprafeita();
						n1.notinha();
						System.out.println("Cliente: "+c1.getPnomecliente()+" "+c1.getSnomecliente()+"\nCPF Cliente: "+c1.cpfcliente + "\nN°-Unidade:01\nProduto: Cimento \nValor:60R$\nData Emissão: "+ datadehoje.format(data) +"\n--------------------------------------------------\n" );

					}
				}else if (e1.comp.equalsIgnoreCase("argamassa")) {
					e1.selecionar();
					System.out.println(e1.argamassa);
					r1.desejacomprar();
					e1.comp = entrada.next();
					if (e1.comp.equalsIgnoreCase("sim")) {
						c1.coletapnome();
						c1.setPnomecliente(entrada.next());
						c1.coletasnome();
						c1.setSnomecliente(entrada.next());
						c1.coletacpf();
						c1.setCpfcliente(entrada.next());
						c1.coletaidade();
						c1.setIdadecliente(entrada.next());
						c1.coletasexo();
						c1.setSexocliente(entrada.next());
						ee1.comprafeita();
						n1.notinha();
						System.out.println("Cliente: "+c1.getPnomecliente()+" "+c1.getSnomecliente()+"\nCPF Cliente: "+c1.cpfcliente + "\nN°-Unidade:01\nProduto: Argamassa \nValor:35R$\nData Emissão: "+ datadehoje.format(data) +"\n--------------------------------------------------\n" );

					}
				}else if (e1.comp.equalsIgnoreCase("gesso")) {
					e1.selecionar();
					System.out.println(e1.gesso);
					r1.desejacomprar();
					e1.comp = entrada.next();
					if (e1.comp.equalsIgnoreCase("sim")) {
						c1.coletapnome();
						c1.setPnomecliente(entrada.next());
						c1.coletasnome();
						c1.setSnomecliente(entrada.next());
						c1.coletacpf();
						c1.setCpfcliente(entrada.next());
						c1.coletaidade();
						c1.setIdadecliente(entrada.next());
						c1.coletasexo();
						c1.setSexocliente(entrada.next());
						ee1.comprafeita();
						n1.notinha();
						System.out.println("Cliente: "+c1.getPnomecliente()+" "+c1.getSnomecliente()+"\nCPF Cliente: "+c1.cpfcliente + "\nN°-Unidade:01\nProduto: Saco de Gesso \nValor:50R$\nData Emissão: "+ datadehoje.format(data) +"\n--------------------------------------------------\n" );

					}
				} else {
					System.out.println("Nome Inválido!");
				}
				
				break;
			case 2:				
					e1.produtos();					
				break;
			}
		} while (op<3);
		
	}

}
