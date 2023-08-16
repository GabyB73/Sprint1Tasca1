package N3Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
public class NoticiaF1 extends Noticia{
    private String escuderia;
    private ArrayList<Noticia> noticias;

    public NoticiaF1(String titular, String texto, int puntuacion, float precio, String escuderia, Redactor redactor) {
        super(titular, texto, puntuacion, precio, redactor);
        this.escuderia  = escuderia;
        this.noticias   = new ArrayList<>(); // Inicializar la lista de noticias
    }
    public String getEscuderia() {

        return escuderia;
    }
    public void setEscuderia(String escuderia) {

        this.escuderia = escuderia;
    }
    public void agregarNoticia(Noticia noticia) {

        noticias.add(noticia);
    }
    public ArrayList<Noticia> getNoticias() {

        return noticias;
    }
    @Override
    public double calcularPrecioNoticia() {

        Scanner sc = new Scanner(System.in);

        double precio = 100; // Precio inicial para noticias de F1

        // Realizar la pregunta al usuario sobre las escuderías

        String opcionEscuderia;
        do {
            System.out.println("¿Es sobre Ferrari o Mercedes? (FERRARI/MERCEDES/N)");
            opcionEscuderia = sc.nextLine();
            if (!opcionEscuderia.equalsIgnoreCase("FERRARI") && !opcionEscuderia.equalsIgnoreCase("MERCEDES")
                    &&!opcionEscuderia.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija FERRARI, MERCEDES, o N.");
            }
        } while (!opcionEscuderia.equalsIgnoreCase("FERRARI") && !opcionEscuderia.equalsIgnoreCase("MERCEDES")
                && !opcionEscuderia.equalsIgnoreCase("N"));

        // Realizar los cálculos basados en las respuestas del usuario

        if (opcionEscuderia.equalsIgnoreCase("FERRARI") || opcionEscuderia.equalsIgnoreCase("MERCEDES")) {
            precio += 50;
    }
        return precio;
}
    @Override
    public int calcularPuntuacionNoticia() {
        Scanner sc = new Scanner(System.in);

        int puntuacion = 4; // Puntuación inicial para noticias de F1

        // Realizar la pregunta al usuario sobre las escuderías

        String opcionEscuderia;
        do {
            System.out.println("¿Es sobre Ferrari o Mercedes? (FERRARI/MERCEDES/N)");
            opcionEscuderia = sc.nextLine();
            if (!opcionEscuderia.equalsIgnoreCase("FERRARI") && !opcionEscuderia.equalsIgnoreCase("MERCEDES")
                    &&!opcionEscuderia.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija FERRARI, MERCEDES, o N.");
            }
        } while (!opcionEscuderia.equalsIgnoreCase("FERRARI") && !opcionEscuderia.equalsIgnoreCase("MERCEDES")
                && !opcionEscuderia.equalsIgnoreCase("N"));

        // Realizar los cálculos basados en las respuestas del usuario

        if (opcionEscuderia.equalsIgnoreCase("FERRARI") || opcionEscuderia.equalsIgnoreCase("MERCEDES")) {
            puntuacion += 2;

        }
        return puntuacion;
    }

    }
