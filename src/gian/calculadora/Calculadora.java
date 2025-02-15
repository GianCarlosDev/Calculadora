package gian.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitorEntradas = new Scanner(System.in);
        try {
            System.out.println("Digite um número: ");
            int num1 = leitorEntradas.nextInt();
            System.out.println("Qual operação matemática você quer fazer? + , - , * , / ");
            String operadoresAritmeticos = leitorEntradas.next();
            System.out.println("Digite outro número: ");
            int num2 = leitorEntradas.nextInt();

            while (operadoresAritmeticos.equals("/") && num2 == 0) {
                System.out.println("Erro: divisão por zero não é permitida. Por favor, digite um número diferente de zero: ");
                num2 = leitorEntradas.nextInt();
            }

            switch (operadoresAritmeticos) {
                case "+":
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("Resultado: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Operação não definida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Por favor, insira números inteiros.");
        } finally {
            leitorEntradas.close();
        }
    }
}

