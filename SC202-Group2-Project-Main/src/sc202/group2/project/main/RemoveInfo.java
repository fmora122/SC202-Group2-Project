/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Josuel Rodriguez
 */

  public class RemoveInfo {
    private String filename;

    public RemoveInfo(String filename) {
        this.filename = filename;
    }

    public void removeCattle(String cattleId) {
        removeEntry(cattleId, "Cattle");
    }

    public void removeState(String stateId) {
        removeEntry(stateId, "State");
    }

    public void removePadock(String padockId) {
        removeEntry(padockId, "Padock");
    }

    private void removeEntry(String id, String dataType) {
        try {
            File inputFile = new File(filename);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String lineToRemove = dataType + " ID: " + id;
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains(lineToRemove)) {
                    continue;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();

            inputFile.delete();
            tempFile.renameTo(inputFile);

            System.out.println(dataType + " with ID " + id + " removed successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        RemoveInfo remover = new RemoveInfo("data.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select data type to remove (Cattle/State/Padock):");
        String dataType = scanner.nextLine();
        
        System.out.println("Enter ID to remove:");
        String id = scanner.nextLine();
        
        switch (dataType.toLowerCase()) {
            case "cattle":
                remover.removeCattle(id);
                break;
            case "state":
                remover.removeState(id);
                break;
            case "padock":
                remover.removePadock(id);
                break;
            default:
                System.out.println("Invalid data type.");
        }
        
        scanner.close();
    }
}