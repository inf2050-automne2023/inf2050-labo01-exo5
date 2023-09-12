package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectureFilm {
    private ArrayList<String> films = new ArrayList<String>();

    public LectureFilm(String path) throws IOException {
        enregistrerFilms(path);
    }

    public void enregistrerFilms(String path) throws IOException {

        // Ouvre le fichier path
        String fileText = Utf8File.loadFileIntoString(path);
        Scanner fileScanner = new Scanner(fileText);

        while (fileScanner.hasNextLine()) {
            String titre = fileScanner.nextLine();
            films.add(titre);
        }
        fileScanner.close();
    }

    public ArrayList<String> getFilms() {
        return films;
    }
}
