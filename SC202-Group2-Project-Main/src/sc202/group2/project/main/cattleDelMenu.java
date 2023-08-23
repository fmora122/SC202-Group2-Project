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
public class cattleDelMenu {
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
    private JButton buttonDel;
    private JLabel LBcattleID; 
    private JLabel blank1;
    private JTextField TXcattleID;
    private int numID = 0;
    
    public cattleDelMenu(){
        cattleDelMain();
    }
    public void cattleDelMain() {
        
        frame = new JFrame();
        frame.setSize(450, 300);
        
        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelS = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        buttonExit = new JButton("Salir");
        buttonExit.addActionListener( new exitActionListener());
        buttonDel = new JButton("Borrar");
        buttonDel.addActionListener( new delActionListener());
        
        labelN = new JLabel("Menu Borrar Ganado");
        labelS = new JLabel("");
        LBcattleID = new JLabel("Ingresar el ID de Ganado"); 
        LBcattleID.setPreferredSize(new Dimension(185,19));
        blank1 = new JLabel(" ");
        
        TXcattleID = new JTextField(20); 
        TXcattleID.addActionListener(new TXcattleIDActionListener());
        
        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(LBcattleID);
        panelW.add(blank1);
        panelW.add(buttonDel);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(TXcattleID);
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
            String inputText = TXcattleID.getText();
            numID = Integer.parseInt(inputText);
      }
   }    
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
    class delActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int cattleIDToDelete = numID; // Obtener el ID de ganado a eliminar
            RemoveInfo remover = new RemoveInfo();
            remover.removeCattle(cattleIDToDelete); // Llamar al método removeCattle
            labelS.setText("Record Deleted! Delete Another One or Exit");
        }
    }

}
   
    

