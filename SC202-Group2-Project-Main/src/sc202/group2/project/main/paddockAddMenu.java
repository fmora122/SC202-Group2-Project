/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
public class paddockAddMenu {
    private JFrame frame;
    private JPanel panelN;
    private JPanel panelW;
    private JPanel panelE;
    private JPanel panelWMiddle;
    private JPanel panelEMiddle;
    private JPanel panelMiddle;
    private JLabel labelN;
    private JButton buttonExit;
    private JLabel LBpaddocksId; 
    private JLabel LBpaddocksName;
    private JLabel LBpaddocksStatus;
    private JLabel LBcattleEntryDate;
    private JLabel LBcattleExitDate;
    private JLabel LBammountCattle; 
    private JLabel LBwaterCattle;
    private JLabel LBterrainType;
    private JTextField TXpaddocksId; 
    private JTextField TXpaddocksName;
    private JTextField TXpaddocksStatus;
    private JTextField TXcattleEntryDate;
    private JTextField TXcattleExitDate;
    private JTextField TXammountCattle;
    private JTextField TXwaterCattle;
    private JTextField TXterrainType;
    
        public paddockAddMenu(){
        paddockAddMain();
    }
    public void paddockAddMain() {
        
        frame = new JFrame();
        frame.setSize(500, 300);
        
        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        buttonExit = new JButton("Exit");
        
        labelN = new JLabel("Add New Padock Menu");
        LBpaddocksId = new JLabel("Paddocks Id"); 
        LBpaddocksId.setPreferredSize(new Dimension(180,19));
        LBpaddocksName = new JLabel("Paddock Name");
        LBpaddocksName.setPreferredSize(new Dimension(180,19));
        LBpaddocksStatus = new JLabel("Paddock Status");
        LBpaddocksStatus.setPreferredSize(new Dimension(180,19));
        LBcattleEntryDate = new JLabel("Cattle Entry Date");
        LBcattleEntryDate.setPreferredSize(new Dimension(180,19));
        LBcattleExitDate = new JLabel("Cattle Exit Date");
        LBcattleExitDate.setPreferredSize(new Dimension(180,19));
        LBammountCattle = new JLabel("Ammount Cattle");
        LBammountCattle.setPreferredSize(new Dimension(180,19));
        LBwaterCattle = new JLabel("Water Cattle");
        LBwaterCattle.setPreferredSize(new Dimension(180,19));
        LBterrainType = new JLabel("Terrain Type");
        LBterrainType.setPreferredSize(new Dimension(180,19));
        TXpaddocksId = new JTextField(20); 
        TXpaddocksName = new JTextField(20);
        TXpaddocksStatus = new JTextField(20);
        TXcattleEntryDate = new JTextField(20);
        TXcattleExitDate = new JTextField(20);
        TXammountCattle = new JTextField(20); 
        TXwaterCattle = new JTextField(20);
        TXterrainType = new JTextField(20);
        
        panelN.add(labelN);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(LBpaddocksId);
        panelW.add(LBpaddocksName);
        panelW.add(LBpaddocksStatus);
        panelW.add(LBcattleEntryDate);
        panelW.add(LBcattleExitDate);
        panelW.add(LBammountCattle);
        panelW.add(LBwaterCattle);
        panelW.add(LBterrainType);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
        
        
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(TXpaddocksId);
        panelE.add(TXpaddocksName);
        panelE.add(TXpaddocksStatus);
        panelE.add(TXcattleEntryDate);
        panelE.add(TXcattleExitDate);
        panelE.add(TXammountCattle);
        panelE.add(TXwaterCattle);
        panelE.add(TXterrainType);
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
    class TXpaddocksIdActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXpaddocksId.getText();
      }
   }
     class TXpaddocksNameActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXpaddocksName.getText();
      }
   }
      class TXpaddocksStatusActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXpaddocksStatus.getText();
      }
   }
     class TXcattleEntryDateActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXcattleEntryDate.getText();
      }
   }
     class TXcattleExitDateActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXcattleExitDate.getText();
      }
   }
     class TXammountCattleActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXammountCattle.getText();
      }
   }
     class TXwaterCattleActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXwaterCattle.getText();
      }
   }
      class TXterrainTypeActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXterrainType.getText();
      }
   }
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }

}
