package Midia;
public class Midia {
    // Atributes
    private String title;
    private final String releaseDate;
    private final int duration; // in minutes
    private final String genre;
    private String[] authors = {};
    private int views;
    private String language;
    
    public boolean isPlaying;


    // Methods
    // Constructor
    public Midia(String ttl, String dte, int dur, String gnr, String[] athrs, int views, String lang) {
        this.title = ttl;
        this.releaseDate = dte;
        this.duration = dur;
        this.genre = gnr;
        this.authors = athrs;
        this.views = views;
        this.language = lang;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String[] getAuthors() {
        return authors;
    }

    public int getViews() {
        return views;
    }

    public String getLanguage() {
        return language;
    }

    public double getReproductionTime(boolean inHours) {
        return inHours ? (views * duration) / 60.0 : (views * duration);
    }

    public String getMidiaMetaData() {
        String toReturn = "Midia data:\nTitle: " + title + "\nRelease date: " + releaseDate + "\nDuration: " + duration + "min" + "\nGenre: " + genre + "\nAuthors: ";
        for (int i = 0; i < authors.length; i++) {
            toReturn += authors[i];
            if (i < authors.length - 1) {
                toReturn += ", ";
            }
        }
        toReturn += "\nViews: " + views;
        return toReturn;
    }

    // Setters
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setAuthors(String[] newAuthors) {
        this.authors = newAuthors;
    }

    public void setViews(int newViewQt) {
        this.views = newViewQt;
    }

    public void setLanguage(String newLang) {
        this.language = newLang;
    }

    // Own Methods
    public void startMidia() {
        isPlaying = true;
        views++;
    }

    public void pause(boolean pause) {
        isPlaying = !pause;
    }

}
