public class Principal {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(4);
        q1.imprimir();
        Retangulo r1 = new Retangulo(5, 6);
        r1.imprimir();
        Triangulo t1 = new Triangulo(5, 10);
        t1.imprimir();
        Circulo c1 = new Circulo(2, 4);
        c1.imprimir();
    }
}
