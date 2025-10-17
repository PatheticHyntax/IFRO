package User;
public class User {
    private String name;
    private int age;
    private String email;
    private String bio;
    private String genre;
    private String[] friends = {};

    public User(String nm, int age, String email, String bio, String genre) {
        this.name = nm;
        this.age = age;
        this.email = email;
        this.bio = bio;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String[] getFriends() {
        return friends;
    }

    public void showProfile() {
        System.out.println("User profile:\nName: " + getName() + "\nBio: " + getBio() + "\nGenre: " + getGenre() + "\nAge: " + getAge() + "\nEmail: " + getEmail());
    }

    public void addFriend(String newFriend) {
        friends[friends.length] = newFriend;
    }
}
