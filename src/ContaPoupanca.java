class ContaPoupanca extends Conta {

	ContaPoupanca(Cliente cliente) {

		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
	}
}
