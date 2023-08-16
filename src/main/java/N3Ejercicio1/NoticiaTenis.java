package N3Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
public class NoticiaTenis extends Noticia{

    private String competicion;
    private String tenista;
    private ArrayList<Noticia> noticias;

    public NoticiaTenis(String titular, String texto, int puntuacion, float precio, String competicion,
                        String tenista, Redactor redactor) {
        super(titular, texto, puntuacion, precio, redactor);
        this.competicion    = competicion;
        this.tenista        = tenista;
        this.noticias       = new ArrayList<>(); // Inicializar la lista de noticias
    }
    public String getCompeticion() {

        return competicion;
    }
    public void setCompeticion(String competicion) {

        this.competicion = competicion;
    }
    public String getTenista() {

        return tenista;
    }
    public void setTenista(String tenista) {

        this.tenista = tenista;
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

        double precio = 150; // Precio inicial para noticias de tenis

        // Realizar la pregunta al usuario sobre los tenistas

        String opcionTenista;
        do {
            System.out.println("¿Es sobre Federer o Nadal o Djokovic? (FEDERER/NADAL/DJOKOVIC/N)");
            opcionTenista = sc.nextLine();
            if (!opcionTenista.equalsIgnoreCase("FEDERER") && !opcionTenista.equalsIgnoreCase("NADAL")
                    && !opcionTenista.equalsIgnoreCase("DJOKOVIC") &&!opcionTenista.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija FEDERER, NADAL, DJOKOVIC o N.");
            }
        } while (!opcionTenista.equalsIgnoreCase("FEDERER") && !opcionTenista.equalsIgnoreCase("NADAL")
                && !opcionTenista.equalsIgnoreCase("DJOKOVIC") && !opcionTenista.equalsIgnoreCase("N"));

        // Realizar los cálculos basados en las respuestas del usuario

        if (opcionTenista.equalsIgnoreCase("FEDERER") || opcionTenista.equalsIgnoreCase("NADAL")
                || opcionTenista.equalsIgnoreCase("DJOKOVIC") ) {
            precio += 100;
        }
        return precio;
    }
    @Override
    public int calcularPuntuacionNoticia() {

        Scanner sc = new Scanner(System.in);

        int puntuacion = 4; // Puntuación inicial para noticias de tenis

        // Realizar la pregunta al usuario sobre los tenistas

        String opcionTenista;
        do {
            System.out.println("¿Es sobre Federer o Nadal o Djokovic? (FEDERER/NADAL/DJOKOVIC/N)");
            opcionTenista = sc.nextLine();
            if (!opcionTenista.equalsIgnoreCase("FEDERER") && !opcionTenista.equalsIgnoreCase("NADAL")
                    && !opcionTenista.equalsIgnoreCase("DJOKOVIC") &&!opcionTenista.equalsIgnoreCase("N")) {
                System.out.println("Opción inválida. Por favor, elija FEDERER, NADAL, DJOKOVIC o N.");
            }
        } while (!opcionTenista.equalsIgnoreCase("FEDERER") && !opcionTenista.equalsIgnoreCase("NADAL")
                && !opcionTenista.equalsIgnoreCase("DJOKOVIC") && !opcionTenista.equalsIgnoreCase("N"));

        // Realizar los cálculos basados en las respuestas del usuario

        if (opcionTenista.equalsIgnoreCase("FEDERER") || opcionTenista.equalsIgnoreCase("NADAL")
                || opcionTenista.equalsIgnoreCase("DJOKOVIC") ) {
            puntuacion += 3;
        }
            return puntuacion;
        }
}
