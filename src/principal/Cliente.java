package principal;

public class Cliente {
	
	public void coletapnome() {
		System.out.println("Informe seu primeiro nome: ");
		
	}
	public void coletasnome() {
		System.out.println("Informe seu Segundo Nome: ");
	}
	public void coletacpf() {
		System.out.println("Informe seu CPF: ");
	}
	
	public void coletaidade() {
		System.out.println("Informe sua idade: ");
	}
	
	public void coletasexo() {
		System.out.println("Informe seu sexo: Masculino ou Feminino: ");
	}
	public void dadosalvo() {
		System.out.println("Cliente cadastrado com Sucesso!!");
	}
	
	
	public String getPnomecliente() {
		return pnomecliente;
	}

	public void setPnomecliente(String pnomecliente) {
		this.pnomecliente = pnomecliente;
	}

	public String getSnomecliente() {
		return snomecliente;
	}

	public void setSnomecliente(String snomecliente) {
		this.snomecliente = snomecliente;
	}

	public String getCpfcliente() {
		return cpfcliente;
	}

	public void setCpfcliente(String cpfcliente) {
		this.cpfcliente = cpfcliente;
	}

	public String getIdadecliente() {
		return idadecliente;
	}

	public void setIdadecliente(String idadecliente) {
		this.idadecliente = idadecliente;
	}

	public String getInformar() {
		return informar;
	}

	public void setInformar(String informar) {
		this.informar = informar;
	}

	String pnomecliente,snomecliente, cpfcliente, idadecliente, informar, sexocliente;

	public String getSexocliente() {
		return sexocliente;
	}
	public void setSexocliente(String sexocliente) {
		this.sexocliente = sexocliente;
	}
	
}
