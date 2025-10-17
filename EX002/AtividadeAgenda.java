public class AtividadeAgenda {
    public static void main(String[] args) {
        Contact contato05 = new Contact("Batman", "batman@gmail.com", "(69) 9123-4567");
        Contact contato02 = new Contact("Superman", "superman@gmail.com", "(69) 9123-4568");
        Contact contato03 = new Contact("Mulher Maravilha", "mulher.maravilha@gmail.com", "(69) 9123-4569");



        Agenda agenda = new Agenda();

        agenda.addContact(contato05);
        agenda.addContact(contato02);
        agenda.addContact(contato03);

        agenda.printContacts();

        agenda.removeContactByIndex(1);
        agenda.printContacts();

        Contact contato04 = new Contact("Homem aranha", "homemaranha@gmail.com", "(11) 9439-4934");

        agenda.addContact(contato04);

        agenda.printContact(agenda.findContactByName("Homem aranha"));
        agenda.printContact(1);

        agenda.removeContactByName("Homem aranha");
    }
}
