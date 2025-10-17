public class Triangulo {
    // Atributos de classe quadrado
    double base;
    double altura;
    double area;
    double perimetro;
    String cor;
    
    // Métodos
    // Método construtor
    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = (base*altura)/2;
    }

    void imprimir() {
        System.out.println("** Triângulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
}
