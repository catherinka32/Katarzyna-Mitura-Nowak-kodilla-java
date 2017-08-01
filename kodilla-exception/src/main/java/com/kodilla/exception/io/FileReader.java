package com.kodilla.exception.io;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile(){
        // classloder odpowiedzialna za znalezienieklas i plików wewnątrz aplikacji
        ClassLoader classLoader = getClass().getClassLoader();
        //tworzymy obiekt reprezentujący nasz plik tekstowy
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        //modyfikacja ścieżki typu String na obiekt Path
        //Path path = Paths.get(file.getPath());
        //wywołanie metody lines na Files, efekt Stream Stringów
        //lines() to metoda statyczna
        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){
            fileLines.forEach(System.out::println);
        }catch(IOException e){
            System.out.println("something się zjebało " + e);
        }finally{
            System.out.println("It must be always here");
        }
    }
}
