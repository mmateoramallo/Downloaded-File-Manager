/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.*;
import java.text.ParseException;
import java.util.*;

/**
 *
 * @author mateo
 */
public class Admin {

    //Metodo para crear Carpeta
    /*
    public static void carpetaImagenes() {
        File archivo = new File("C:\\Users\\mateo\\Downloads\\Imagenes");
        System.out.println("Se creo la carpeta");
        archivo.mkdir();
    }

    public static void carpetasComprimidas(){
        File archivo = new File("C:\\Users\\mateo\\Downloads\\CarpetasComprimidas");
        archivo.mkdir();
        System.out.println("Se Creo La Carpeta");
    }
    */
    public static void findAllFilesInFolder(File folder) {
        /*
        Recibe un parametro de tipo File especificando la ruta, y itera todos los elementos que hay en esa ruta en caso de que el elemento no sea un directorio
        se muestra el nombre del elemento y de no ser asi el metodo se llama asi mismo nuevamente para mostrar todos los elementos que hay en la "SUBCARPETA" en caso de que se haya encontrado un directorio
        y mostrara los elementos que hay en ese directorio para luego salir y volver a la carpeta "raiz"
        */
        for (File file : folder.listFiles()) {
            if (!file.isDirectory()) {
                if(file.getName().contains(".jpg") || file.getName().contains(".png")){
                    List <String> archivosJpg = new ArrayList<>();
                    archivosJpg.add(file.getName());
                    for (int i = 0; i < archivosJpg.size(); i++) {
                        file.renameTo(new File("C:\\Users\\mateo\\Downloads\\Imagenes\\"+archivosJpg.get(i)));
                        file.delete();
                        System.out.println("File moved successfully");
                    }
                }
                System.out.println(file.getName());
            } else {
                findAllFilesInFolder(file);
                //Mover el archivo a una carpeta con los zip
                
            }
        }
    }
    public static void findAllFilesImagenesInFolder(File folder) {
        /*
        Recibe un parametro de tipo File especificando la ruta, y itera todos los elementos que hay en esa ruta en caso de que el elemento no sea un directorio
        se muestra el nombre del elemento y de no ser asi el metodo se llama asi mismo nuevamente para mostrar todos los elementos que hay en la "SUBCARPETA" en caso de que se haya encontrado un directorio
        y mostrara los elementos que hay en ese directorio para luego salir y volver a la carpeta "raiz"
         */
        for (File file : folder.listFiles()) {
            if (!file.isDirectory()) {
                if (file.getName().contains(".jpg") || file.getName().contains(".png")) {
                    List<String> archivosJpg = new ArrayList<>();
                    archivosJpg.add(file.getName());
                    for (int i = 0; i < archivosJpg.size(); i++) {
                        file.renameTo(new File("C:\\Users\\mateo\\OneDrive\\Imágenes\\ImagenesDescargadas\\" + archivosJpg.get(i)));
                        //file.renameTo(new File("C:\\Users\\mateo\\Downloads\\Imagenes\\"+archivosJpg.get(i)));
                        file.delete();
                        System.out.println("File moved successfully");
                    }
                }
                System.out.println(file.getName());
            } else {
                findAllFilesInFolder(file);
            }
        }
    }

    public static void findAllPdfFiles(File folder) {
        for (File file : folder.listFiles()) {
            if (!file.isDirectory()) {
                if (file.getName().contains(".pdf")) {
                    List<String> archivosPDF = new ArrayList<>();
                    archivosPDF.add(file.getName());
                    for (int i = 0; i < archivosPDF.size(); i++) {
                        file.renameTo(new File("C:\\Users\\mateo\\OneDrive\\Documentos\\PdfDownloaded\\" + archivosPDF.get(i)));
                        //file.renameTo(new File("C:\\Users\\mateo\\Downloads\\Imagenes\\"+archivosJpg.get(i)));
                        file.delete();
                        System.out.println("File moved successfully");
                    }
                }
                System.out.println(file.getName());
            } else {
                findAllFilesInFolder(file);
            }
        }
    }

    public static void findAllFolderFiles(File folder) {
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                List<String> archivosZip = new ArrayList<>();
                archivosZip.add(file.getName());
                for (int i = 0; i < archivosZip.size(); i++) {
                    file.renameTo(new File("C:\\Users\\mateo\\OneDrive\\Documentos\\CarpetasDownloaded\\" + archivosZip.get(i)));
                    file.delete();
                    System.out.println("File moved successfully");
                }
            }
        }
    }
    public static void findAllZipFiles(File folder){
        for(File file: folder.listFiles()){
            if(!file.isDirectory()){
                if(file.getName().contains(".zip") || file.getName().contains(".rar")){
                    List <String> archivosZip = new ArrayList<>();
                    archivosZip.add(file.getName());
                    for (int i = 0; i < archivosZip.size(); i++) {
                        file.renameTo(new File("C:\\Users\\mateo\\OneDrive\\Documentos\\CarpetasZip\\" + archivosZip.get(i)));
                        file.delete();
                        System.out.println("File moved successfully");
                    }
                }
                System.out.println(file.getName());
            }else{
                findAllFilesInFolder(folder);
            }
        }
    }
}

