package dominio;

import java.io.Serializable;

public class CartaUltra extends Carta implements Serializable {
    public CartaUltra(int tiro, int pase, int fisico, int velocidad, int defensa, int regate) {
        super(
                Math.min(Math.max(tiro,91), 99),
                Math.min(Math.max(pase, 91), 99),
                Math.min(Math.max(fisico, 91), 99),
                Math.min(Math.max(velocidad, 91), 99),
                Math.min(Math.max(defensa, 91), 99),
                Math.min(Math.max(regate, 91), 99));
    }
    @Override
    public String toCSV() {
        return "Ultra," + super.toCSV();
    }
    @Override
    public String toString() {
        return "CartaUltras{" +
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
        return new CartaOro(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]),
                Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
    }
}