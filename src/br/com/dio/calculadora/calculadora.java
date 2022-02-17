package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro numero: ");
        a = scan.nextInt();
        System.out.println("Digite o Segundo numero: ");
        b = scan.nextInt();

        int soma = Soma(a, b);
        int subtracao = Subtracao(a, b);
        int mutiplicacao = Multiplicacao(a, b);
        float divisao = Divisao(a, b);



        System.out.println("Somar " + soma);
        System.out.println("Subtrair " + subtracao);
        System.out.println("Mutiplicacao " + mutiplicacao);
        System.out.println("Divisão " + divisao);

    }

    public static int Soma(int a, int b) {
        return a + b;
    }

    public static int Subtracao(int a, int b) {
        return a - b;
    }

    public static int Multiplicacao(int a, int b) {
        return a * b;
    }

    public static float Divisao(float a, float b) {
        return a / b;
    }

}
