import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    

    public void removeContactByIndex(int index) {
        this.contacts.remove(contacts.get(index));
    }

    public void removeContact(Contact contact) {
        this.contacts.remove(contact);
    }

    public int findContactByName(String name) {
        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).get_name().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void removeContactByName(String name) {
        removeContact(this.contacts.get(findContactByName(name)));
    }

    public int getNumberOfContacts() {
        return this.contacts.size();
    }

    public void printContacts() {
        System.out.println("================= Contacts ================");
        for (Contact contact : this.contacts) {
            contact.printInfo();
            System.out.println("");
        }
        System.out.println("==========================================");
    }

    public void printContact(int index) {
        this.contacts.get(index).printInfo();
    }
}
