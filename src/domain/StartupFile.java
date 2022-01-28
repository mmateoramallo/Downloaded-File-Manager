/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author mateo
 */
public class StartupFile {

    public static void cleanFile(File file)throws FileNotFoundException{
        if (file.exists()) {
            file.delete();
            System.out.println("Se ha eliminado correctamente el Archivo");
        }else{
            throw new FileNotFoundException("No existe el Archivo");
        }
    }
}
