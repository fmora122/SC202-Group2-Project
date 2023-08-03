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
public class estateAddMenu {
    private JFrame frame;
    private JPanel panelN;
    private JPanel panelW;
    private JPanel panelE;
    private JPanel panelWMiddle;
    private JPanel panelEMiddle;
    private JPanel panelMiddle;
    private JLabel labelN;
    private JButton buttonExit;
    private JLabel LBestateName; 
    private JLabel LBestateLocation;
    private JLabel LBestateManagerName;
    private JLabel LBestateManagerId;
    private JLabel LBestateManagerPhone;
    private JLabel LBestateNumberPaddocks; 
    private JLabel LBestateSize;
    private JLabel LBestateTotalCattle;
    private JTextField TXestateName; 
    private JTextField TXestateLocation;
    private JTextField TXestateManagerName;
    private JTextField TXestateManagerId;
    private JTextField TXestateManagerPhone;
    private JTextField TXestateNumberPaddocks;
    private JTextField TXestateSize;
    private JTextField TXestateTotalCattle;
    
    public estateAddMenu(){
        estateAddMain();
    }
    public void estateAddMain() {
        
        frame = new JFrame();
        frame.setSize(500, 300);
        
        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        buttonExit = new JButton("Exit");
        
        labelN = new JLabel("Add New Estate Menu");
        LBestateName = new JLabel("Estate Name"); 
        LBestateName.setPreferredSize(new Dimension(180,19));
        LBestateLocation = new JLabel("Estate Location");
        LBestateLocation.setPreferredSize(new Dimension(180,19));
        LBestateManagerName = new JLabel("Estate Manager Name");
        LBestateManagerName.setPreferredSize(new Dimension(180,19));
        LBestateManagerId = new JLabel("Estate Manager Id");
        LBestateManagerId.setPreferredSize(new Dimension(180,19));
        LBestateManagerPhone = new JLabel("Estate Manager Phone");
        LBestateManagerPhone.setPreferredSize(new Dimension(180,19));
        LBestateNumberPaddocks = new JLabel("Estate Number Paddocks");
        LBestateNumberPaddocks.setPreferredSize(new Dimension(180,19));
        LBestateSize = new JLabel("Estate Size");
        LBestateSize.setPreferredSize(new Dimension(180,19));
        LBestateTotalCattle = new JLabel("Estate Total Cattle");
        LBestateTotalCattle.setPreferredSize(new Dimension(180,19));
        TXestateName = new JTextField(20); 
        TXestateLocation = new JTextField(20);
        TXestateManagerName = new JTextField(20);
        TXestateManagerId = new JTextField(20);
        TXestateManagerPhone = new JTextField(20);
        TXestateNumberPaddocks = new JTextField(20); 
        TXestateSize = new JTextField(20);
        TXestateTotalCattle = new JTextField(20);
        
        panelN.add(labelN);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(LBestateName);
        panelW.add(LBestateLocation);
        panelW.add(LBestateManagerName);
        panelW.add(LBestateManagerId);
        panelW.add(LBestateManagerPhone);
        panelW.add(LBestateNumberPaddocks);
        panelW.add(LBestateSize);
        panelW.add(LBestateTotalCattle);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
        
        
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(TXestateName);
        panelE.add(TXestateLocation);
        panelE.add(TXestateManagerName);
        panelE.add(TXestateManagerId);
        panelE.add(TXestateManagerPhone);
        panelE.add(TXestateNumberPaddocks);
        panelE.add(TXestateSize);
        panelE.add(TXestateTotalCattle);
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
    class TXestateNameActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXestateName.getText();
      }
   }
     class TXestateLocationActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXestateLocation.getText();
      }
   }
      class TXestateManagerNameActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXestateManagerName.getText();
      }
   }
     class TXestateManagerIdActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXestateManagerId.getText();
      }
   }
     class TXestateManagerPhoneActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXestateManagerPhone.getText();
      }
   }
     class TXestateNumberPaddocksActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXestateNumberPaddocks.getText();
      }
   }
     class TXestateSizeActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXestateSize.getText();
      }
   }
      class TXestateTotalCattleActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String inputText = TXestateTotalCattle.getText();
      }
   }
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
    

}
