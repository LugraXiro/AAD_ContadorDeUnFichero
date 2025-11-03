package com.lugra;

import java.io.File;

public class Main {
    public static void main(String[] args) {

System.out.println("Ruta absoluta: " + new File("src\\\\main\\\\java\\\\com\\\\lugra\\\\versos.txt").getAbsolutePath());


        File f = new File("src\\main\\java\\com\\lugra\\versos.txt");

        int numPalabras = ContadorArchivos.numPalabras(f);
        int numLineas = ContadorArchivos.numLineas(f);

        System.out.println("\n=== FICHERO -> " + f.getName() + " ===");
        System.out.println("Número de palabras = " + numPalabras);
        System.out.println("Número de líneas = " + numLineas);
    }
}