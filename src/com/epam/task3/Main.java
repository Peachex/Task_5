package com.epam.task3;

import java.time.LocalDate;

/* Задача 3.
   Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и
   праздничных днях. */
public class Main {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2020, 11, 11);
		LocalDate date2 = LocalDate.of(2020, 12, 31);
		LocalDate date3 = LocalDate.of(2020, 4, 1);

		Calendar calendar = new Calendar();

		calendar.createNote(date1, "My birthday.");
		calendar.createNote(date2, "New Year's Eve.");
		calendar.createNote(date3, "Fool's day.");

		calendar.viewNotes();
	}
}
