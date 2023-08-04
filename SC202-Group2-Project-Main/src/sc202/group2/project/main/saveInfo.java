/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;
import java.util.ArrayList;
/**
 *
 * @author chris
 */
public class saveInfo {
    private static ArrayList<Cattle> loadData = new ArrayList<Cattle>();
    
    public class savePaddock {
   
    
    }
     
    
    public class saveEstate{
        
    
    }
    
public static void saveCattle(Cattle newCattle) {
        loadData.add(newCattle);
    }
    
}
