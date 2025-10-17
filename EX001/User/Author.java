package User;

public class Author extends User {
    private String[] ownedMidia = {};
    private int timeListened;
    private int monthGains;

    public Author(String nm, int age, String email, String bio, String genre, String[] ownedMidia) {
        super(nm, age, email, bio, genre);
        this.ownedMidia = ownedMidia;
    }

    public String[] getOwnedMidia() {
        return ownedMidia;
    }

    public int getTimeListened() {
        return timeListened;
    }

    public void updateTimeListened(int amount) {
        timeListened += amount;
    }

    public int getMonthGains() {
        return monthGains;
    }

    public void setMonthGains(int newMonthGains) {
        this.monthGains = newMonthGains;
    }

    @Override
    public void showProfile() {
        showProfile();
        System.out.println("\nAuthor data: " + getTimeListened() + getMonthGains());
    }

}
