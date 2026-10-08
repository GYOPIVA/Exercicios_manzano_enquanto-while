package ManzanoWhile;

import java.util.Scanner;

public class ExercicioL {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        boolean primeirosNumeros = true;
        while (true){
            System.out.println("Digite um numero: \n" +
                    "(Digite um numero negativo para terminar!)");
            int numero = input.nextInt();
            if (numero < 0){
                System.out.println("Programa finalizado!");
                break;
            }
            if (primeirosNumeros){
                menor = numero;
                maior = numero;
                primeirosNumeros = false;
            }
            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
