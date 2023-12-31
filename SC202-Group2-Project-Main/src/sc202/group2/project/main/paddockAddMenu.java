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
import javax.swing.JOptionPane;
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
    private JPanel panelS;
    private JPanel panelWMiddle;
    private JPanel panelEMiddle;
    private JPanel panelMiddle;
    private JLabel labelN;
    private JLabel labelS;
    private JButton buttonExit;
    private JButton buttonSave;
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
    private int paddocksId =0;
    private String paddocksName = "";
    private String paddocksStatus = "";
    private int cattleEntryDate =0;
    private int cattleExitDate =0;
    private int ammountCattle =0;
    private String waterCattle = "";
    private String terrainType ="";
    
        public paddockAddMenu(){
        paddockAddMain();
    }
    public void paddockAddMain() {
        
        frame = new JFrame();
        frame.setSize(500, 300);
        
        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelS = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        buttonExit = new JButton("Salir");
        buttonExit.addActionListener( new exitActionListener());
        buttonSave = new JButton("Salvar");
        buttonSave.addActionListener( new saveActionListener());
        
        labelN = new JLabel("Menu Agregar Nuevo Potrero");
        labelS = new JLabel("");
        LBpaddocksId = new JLabel("ID del Potrero"); 
        LBpaddocksId.setPreferredSize(new Dimension(240,19));
        LBpaddocksName = new JLabel("Nombre");
        LBpaddocksName.setPreferredSize(new Dimension(240,19));
        LBpaddocksStatus = new JLabel("Estado");
        LBpaddocksStatus.setPreferredSize(new Dimension(240,19));
        LBcattleEntryDate = new JLabel("Fecha de ingreso de Ganado");
        LBcattleEntryDate.setPreferredSize(new Dimension(240,19));
        LBcattleExitDate = new JLabel("Fecha de salida de Ganado");
        LBcattleExitDate.setPreferredSize(new Dimension(240,19));
        LBammountCattle = new JLabel("Cant de Banado");
        LBammountCattle.setPreferredSize(new Dimension(240,19));
        LBwaterCattle = new JLabel("Agua");
        LBwaterCattle.setPreferredSize(new Dimension(240,19));
        LBterrainType = new JLabel("Tipo de Terreno");
        LBterrainType.setPreferredSize(new Dimension(240,19));
        TXpaddocksId = new JTextField(20); 
        TXpaddocksName = new JTextField(20);
        TXpaddocksStatus = new JTextField(20);
        TXcattleEntryDate = new JTextField(20);
        TXcattleExitDate = new JTextField(20);
        TXammountCattle = new JTextField(20); 
        TXwaterCattle = new JTextField(20);
        TXterrainType = new JTextField(20);
        
        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(LBpaddocksId);
        panelW.add(LBpaddocksStatus);
        panelW.add(LBpaddocksName);
        panelW.add(LBcattleEntryDate);
        panelW.add(LBcattleExitDate);
        panelW.add(LBammountCattle);
        panelW.add(LBwaterCattle);
        panelW.add(LBterrainType);
        panelW.add(buttonSave);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
        
        
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(TXpaddocksId);
        panelE.add(TXpaddocksStatus);
        panelE.add(TXpaddocksName);
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
        frame.getContentPane() .add(BorderLayout.SOUTH, panelS);
        frame.setVisible(true);
 
    }
    class TXpaddocksIdActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            paddocksId = Integer.parseInt(TXpaddocksId.getText());
      }
   }
     class TXpaddocksNameActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            paddocksName = TXpaddocksName.getText();
      }
   }
      class TXpaddocksStatusActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            paddocksStatus = TXpaddocksStatus.getText();
      }
   }
     class TXcattleEntryDateActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            cattleEntryDate = Integer.parseInt(TXcattleEntryDate.getText());
      }
   }
     class TXcattleExitDateActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            cattleExitDate = Integer.parseInt(TXcattleExitDate.getText());
      }
   }
     class TXammountCattleActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            ammountCattle = Integer.parseInt(TXammountCattle.getText());
      }
   }
     class TXwaterCattleActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            waterCattle = TXwaterCattle.getText();
      }
   }
      class TXterrainTypeActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            terrainType = TXterrainType.getText();
      }
   }
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
class saveActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        
        // Datos necesarios desde tus campos de texto
        int paddocksId = Integer.parseInt(TXpaddocksId.getText());
        String paddocksName = TXpaddocksName.getText();
        String paddocksStatus = TXpaddocksStatus.getText();
        String cattleEntryDate = TXcattleEntryDate.getText();
        String cattleExitDate = TXcattleExitDate.getText();
        String ammountCattle = TXammountCattle.getText();
        String waterCattle = TXammountCattle.getText();
        String terrainType = TXterrainType.getText();
        
        // Llamar al método savePaddock de la clase saveInfo
        saveInfo.savePaddock.savePaddockInfo(paddocksId, paddocksName, paddocksStatus, cattleEntryDate, cattleExitDate, ammountCattle, waterCattle, terrainType);
        
        // Actualizar el mensaje en la interfaz gráfica
        labelS.setText("Paddock Record Saved! Add a New One or Exit");
    }
}

}
