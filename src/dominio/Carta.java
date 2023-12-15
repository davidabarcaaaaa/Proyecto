class Carta {
    protected int tiro;
    protected int pase;
    protected int fisico;
    protected int velocidad;

    // Constructor vacío, getters y setters
    public Carta() {}

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

    // Getters
    public int getTiro() {
        return tiro;
    }

    public int getPase() {
        return pase;
    }

    public int getFisico() {
        return fisico;
    }

    public int getVelocidad() {
        return velocidad;
    }
}