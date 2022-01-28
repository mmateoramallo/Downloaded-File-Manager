/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Test {

    public static void main(String[] args) {
        //Crear Carpeta Imagenes
        File folder = new File("C:\\Users\\mateo\\Downloads");
        //Creamos La Carpeta Imagenes
        //Admin.carpetaImagenes();
        Admin.findAllFilesInFolder(folder);
        
    }
}
