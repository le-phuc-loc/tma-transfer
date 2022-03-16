package java11.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMain {
    public static void main(String[] args) throws IOException {
        Path filePath = Files.writeString(Files.createTempFile( "test", ".txt"), "Le Phuc Loc");
        System.out.println(filePath);
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);
    }
}
