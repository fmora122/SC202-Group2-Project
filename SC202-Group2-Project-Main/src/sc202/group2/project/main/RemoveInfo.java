/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class RemoveInfo {
    
    
public void removeCattle(int cattleID) {
    removeEntry("Cattle ID: " + cattleID);
}

private void removeEntry(String targetLine) {
    try {
        String rootDir = System.getProperty("user.dir");
        String fileName = "Cattle_Info";
        String filePath = rootDir + "/" + fileName;

        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        PrintWriter writer = new PrintWriter(new FileWriter(tempFile));

            String line;
            boolean found = false;
            boolean skipLines = false;

            while ((line = reader.readLine()) != null) {
                if (skipLines) {
                    if (line.equals("================================")) {
                        skipLines = false;
                    }
                    continue;
                }

                if (line.equals(targetLine)) {
                    found = true;
                    skipLines = true;
                    continue;
                }

                writer.println(line);
            }

            writer.close();
            reader.close();

        File originalFile = new File(filePath);
        if (originalFile.delete()) {
            tempFile.renameTo(originalFile);
            if (found) {
                JOptionPane.showMessageDialog(null, "Cattle information removed successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Cattle ID not found.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error while removing cattle information.");
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error while removing cattle information: " + e.getMessage());
    }
}

public void removePaddock(int paddocksId){
    removeEntryPaddock("Paddock ID: " + paddocksId);
}

private void removeEntryPaddock(String targetLine) {
    try {
        String rootDir = System.getProperty("user.dir");
        String fileName = "Paddock_Info.txt";
        String filePath = rootDir + "/" + fileName;

        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        PrintWriter writer = new PrintWriter(new FileWriter(tempFile));

            String line;
            boolean found = false;
            boolean skipLines = false;

            while ((line = reader.readLine()) != null) {
                if (skipLines) {
                    if (line.equals("================================")) {
                        skipLines = false;
                    }
                    continue;
                }

                if (line.equals(targetLine)) {
                    found = true;
                    skipLines = true;
                    continue;
                }

                writer.println(line);
            }

            writer.close();
            reader.close();

        File originalFile = new File(filePath);
        if (originalFile.delete()) {
            tempFile.renameTo(originalFile);
            if (found) {
                JOptionPane.showMessageDialog(null, "Paddock information removed successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Paddock ID not found.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error while removing Paddock information.");
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error while removing Paddock information: " + e.getMessage());
    }
}

public void removeEstate(int cattleID){}
    
}
