package ManzanoWhile;

public class ExercicioC {
    static void main(String[] args) {
        int[] contador = new int[2];
        contador[0] = 2;
        while (contador[0] < 500){
                contador[1] += contador[0];
            contador[0] = contador[0]+2;
        }
        System.out.println(contador[1]);
    }
}
