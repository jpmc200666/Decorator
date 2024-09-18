public class App {
    public static void main(String[] args) throws Exception {
        
        Forma circle = new Circle();
        Forma triangulo = new Triangulo();
        Forma rectangulo = new Rectangulo();
        Forma circuloRojo= new DecoradorFormaRoja(new Circle());
        Forma rectanguloRojo= new DecoradorFormaRoja(new Rectangulo());
        Forma trianguloRojo = new DecoradorFormaRoja(new Triangulo());

        circle.dibujar();
        rectangulo.dibujar();
        triangulo.dibujar();

        System.out.println("\nPintemos el borde de rojo\n");
        
        circuloRojo.dibujar();
        rectanguloRojo.dibujar();
        trianguloRojo.dibujar();
    }
}
