package com.lugra;

import java.io.File;
import java.util.Scanner;


public class ContadorArchivos {
    
    static int numPalabras(File f) {
        int sumaPalabras = 0;
        try (Scanner s = new Scanner(f)) {
            while(s.hasNext()){
                sumaPalabras++;
            }
        } catch (Exception e) {
            System.out.println("Error al contar palabras de un File con la clase Scanner.");
            e.printStackTrace();
        }
        return sumaPalabras;
    }

    static int numLineas(File f) {
        int sumaLineas = 0;
        try (Scanner s = new Scanner(f)) {
            while (s.hasNextLine()) {
                sumaLineas++;
            }
        } catch (Exception e) {
            System.out.println("Error al contar líneas de un File con la clase Scanner.");
            e.printStackTrace();
        }

        return sumaLineas;
    }
}
