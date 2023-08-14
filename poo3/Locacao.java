class Locacao {
    Cliente cliente;
    Locadora locadora;
    Carro carro;
    int tempoAluguel;

    public Locacao(Cliente cliente, Locadora locadora, Carro carro, int tempoAluguel) {
        this.cliente = cliente;
        this.locadora = locadora;
        this.carro = carro;
        this.tempoAluguel = tempoAluguel;
    }

    public void resultado() {

        System.out
                .println("O cliente " + cliente.nome + " Alugou o carro modelo " + carro.modelo + ", ano " + carro.ano
                        + " na locadora "
                        + locadora.getNome() + " por " + tempoAluguel + " dias," + " O aluguel ficou no valor de R$"
                        + (carro.aluguel * tempoAluguel));

    }
}
