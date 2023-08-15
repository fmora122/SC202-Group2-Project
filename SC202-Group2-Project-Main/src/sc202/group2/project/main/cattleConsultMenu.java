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
public class cattleConsultMenu {
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
    private JLabel cattleID; 
    private JLabel cattleName;
    private JLabel cattleBirthdate;
    private JLabel cattleLastWeight;
    private JLabel cattleSex; 
    private JLabel cattleBreed;
    private JLabel viewcattleID; 
    private JLabel viewcattleName;
    private JLabel viewcattleBirthdate;
    private JLabel viewcattleLastWeight;
    private JLabel viewcattleSex; 
    private JLabel viewcattleBreed;
    private JTextField inputCattleID;
    private JLabel blank1;
    private JLabel blank2;
    private JLabel blank3;
    private int numID = 0;
    
    public cattleConsultMenu(){
        cattleConsultMenu();
    }
    
    public void cattleConsultMenu() {
        
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
        labelN = new JLabel("Consult Cattle Menu");
        labelS = new JLabel("");
        cattleID = new JLabel("Enter the Cattle ID");
        cattleID.setPreferredSize(new Dimension(165,19));
        cattleName = new JLabel("Name"); 
        cattleName.setPreferredSize(new Dimension(135,19));
        cattleBirthdate = new JLabel("Birthdate");
        cattleBirthdate.setPreferredSize(new Dimension(135,19));
        cattleLastWeight = new JLabel("Last Weight");
        cattleLastWeight.setPreferredSize(new Dimension(135,19));
        cattleSex = new JLabel("Gender");
        cattleSex.setPreferredSize(new Dimension(135,19));
        cattleBreed = new JLabel("Breed/Type");
        cattleBreed.setPreferredSize(new Dimension(135,19));
        
        viewcattleName = new JLabel(""); 
        viewcattleName.setPreferredSize(new Dimension(135,19));
        viewcattleBirthdate = new JLabel("");
        viewcattleBirthdate.setPreferredSize(new Dimension(135,19));
        viewcattleLastWeight = new JLabel("");
        viewcattleLastWeight.setPreferredSize(new Dimension(135,19));
        viewcattleSex = new JLabel("");
        viewcattleSex.setPreferredSize(new Dimension(135,19));
        viewcattleBreed = new JLabel("");
        viewcattleBreed.setPreferredSize(new Dimension(135,19));
        
        inputCattleID = new JTextField(20); 
        inputCattleID.addActionListener(new inputCattleIDActionListener());
        
        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(cattleID);
        panelW.add(blank1);
        panelW.add(cattleName);
        panelW.add(cattleBirthdate);
        panelW.add(cattleLastWeight);
        panelW.add(cattleSex);
        panelW.add(cattleBreed);
        panelW.add(blank2);
        panelW.add(buttonView);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(inputCattleID);
        panelE.add(blank3);
        panelE.add(viewcattleName);
        panelE.add(viewcattleBirthdate);
        panelE.add(viewcattleLastWeight);
        panelE.add(viewcattleSex);
        panelE.add(viewcattleBreed);
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
    class inputCattleIDActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            numID = Integer.parseInt(inputCattleID.getText());
      }
   }
    class viewActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            labelS.setText("Cattle "+numID+". View a New Record or Exit");
            
            viewcattleName.setText("NA");
            viewcattleBirthdate.setText("NA");
            viewcattleLastWeight.setText("NA");
            viewcattleSex.setText("NA");  
            viewcattleBreed.setText("NA");
      }
   }
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
}
