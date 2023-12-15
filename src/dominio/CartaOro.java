class CartaOro extends Carta {
    public CartaOro(int tiro, int pase, int fisico, int velocidad) {
        setTiro(Math.min(Math.max(tiro, 70), 90));
        setPase(Math.min(Math.max(pase, 70), 90));
        setFisico(Math.min(Math.max(fisico, 70), 90));
        setVelocidad(Math.min(Math.max(velocidad, 70), 90));
    }
}