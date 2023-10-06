package de.neuefische;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Schritt 1: Filtert eine Liste von Zahlen und gibt nur die geraden Zahlen aus.
        // numbers ist die Liste von Zahlen
        List<Integer> numbers = Arrays.asList(12, 2, 8, 4, 520, 6, 58, 8, 9990, 10);


        //Schritt 1 - 6: Sammelt die verarbeiteten Zahlen in einer neuen Liste mit 'collect'.
        //Schritt 1: Filtert eine Liste von Zahlen und gebt nur die geraden Zahlen aus
        //Schritt 2: Verwendet 'map' und verdoppelt jede Zahl in der Liste.
        //Schritt 3: Sortiert die Liste in aufsteigender Reihenfolge.
        //Schritt 4: Führt eine 'reduce'-Operation durch, um die Summe aller Zahlen in der Liste zu berechnen.
        //Schritt 5: Nutzt 'forEach' und gebt jede verarbeitete Zahl aus.
        //Schritt 6: Sammelt die verarbeiteten Zahlen in einer neuen Liste mit 'collect'.

        // Verwandelt die Liste in einen Stream, um Operationen darauf auszuführen.
        numbers.stream()
                // Filtert die Liste nach geraden Zahlen
                .filter(number -> number % 2 == 0)
                // Wendet 'map' an, um jede Zahl zu verdoppeln
                .map(number -> number * 2)
                // Sortiert die Liste in aufsteigender Reihenfolge
                .sorted()
                // Sammelt die verarbeiteten Zahlen in einer neuen Liste mit 'collect'
                .collect(Collectors.toList())
                // Gibt jede sortierte Zahl aus
                .forEach(number -> System.out.println("Sortierte Zahl: " + number));
    }
}