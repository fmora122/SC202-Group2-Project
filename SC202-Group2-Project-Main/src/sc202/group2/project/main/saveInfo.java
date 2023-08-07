/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.io.*;

/**
 *
 * @author chris
 */
public class saveInfo {

    public class savePaddock {

    }

    public class saveEstate {

    }

    public static void saveCattle(Cattle[] cattleArray, String filePath) {
        //String filePath = "C:/Users/chris/Documents/Progra/Proyecto/SC202-Group2-Project/SC202-Group2-Project-Main/src/sc202/group2/project/Cattle_Info.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath)))
            {
                for (Cattle cattle : cattleArray) {
                    writer.println(cattle.getCattleID() + ","
                            + cattle.getCattleName() + ","
                            + cattle.getCattleBirthdate() + ","
                            + cattle.getCattleLastWeight() + ","
                            + cattle.getCattleSex() + ","
                            + cattle.getCattleBreed());
                }
            }catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
