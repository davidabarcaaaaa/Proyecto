package aplicacion;

import dominio.Carta;
import java.util.ArrayList;
import java.util.List;

/**
 * GestorCartas maneja las operaciones de negocio relacionadas con objetos Carta.
 * Permite agregar, eliminar, modificar y obtener cartas.
 */
public class GestorCartas {
    private List<Carta> cartas;

    /**
     * Constructor que inicializa la lista de cartas.
     */
    public GestorCartas() {
        this.cartas = new ArrayList<>();
    }

    /**
     * Agrega una nueva carta a la lista.
     * @param carta La carta a agregar.
     */
    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    /**
     * Elimina una carta de la lista.
     * @param carta La carta a eliminar.
     */
    public void eliminarCarta(Carta carta) {
        cartas.remove(carta);
    }

    /**
     * Modifica una carta existente en la lista.
     * @param indice El índice de la carta a modificar.
     * @param carta La carta con las modificaciones aplicadas.
     */
    public void modificarCarta(int indice, Carta carta) {
        if (indice >= 0 && indice < cartas.size()) {
            cartas.set(indice, carta);
        }
    }

    /**
     * Obtiene la lista de cartas.
     * @return Una lista de cartas.
     */
    public List<Carta> obtenerCartas() {
        return new ArrayList<>(cartas);
    }
}

