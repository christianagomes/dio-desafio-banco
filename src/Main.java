public class Main {

    public static void main(String[] args) {
        Cliente chris = new Cliente();
        chris.setNome("Chris");

        Conta cc = new ContaCorrente(chris);
        Conta poupanca = new ContaPoupanca(chris);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }


}
