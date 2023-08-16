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
public class paddockDelMenu {

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
    private JLabel LBpaddockID;
    private JLabel blank1;
    private JTextField TXcpaddockID;
    private int numID = 0;


    public paddockDelMenu() {
        paddockDelMain();
    }
    public void paddockDelMain() {

        frame = new JFrame();
        frame.setSize(420, 300);

        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelS = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        buttonExit = new JButton("Exit");
        buttonExit.addActionListener( new exitActionListener());
        buttonDel = new JButton("Delete");
        buttonDel.addActionListener(new delActionListener());        

        labelN = new JLabel("Delete Paddock Menu");
        labelS = new JLabel("");
        LBpaddockID = new JLabel("Enter the Paddock ID"); 
        LBpaddockID.setPreferredSize(new Dimension(149,19));
        blank1 = new JLabel(" ");


        TXcpaddockID = new JTextField(20);
        TXcpaddockID.addActionListener(new TXcpaddockIDActionListener());

        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(LBpaddockID);
        panelW.add(blank1);
        panelW.add(buttonDel);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());

        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());

        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(TXcpaddockID);
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

    class TXcpaddockIDActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String inputText = TXcpaddockID.getText();
            numID = Integer.parseInt(inputText);
        }
    }

    class exitActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            frame.dispose();
        }
    }

    class delActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int paddockIDToDelete = numID; 
            RemoveInfo remover = new RemoveInfo();
            remover.removePaddock(paddockIDToDelete); // Llamar al método 
            labelS.setText("Record Deleted! Delete Another One or Exit");

        }
    }
}

