package dominio;

public abstract class Carta{
    private int tiro;
    private int pase;
    private int fisico;
    private int velocidad;
    private int defensa;
    private int regate;

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
    public String toCSV() {
        // Convierte el objeto Carta a una cadena en formato CSV
        return tiro + "," + pase + "," + fisico + "," + velocidad + "," + defensa + "," + regate;
    }
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