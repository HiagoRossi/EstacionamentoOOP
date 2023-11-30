class Vaga {
    private int numero;
    private Carro carroEstacionado;

    public Vaga(int numero) {
        this.numero = numero;
        this.carroEstacionado = null;
    }

    public boolean isVagaOcupada() {
        return carroEstacionado != null;
    }

    public void estacionarCarro(Carro carro) {
        if (!isVagaOcupada()) {
            this.carroEstacionado = carro;
            System.out.println("Carro estacionado na vaga " + numero);
        } else {
            System.out.println("Vaga ocupada. Não é possível estacionar.");
        }
    }

    public void liberarVaga() {
        if (isVagaOcupada()) {
            this.carroEstacionado = null;
            System.out.println("Vaga " + numero + " liberada.");
        } else {
            System.out.println("Vaga já está vazia.");
        }
    }
}
