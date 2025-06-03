package br.com.cdb.tratamentodeerros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int numero = 10;
//
//        int divisor = input.nextInt();
//        // Tratamento de erro com try-catch
//        try {
//            // Tentativa de dividir por zero
//            int resultado = numero / divisor;
//            System.out.println("Resultado: " + resultado);
//        } catch (ArithmeticException | NullPointerException e) {
//            // Tratamento de erro para divisão por zero
//            System.out.println("Erro: Divisão por zero não é permitida." + e.getMessage());
//        } finally {
//            // Bloco finally sempre executado
//            System.out.println("Operação finalizada.");
//        }

        double resultado = 0;
        try {
            resultado = divisao(10, 2);
        } catch (ArithmeticException e) {
            // Tratamento de erro para divisão por zero
            System.out.println("Erro: " + e.getMessage());

        } finally {

        }


    }

    private static double divisao(int dividendo, int divisor) throws ArithmeticException {
        double result = 0;
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        result = dividendo / divisor;
        return result;

    }
}