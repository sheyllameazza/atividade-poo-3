public class SQLFactory {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fabio");

        Locadora locadora = new Locadora("Unidas");

        Carro carro = new Carro("Hilux", 2022, 150);

        Locacao locacao = new Locacao(cliente, locadora, carro, 10);
        locacao.resultado();
    }

}
