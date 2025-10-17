public class Contact {
    private String _name;
    private String _email;
    private String _phoneNumber;

    
    public Contact(String name, String email, String phoneNumber) {
        this._name =        name;
        this._email =       email;
        this._phoneNumber = phoneNumber;
    }

    // getters and setters
    public String get_name()        { return _name; }
    public String get_email()       { return _email; }
    public String get_phoneNumber() { return _phoneNumber; }

    public void set_name(String name)               { this._name = name; }
    public void set_email(String email)             { this._email = email; }
    public void set_phoneNumber(String phoneNumber) { this._phoneNumber = phoneNumber; }


    public void printInfo() {
        System.out.println("Name: "         + this._name);
        System.out.println("Email: "        + this._email);
        System.out.println("Phone Number: " + this._phoneNumber);
    }

}
