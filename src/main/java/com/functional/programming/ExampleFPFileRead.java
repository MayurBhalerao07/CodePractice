package com.functional.programming;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ExampleFPFileRead {

    public static void main(String[] args) throws IOException {
        ExampleFPFileRead exampleFPFileRead = new ExampleFPFileRead();
        

        Path path = Paths.get("file.txt");

        Files.lines(path).forEach(System.out::println);

        Files.lines(path).map(f->f.split(" ")).flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);

        String a = new String();

    }


}


