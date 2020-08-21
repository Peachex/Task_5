package com.epam.task3;

import java.time.LocalDate;

public class Calendar {
    public class Note {
        private LocalDate date;
        private String noteText;

        public Note(LocalDate date, String noteText) {
            this.date = date;
            this.noteText = noteText;
        }

        public LocalDate getDate() {
            return this.date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getNoteText() {
            return this.noteText;
        }

        public void setNoteText(String noteText) {
            this.noteText = noteText;
        }

        public String toString() {
            return this.date.toString() + " - " + this.noteText;
        }
    }

    private static final int size = 100;
    private Note[] notes = new Note[size];
    private int index = 0;

    public Calendar() {

    }

    public Note[] getNotes() {
        return this.notes;
    }

    public void setNotes(Note[] notes) {
        this.notes = notes;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static int getSize() {
        return size;
    }

    public void createNote(Note... notes) {
        if (this.index < size) {
            for (Note note : notes) {
                this.notes[index++] = note;
            }
        } else {
            System.out.println("\nSomething wrong...\n");
        }
    }

    public void viewNotes() {
        System.out.print(this);
    }

    public String toString() {
        for (Note note : this.notes) {
            if (note != null) {
                System.out.println(note);
            } else {
                break;
            }
        }
        return "";
    }
}
