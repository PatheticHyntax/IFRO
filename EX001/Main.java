import Midia.Music;
import User.User;
import User.Author;

public class Main {
    public static void main(String[] args) {
        Music music = new Music("Caneta azul", "26/08/2025", 4, "Música", new String[]{"Bele belinha", "Pablo Pascal"}, 2000, "Português", "Só as piores", "\nSECRETÁRIAAAA,\nQue trabalha o dia inteiro comigo,\nEu quero só... gooooozaaaar");

        System.out.println(music.getMidiaMetaData());
        System.out.printf("Tempo ouvido dessa música: %.1f horas", music.getReproductionTime(true));
        
        User joao = new User("João", 14, "joao@gmail.com", "Não é fase, é estilo de vida", "Masculino");

        Author polaout = new Author("Polaout", 19, "thiago@gmail.com", "maquina de combate", "Masculino", new String[]{"Musica Sem Graça", "Musica Ruim", "Musica Que Ele fez pro niderio (a goat)"});
    }
}