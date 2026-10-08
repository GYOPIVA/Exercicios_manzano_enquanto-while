package ManzanoWhile;

public class ExercicioB {
    public static void main(String[] args) {
        int[] contador = new int[2];

        while(contador[0] < 101){
            contador[1] += contador[0];
            contador[0]++;
            System.out.print(contador[1] + " ,");
        }
    }
}
