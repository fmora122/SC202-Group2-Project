package sc202.group2.project.main;
import javax.swing.JOptionPane;

public class SC202Group2ProjectMain {

    
    public static void main(String[] args) {
        

// Menu
        int enter = 0;
        while (enter!=5){
            //Opciones de menu
            JOptionPane.showConfirmDialog(null, "LiveStock Menu\nOptions"+"\n1) Cattle Management"+
                    "\n2) Estate Management"+"\n3) Paddocks Management"+"\n4) Paddocks Analytics"+"\n5)Exit");
            //Ingresar al menu
            
            enter = Integer.parseInt(JOptionPane.showInputDialog("Enter the option that would you like to use"));
            
            int subenter = 0;
            switch(enter){
                
                // Cattle Management
                case 1:

                    while (subenter!=3){
                        JOptionPane.showConfirmDialog(null,"Cattle Management"+"\n Would you like to:"+"\n1) Add New Cattle."+
                            "\n2) Delete Cattle."+"\n3)Exit.");
                        subenter = Integer.parseInt(JOptionPane.showInputDialog("Enter the option that would you like to use"));
                        switch(subenter){
                            
                            case 1:
                                JOptionPane.showConfirmDialog(null,"Add New Cattle");
                                //Add New Cattle. Class
                                break;
                                
                            case 2:
                                JOptionPane.showConfirmDialog(null,"Delete Cattle");
                                //Delete Cattle.
                                break;
                                
                            case 3:
                                JOptionPane.showConfirmDialog(null,"Back to the main menu");
                                break;
                                
                            default:
                                JOptionPane.showConfirmDialog(null, "Not a valid option");
                                break;    
                        }
                    }
                    break;
                    
                //Estate Management
                case 2:
                    while (subenter!=3){
                        JOptionPane.showConfirmDialog(null,"Estate Management Menu"+"\n1) Add New Estate."+"\n2) Delete Estate."+
                            "3)Exit");
                        subenter = Integer.parseInt(JOptionPane.showInputDialog("Enter the option that would you like to use"));
                        switch(subenter){
                            
                            case 1:
                                JOptionPane.showConfirmDialog(null,"Add New Estate");
                                //Add New Estate. Class
                                break;
                                
                            case 2:
                                JOptionPane.showConfirmDialog(null,"Delete Estate");
                                // Delete Estate. Class
                                break;
                                
                            case 3:
                                JOptionPane.showConfirmDialog(null,"Back to the main menu");
                                break;
                                
                            default:
                                JOptionPane.showConfirmDialog(null, "Not a valid option");
                                break;    
                        }
                    }
                    break;
                    
                //Paddocks Management
                case 3:
                    while (subenter!=6){
                        JOptionPane.showConfirmDialog(null,"Paddocks Management Menu"+"\n1) Add New Paddock"+"\n2) Delete Paddock"
                    +"\n3) Update Paddock Status"+"\n4) Add Cattle to Paddock."+"\n5) Remove Cattle to Paddock."+"\n6)Exit");
                        subenter = Integer.parseInt(JOptionPane.showInputDialog("Enter the option that would you like to use"));
                        switch(subenter){
                            
                            case 1:
                                JOptionPane.showConfirmDialog(null,"Add New Paddock");
                                //Add New Paddock. Class
                                break;
                                
                            case 2:
                                JOptionPane.showConfirmDialog(null,"Delete Paddock");
                                // Delete Paddock. Class
                                break;
                             
                            case 3:
                                JOptionPane.showConfirmDialog(null,"Update Paddock Status");
                                // Update Paddock Status. Class
                                break;
                                
                            case 4:
                                JOptionPane.showConfirmDialog(null,"Add Cattle to Paddock");
                                //  Add Cattle to Paddock. Class
                                break;
                            
                            case 5:
                                JOptionPane.showConfirmDialog(null,"Remove Cattle to Paddock");
                                // Remove Cattle to Paddock. Class
                                break;
                                
                            case 6:
                                JOptionPane.showConfirmDialog(null,"Back to the main menu");
                                break;
                                
                            default:
                                JOptionPane.showConfirmDialog(null, "Not a valid option");
                                break;    
                        }
                    }
                    break;
                    
                //Status
                case 4:
                    while (subenter!=5){
                        JOptionPane.showConfirmDialog(null,"Paddocks Analytics Menu"+"\n1)View Status."+
                            "\n2)View Ingress Date."+"\n3)View Engress Date."+"\n4)View Current Rest Time."+"\n5)Exit");
                        subenter = Integer.parseInt(JOptionPane.showInputDialog("Enter the option that would you like to use"));
                        switch(subenter){
                            
                            case 1:
                                JOptionPane.showConfirmDialog(null,"View Status");
                                //View Status. Class
                                break;
                                
                            case 2:
                                JOptionPane.showConfirmDialog(null,"View Ingress Date");
                                // View Ingress Date. Class
                                break;
                            
                            case 3:
                                JOptionPane.showConfirmDialog(null,"View Engress Date");
                                // View Engress Date. Class
                                break;
                                
                            case 4:
                                JOptionPane.showConfirmDialog(null,"View Current Rest Time.");
                                // View Current Rest Time.. Class
                                break;
                                
                            case 5:
                                JOptionPane.showConfirmDialog(null,"Back to the main menu");
                                break;
                                
                            default:
                                JOptionPane.showConfirmDialog(null, "Not a valid option");
                                break;    
                        }
                    }
                    break;
                    
               //OUT of the menu     
                case 5:
                    JOptionPane.showConfirmDialog(null,"Thanks for using LiveStock Menu."+"\nHAVE A NICE DAY");
                    break;
                
                // Default to any other number
                default:
                    JOptionPane.showConfirmDialog(null, "Not a valid option");
                    break;
            
            }
        
        
        }
        
        
    } 
    
}
