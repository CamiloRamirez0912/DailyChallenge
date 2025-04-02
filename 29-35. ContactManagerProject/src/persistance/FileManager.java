package persistance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import model.Contact;

public class FileManager {
    private String filePath = "resources/contacts.json";

    public void initFile() throws IOException {
        
        File file = new File(filePath);

        if (!file.exists()) 
            file.createNewFile();        

        if (file.length() == 0) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("[]");
            }
        }
    }

    public boolean addContact(Contact contact) throws IOException {
        initFile();

        RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
        long fileLength = raf.length();

        raf.seek(fileLength - 1);

        if (fileLength > 2) { 
            raf.writeBytes(",\n");
        } else {
            raf.seek(1);
            raf.writeBytes("\n");
        }

        String contactJson = "    " + chainObjectJson(contact).replace("\n", "\n    ");
        raf.writeBytes(contactJson + "]");

        raf.close();
        return true;
    }

    private String chainObjectJson(Contact contact) {
        return "{" + "\n" +
                "    \"name\": \"" + contact.getName() + "\"," + "\n" +
                "    \"phone\": \"" + contact.getNumber() + "\"," + "\n" +
                "    \"email\": \"" + contact.getEmail() + "\"" + "\n" +
                "}";
    }
}
