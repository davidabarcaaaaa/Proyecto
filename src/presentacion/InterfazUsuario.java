package presentacion;

import aplicacion.GestorCartas;
import dominio.*;
import java.util.List;
import java.util.Scanner;
/**
 * Clase que representa la interfaz de usuario para gestionar cartas.
 */
public class InterfazUsuario {
    private GestorCartas gestorCartas;
    private Scanner scanner;
    /**
     * Constructor de la clase InterfazUsuario.
     * @param gestorCartas El gestor de cartas que se utilizará para realizar las operaciones de negocio.
     */
    public InterfazUsuario(GestorCartas gestorCartas) {
        this.gestorCartas = gestorCartas;
        this.scanner = new Scanner(System.in);
    }
    /**
     * Muestra el menú de opciones y permite al usuario seleccionar una opción.
     */
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar Carta");
            System.out.println("2. Eliminar Carta");
            System.out.println("3. Modificar Carta");
            System.out.println("4. Mostrar Cartas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarCarta();
                    break;
                case 2:
                    eliminarCarta();
                    break;
                case 3:
                    modificarCarta();
                    break;
                case 4:
                    mostrarCartas();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
    /**
     * Método privado para agregar una nueva carta.
     */
    private void agregarCarta() {
        System.out.println("Agregar nueva carta:");
        System.out.print("Tipo de carta (Bronce, Oro, Plata, Ultra): ");
        String tipo = scanner.next();

        System.out.print("Tiro: ");
        int tiro = scanner.nextInt();

        System.out.print("Pase: ");
        int pase = scanner.nextInt();

        System.out.print("Fisico: ");
        int fisico = scanner.nextInt();

        System.out.print("Velocidad: ");
        int velocidad = scanner.nextInt();

        System.out.print("Defensa: ");
        int defensa = scanner.nextInt();

        System.out.print("Regate: ");
        int regate = scanner.nextInt();

        Carta carta = null;
        switch (tipo.toLowerCase()) {
            case "bronce":
                carta = new CartaBronce(tiro, pase, fisico, velocidad, defensa, regate);
                break;
            case "oro":
                carta = new CartaOro(tiro, pase, fisico, velocidad, defensa, regate);
                break;
            case "plata":
                carta = new CartaPlata(tiro, pase, fisico, velocidad, defensa, regate);
                break;
            case "ultra":
                carta = new CartaUltra(tiro, pase, fisico, velocidad, defensa, regate);
                break;
            default:
                System.out.println("Tipo de carta no reconocido.");
                return;
        }

        gestorCartas.agregarCarta(carta);
        System.out.println("Carta agregada exitosamente.");
    }
    /**
     * Método privado para eliminar una carta.
     */
    private void eliminarCarta() {
        System.out.println("Eliminar carta:");
        List<Carta> cartas = gestorCartas.obtenerCartas();
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println((i + 1) + ". " + cartas.get(i));
        }

        System.out.print("Seleccione el número de la carta a eliminar: ");
        int indice = scanner.nextInt() - 1;

        if (indice >= 0 && indice < cartas.size()) {
            gestorCartas.eliminarCarta(cartas.get(indice));
            System.out.println("Carta eliminada exitosamente.");
        } else {
            System.out.println("Indice de carta inválido.");
        }
    }
    /**
     * Método privado para modificar una carta.
     */
    private void modificarCarta() {
        System.out.println("Modificar carta:");
        List<Carta> cartas = gestorCartas.obtenerCartas();
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println((i + 1) + ". " + cartas.get(i));
        }

        System.out.print("Seleccione el número de la carta a modificar: ");
        int indice = scanner.nextInt() - 1;

        if (indice >= 0 && indice < cartas.size()) {
            Carta carta = cartas.get(indice);

            System.out.print("Nuevo tiro (actual " + carta.getTiro() + "): ");
            carta.setTiro(scanner.nextInt());

            System.out.print("Nuevo pase (actual " + carta.getPase() + "): ");
            carta.setPase(scanner.nextInt());

            System.out.print("Nuevo fisico (actual " + carta.getFisico() + "): ");
            carta.setFisico(scanner.nextInt());

            System.out.print("Nueva velocidad (actual " + carta.getVelocidad() + "): ");
            carta.setVelocidad(scanner.nextInt());

            System.out.print("Nueva defensa (actual " + carta.getDefensa() + "): ");
            carta.setDefensa(scanner.nextInt());

            System.out.print("Nuevo regate (actual " + carta.getRegate() + "): ");
            carta.setRegate(scanner.nextInt());

            gestorCartas.modificarCarta(indice, carta);
            System.out.println("Carta modificada exitosamente.");
        } else {
            System.out.println("Indice de carta inválido.");
        }
    }
    /**
     * Método privado para mostrar las cartas.
     */
    private void mostrarCartas() {
        List<Carta> cartas = gestorCartas.obtenerCartas();
        if (cartas.isEmpty()) {
            System.out.println("No hay cartas disponibles.");
        } else {
            for (int i = 0; i < cartas.size(); i++) {
                System.out.println((i + 1) + ". " + cartas.get(i));
            }
        }
    }
}