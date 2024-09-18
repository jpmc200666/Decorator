public abstract class DecoradorForma implements Forma{

	protected Forma formaDecorada;

	public DecoradorForma(Forma formaDecorada) {
		this.formaDecorada = formaDecorada;
	}

	public void dibujar() {
		formaDecorada.dibujar();
	}
}
