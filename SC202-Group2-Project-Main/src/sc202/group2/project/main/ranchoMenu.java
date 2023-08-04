/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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

/**
 *
 * @author fmora
 */
public class ranchoMenu {
    private JFrame frame;
    private JPanel panelN;
    private JPanel panelC;
    private JPanel panelMiddle;
    private JLabel labelN;
    private JButton buttonCattle;
    private JButton buttonEstate;
    private JButton buttonPaddock;
    private JButton buttonAnalytics;
    
    
    public ranchoMenu(){
        mainMenu();
    }
    public void mainMenu() {
        
        
        frame = new JFrame();
        frame.setSize(300, 300);
        
        panelN = new JPanel();
        panelC = new JPanel();
        panelMiddle = new JPanel();
        labelN = new JLabel("Main Menu");
        
        buttonCattle = new JButton("Cattle Management");
        buttonCattle.setMaximumSize(new Dimension(215, 25));
        buttonCattle.addActionListener( new cattleActionListener());
        buttonEstate = new JButton("Estate Management");
        buttonEstate.setMaximumSize(new Dimension(215, 25));
        buttonEstate.addActionListener( new estateActionListener());
        buttonPaddock = new JButton("Paddock Management");
        buttonPaddock.setMaximumSize(new Dimension(215, 25));
        buttonPaddock.addActionListener( new paddockActionListener());
        buttonAnalytics = new JButton("Paddocks Analytics");
        buttonAnalytics.setMaximumSize(new Dimension(215, 25));
        //buttonAnalytics.addActionListener( new analyticsActionListener());
        
        frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
        });
        
        panelN.add(labelN);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.Y_AXIS));
        panelC.add(Box.createVerticalGlue());
        panelC.add(buttonCattle);
        panelC.add(buttonEstate);
        panelC.add(buttonPaddock);
        panelC.add(buttonAnalytics);
        panelC.add(Box.createVerticalGlue());
        
        panelMiddle.add(Box.createHorizontalGlue());
        panelMiddle.add(panelC);
        panelMiddle.add(Box.createHorizontalGlue());
        
        frame.setTitle("Fincas Anónimas S.A");
        frame.getContentPane() .add(BorderLayout.NORTH, panelN);
        frame.getContentPane() .add(BorderLayout.CENTER, panelMiddle);
        frame.setVisible(true);
 
    }
    
    class cattleActionListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
          new cattleMenu();
      }
   }  
    class estateActionListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
          new estateMenu();
      }
   }
    class paddockActionListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
          new paddockMenu();
      }
   }    
    class analyticsActionListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
          new analyticsMenu();
      }
   }       
    
}
