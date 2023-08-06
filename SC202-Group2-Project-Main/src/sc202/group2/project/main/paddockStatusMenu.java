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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fmora
 */
public class paddockStatusMenu {
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
    private JLabel LBpaddockID;
    private JLabel LBpaddockStatus;
    private JLabel blank1;
    private JLabel blank2;
    private JLabel blank3;
    private JCheckBox checkbox;
    private JCheckBox checkbox2;
    private JCheckBox checkbox3;
    private JTextField TXpaddockID;
    
    public paddockStatusMenu(){
        paddockStatusMain();
    }
    public void paddockStatusMain() {
        
        frame = new JFrame();
        frame.setSize(450, 300);
        
        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelS = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        buttonExit = new JButton("Exit");
        buttonExit.addActionListener( new exitActionListener());
        buttonSave = new JButton("Save");
        buttonSave.addActionListener( new saveActionListener());
        checkbox = new JCheckBox("checkbox 1");
        checkbox2 = new JCheckBox("checkbox 2");
        checkbox3 = new JCheckBox("checkbox 3");
        
        labelN = new JLabel("Set Paddock Status Menu");
        labelS = new JLabel("");
        LBpaddockID = new JLabel("Enter the Paddock ID"); 
        LBpaddockID.setPreferredSize(new Dimension(155,19));
        LBpaddockStatus = new JLabel("Select the Paddock Status"); 
        LBpaddockStatus.setPreferredSize(new Dimension(190,19));
        blank1 = new JLabel(" ");
        blank2 = new JLabel(" ");
        blank3 = new JLabel(" ");
        
        TXpaddockID = new JTextField(20); 
        TXpaddockID.addActionListener(new TXpaddockIDActionListener());
        
        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(LBpaddockID);
        panelW.add(LBpaddockStatus);
        panelW.add(blank1);
        panelW.add(blank2);
        panelW.add(blank3);
        panelW.add(checkbox);
        panelW.add(checkbox2);
        panelW.add(checkbox3);
        panelW.add(buttonSave);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(TXpaddockID);
        panelE.add(checkbox);
        panelE.add(checkbox2);
        panelE.add(checkbox3);
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
    class TXpaddockIDActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String cattleBreed = TXpaddockID.getText();
      }
   }    
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
    class saveActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            labelS.setText("Record Updated! Update Another One or Exit");
      }
   }
}    


