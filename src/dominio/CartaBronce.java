class CartaBronce extends Carta {
    public CartaBronce(int tiro, int pase, int fisico, int velocidad) {
        setTiro(Math.min(tiro, 30));
        setPase(Math.min(pase, 30));
        setFisico(Math.min(fisico, 30));
        setVelocidad(Math.min(velocidad, 30));
    }
}