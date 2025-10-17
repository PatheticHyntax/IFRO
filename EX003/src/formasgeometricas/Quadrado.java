public class Quadrado {
    // Atributos de classe quadrado
    double lado;
    double area;
    double perimetro;
    String cor;
    
    // Métodos
    // Método construtor
    Quadrado(double lado) {
        this.lado = lado;
        this.area = lado*lado;
        this.perimetro = lado*4;
    }

    void imprimir() {
        System.out.println("** Quadrado");
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
