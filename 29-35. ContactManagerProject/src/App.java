import model.Contact;
import persistance.FileManager;

public class App {
    public static void main(String[] args) throws Exception {
        FileManager manager = new FileManager();
        Contact contact = new Contact("Pepe", "3122395518", "pepe@gmail.com");
        manager.addContact(contact);
    }
}
