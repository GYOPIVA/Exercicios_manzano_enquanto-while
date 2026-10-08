package ManzanoWhile;

public class ExercicioH {
    static void main(String[] args) {

        int contador = 0;
        double celcius = 10;
        double fahrenheit;
        while (contador < 10){
             fahrenheit = (celcius * 9/5) + 32;
            System.out.printf("""
                    Celcius: %.0f°C
                    Fahrenheit: %.0f°F
                    -------------------
                    """, celcius,fahrenheit);
            celcius = celcius + 10;
            contador++;

        }
    }
}
