package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.List;
import java.io.File;

public class Main {

    public static final String GAMES = "C:/Games";      // Вынесли отдельно путь на папку Games: C:/Games (в случии изменение пути писать уже тут)

    public static void main(String[] args) throws IOException {

        directories();                                  // Включаем метод директорий в работу, чтобы он заработал (в классе Main)
        сreateFiles();                                  // Включаем метод создавать файлы в работу, чтобы он заработал (в классе Main)
        record();                                       // Включаем метод записывать в работу, чтобы он заработал (в классе Main)
    }

    public static List<File> directories() {            // Метод директорий
        // В папке Games создал несколько директорий: src, res, savegames, temp.
        List<String> arr = new ArrayList<>();           // Создал List <String> arr, пока пустой (потом будет заполняться директориями)
        arr.add(GAMES + "/src");                        // Cоздал директорию src и положил в arr
        // В каталоге src создал две директории: main, test.
        arr.add(GAMES + "/src/main");                   // В каталоге src создал директорию: main и положил в arr
        arr.add(GAMES + "/src/test");                   // В каталоге src создал директорию: test и положил в arr
        arr.add(GAMES + "/res");                        // Cоздал директорию res и положил в arr
        // В каталог res создайте три директории: drawables, vectors, icons.
        arr.add(GAMES + "/res/drawables");              // В каталоге res создал директорию: drawables и положил в arr.
        arr.add(GAMES + "/res/vectors");                // В каталоге res создал директорию: vectors и положил в arr.
        arr.add(GAMES + "/res/icons");                  // В каталоге res создал директорию: icons и положил в arr.
        arr.add(GAMES + "/savegames");                  // Cоздал директорию savegames и положил в arr
        arr.add(GAMES + "/temp");                       // Cоздал директорию temp и положил в arr

        List<File> result = new ArrayList<>();          // Создал List <File> result , пока пустой (потом будет заполняться директориями)
        for (int i = 0; i < arr.size(); i++) {          // Прошёлся по всему List<String> arr по его длинне
            result.add(new File(arr.get(i)));           // В List result добавил new File и из каждого Lust arr (по которому прошёлся полностью) добавил каждый элемент (которой есть в arr) уже в result
        }

        for (File resultAll : result) {                 // Прошёлся циклом по List <File> result (теперь там должен быть каждый файл: File dir1 = new File("C:/Games/src") и так, для каждого файла)
            resultAll.mkdir();                          // Метод mkdir() для создание файлов, создали рипозитарии все.  resultAll - это каждый элемент List result
            resultAll.exists();                         // Проверка всех директорий, если такие директории
        }
        return result;                                  // Метод отдаёт List<File> result, что он записал в себя (создал директории) и проверил, если ли они там
    }

    public static List<File> сreateFiles() throws IOException {  // Метод создавать файлы

        String main = GAMES + "/src/main";              // Вынесли отдельно путь на папку GAMES + "/src/main" (в случии изменение пути писать уже тут)
        String temp = GAMES + "/temp";                  // Вынесли отдельно путь на папку GAMES + "/temp" (в случии изменение пути писать уже тут)

        List<String> fileNames = new ArrayList<>();     // Создал List<String> fileNames , пока пустой (потом будет заполняться названиями файлов)
        // В подкаталоге main создайте два файла: Main.java, Utils.java
        fileNames.add(main + "/Main.java");             // В подкаталоге main создал название файла: Main.java и добавил в List<String> fileNames
        fileNames.add(main + "/Utils.java");            // В подкаталоге main создал название файла: Utils.java и добавил в List<String> fileNames
        // В директории temp создайте файл temp.txt
        fileNames.add(temp + "/temp.txt");              // В директории temp создал название файла: temp.txt и добавил в List<String> fileNames

        List<File> fileList = directories();            // Создал List<File> fileList и передал туда метод directories() (то есть: List<File> result из метода directories())
        for (int i = 0; i < fileNames.size(); i++)      // Прошёлся по всему List<String> fileName по его длинне
            fileList.add(new File(fileNames.get(i)));   // В List fileList добавил new File и из каждого Lust fileNames (по которому прошёлся полностью) добавил каждый элемент (которой есть в fileNames)

        for (File resultMainAll : fileList) {           //  Прошёлся циклом по List <File> result (теперь там должен быть каждый файл: File dir1 = new File("C:/Games/src/...") и так далее, для каждшо файла)
            resultMainAll.createNewFile();              // Создали файлы для каждого элемента, которые в List<File> fileList
            System.out.println(resultMainAll.exists()); // Проверка всех файлов, если такие файлы или нет (будет печатать и выдвать результат true или false)
        }
        return fileList;                                // Этот метод нам должен вернуть List<File> fileList
    }

    public static void record() throws IOException {    // Метод записывать

        String tempTxt = GAMES + "\\temp\\temp.txt";   // Вынесли отдельно путь на папку "C:\\Games\\temp\\temp.txt" (в случии изменение пути писать уже тут)
        File file = new File(tempTxt);                                                      // Создали new File и указали у него путь String tempTxt = GAMES + "\\temp\\temp.txt";
        String text = file.getCanonicalPath() + " существует файл - " + file.exists();      // Делаем проверку, существует файл temp.txt ? Если да, то true и эту информацию передаём всё в String text
        if (!file.exists()) {                                                               // Делаем проверку, не существует файл temp.txt ? Если да не существует, то false
            System.out.println(file.getCanonicalPath() + " не существует файл.");           // И если да не существует, то false (после проверки кода if (!file.exists()) ) То в печает текс в терминале
            return;                                                                         // После этого, как происходит false: Идёт прерывание метода if (!file.exists()) { ... }  (если сработает код: (!file.exists()) выходим из цикла и другой код уже не работает дальше
        }

        try (FileWriter writer = new FileWriter(tempTxt, true)) {                    // Передаём файл (то есть его путь: tempTxt (String tempTxt = GAMES + "\\temp\\temp.txt")) , который нужно записать в файл temp.txt
            writer.write(text);                                                             // Записали всё, весь текст text (согласно String text = file.getCanonicalPath() + " существует файл - " + file.exists(); )
        } catch (IOException ex) {                                                          // Обернули всё в  try catch , если выдасть ошибку
            System.out.println(ex.getMessage());                                            // Если выдаст всё-таки ошибку, покажет это сообщение
        }
    }
}