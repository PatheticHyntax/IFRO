public class Circulo {
    // Atributos de classe quadrado
    double raio;
    double diametro;
    double area;
    double perimetro;
    String cor;
    
    // Métodos
    // Método construtor
    Circulo(double raio, double diametro) {
        this.raio = raio;
        this.diametro = diametro;
        this.area = Math.PI * (raio*raio);
        this.perimetro = 2 * Math.PI * raio;
    }

    void imprimir() {
        System.out.println("** Círculo");
        System.out.println("Raio: " + raio);
        System.out.println("Diâmetro: " + diametro);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
