package com.epam.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

public class TextFile {
    private Path path;

    public TextFile(Path path) {
        this.path = path;
    }

    public Path getPath() {
        return this.path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public boolean createFile() {
        if (!Files.exists(this.path)) {
            try {
                Files.createFile(this.path);
                return true;
            } catch (IOException e) {
                System.out.println("\nCouldn't create!\n" + e.getMessage());
            }
        }
        return false;
    }

    public boolean deleteFile() {
        if (Files.exists(this.path)) {
            try {
                Files.delete(this.path);
                return true;
            } catch (IOException e) {
                System.out.println("\nCouldn't delete!\n" + e.getMessage());
            }
        }
        return false;
    }

    public boolean renameFile(Path newPath) {
        if (Files.exists(this.path)) {
            try {
                Files.move(this.path, newPath);
                this.path = newPath;
                return true;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    public boolean write(String str) {
        if (Files.exists(this.path)) {
            try {
                FileOutputStream outFile = new FileOutputStream(this.path.toString(), true);
                outFile.write(str.getBytes());
                outFile.close();
                return true;
            } catch (IOException e) {
                System.out.println("\nCouldn't write!\n" + e.getMessage());
            }
        }
        return false;
    }

    public boolean read() {
        if (Files.exists(this.path)) {
            try {
                FileInputStream inFile = new FileInputStream(this.path.toString());
                while (inFile.available() != 0) {
                    System.out.print((char) inFile.read());
                }
                inFile.close();
                return true;
            } catch (IOException e) {
                System.out.println("\nCouldn't read!\n" + e.getMessage());
            }
        }
        return false;
    }

}
