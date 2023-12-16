package dominio;
/**
 * La clase Carta representa una carta de fútbol.
 * Una carta tiene atributos de tiro, pase, físico, velocidad, defensa y regate.
 * Estos atributos se utilizan para calcular el puntaje de la carta.
 */
public abstract class Carta{
    private int tiro;
    private int pase;
    private int fisico;
    private int velocidad;
    private int defensa;
    private int regate;

    /**
     * Constructor de la clase Carta.
     * @param tiro El valor de tiro de la carta.
     * @param pase El valor de pase de la carta.
     * @param fisico El valor de físico de la carta.
     * @param velocidad El valor de velocidad de la carta.
     * @param defensa El valor de defensa de la carta.
     * @param regate El valor de regate de la carta.
     */
    public Carta(int tiro, int pase, int fisico, int velocidad, int defensa, int regate){
        this.tiro = tiro;
        this.pase = pase;
        this.fisico = fisico;
        this.velocidad = velocidad;
        this.defensa = defensa;
        this.regate = regate;
    }
    public int getTiro(){
        return tiro;
    }
    public int getPase(){
        return pase;
    }
    public int getFisico(){
        return fisico;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public int getDefensa(){
        return defensa;
    }
    public int getRegate(){
        return regate;
    }
    public void setTiro(int tiro) {
        this.tiro = tiro;
    }
    public void setPase(int pase) {
        this.pase = pase;
    }
    public void setFisico(int fisico) {
        this.fisico = fisico;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void setRegate(int regate) {
        this.regate = regate;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    /**
     * Calcula el puntaje de la carta.
     * @return El puntaje de la carta.
     */
    public String toCSV() {
        // Convierte el objeto Carta a una cadena en formato CSV
        return tiro + "," + pase + "," + fisico + "," + velocidad + "," + defensa + "," + regate;
    }

    /**
     * Crea una nueva carta a partir de una cadena en formato CSV.
     * @param csvLine
     * @return
     */
    public static Carta fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        String tipo = values[0];

        switch (tipo) {
            case "Bronce":
                return new CartaBronce(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
            case "Oro":
                return new CartaOro(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
            case "Plata":
                return new CartaPlata(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
            case "Ultra":
                return new CartaUltra(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));

            default:
                throw new IllegalArgumentException("Tipo de carta desconocido: " + tipo);
        }
    }

}