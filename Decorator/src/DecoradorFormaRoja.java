public class DecoradorFormaRoja extends DecoradorForma{

	public DecoradorFormaRoja(Forma formaDecorada) {
		super(formaDecorada);
	}

	public void dibujar(){
		formaDecorada.dibujar();
		ponerBordeRojo(formaDecorada);
	}

	private void ponerBordeRojo(Forma formaDecorada){
		System.out.println("Color borde rojo\n");
	}
}
