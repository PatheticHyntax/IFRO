// eu só programo em ingles então tá tudo em inglês prof, valeeeeu
public class Character {
    // Atributos
    private String name;
    private int health;
    private int level;
    private int strength;
    private int defense;
    private int brainrotLevel;

    // Método de construção da classe
    public Character(String name, int health, int brainrotLevel) {
        this.name = name;
        this.health = health;
        this.brainrotLevel = brainrotLevel;
    }

    // Métodos
    // getters e setters

    // Nome do personagem
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Vida do personagem
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Level do personagem
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Ataque do personagem
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    // Defesa do personagem
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getBrainrotLevel() {
        return brainrotLevel;
    }

    public void setBrainrotLevel(int brainrotLevel) {
        this.brainrotLevel = brainrotLevel;
    }
}