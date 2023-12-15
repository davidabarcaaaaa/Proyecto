class CartaUltra extends Carta {
    public CartaUltra(int tiro, int pase, int fisico, int velocidad) {
        setTiro(Math.min(Math.max(tiro, 90), 100));
        setPase(Math.min(Math.max(pase, 90), 100));
        setFisico(Math.min(Math.max(fisico, 90), 100));
        setVelocidad(Math.min(Math.max(velocidad, 90), 100));
    }
}
