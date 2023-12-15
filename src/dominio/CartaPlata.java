class CartaPlata extends Carta {
    public CartaPlata(int tiro, int pase, int fisico, int velocidad) {
        setTiro(Math.min(Math.max(tiro, 30), 70));
        setPase(Math.min(Math.max(pase, 30), 70));
        setFisico(Math.min(Math.max(fisico, 30), 70));
        setVelocidad(Math.min(Math.max(velocidad, 30), 70));
    }
}