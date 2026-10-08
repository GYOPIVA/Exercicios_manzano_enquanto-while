package ManzanoWhile;

import java.util.Scanner;

public class ExercicioK {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nomeComodo;
        String resposta;

        double largura;
        double comprimento;
        double area;
        double areaTotal = 0;

        do {
            System.out.print("Digite o nome do cômodo: ");
            nomeComodo = entrada.nextLine();

            System.out.print("Digite a largura do cômodo: ");
            largura = entrada.nextDouble();

            System.out.print("Digite o comprimento do cômodo: ");
            comprimento = entrada.nextDouble();

            area = largura * comprimento;
            areaTotal += area;

            System.out.println("\nCômodo: " + nomeComodo);
            System.out.println("Área: " + area + " m²");

            entrada.nextLine();

            System.out.print("\nDeseja cadastrar outro cômodo? (SIM/NAO): ");
            resposta = entrada.nextLine();

        } while (resposta.equalsIgnoreCase("SIM"));

        System.out.println("\nÁrea total da residência: " + areaTotal + " m²");

        entrada.close();
    }
}