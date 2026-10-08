package ManzanoWhile;

public class ExercicioE {
    static void main(String[] args) {

        int expoente = 0;

        while (expoente < 16){

            System.out.printf("%d^%d = %.0f\n", 3, expoente, Math.pow(3,expoente));
            expoente++;
        }
    }
}
