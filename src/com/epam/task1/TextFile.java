package com.epam.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFile extends File {
	public TextFile(File file) {
		super(file.getDirectoryPath(), file.getFileName());
	}

	public boolean createFile() {
		if (!Files.exists(this.getPath())) {
			try {
				Files.createFile(this.getPath());
				return true;
			} catch (IOException e) {
				System.out.println("\nCouldn't create!\n" + e.getMessage());
			}
		} else {
			System.out.println("\nFile already exists!");
		}
		return false;
	}

	public boolean deleteFile() {
		if (Files.exists(this.getPath())) {
			try {
				Files.delete(this.getPath());
				return true;
			} catch (IOException e) {
				System.out.println("\nCouldn't delete!\n" + e.getMessage());
			}
		} else {
			System.out.println("File already exists!");
		}
		return false;
	}

	public boolean renameFile(String path, String fileName) {
		if (Files.exists(this.getPath())) {
			try {
				Files.move(this.getPath(), Paths.get(path.concat(java.io.File.separator).concat(fileName)));
				this.setDirectoryPath(path);
				this.setFileName(fileName);
				return true;
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("File already exists!");
		}
		return false;
	}

	public boolean write(String str) {
		if (Files.exists(this.getPath())) {
			try {
				FileOutputStream outFile = new FileOutputStream(this.getPath().toString(), true);
				outFile.write(str.getBytes());
				outFile.close();
				return true;
			} catch (IOException e) {
				System.out.println("\nCouldn't write!\n" + e.getMessage());
			}
		} else {
			System.out.println("File already exists!");
		}
		return false;
	}

	public boolean read() {
		if (Files.exists(this.getPath())) {
			try {
				FileInputStream inFile = new FileInputStream(this.getPath().toString());
				while (inFile.available() != 0) {
					System.out.print((char) inFile.read());
				}
				inFile.close();
				return true;
			} catch (IOException e) {
				System.out.println("\nCouldn't read!\n" + e.getMessage());
			}
		} else {
			System.out.println("File already exists!");
		}
		return false;
	}
}
