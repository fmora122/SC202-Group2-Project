/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

/**
 *
 * @author fmora
 */
public class allData {
        public Cattle cattle[] = new Cattle[1];
        public Estate estate[] = new Estate[1];
        public Paddocks padocks[] = new Paddocks[1];
        public loadData loader = new loadData();

    public allData() {
    }
    public void allLoaders() {
        cattle = loader.loadCattle(cattle);
        estate = loader.loadEstate(estate);
    }

    public Cattle[] getCattle() {
        return cattle;
    }

    public void setCattle(Cattle[] cattle) {
        this.cattle = cattle;
    }

    public Estate[] getEstate() {
        return estate;
    }

    public void setEstate(Estate[] estate) {
        this.estate = estate;
    }

    public Paddocks[] getPadocks() {
        return padocks;
    }

    public void setPadocks(Paddocks[] padocks) {
        this.padocks = padocks;
    }
        
    
        
        
}
