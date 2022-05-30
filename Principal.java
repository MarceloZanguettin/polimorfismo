public class Principal {

    public static void main(String[] args) {
        
        Quadrilatero quadrilatero = new Quadrilatero();
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        Trapezio trapezio = new Trapezio();
        Lozango lozango = new Lozango();

        quadrado.calcularArea();
        lozango.calcularArea();
        quadrilatero.calcularArea();
        retangulo.calcularArea();
        trapezio.calcularArea();

    }
    
}
