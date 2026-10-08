package ManzanoWhile;

import java.util.Scanner;

public class ExercicioI {

    static void main(String[] args) {

        int contador = 0;
        int[] numeros =  new int[10];
        int soma = 0;
        double media = 0;
        Scanner input = new Scanner(System.in);
        while (contador < 10){
            System.out.printf("Digite o %d° numero: ", (contador + 1));
            numeros[contador] = input.nextInt();
            soma += numeros[contador];
            media += numeros[contador];
            contador++;
        }
        media = media/10;
        System.out.printf("Total soma: %d\nTotal média: %.1f", soma, media);

    }
}
