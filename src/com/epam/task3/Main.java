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

        Calendar.Note note1 = calendar.new Note(date1, "My birthday.");
        Calendar.Note note2 = calendar.new Note(date2, "New Year.");
        Calendar.Note note3 = calendar.new Note(date3, "Fool's day.");

        calendar.createNote(note1, note2, note3);
        calendar.viewNotes();
    }
}
