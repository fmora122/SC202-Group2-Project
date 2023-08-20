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
public class paddockConsultMenu {
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
    private JButton buttonView;
    private JLabel paddocksId; 
    private JLabel paddocksName;
    private JLabel paddocksStatus;
    private JLabel cattleEntryDate;
    private JLabel cattleExitDate; 
    private JLabel ammountCattle;
    private JLabel waterCattle;
    private JLabel terrainType; 
    
    private JLabel viewpaddocksId; 
    private JLabel viewpaddocksName;
    private JLabel viewpaddocksStatus;
    private JLabel viewcattleEntryDate;
    private JLabel viewcattleExitDate; 
    private JLabel viewammountCattle;
    private JLabel viewwaterCattle;
    private JLabel viewterrainType; 
    private JTextField inputPaddockID;
    private JLabel blank1;
    private JLabel blank2;
    private JLabel blank3;
    private int numID = 0;
    
    public paddockConsultMenu(){
        paddockConsultMenu();
    }
    public void paddockConsultMenu() {
        
        frame = new JFrame();
        frame.setSize(440, 350);
        
        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelS = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        
        buttonExit = new JButton("Exit");
        buttonExit.addActionListener( new exitActionListener());
        buttonView = new JButton("View");
        buttonView.addActionListener( new viewActionListener());
        
        blank1 = new JLabel(" ");
        blank2 = new JLabel(" ");
        blank3 = new JLabel(" ");
        labelN = new JLabel("Consult Paddock Menu");
        labelS = new JLabel("");
        paddocksId = new JLabel("Enter the Paddock ID");
        paddocksId.setPreferredSize(new Dimension(165,19));
        paddocksName = new JLabel("Name"); 
        paddocksName.setPreferredSize(new Dimension(135,19));
        paddocksStatus = new JLabel("Status");
        paddocksStatus.setPreferredSize(new Dimension(135,19));
        cattleEntryDate = new JLabel("Entry Date");
        cattleEntryDate.setPreferredSize(new Dimension(135,19));
        cattleExitDate = new JLabel("Exit Date");
        cattleExitDate.setPreferredSize(new Dimension(135,19));
        ammountCattle = new JLabel("Ammount of Cattle");
        ammountCattle.setPreferredSize(new Dimension(135,19));
        waterCattle = new JLabel("Water");
        waterCattle.setPreferredSize(new Dimension(135,19));
        terrainType = new JLabel("Terrain Type");
        terrainType.setPreferredSize(new Dimension(135,19));

        viewpaddocksName = new JLabel(""); 
        viewpaddocksName.setPreferredSize(new Dimension(135,19));
        viewpaddocksStatus = new JLabel("");
        viewpaddocksStatus.setPreferredSize(new Dimension(135,19));
        viewcattleEntryDate = new JLabel("");
        viewcattleEntryDate.setPreferredSize(new Dimension(135,19));
        viewcattleExitDate = new JLabel("");
        viewcattleExitDate.setPreferredSize(new Dimension(135,19));
        viewammountCattle = new JLabel("");
        viewammountCattle.setPreferredSize(new Dimension(135,19));
        viewwaterCattle = new JLabel("");
        viewwaterCattle.setPreferredSize(new Dimension(135,19));
        viewterrainType = new JLabel("");
        viewterrainType.setPreferredSize(new Dimension(135,19));
        
        inputPaddockID = new JTextField(20); 
        inputPaddockID.addActionListener(new inputPaddockIDActionListener());
        
        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(paddocksId);
        panelW.add(blank1);
        panelW.add(paddocksName);
        panelW.add(paddocksStatus);
        panelW.add(cattleEntryDate);
        panelW.add(cattleExitDate);
        panelW.add(ammountCattle);
        panelW.add(waterCattle);
        panelW.add(terrainType);
        panelW.add(blank2);
        panelW.add(buttonView);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(inputPaddockID);
        panelE.add(blank3);
        panelE.add(viewpaddocksName);
        panelE.add(viewpaddocksStatus);
        panelE.add(viewcattleEntryDate);
        panelE.add(viewcattleExitDate);
        panelE.add(viewammountCattle);
        panelE.add(viewwaterCattle);
        panelE.add(viewterrainType);
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
    class inputPaddockIDActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            numID = Integer.parseInt(inputPaddockID.getText());
      }
   }
    class viewActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            labelS.setText("Paddock "+numID+". View a New Record or Exit");
            //PaddockStatusChanger changer = new PaddockStatusChanger();
            //changer.changePaddockStatus(numID, paddocksStatus);
            //viewpaddocksName.setText("NA");
            //viewpaddocksStatus.setText("NA");
            //viewcattleEntryDate.setText("NA");
            //viewcattleExitDate.setText("NA");  
            //viewammountCattle.setText("NA");
            //viewwaterCattle.setText("NA");
            //viewterrainType.setText("NA");
      }
   }
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
}
