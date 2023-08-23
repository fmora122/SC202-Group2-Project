/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fmora
 */
public class cattleAddMenu {
    private JFrame frame;
    private JPanel panelN;
    private JPanel panelW;
    private JPanel panelE;
    private JPanel panelS;
    private JPanel panelWMiddle;
    private JPanel panelEMiddle;
    private JPanel panelMiddle;
    private JLabel labelN;
    private JLabel labelS;
    private JButton buttonExit;
    private JButton buttonSave;
    private JLabel LBcattleID; 
    private JLabel LBcattleName;
    private JLabel LBcattleBirthdate;
    private JLabel LBcattleLastWeight;
    private JLabel LBcattleSex;
    private JLabel LBcattleBreed;       
    private JTextField TXcattleID; 
    private JTextField TXcattleName;
    private JTextField TXcattleBirthdate;
    private JTextField TXcattleLastWeight;
    private JTextField TXcattleSex;
    private JTextField TXcattleBreed;
    public int cattleID = 0; 
    private String cattleName = "";
    private int cattleBirthdate = 0;
    private double cattleLastWeight = 0;
    private String cattleSex = "";
    private String cattleBreed = "";
    
    public cattleAddMenu(){
        cattleAddMain();
    }
    public void cattleAddMain() {
        
        frame = new JFrame();
        frame.setSize(400, 300);
        
        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelS = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        buttonExit = new JButton("Salir");
        buttonExit.addActionListener( new exitActionListener());
        buttonSave = new JButton("Guardar");
        buttonSave.addActionListener( new saveActionListener());
        
        labelN = new JLabel("Menu Agregar Ganado Nuevo");
        labelS = new JLabel("");
        LBcattleID = new JLabel("ID de Ganado"); 
        LBcattleID.setPreferredSize(new Dimension(135,19));
        LBcattleName = new JLabel("Nombre de Ganado");
        LBcattleName.setPreferredSize(new Dimension(135,19));
        LBcattleBirthdate = new JLabel("Cumpleanos");
        LBcattleBirthdate.setPreferredSize(new Dimension(135,19));
        LBcattleLastWeight = new JLabel("Ultimo Peso");
        LBcattleLastWeight.setPreferredSize(new Dimension(135,19));
        LBcattleSex = new JLabel("Genero/Sexo");
        LBcattleSex.setPreferredSize(new Dimension(135,19));
        LBcattleBreed = new JLabel("Raza/Tipo");
        LBcattleBreed.setPreferredSize(new Dimension(135,19));
        
        TXcattleID = new JTextField(20); 
        TXcattleID.addActionListener(new TXcattleIDActionListener());
        TXcattleName = new JTextField(20);
        TXcattleName.addActionListener(new TXcattleNameActionListener());
        TXcattleBirthdate = new JTextField(20);
        TXcattleBirthdate.addActionListener(new TXcattleBirthdateActionListener());
        TXcattleLastWeight = new JTextField(20);
        TXcattleLastWeight.addActionListener(new TXcattleLastWeightActionListener());
        TXcattleSex = new JTextField(20);
        TXcattleSex.addActionListener(new TXcattleSexActionListener());
        TXcattleBreed = new JTextField(20);
        TXcattleBreed.addActionListener(new TXcattleBreedActionListener());
        
        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(LBcattleID);
        panelW.add(LBcattleName);
        panelW.add(LBcattleBirthdate);
        panelW.add(LBcattleLastWeight);
        panelW.add(LBcattleSex);
        panelW.add(LBcattleBreed);
        panelW.add(buttonSave);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
        
        
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(TXcattleID);
        panelE.add(TXcattleName);
        panelE.add(TXcattleBirthdate);
        panelE.add(TXcattleLastWeight);
        panelE.add(TXcattleSex);
        panelE.add(TXcattleBreed);
        panelE.add(Box.createVerticalGlue());
        
        
        panelEMiddle.add(Box.createHorizontalGlue());
        panelEMiddle.add(panelE);
        panelEMiddle.add(Box.createHorizontalGlue());
        
              
        frame.setTitle("Fincas Anónimas S.A");
        frame.getContentPane() .add(BorderLayout.NORTH, panelN);
        frame.getContentPane() .add(BorderLayout.WEST, panelWMiddle);
        frame.getContentPane() .add(BorderLayout.EAST, panelEMiddle);
        frame.getContentPane() .add(BorderLayout.SOUTH, panelS);
        frame.setVisible(true);
 
    }
    class TXcattleIDActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            cattleID = Integer.parseInt(TXcattleID.getText());
      }
   }
    class TXcattleNameActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            cattleName = TXcattleName.getText();
      }
   }
    class TXcattleBirthdateActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            cattleBirthdate = Integer.parseInt(TXcattleBirthdate.getText());
      }
   }
    class TXcattleLastWeightActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            cattleLastWeight = Double.parseDouble(TXcattleLastWeight.getText());
      }
   }
    class TXcattleSexActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            cattleSex = TXcattleSex.getText();
      }
   }
    class TXcattleBreedActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            cattleBreed = TXcattleBreed.getText();
      }
   }    
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }

    class saveActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {           
//<<<<<<< HEAD
            // Obtener toda la información ingresada en los campos de texto
            int cattleId = Integer.parseInt(TXcattleID.getText());
            String cattleName = TXcattleName.getText();
            int cattleBirthdate = Integer.parseInt(TXcattleBirthdate.getText());
            double cattleLastWeight = Double.parseDouble(TXcattleLastWeight.getText());
            String cattleSex = TXcattleSex.getText();
            String cattleBreed = TXcattleBreed.getText();

            // Crear un nuevo objeto Cattle con la información recopilada
            saveInfo.saveCattle(cattleId, cattleName, cattleBirthdate, cattleLastWeight, cattleSex, cattleBreed);
            
            // Llamar al método saveCattle de la clase saveInfo, pasando el nuevo objeto Cattle
        }
    }
//=======
           // allData data = new allData();
           // loadData loader = new loadData();
           // Cattle tempCattle[] = new Cattle[1];
           // tempCattle = data.getCattle();            
            //tempCattle = loader.addNewCattle(tempCattle, 111, "JUANCHO", 13, 1050.6, "Male", "Bavarian");
           // tempCattle = loader.addNewCattle(tempCattle, cattleID, cattleName, cattleBirthdate, cattleLastWeight, cattleSex, cattleBreed);
           // System.out.println(tempCattle[60].getCattleName());
            
        //}
   //}
//>>>>>>> refs/remotes/origin/main
    
}
    

    

