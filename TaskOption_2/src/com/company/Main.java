package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
// По этому пути: C:/Games в начале создали папку Games
// В папке Games создайте несколько директорий: src, res, savegames, temp.
        File dir1 = new File("C:/Games/src");
        if (dir1.mkdir())
            System.out.println("Каталог " + dir1.getName() + " создан");

        File dir2 = new File("C:/Games/res");
        if (dir2.mkdir())
            System.out.println("Каталог " + dir2.getName() + " создан");

        File dir3 = new File("C:/Games/savegames");
        if (dir3.mkdir())
            System.out.println("Каталог " + dir3.getName() + " создан");

        File dir4 = new File("C:/Games/temp");
        if (dir4.mkdir())
            System.out.println("Каталог " + dir4.getName() + " создан");
        System.out.println();

// В каталоге src создайте две директории: main, test.
        File dir1_1 = new File("C:/Games/src/main");
        if (dir1_1.mkdir())
            System.out.println("Каталог " + dir1_1.getName() + " создан");

        File dir1_2 = new File("C:/Games/src/test");
        if (dir1_2.mkdir())
            System.out.println("Каталог " + dir1_2.getName() + " создан");
        System.out.println();

// В подкаталоге main создайте два файла: Main.java, Utils.java.
        File file1 = new File(dir1_1, "Main.java");
        try {
            if (file1.createNewFile())
                System.out.println("Файл " + file1.getName() + " создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File file2 = new File(dir1_1, "Utils.java");
        try {
            if (file2.createNewFile())
                System.out.println("Файл " + file2.getName() + " создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();

// В каталог res создайте три директории: drawables, vectors, icons.
        File dir2_1 = new File("C:/Games/res/drawables");
        if (dir2_1.mkdir())
            System.out.println("Каталог " + dir2_1.getName() + " создан");

        File dir2_2 = new File("C:/Games/res/vectors");
        if (dir2_2.mkdir())
            System.out.println("Каталог " + dir2_2.getName() + " создан");

        File dir2_3 = new File("C:/Games/res/icons");
        if (dir2_3.mkdir())
            System.out.println("Каталог " + dir2_3.getName() + " создан");
        System.out.println();

// В директории temp создайте файл temp.txt
        File file3 = new File(dir4, "temp.txt");
        try {
            if (file3.createNewFile())
                System.out.println("Файл " + file3.getName() + " создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();

        StringBuilder wrapperText = new StringBuilder();

// В папке Games, проверили, если ли такой каталог src
        if (dir1.exists()) {
            wrapperText.append("Каталог " + dir1.getName() + " создан");
        } else {
            wrapperText.append("Каталог " + dir1.getName() + " не создан");
        }
        wrapperText.append("\n");

// В папке Games, проверили, если ли такой каталог res
        if (dir2.exists()) {
            wrapperText.append("Каталог " + dir2.getName() + " создан");
        } else {
            wrapperText.append("Каталог " + dir2.getName() + " не создан");
        }
        wrapperText.append("\n");

// В папке Games, проверили, если ли такой каталог savegames
        if (dir3.exists()) {
            wrapperText.append("Каталог " + dir3.getName() + " создан");
        } else {
            wrapperText.append("Каталог " + dir3.getName() + " не создан");
        }
        wrapperText.append("\n");

// В папке Games, проверили, если ли такой каталог temp
        if (dir4.exists()) {
            wrapperText.append("Каталог " + dir4.getName() + " создан");
        } else {
            wrapperText.append("Каталог " + dir4.getName() + " не создан");
        }
        wrapperText.append("\n");
        wrapperText.append("\n");
// В папке Games в каталоге src, проверили, если ли такой каталог main
        if (dir1_1.exists()) {
            wrapperText.append("Каталог " + dir1_1.getName() + " создан");
        } else {
            wrapperText.append("Каталог " + dir1_1.getName() + " не создан");
        }
        wrapperText.append("\n");

// В папке Games в каталоге src, проверили, если ли такой каталог test
        if (dir1_2.exists()) {
            wrapperText.append("Каталог " + dir1_2.getName() + " создан");
        } else {
            wrapperText.append("Каталог " + dir1_2.getName() + " не создан");
        }
        wrapperText.append("\n");
        wrapperText.append("\n");

// В папке Games в каталоге src/main, проверили, если ли файл: Main.java
        if (file1.exists()) {
            wrapperText.append("Файл " + file1.getName() + " создан");
        } else {
            wrapperText.append("Файл " + file1.getName() + " не создан");
        }
        wrapperText.append("\n");

// В папке Games в каталоге src/main, проверили, если ли файл: Utils.java
        if (file2.exists()) {
            wrapperText.append("Файл " + file2.getName() + " создан");
        } else {
            wrapperText.append("Файл " + file2.getName() + " не создан");
        }
        wrapperText.append("\n");
        wrapperText.append("\n");

// В папке Games в каталоге res, проверили, если ли каталог drawables
        if (dir2_1.exists()) {
            wrapperText.append("Каталог " + dir2_1.getName() + " создан");
        } else {
            wrapperText.append("Каталог " + dir2_1.getName() + " не создан");
        }
        wrapperText.append("\n");

// В папке Games в каталоге res, проверили, если ли каталог vectors
        if (dir2_2.exists()) {
            wrapperText.append("Каталог " + dir2_2.getName() + " создан");
        } else {
            wrapperText.append("Каталог " + dir2_2.getName() + " не создан");
        }
        wrapperText.append("\n");

// В папке Games в каталоге res, проверили, если ли каталог icons
        if (dir2_3.exists()) {
            wrapperText.append("Каталог " + dir2_3.getName() + " создан");
        } else {
            wrapperText.append("Каталог " + dir2_3.getName() + " не создан");
        }
        wrapperText.append("\n");
        wrapperText.append("\n");

// В папке Games в каталоге temp, проверили, если ли файл: temp.txt
        if (file3.exists()) {
            wrapperText.append("Файл " + file3.getName() + " создан");
        } else {
            wrapperText.append("Файл " + file3.getName() + " не создан");
        }
        wrapperText.append("\n");

        String text = wrapperText.toString();
        try (FileWriter writer = new FileWriter("C:/Games/temp/temp.txt", true)) {
            writer.write(text);              // записали всё
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
