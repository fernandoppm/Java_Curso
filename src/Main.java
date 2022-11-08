public class Main {
    public static void main(String[] args) {
        ContaBanco banco = new ContaBanco( );
        banco.setNumConta(4444);
        banco.setDono("Lucas");
        banco.abrirConta("CC");

        ContaBanco banco2 = new ContaBanco();
        banco2.setNumConta(3333);
        banco2.setDono("Paula");
        banco2.abrirConta("CP");

        banco.depositar(100);
        banco2.depositar(500);

        banco.estadoAtual();
        banco2.estadoAtual();

    }
}