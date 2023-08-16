/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

/**
 *
 * @author chris
 */
import javax.swing.*;
import java.io.*;

public class PaddockStatusChanger {

    public static void changePaddockStatus(int paddocksId, String paddocksStatus) {
        // Ruta del archivo
        String rootDir = System.getProperty("user.dir");
        String fileName = "Paddock_Info.txt";
        String filePath = rootDir + "/" + fileName;

        try {
            // Leer el archivo original
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder fileContent = new StringBuilder();

            // Construir el contenido del archivo excluyendo la entrada del corral con el ID dado
            while ((line = reader.readLine()) != null) {
                if (line.contains("Paddock ID: " + paddocksId)) {
                    fileContent.append("Paddock ID: ").append(paddocksId).append(System.lineSeparator());
                    reader.readLine(); // Ignorar la línea de estado del corral
                    fileContent.append("Paddock Status: ").append(paddocksStatus).append(System.lineSeparator());

                } else {
                    fileContent.append(line).append(System.lineSeparator());
                }
            }
            reader.close();

            // Escribir el contenido actualizado al archivo
            FileWriter fileWriter = new FileWriter(filePath);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(fileContent);
            printWriter.close();

            JOptionPane.showMessageDialog(null, "Paddock status changed successfully.");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error while changing paddock status: " + e.getMessage());
        }
    }
}
