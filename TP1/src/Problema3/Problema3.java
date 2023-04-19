package Problema3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Problema3 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("array_info.txt"))) {
            writer.write("Numeros nos índices pares:");
            writer.newLine();
            for (int i = 0; i < array.length; i += 2) {
                writer.write(array[i] + " ");
            }
            writer.newLine();
            writer.write("Numeros pares:");
            writer.newLine();
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    writer.write(array[i] + " ");
                }
            }
            writer.newLine();
            writer.write("Numeros na ordem inversa:");
            writer.newLine();
            for (int i = array.length - 1; i >= 0; i--) {
                writer.write(array[i] + " ");
            }
            writer.newLine();
            writer.write("Primeiro e último numeros:");
            writer.newLine();
            writer.write(array[0] + " " + array[array.length - 1]);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }

}