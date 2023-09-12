package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // permuter();

        System.out.print("Entrer le nom du fichier : ");
        Scanner scannerConsole = new Scanner(System.in);
        String filePath = scannerConsole.nextLine();
        try {
            LectureFilm lectureFilm = new LectureFilm(filePath);
            ArrayList<String> films = lectureFilm.getFilms();

            for (String film : films) {
                System.out.println("Titre : " + film);
            }
        } catch (IOException e) {
            System.out.println("Le fichier " + filePath + " n'existe pas");
        }
    }
}