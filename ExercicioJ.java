package ManzanoWhile;

public class ExercicioJ {
    static void main(String[] args) {

        int contadora = 50;
        int soma = 0;
        int media = 0;

        while (contadora < 71){
            if (contadora % 2 == 0){
                System.out.println(contadora);
                soma += contadora;
            }
            contadora++;
        }

        media = soma/ 10;
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}
