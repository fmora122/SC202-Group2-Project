/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

/**
 *
 * @author XPC
 */
public class Cattle {
    private int cattleID = 0; 
    private String cattleName = "";
    private int cattleBirthdate = 0;
    private double cattleLastWeight = 0;
    private String cattleSex = "";
    private String cattleBreed = "";

    public Cattle(int cattleID, String cattleName, int cattleBirthdate, double cattleLastWeight, String cattleSexString, String cattleBreed) {
        this.cattleID = cattleID; 
        this.cattleName = cattleName;
        this.cattleBirthdate = cattleBirthdate;
        this.cattleLastWeight = cattleLastWeight;
        this.cattleSex = cattleSex;
        this.cattleBreed = cattleBreed;
    }
    
    public int getCattleID() {
        return cattleID;
    }

    public String getCattleName() {
        return cattleName;
    }

    public int getCattleBirthdate() {
        return cattleBirthdate;
    }

    public double getCattleLastWeight() {
        return cattleLastWeight;
    }

    public String getCattleSex() {
        return cattleSex;
    }

    public String getCattleBreed() {
        return cattleBreed;
    }

    public void setCattleID(int cattleID) {
        this.cattleID = cattleID;
    }

    public void setCattleName(String cattleName) {
        this.cattleName = cattleName;
    }

    public void setCattleBirthdate(int cattleBirthdate) {
        this.cattleBirthdate = cattleBirthdate;
    }

    public void setCattleLastWeight(double cattleLastWeight) {
        this.cattleLastWeight = cattleLastWeight;
    }

    public void setCattleSex(String cattleSex) {
        this.cattleSex = cattleSex;
    }

    public void setCattleBreed(String cattleBreed) {
        this.cattleBreed = cattleBreed;
    }
    
    
    
    
    
    
}
