package aplicacion;

import dominio.Carta;
import java.util.ArrayList;
import java.util.List;

public class GestorCartas {
    private List<Carta> cartas;

    public GestorCartas() {
        this.cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void eliminarCarta(Carta carta) {
        cartas.remove(carta);
    }

    public void modificarCarta(int indice, Carta carta) {
        if (indice >= 0 && indice < cartas.size()) {
            cartas.set(indice, carta);
        }
    }

    public List<Carta> obtenerCartas() {
        return new ArrayList<>(cartas);
    }
}