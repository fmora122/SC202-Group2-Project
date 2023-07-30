/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

/**
 *
 * @author XPC
 */
public class Estate {
   private String estateName = "";
   private String estateLocation = "";
   private String estateManagerName = "";
   private int estateManagerId =0;
   private int estateManagerPhone =0;
   private int estateNumberPaddocks =0;
   private double estateSize =0;
   private int estateTotalCattle =0;

    public Estate(String estateName, String estateLocation, String estateManagerName, int estateManagerId, int estateManagerPhone, int estateNumberPaddocks, double estateSize, int estateTotalCattle) {
        this.estateName = estateName;
        this.estateLocation = estateLocation;
        this.estateManagerName = estateManagerName;
        this.estateManagerId = estateManagerId;
        this.estateManagerPhone = estateManagerPhone;
        this.estateNumberPaddocks = estateNumberPaddocks;
        this.estateSize = estateSize;
        this.estateTotalCattle = estateTotalCattle;
    }
   
    public String getEstateName() {
        return estateName;
    }

    public String getEstateLocation() {
        return estateLocation;
    }

    public String getEstateManagerName() {
        return estateManagerName;
    }

    public int getEstateManagerId() {
        return estateManagerId;
    }

    public int getEstateManagerPhone() {
        return estateManagerPhone;
    }

    public int getEstateNumberPaddocks() {
        return estateNumberPaddocks;
    }

    public double getEstateSize() {
        return estateSize;
    }

    public int getEstateTotalCattle() {
        return estateTotalCattle;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
    }

    public void setEstateLocation(String estateLocation) {
        this.estateLocation = estateLocation;
    }

    public void setEstateManagerName(String estateManagerName) {
        this.estateManagerName = estateManagerName;
    }

    public void setEstateManagerId(int estateManagerId) {
        this.estateManagerId = estateManagerId;
    }

    public void setEstateManagerPhone(int estateManagerPhone) {
        this.estateManagerPhone = estateManagerPhone;
    }

    public void setEstateNumberPaddocks(int estateNumberPaddocks) {
        this.estateNumberPaddocks = estateNumberPaddocks;
    }

    public void setEstateSize(double estateSize) {
        this.estateSize = estateSize;
    }

    public void setEstateTotalCattle(int estateTotalCattle) {
        this.estateTotalCattle = estateTotalCattle;
    }
   
   
   
    
}
