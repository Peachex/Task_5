package com.epam.task1;

import java.nio.file.Paths;

/* Задача 1.
   Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
   вывести на консоль содержимое, дополнить, удалить. */
public class Main {
    public static void main(String[] args) {
        // Write your directory.
        String fileDirectory = "c:\\Users\\knigh_000\\IdeaProjects\\EpamTask5\\src\\com\\epam\\task1\\File\\" +
                "Text File.txt\\";

        // Rename your file.
        String newFileDirectory = "c:\\Users\\knigh_000\\IdeaProjects\\EpamTask5\\src\\com\\epam\\task1\\File\\" +
                "Renamed Text File.txt\\";

        TextFile textFile = new TextFile(Paths.get(fileDirectory));
        textFile.createFile();
        textFile.write("Hello World! Goodbye World!\n");
        textFile.read();
        textFile.renameFile(Paths.get(newFileDirectory));
        textFile.deleteFile();
    }
}
