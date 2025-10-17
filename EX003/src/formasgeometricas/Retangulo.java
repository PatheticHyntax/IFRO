public class Retangulo {
    // Atributos de classe quadrado
    double largura;
    double altura;
    double area;
    double perimetro;
    String cor;
    
    // Métodos
    // Método construtor
    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
        this.area = largura*altura;
        this.perimetro = (largura*2)+(altura*2);
    }

    void imprimir() {
        System.out.println("** Retângulo");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
