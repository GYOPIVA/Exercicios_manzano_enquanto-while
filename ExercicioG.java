package ManzanoWhile;

public class ExercicioG {
    static void main(String[] args) {

        int contador = 2;
        int anterior = 1;
        int atual = 1;
        System.out.println(anterior);
        System.out.println(atual);
        while (contador < 16){
            int proximo = anterior + atual;
            System.out.println(proximo);
            anterior = atual;
            atual = proximo;
            contador++;
        }
    }
}

