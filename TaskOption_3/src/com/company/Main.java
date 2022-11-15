package com.company;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Main {

    public static final String GAMES = "C:/Games";                                          // По этому пути: C:/Games в начале создали папку Games

    public static void main(String[] args) throws IOException {

        File file = new File(GAMES);

        Path dir1 = Files.createDirectories(Path.of(GAMES + "\\src\\main"));                // В папке Games создал директорию: src -> main
        Files.newOutputStream(dir1.resolve("Main.java"));                                   // В папке Games -> src -> main -> созадал файл Main.java
        Files.newOutputStream(dir1.resolve("Utils.java"));                                  // В папке Games -> src -> main -> созадал файл Utils.java
        System.out.println(Files.exists(dir1));                                             // В Games папке,проверил, если папка src -> и папка main
        System.out.println(Files.exists(Path.of(GAMES + "\\src\\main\\Main.java")));        // В Games папке,проверил, если папка src -> и папка main, файл Main.java
        System.out.println(Files.exists(Path.of(GAMES + "\\src\\main\\Utils.java")));       // В Games папке,проверил, если папка src -> и папка main, файл Utils.java

        Path dir2 = Files.createDirectories(Path.of(GAMES + "\\src\\test"));                // В папке Games создал директорию: src (если папка src есть, она не создаётся) -> test
        System.out.println(Files.exists(dir2));                                             // В Games папке,проверил, если папка src -> и папка test

        Path dir3 = Files.createDirectories(Path.of(GAMES + "\\res\\drawables"));           // В папке Games создал директорию: res -> drawables
        System.out.println(Files.exists(dir3));                                             // В Games папке,проверил, если папка res -> и папка drawables

        Path dir4 = Files.createDirectories(Path.of(GAMES + "\\res\\vectors"));             // В папке Games создал директорию: res (если папка res есть, она не создаётся) -> vectors
        System.out.println(Files.exists(dir4));                                             // В Games папке,проверил, если папка res -> и папка vectors
  
        Path dir5 = Files.createDirectories(Path.of(GAMES + "\\res\\icons"));               // В папке Games создал директорию: res (если папка res есть, она не создаётся) -> icons
        System.out.println(Files.exists(dir5));                                             // В Games папке,проверил, если папка res -> и папка vectors

        Path dir6 = Files.createDirectories(Path.of(GAMES + "\\savegames"));                // В папке Games создал директорию: savegames
        System.out.println(Files.exists(dir6));                                             // В Games папке,проверил, если папка savegames

        Path dir7 = Files.createDirectories(Path.of(GAMES + "\\temp"));                     // В папке Games создал директорию: temp
        System.out.println(Files.exists(dir7));                                             // В Games папке,проверил, если папка temp
        Files.newOutputStream(dir7.resolve("temp.txt"));                                    // В Games папке -> temp -> создал файл: temp.txt
        StringBuilder wrapperText = new StringBuilder();
        wrapperText.append(Files.exists(Path.of("temp.txt")) + " - файл temp.txt.");        // В Games папке -> temp -> проверил файл: temp.txt
        String text = wrapperText.toString();
        try (FileWriter writer = new FileWriter(GAMES + "\\temp\\temp.txt", true)) {
            writer.write(text);                                                             // Записали всё в temp.txt (ответ true или false)
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
