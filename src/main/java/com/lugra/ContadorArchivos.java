package com.lugra;

import java.io.File;
import java.util.Scanner;


public class ContadorArchivos {
    
    /**
     * Cuenta el número de palabras de un File usando la clase Scanner.
     * @param f El archivo File del que se quieren contar las palabras.
     * @return El número de palabras del archivo File.
     */
    static int numPalabras(File f) {
        int sumaPalabras = 0;
        try (Scanner s = new Scanner(f)) {
            while(s.hasNext()){
                sumaPalabras++;
                s.next();
            }
        } catch (Exception e) {
            System.out.println("Error al contar palabras de un File con la clase Scanner.");
            e.printStackTrace();
        }
        return sumaPalabras;
    }

    /**
     * Cuenta el número de líneas de un File usando la clase Scanner.
     * @param f El archivo File del que se quieren contar las líneas.
     * @return  El número de líneas del archivo File.
     */
    static int numLineas(File f) {
        int sumaLineas = 0;
        try (Scanner s = new Scanner(f)) {
            while (s.hasNextLine()) {
                sumaLineas++;
                s.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Error al contar líneas de un File con la clase Scanner.");
            e.printStackTrace();
        }

        return sumaLineas;
    }
}
