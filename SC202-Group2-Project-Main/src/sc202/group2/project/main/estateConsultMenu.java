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
public class estateConsultMenu {
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
    private JLabel estateName; 
    private JLabel estateLocation;
    private JLabel estateManagerName;
    private JLabel estateManagerId;
    private JLabel estateManagerPhone; 
    private JLabel estateNumberPaddocks;
    private JLabel estateSize;
    private JLabel estateTotalCattle;  
    private JLabel viewestateLocation;
    private JLabel viewestateManagerName; 
    private JLabel viewestateManagerId;
    private JLabel viewestateManagerPhone;
    private JLabel viewestateNumberPaddocks;
    private JLabel viewestateSize; 
    private JLabel viewestateTotalCattle;
    private JTextField inputEstateID;
    private JLabel blank1;
    private JLabel blank2;
    private JLabel blank3;
    private int numID = 0;
    
    public estateConsultMenu(){
        estateConsultMenu();
    }
    
    public void estateConsultMenu() {
        
        frame = new JFrame();
        frame.setSize(480, 350);
        
        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelS = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        
        buttonExit = new JButton("Salir");
        buttonExit.addActionListener( new exitActionListener());
        buttonView = new JButton("Ver");
        buttonView.addActionListener( new viewActionListener());
        
        blank1 = new JLabel(" ");
        blank2 = new JLabel(" ");
        blank3 = new JLabel(" ");
        labelN = new JLabel("Menu Consultar Finca");
        labelS = new JLabel("");
        estateName = new JLabel("Ingrese el Nombre de la Finca");
        estateName.setPreferredSize(new Dimension(220,19));
        estateLocation = new JLabel("Ubicacion"); 
        estateLocation.setPreferredSize(new Dimension(135,19));
        estateManagerName = new JLabel("Nombre del Administrador");
        estateManagerName.setPreferredSize(new Dimension(135,19));
        estateManagerId = new JLabel("ID del Administrador");
        estateManagerId.setPreferredSize(new Dimension(135,19));
        estateManagerPhone = new JLabel("Tel del Administrador");
        estateManagerPhone.setPreferredSize(new Dimension(135,19));
        estateNumberPaddocks = new JLabel("Cant de Potreros");
        estateNumberPaddocks.setPreferredSize(new Dimension(135,19));
        estateSize = new JLabel("Tamano");
        estateSize.setPreferredSize(new Dimension(135,19));
        estateTotalCattle = new JLabel("Cant de Ganado");
        estateTotalCattle.setPreferredSize(new Dimension(135,19));

        viewestateLocation = new JLabel(""); 
        viewestateLocation.setPreferredSize(new Dimension(135,19));
        viewestateManagerName = new JLabel("");
        viewestateManagerName.setPreferredSize(new Dimension(135,19));
        viewestateManagerId = new JLabel("");
        viewestateManagerId.setPreferredSize(new Dimension(135,19));
        viewestateManagerPhone = new JLabel("");
        viewestateManagerPhone.setPreferredSize(new Dimension(135,19));
        viewestateNumberPaddocks = new JLabel("");
        viewestateNumberPaddocks.setPreferredSize(new Dimension(135,19));
        viewestateSize = new JLabel("");
        viewestateSize.setPreferredSize(new Dimension(135,19));
        viewestateTotalCattle = new JLabel("");
        viewestateTotalCattle.setPreferredSize(new Dimension(135,19));
        
        inputEstateID = new JTextField(20); 
        inputEstateID.addActionListener(new inputEstateIDActionListener());
        
        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(estateName);
        panelW.add(blank1);
        panelW.add(estateLocation);
        panelW.add(estateManagerName);
        panelW.add(estateManagerId);
        panelW.add(estateManagerPhone);
        panelW.add(estateNumberPaddocks);
        panelW.add(estateSize);
        panelW.add(estateTotalCattle);
        panelW.add(blank2);
        panelW.add(buttonView);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
        
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(inputEstateID);
        panelE.add(blank3);
        panelE.add(viewestateLocation);
        panelE.add(viewestateManagerName);
        panelE.add(viewestateManagerId);
        panelE.add(viewestateManagerPhone);
        panelE.add(viewestateNumberPaddocks);
        panelE.add(viewestateSize);
        panelE.add(viewestateTotalCattle);
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
    class inputEstateIDActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            numID = Integer.parseInt(inputEstateID.getText());
      }
   }
    class viewActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            labelS.setText("Estate "+numID+". View a New Record or Exit");
            
            viewestateLocation.setText("NA");
            viewestateManagerName.setText("NA");
            viewestateManagerId.setText("NA");
            viewestateManagerPhone.setText("NA");  
            viewestateNumberPaddocks.setText("NA");
            viewestateSize.setText("NA");
            viewestateTotalCattle.setText("NA");
      }
   }
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
    
}
