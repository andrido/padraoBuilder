package br.com.designpatterns.projeto.model;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;

    // Construtor privado
    private Carro(CarroBuilder builder) {
        this.modelo = builder.modelo;
        this.cor = builder.cor;
        this.ano = builder.ano;
    }

    public static class CarroBuilder {
        private String modelo;
        private String cor;
        private int ano;

        public CarroBuilder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public CarroBuilder setCor(String cor) {
            this.cor = cor;
            return this;
        }

        public CarroBuilder setAno(int ano) {
            this.ano = ano;
            return this;
        }

        public Carro build() {
            return new Carro(this);
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
