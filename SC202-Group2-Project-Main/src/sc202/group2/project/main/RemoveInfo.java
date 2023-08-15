/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 
 */
public class removeInfo {
    
    public static boolean removeCattle(int cattleID) throws FileNotFoundException, IOException {

        File inputFile = new File(constants.fileCattlePath);
        File tempFile = new File(constants.fileCattlePath + ".tmp");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        int cattleLines = 7;
        boolean flag = false;

        while ((currentLine = reader.readLine()) != null) {
            if (currentLine.startsWith("Cattle ID: " + cattleID)) {
                cattleLines--;
                flag = true;
                continue;
            }
            if (cattleLines > 0 && flag) {
                cattleLines--;
                continue;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        inputFile.delete();
        boolean successful = tempFile.renameTo(inputFile);
        return flag;
    }
    public static boolean removeEstate(String EstateName) throws FileNotFoundException, IOException {

        File inputFile = new File(constants.fileEstatePath);
        File tempFile = new File(constants.fileEstatePath + ".tmp");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        int cattleLines = 9;
        boolean flag = false;

        while ((currentLine = reader.readLine()) != null) {
            if (currentLine.startsWith("Estate Name: " + EstateName)) {
                cattleLines--;
                flag = true;
                continue;
            }
            if (cattleLines > 0 && flag) {
                cattleLines--;
                continue;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        inputFile.delete();
        boolean successful = tempFile.renameTo(inputFile);
        return flag;
    }
    public static boolean removePaddok(int PaddokId) throws FileNotFoundException, IOException {

        File inputFile = new File(constants.filePaddokPath);
        File tempFile = new File(constants.filePaddokPath + ".tmp");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        int cattleLines = 9;
        boolean flag = false;

        while ((currentLine = reader.readLine()) != null) {
            if (currentLine.startsWith("Paddock ID: " + PaddokId)) {
                cattleLines--;
                flag = true;
                continue;
            }
            if (cattleLines > 0 && flag) {
                cattleLines--;
                continue;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        inputFile.delete();
        boolean successful = tempFile.renameTo(inputFile);
        return flag;
    }
}
