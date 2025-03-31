package persistance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public void initFile() throws IOException {
        String filePath = "resources/contacts.json";
        File file = new File(filePath);

        if (!file.exists()) {
            file.createNewFile();
        }

        if (file.length() == 0) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("[]");
            }
        }
    }
}
