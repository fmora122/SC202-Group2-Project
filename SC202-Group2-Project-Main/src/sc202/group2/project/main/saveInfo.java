/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class saveInfo {

    public static class savePaddock {
        public static void savePaddockInfo(int paddocksId, String paddocksName, String paddocksStatus, String cattleEntryDate, String cattleExitDate, String ammountCattle, String waterCattle, String terrainType) {
            //Ruta del archivo
            String rootDir = System.getProperty("user.dir");
            String fileName = "Paddock_Info.txt";
            String filePath = rootDir + "/" + fileName;
        
            try {
                // Crear o abrir el archivo para escritura
                FileWriter fileWriter = new FileWriter(filePath, true); // El true permite añadir al archivo existente
                PrintWriter printWriter = new PrintWriter(fileWriter);

                // Escribir la información en el archivo
                // , String , String , String , String , String , String 
                printWriter.println("Paddock ID: " + paddocksId);
                printWriter.println("Paddock Name: " + paddocksName);
                printWriter.println("Paddock Status: " + paddocksStatus);
                printWriter.println("Cattle Ingress Date: " + cattleEntryDate);
                printWriter.println("Cattle Egress Date: " + cattleExitDate);
                printWriter.println("Cattle Ammount: " + ammountCattle);
                printWriter.println("Water (L): " + waterCattle);
                printWriter.println("Terrain Type: " + terrainType);

                // Separador entre registros
                printWriter.println("================================");

                // Cerrar el archivo
                printWriter.close();
                fileWriter.close();

                System.out.println("Paddock information saved successfully.");

            } catch (IOException e) {
                System.err.println("Error while saving paddock information: " + e.getMessage());
            }
        }
    }

    public static class saveEstate {
        public static void saveEstateInfo(String estateName, String estateLocation, String estateManagerName, String estateManagerId, String estateManagerPhone, String estateNumberPaddocks, String estateSize, String estateTotalCattle) {
            //Ruta del archivo
            String rootDir = System.getProperty("user.dir");
            String fileName = "Estate_Info.txt";
            String filePath = rootDir + "/" + fileName;
            try {
                // Crear o abrir el archivo para escritura
                FileWriter fileWriter = new FileWriter(filePath, true); // El true permite añadir al archivo existente
                PrintWriter printWriter = new PrintWriter(fileWriter);

                // Escribir la información en el archivo
                //printWriter.println("Estate ID: " + estateID);
                printWriter.println("Estate Name: " + estateName);
                printWriter.println("Estate Address: " + estateLocation);
                printWriter.println("Estate Address: " + estateManagerName);
                printWriter.println("Estate Address: " + estateManagerId);
                printWriter.println("Estate Address: " + estateManagerPhone);
                printWriter.println("Estate Address: " + estateNumberPaddocks);
                printWriter.println("Estate Address: " + estateSize);
                printWriter.println("Estate Address: " + estateTotalCattle);

                // Separador entre registros
                printWriter.println("================================");

                // Cerrar el archivo
                printWriter.close();
                fileWriter.close();

                System.out.println("Estate information saved successfully.");

            } catch (IOException e) {
                System.err.println("Error while saving estate information: " + e.getMessage());
            }
        }
    }

    public static void saveCattle(int cattleID, String cattleName, int cattleBirthdate, double cattleLastWeight, String cattleSexString, String cattleBreed) {
        //String filePath = "/home/fmora/NetBeansProjects/SC202-Group2-Project/SC202-Group2-Project-Main/Cattle_Info"; 
        String rootDir = System.getProperty("user.dir");
        String fileName = "Cattle_Info";
        String filePath = rootDir + "/" + fileName;
        
        try {

            if (CattleIDUsed(cattleID)) {
                System.out.println("Error: Cattle ID already in use.");
                return;
            }
            // Crear o abrir el archivo para escritura
            FileWriter fileWriter = new FileWriter(filePath, true); // El true permite añadir al archivo existente
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Escribir la información en el archivo
            printWriter.println("Cattle ID: " + cattleID);
            printWriter.println("Cattle Name: " + cattleName);
            printWriter.println("Cattle Birthdate: " + cattleBirthdate);
            printWriter.println("Cattle Last Weight: " + cattleLastWeight);
            printWriter.println("Cattle Gender: " + cattleSexString);
            printWriter.println("Cattle Breed: " + cattleBreed);

            // Separador entre registros
            printWriter.println("================================");

            // Cerrar el archivo
            printWriter.close();
            fileWriter.close();

            JOptionPane.showMessageDialog(null,"Cattle information saved successfully.");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error while saving cattle information: " + e.getMessage());
        }
    }

    private static boolean CattleIDUsed(int cattleID) throws IOException {
        //String filePath = "/home/fmora/NetBeansProjects/SC202-Group2-Project/SC202-Group2-Project-Main/Cattle_Info"; //
        String rootDir = System.getProperty("user.dir");
        String fileName = "Cattle_Info";
        String filePath = rootDir + "/" + fileName;
        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("Cattle ID: " + cattleID)) {
                    return true;
                }
            }
        }

        return false;

    }
}
