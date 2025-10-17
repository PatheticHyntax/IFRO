package Midia;
public class Music extends Midia {
    // Atributes
    private String album;
    private String lyrics;

    public Music(String ttl, String dte, int dur, String gnr, String[] athrs, int views, String lang, String album, String lyrics) {
        super(ttl, dte, dur, gnr, athrs, views, lang);
        this.album = album;
        this.lyrics = lyrics;
    }

    // Getters
    public String getAlbum() {
        return album;
    }

    public String getLyrics() {
        return lyrics;
    }

    // Setters
    public void setAlbum(String newAlbum) {
        this.album = newAlbum;
    }

    public void setLyrics(String newLyrics) {
        this.lyrics = newLyrics;
    }

    // Own Methods
    @Override
    public String getMidiaMetaData() {
        return super.getMidiaMetaData() + "\nAlbum: " + album + "\nLyrics: " + lyrics;
    }

    public void playSample() {
        System.out.println("Playing a 30-second sample of the music: " + getTitle());
    }

    public void displayLyrics() {
        System.out.println("Lyrics:\n" + lyrics);
    }
}
