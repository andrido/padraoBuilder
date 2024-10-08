package br.com.designpatterns.projeto;

import br.com.designpatterns.projeto.model.Carro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        // Usando o Builder para criar um Carro
        Carro carro = new Carro.CarroBuilder()
                .setModelo("Fusca")
                .setCor("Azul")
                .setAno(1970)
                .build();

        System.out.println(carro);
    }
}
