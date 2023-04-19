package Problema8;

import java.util.Random;

public class Problema8 {
    public static void main(String[] args) {
        double resistenciaNominal = 330; // valor nominal da resistência
        double tolerancia = 0.1; // tolerância de 10%
        int numResistencias = 10; // número de resistências a serem calculadas

        Random rand = new Random(); // objeto para gerar valores aleatórios

        for (int i = 0; i < numResistencias; i++) {
            double variacao = rand.nextDouble() * tolerancia * 2 - tolerancia; // calcula a variação aleatória da resistência
            double resistenciaReal = resistenciaNominal * (1 + variacao); // calcula o valor real da resistência

            System.out.printf("Resistência %d: %.2f Ω\n", i+1, resistenciaReal); // imprime o resultado com duas casas decimais
        }
    }
}
