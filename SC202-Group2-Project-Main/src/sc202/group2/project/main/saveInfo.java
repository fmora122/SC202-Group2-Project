/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author chris
 */
public class saveInfo {

    public class savePaddock {

    }

    public class saveEstate {

    }

    public static void saveCattle(int cattleID, String cattleName, int cattleBirthdate, double cattleLastWeight, String cattleSexString, String cattleBreed) {
        String filePath = "C:\\Users\\chris\\Documents\\Progra\\Proyecto\\SC202-Group2-Project\\SC202-Group2-Project-Main\\src\\sc202\\group2\\project\\Cattle_Info"; // Reemplaza con la ruta correcta

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

            System.out.println("Cattle information saved successfully.");

        } catch (IOException e) {
            System.err.println("Error while saving cattle information: " + e.getMessage());
        }
    }

    private static boolean CattleIDUsed(int cattleID) throws IOException {
        String filePath = "C:\\Users\\chris\\Documents\\Progra\\Proyecto\\SC202-Group2-Project\\SC202-Group2-Project-Main\\src\\sc202\\group2\\project\\Cattle_Info"; //

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
