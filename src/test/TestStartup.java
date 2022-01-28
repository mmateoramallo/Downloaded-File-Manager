/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static domain.StartupFile.*;
import java.io.*;
import javax.swing.JOptionPane;


/**
 *
 * @author mateo
 */
public class TestStartup {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Public\\Desktop\\Startup.log");
        try {
            cleanFile(file);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error "+ex.getMessage());
        }
    }
}
