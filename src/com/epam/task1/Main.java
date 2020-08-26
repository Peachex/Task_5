package com.epam.task1;

/* Задача 1.
   Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
   вывести на консоль содержимое, дополнить, удалить. */
public class Main {
	public static void main(String[] args) {
		TextFile textFile = new TextFile(new File("src\\com\\epam\\task1\\File\\", "textFile.txt"));
		textFile.createFile();
		textFile.write("Hello World! Goodbye World!\n");
		textFile.read();
		textFile.renameFile("src\\com\\epam\\task1\\File\\", "renamedTextFile.txt");
		textFile.deleteFile();
	}
}
