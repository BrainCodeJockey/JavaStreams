package de.neuefische;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //<< Main Aufgabe I >>
        /*        List<Integer> numbers = Arrays.asList(12, 2, 8, 4, 520, 6, 58, 8, 9990, 10);

        NumberProcessor processor = new NumberProcessor();
        processor.processAndPrint(numbers);*/


        // << Bonus Aufgabe >>
        // Pfad zur CSV-Datei
        String filePath = "students.csv";

        try {
            // Aufruf der Methode, um Studenten aus der Datei zu lesen und auszugeben
            readStudentsFromFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Methode, um Studenten aus einer Datei zu lesen und auszugeben
    private static void readStudentsFromFile(String filePath) throws IOException {
        // Lesen der Zeilen aus der Datei und Überspringen der ersten Zeile (Überschrift)
        List<Student> students = Files.lines(Path.of(filePath))
                .skip(1)  // Überspringe die Überschrift
                .map(Main::parseStudent)  // Wandelt die Zeilen in Studentenobjekte um
                .filter(student -> student != null)  // Filtert ungültige Zeilen
                .distinct()  // Entfernt Duplikate
                .collect(Collectors.toList());  // Sammelt die Studenten in einer Liste

        // Systemausgabe für jeden Studenten
        students.forEach(System.out::println);
    }

    // Methode, um eine Zeile in ein Studentenobjekt umzuwandeln
    private static Student parseStudent(String line) {
        // Aufteilen der Zeile anhand des Kommas
        String[] parts = line.split(",");

        // Überprüfung der Anzahl der Felder in der Zeile
        if (parts.length != 4) {
            return null;
        }

        try {
            // Parsen der Daten aus den Zeilen
            int id = Integer.parseInt(parts[0].trim());
            String name = parts[1].trim();
            String postalCode = parts[2].trim();
            int age = Integer.parseInt(parts[3].trim());


            // Erstellen und Rückgabe eines Studentenobjekts
            return new Student(id, name, postalCode, age);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}