package ManzanoWhile;

import java.util.Scanner;

public class ExercicioF {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[2];
        System.out.println("Digite um numero base:");
        numeros[0] = sc.nextInt();
        System.out.println("Digite o numero expoente:");
        numeros[1] = sc.nextInt();

        System.out.printf("Resultado: %d^%d = %.0f", numeros[0], numeros[1], Math.pow(numeros[0], numeros[1]));
    }
}
