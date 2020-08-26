package com.epam.task1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class File extends Directory {
	private String fileName;

	public File(String path, String fileName) {
		super(path);
		this.fileName = fileName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Path getPath() {
		return Paths.get(getDirectoryPath().concat(java.io.File.separator).concat(this.fileName));
	}
}
