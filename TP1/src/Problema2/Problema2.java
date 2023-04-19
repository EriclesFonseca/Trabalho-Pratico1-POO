package Problema2;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o texto a ser encriptado:");
        String textoOriginal = sc.nextLine();
        String textoEncriptado = rodarTexto(textoOriginal);
        System.out.println("Texto encriptado: " + textoEncriptado);
    }

    public static String rodarTexto(String textoOriginal) {
        StringBuilder textoEncriptado = new StringBuilder();
        for (int i = 0; i < textoOriginal.length(); i++) {
            char letra = textoOriginal.charAt(i);
            if (letra >= 'A' && letra <= 'Z') {
                letra = (char) ((letra - 'A' + 13) % 26 + 'A');
            } else if (letra >= 'a' && letra <= 'z') {
                letra = (char) ((letra - 'a' + 13) % 26 + 'a');
            }
            textoEncriptado.append(letra);
        }
        return textoEncriptado.toString();
    }

}
