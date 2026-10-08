package ManzanoWhile;

import java.util.Scanner;

public class ExercicioA {
    static void main(String[] args) {
        byte contador = 1;
        System.out.println("Digite um numero para fazer sua tabuada: ");
        int numeroDigitado = new Scanner(System.in).nextInt();
        while (contador < 11){
            System.out.printf("%d x %d = %d\n"
                    , contador, numeroDigitado, (contador * numeroDigitado));
            contador++;
            if (contador == 11){
                System.out.println("Digitar outro numero? 1(Sim) ou outro numero para não");
                byte loop = (new Scanner(System.in)).nextByte();
                if (loop == 1){
                    System.out.println("Digite um numero para fazer sua tabuada: ");
                    numeroDigitado = new Scanner(System.in).nextInt();
                    contador = 1;
                }else {
                    System.out.println("Programa finalizado!");
                }
            }
        }
    }
}
