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
    private JPanel panelWMiddle;
    private JPanel panelEMiddle;
    private JPanel panelMiddle;
    private JLabel labelN;
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
    private int cattleID = 0; 
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
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        buttonExit = new JButton("Exit");
        buttonExit.addActionListener( new exitActionListener());
        buttonSave = new JButton("Save");
        buttonSave.addActionListener( new saveActionListener());
        
        labelN = new JLabel("Add New Cattle Menu");
        LBcattleID = new JLabel("Cattle ID"); 
        LBcattleID.setPreferredSize(new Dimension(135,19));
        LBcattleName = new JLabel("Cattle Name");
        LBcattleName.setPreferredSize(new Dimension(135,19));
        LBcattleBirthdate = new JLabel("Cattle Birthdate");
        LBcattleBirthdate.setPreferredSize(new Dimension(135,19));
        LBcattleLastWeight = new JLabel("Cattle Last Weight");
        LBcattleLastWeight.setPreferredSize(new Dimension(135,19));
        LBcattleSex = new JLabel("Cattle Sex");
        LBcattleSex.setPreferredSize(new Dimension(135,19));
        LBcattleBreed = new JLabel("Cattle Breed");
        LBcattleBreed.setPreferredSize(new Dimension(135,19));
        TXcattleID = new JTextField(20); 
        TXcattleName = new JTextField(20);
        TXcattleBirthdate = new JTextField(20);
        TXcattleLastWeight = new JTextField(20);
        TXcattleSex = new JTextField(20);
        TXcattleBreed = new JTextField(20); 
        
        panelN.add(labelN);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(LBcattleID);
        panelW.add(LBcattleName);
        panelW.add(LBcattleBirthdate);
        panelW.add(LBcattleLastWeight);
        panelW.add(LBcattleSex);
        panelW.add(LBcattleBreed);
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
        frame.setVisible(true);
 
    }
    class TXcattleIDActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXcattleID.getText();
            cattleID = Integer.parseInt(inputText);
      }
   }
    class TXcattleNameActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String cattleName = TXcattleName.getText();
      }
   }
    class TXcattleBirthdateActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXcattleBirthdate.getText();
            cattleBirthdate = Integer.parseInt(inputText);
      }
   }
    class TXcattleLastWeightActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXcattleLastWeight.getText();
            cattleLastWeight = Double.parseDouble(inputText);
      }
   }
    class TXcattleSexActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String cattleSex = TXcattleSex.getText();
      }
   }
    class TXcattleBreedActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String cattleBreed = TXcattleBreed.getText();
      }
   }    
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
    class saveActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            loadData item = new loadData();
            Cattle temp[] = new Cattle[1];
            temp= cattle;
            temp = item.addNewCattle(cattle, cattleID, cattleName, cattleBirthdate, cattleLastWeight, cattleSex, cattleBreed);
      }
   }
    
}
