package br.com.cdb.tratamentodeerros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 10;

        int divisor = input.nextInt();
        // Tratamento de erro com try-catch
        try {
            // Tentativa de dividir por zero
            int resultado = numero / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Tratamento de erro para divisão por zero
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {
            // Bloco finally sempre executado
            System.out.println("Operação finalizada.");
        }


    }
}