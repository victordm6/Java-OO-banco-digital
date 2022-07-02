class Main {

	static void main(String[] args) {
		
		Cliente victor = new Cliente();
		victor.setNome("Victor");
		
		Conta cc = new ContaCorrente(victor);
		Conta poupanca = new ContaPoupanca(victor);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
