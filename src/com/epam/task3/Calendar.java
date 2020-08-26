package com.epam.task3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Calendar {
	public static class Note {
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

	private ArrayList<Note> notes = new ArrayList<>();

	public Calendar() {

	}

	public ArrayList<Note> getNotes() {
		return this.notes;
	}

	public void addToNotes(Note note) {
		this.notes.add(note);
	}

	public void createNote(Note note) {
		this.notes.add(note);
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
