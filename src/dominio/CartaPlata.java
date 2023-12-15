package dominio;

import java.io.Serializable;

public class CartaPlata extends Carta implements Serializable {
    public CartaPlata(int tiro, int pase, int fisico, int velocidad, int defensa, int regate) {
        super(
                Math.min(Math.max(tiro, 31), 70),
                Math.min(Math.max(pase, 31), 70),
                Math.min(Math.max(fisico, 31), 70),
                Math.min(Math.max(velocidad, 31), 70),
                Math.min(Math.max(defensa, 31), 70),
                Math.min(Math.max(regate, 31), 70));
    }
    @Override
    public String toCSV() {
        return "Plata," + super.toCSV();
    }
    @Override
    public String toString() {
        return "CartaPlata{" +
                "tiro=" + getTiro() +
                ", pase=" + getPase() +
                ", fisico=" + getFisico() +
                ", velocidad=" + getVelocidad() +
                ", defensa=" + getDefensa() +
                ", regate=" + getRegate() +
                '}';
    }
    public static Carta fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        return new CartaPlata(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]),
                Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
    }
}