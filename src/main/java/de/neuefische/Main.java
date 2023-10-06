package de.neuefische;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Schritt 1: Filtert eine Liste von Zahlen und gibt nur die geraden Zahlen aus.
        // numbers ist die Liste von Zahlen
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtern und Ausgeben der geraden Zahlen
        // Verwandelt die Liste in einen Stream, um Operationen darauf auszuführen
        numbers.stream()
                // Filtert die Liste nach geraden Zahlen
                .filter(number -> number % 2 == 0)
                // Gibt die gefilterte Liste aus
                .forEach(number -> System.out.println("Gerade Zahl: " + number));

        // Schritt 2: Verwendet 'map' und verdoppelt jede Zahl in der Liste.
        System.out.println("\nSchritt 2: Verdoppeln jeder Zahl und Ausgabe");

        // Verwandelt die Liste in einen Stream, um Operationen darauf auszuführen
        numbers.stream()
                // Wendet 'map' an, um jede Zahl zu verdoppeln
                .map(number -> number * 2)
                // Gibt jede verdoppelte Zahl aus
                .forEach(doubledNumber -> System.out.println("Verdoppelte Zahl: " + doubledNumber));

        // Schritt 3: Sortiert die Liste in aufsteigender Reihenfolge.
        System.out.println("\nSchritt 3: Sortieren der Liste in aufsteigender Reihenfolge");

        // Verwandelt die Liste in einen Stream, um Operationen darauf auszuführen
        numbers.stream()
                // Sortiert die Liste in aufsteigender Reihenfolge
                .sorted()
                // Gibt jede sortierte Zahl aus
                .forEach(sortedNumber -> System.out.println("Sortierte Zahl: " + sortedNumber));

        //Schritt 4: Führt eine 'reduce'-Operation durch, um die Summe aller Zahlen in der Liste zu berechnen.
        System.out.println("\nSchritt 4: Berechnung der Summe aller Zahlen in der Liste");

        // Verwandelt die Liste in einen Stream, um Operationen darauf auszuführen
        numbers.stream()
                // Führt eine 'reduce'-Operation durch, um die Summe aller Zahlen in der Liste zu berechnen
                .reduce((sum, number) -> sum + number)
                // Gibt die Summe aus
                .ifPresent(sum -> System.out.println("Summe: " + sum));

        //Schritt 5: Nutzt 'forEach' und gebt jede verarbeitete Zahl aus.
        System.out.println("\nSchritt 5: Nutzt 'forEach' und gebt jede verarbeitete Zahl aus");

        // Verwandelt die Liste in einen Stream, um Operationen darauf auszuführen
        numbers.stream()
                // Filtert die Liste nach geraden Zahlen
                .filter(number -> number % 2 == 0)
                // Wendet 'map' an, um jede Zahl zu verdoppeln
                .map(number -> number * 2)
                // Sortiert die Liste in aufsteigender Reihenfolge
                .sorted()
                // Gibt jede sortierte Zahl aus
                .forEach(sortedNumber -> System.out.println("Sortierte Zahl: " + sortedNumber));

        //Schritt 6: Sammelt die verarbeiteten Zahlen in einer neuen Liste mit 'collect'.
        System.out.println("\nSchritt 6: Sammelt die verarbeiteten Zahlen in einer neuen Liste mit 'collect'");

        // Verwandelt die Liste in einen Stream, um Operationen darauf auszuführen
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
                .forEach(sortedNumber -> System.out.println("Sortierte Zahl: " + sortedNumber));
    }
}